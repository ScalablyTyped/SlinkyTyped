package typingsSlinky.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rebase extends StObject {
  
  def addToCollection(refOrPath: String, data: js.Object): js.Promise[_] = js.native
  def addToCollection(refOrPath: String, data: js.Object, id: String): js.Promise[_] = js.native
  /**
    * Add a new Document to a Collection.
    * @param refOrPath CollectionReference or path.
    * @param data The document data.
    * @param id The id for the document. If omitted, the Firestore will
    * generate an id for you.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def addToCollection(refOrPath: js.Object, data: js.Object): js.Promise[_] = js.native
  def addToCollection(refOrPath: js.Object, data: js.Object, id: String): js.Promise[_] = js.native
  
  def bindCollection(refOrPath: String, options: bindCollectionOptions): RebaseBinding = js.native
  /**
    * Bind a collection to a state property in your component. When then
    * collection changes in firestore, your component will re-render with
    * the latest data.
    * @param refOrPath CollectionReference or path.
    * @param options bindCollection Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def bindCollection(refOrPath: js.Object, options: bindCollectionOptions): RebaseBinding = js.native
  
  def bindDoc(refOrPath: String, options: bindDocOptions): js.Object = js.native
  /**
    * Bind a document to your component. When then document changes in
    * firestore, your component will re-render with the latest data.
    * @param refOrPath DocumentReference or path.
    * @param options bindDoc Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def bindDoc(refOrPath: js.Object, options: bindDocOptions): js.Object = js.native
  
  /**
    * One way data binding from Firebase to your component's state. Allows
    * you to bind a component's state property to a Firebase endpoint so
    * whenever that Firebase endpoint changes, your component's state will
    * be updated with that change.
    * @param endpoint The relative Firebase endpoint that you'd like to
    * bind to your component's state.
    * @param options bindToState Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def bindToState(endpoint: String, options: BindToStateOptions): RebaseBinding = js.native
  
  /**
    * Allows you to retrieve the data from a Firebase endpoint just once
    * without subscribing or listening for data changes.
    * @param endpoint The relative Firebase endpoint which contains the
    * data you're wanting to fetch.
    * @param options fetch Options.
    * @returns A Firebase [Promise](https://firebase.google.com/docs/reference/js/firebase.Promise)
    * which resolves when the write is complete and rejects if there is an
    * error.
    */
  def fetch(endpoint: String, options: FetchOptions): js.Promise[_] = js.native
  
  def get(refOrPath: String, options: listenToCollectionOptions): js.Promise[_] = js.native
  /**
    * Fetch either a Collection or Document.
    * @param refOrPath CollectionReference, DocumentReference or path.
    * @param options get Options.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def get(refOrPath: js.Object, options: listenToCollectionOptions): js.Promise[_] = js.native
  
  /**
    * This property contains the initialized firebase app that was passed
    * into re-base. You can access any of the firebase services that you
    * are using off this object. For instance, if you want to use some
    * firebase database methods that re-base doesn't have helpers for or
    * if you are using the auth service and want to quickly access it off
    * of re-base.
    */
  var initializedApp: js.Object = js.native
  
  /**
    * Allows you to listen to Firebase endpoints without binding those
    * changes to a state property. Instead, a callback will be invoked
    * with the newly updated data.
    * @param endpoint The relative Firebase endpoint which contains the
    * data with which you'd like to invoke your callback function.
    * @param options listenTo Options.
    * @returns An object which you can pass to `removeBinding` when your
    * component unmounts to remove the Firebase listeners.
    */
  def listenTo(endpoint: String, options: ListenToOptions): RebaseBinding = js.native
  
  def listenToCollection(refOrPath: String, options: listenToCollectionOptions): RebaseBinding = js.native
  /**
    * Listen to a collection, when the data changes it will invoke a
    * callback passing it the new data from Firestore.
    * @param refOrPath CollectionReference or path.
    * @param options listenToCollection Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def listenToCollection(refOrPath: js.Object, options: listenToCollectionOptions): RebaseBinding = js.native
  
  def listenToDoc(refOrPath: String, options: listenToDocOptions): js.Object = js.native
  /**
    * Listen to a document, when the data changes it will invoke a
    * callback passing it the new data from Firestore.
    * @param refOrPath DocumentReference or path.
    * @param options listenToDoc Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def listenToDoc(refOrPath: js.Object, options: listenToDocOptions): js.Object = js.native
  
  /**
    * Allows you to update a Firebase endpoint with new data. *Replace all
    * the data at this endpoint with the new data*.
    * @param endpoint The relative Firebase endpoint that you'd like to
    * update with the new data.
    * @param options post Options.
    * @returns A Firebase [Promise](https://firebase.google.com/docs/reference/js/firebase.Promise)
    * which resolves when the write is complete and rejects if there is an
    * error.
    */
  def post(endpoint: String, options: PostOptions): js.Promise[_] = js.native
  
  /**
    * Allows you to add data to a Firebase endpoint. *Adds data to a child
    * of the endpoint with a new Firebase push key*.
    * @param endpoint The relative Firebase endpoint that you'd like to
    * push the new data to.
    * @param options push Options.
    * @returns A Firebase [ThenableReference](https://firebase.google.com/docs/reference/js/firebase.database.ThenableReference)
    * which is defined by Firebase as a "Combined Promise and reference;
    * resolves when write is complete, but can be used immediately as the
    * reference to the child location."
    */
  def push(endpoint: String, options: PushOptions): js.Promise[_] = js.native
  
  /**
    * Allows you to delete all data at the endpoint location.
    * @param endpoint The relative Firebase endpoint that you'd like to
    * delete data from.
    * @param callback A callback that will get invoked once the data is
    * successfully removed Firebase. If there is an error, it will be the
    * only argument to this function.
    * @returns A Firebase [Promise](https://firebase.google.com/docs/reference/js/firebase.Promise)
    * which resolves when the write is complete and rejects if there is an
    * error.
    */
  def remove(endpoint: String): js.Promise[_] = js.native
  def remove(endpoint: String, callback: js.Function1[/* result */ js.Promise[_], Unit]): js.Promise[_] = js.native
  
  /**
    * Clean up a listener. Listeners are automatically cleaned up when
    * components unmount, however if you wish to remove a listener while
    * the component is still mounted this will allow you to do that. An
    * example would be if you want to start listening to a new document or
    * change a query on all collection in response to a prop change.
    * @param ref The return value of syncState`, `bindToState`, `listenTo`,
    * `listenToCollection`, `bindCollection`, `listenToDoc`, `bindDoc` or
    * `syncDoc`.
    */
  def removeBinding(ref: js.Object): Unit = js.native
  
  def removeDoc(refOrPath: String, data: js.Object): js.Promise[_] = js.native
  /**
    * Deletes a document.
    * @param refOrPath DocumentReference or path.
    * @param data The document data.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def removeDoc(refOrPath: js.Object, data: js.Object): js.Promise[_] = js.native
  
  def removeFromCollection(refOrPath: String, options: removeFromCollectionOptions): js.Promise[_] = js.native
  /**
    * Removes documents from a collection. If no query is supplied, it
    * will remove all the documents. If a query is supplied, it will only
    * remove documents that match the query.
    * @param refOrPath CollectionReference or path.
    * @param options removeFromCollection Options.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def removeFromCollection(refOrPath: js.Object, options: removeFromCollectionOptions): js.Promise[_] = js.native
  
  /**
    * Removes every Firebase/Firestore listener.
    */
  def reset(): Unit = js.native
  
  def syncDoc(refOrPath: String, options: syncDocOptions): js.Object = js.native
  /**
    * Syncs a component's local state with a document in Firestore.
    * @param refOrPath DocumentReference or path.
    * @param options removeFromCollection Options.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def syncDoc(refOrPath: js.Object, options: syncDocOptions): js.Object = js.native
  
  /**
    * Allows you to set up two way data binding between your component's
    * state and your Firebase. Whenever your Firebase changes, your
    * component's state will change. Whenever your component's state
    * changes, Firebase will change.
    * @param endpoint The relative Firebase endpoint to which you'd like
    * to bind your component's state.
    * @param options syncState Options.
    * @returns An object which you can pass to `removeBinding` if you want
    * to remove the listener while the component is still mounted.
    */
  def syncState(endpoint: String, options: SyncStateOptions): RebaseBinding = js.native
  
  /**
    * This property contains an object that you can use when adding data
    * that will be converted to a timestamp by Firebase. See
    * [the docs](https://firebase.google.com/docs/reference/js/firebase.database.ServerValue)
    * for more info.
    */
  var timestamp: js.Object = js.native
  
  /**
    * Allows you to update data at a Firebase endpoint changing only the
    * properties you pass to it. **Warning: calling update with
    * `options.data` being null will remove all the data at that
    * endpoint**.
    * @param endpoint The relative Firebase endpoint that you'd like to
    * update.
    * @param options update Options.
    * @returns A Firebase [Promise](https://firebase.google.com/docs/reference/js/firebase.Promise)
    * which resolves when the write is complete and rejects if there is an
    * error.
    */
  def update(endpoint: String, options: UpdateOptions): js.Promise[_] = js.native
  
  def updateDoc(refOrPath: String, data: js.Object): js.Promise[_] = js.native
  /**
    * Update an existing document.
    * @param refOrPath DocumentReference or path.
    * @param data The document data.
    * @returns A Promise thats resolve with the resulting data or rejects
    * if the document/collection does not exist or there are any read
    * errors.
    */
  def updateDoc(refOrPath: js.Object, data: js.Object): js.Promise[_] = js.native
}
