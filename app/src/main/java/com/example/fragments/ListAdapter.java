/*package com.example.fragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter {

    private List<Breed> breedArray;

    public ListAdapter(List<Breed> breedArray) {
        this.breedArray = breedArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((ListViewHolder) viewHolder).bindView(i);
    }

    @Override
    public int getItemCount() {
        return breedArray.size();
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView nameTextView;
        public TextView idTextView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textName);
            idTextView = itemView.findViewById(R.id.textId);
            itemView.setOnClickListener(this);
        }

        public void bindView(int i) {
            Breed curItem = breedArray.get(i);
            String name = curItem.getName();
            Log.e("ListAdapter", name + " in bind view");
            int id = curItem.getId();
            nameTextView.setText(name);
            idTextView.setText(id);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
*/


package com.example.fragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter <ListAdapter.ListViewHolder> {

    private List<Breed> mBreedArray;

    public ListAdapter(List<Breed> mBreedArray) {
        this.mBreedArray = mBreedArray;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        Breed curItem = mBreedArray.get(i);
        String name = curItem.getName();
        int id = curItem.getId();
        Log.e("ListAdapter", name + " in onBindViewHolder");
        listViewHolder.mName.setText(name);
        listViewHolder.mId.setText("Id: " + id);


    }

    @Override
    public int getItemCount() {
        return mBreedArray.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public TextView mName;
        public TextView mId;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.textName);
            mId = itemView.findViewById(R.id.textId);
        }
    }
}
