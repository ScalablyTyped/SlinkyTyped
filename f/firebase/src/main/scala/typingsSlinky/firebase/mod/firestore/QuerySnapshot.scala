package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "firestore.QuerySnapshot")
@js.native
class QuerySnapshot[T] protected () extends js.Object {
  
  /**
    * Returns an array of the documents changes since the last snapshot. If this
    * is the first snapshot, all documents will be in the list as added changes.
    *
    * @param options `SnapshotListenOptions` that control whether metadata-only
    * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
    * snapshot events.
    */
  def docChanges(): js.Array[DocumentChange[T]] = js.native
  def docChanges(options: SnapshotListenOptions): js.Array[DocumentChange[T]] = js.native
  
  /** An array of all the documents in the `QuerySnapshot`. */
  val docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  /** True if there are no documents in the `QuerySnapshot`. */
  val empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the `QuerySnapshot`.
    *
    * @param callback A callback to be called with a `QueryDocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg The `this` binding for the callback.
    */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit], thisArg: js.Any): Unit = js.native
  
  /**
    * Returns true if this `QuerySnapshot` is equal to the provided one.
    *
    * @param other The `QuerySnapshot` to compare against.
    * @return true if this `QuerySnapshot` is equal to the provided one.
    */
  def isEqual(other: QuerySnapshot[T]): Boolean = js.native
  
  /**
    * Metadata about this snapshot, concerning its source and if it has local
    * modifications.
    */
  val metadata: SnapshotMetadata = js.native
  
  /**
    * The query on which you called `get` or `onSnapshot` in order to get this
    * `QuerySnapshot`.
    */
  val query: Query[T] = js.native
  
  /** The number of documents in the `QuerySnapshot`. */
  val size: Double = js.native
}
