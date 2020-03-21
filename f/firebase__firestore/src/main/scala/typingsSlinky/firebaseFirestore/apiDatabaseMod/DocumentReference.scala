package typingsSlinky.firebaseFirestore.apiDatabaseMod

import typingsSlinky.firebaseFirestore.apiFieldPathMod.FieldPath
import typingsSlinky.firebaseFirestore.apiObserverMod.PartialObserver
import typingsSlinky.firebaseFirestore.apiObserverMod.Unsubscribe
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelPathMod.ResourcePath
import typingsSlinky.firebaseFirestoreTypes.mod.DocumentData
import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typingsSlinky.firebaseFirestoreTypes.mod.SetOptions
import typingsSlinky.firebaseFirestoreTypes.mod.SnapshotListenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "DocumentReference")
@js.native
class DocumentReference[T] protected ()
  extends typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[T] {
  def this(_key: DocumentKey, firestore: Firestore) = this()
  def this(_key: DocumentKey, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  val _converter: js.UndefOr[FirestoreDataConverter[T]] = js.native
  var _firestoreClient: js.Any = js.native
  var _key: DocumentKey = js.native
  var getViaSnapshotListener: js.Any = js.native
  var onSnapshotInternal: js.Any = js.native
  def onSnapshot(observer: PartialObserver[typingsSlinky.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[typingsSlinky.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]
  ): Unsubscribe = js.native
  def set(value: DocumentData): js.Promise[Unit] = js.native
  def set(value: DocumentData, options: SetOptions): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/api/database", "DocumentReference")
@js.native
object DocumentReference extends js.Object {
  def forPath[U](path: ResourcePath, firestore: Firestore): DocumentReference[U] = js.native
  def forPath[U](path: ResourcePath, firestore: Firestore, converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

