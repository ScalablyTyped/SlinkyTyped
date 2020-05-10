package typingsSlinky.firebaseFirestore.databaseMod

import typingsSlinky.firebaseFirestore.pathMod.ResourcePath
import typingsSlinky.firebaseFirestoreTypes.mod.DocumentData
import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.firebaseFirestoreTypes.mod.Query because Already inherited
- typingsSlinky.firebaseFirestoreTypes.mod.CollectionReference because Inheritance from two classes. Inlined id, parent, path, add, doc, doc, isEqual */ @JSImport("@firebase/firestore/dist/lib/src/api/database", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  def this(_path: ResourcePath, firestore: Firestore) = this()
  def this(_path: ResourcePath, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  val _path: ResourcePath = js.native
  @JSName("id")
  val id_FCollectionReference: String = js.native
  @JSName("parent")
  val parent_FCollectionReference: typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  @JSName("path")
  val path_FCollectionReference: String = js.native
  def add(value: T): js.Promise[typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[T]] = js.native
  def doc(): typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def doc(pathString: String): typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def id: String = js.native
  def isEqual(other: typingsSlinky.firebaseFirestoreTypes.mod.CollectionReference[T]): Boolean = js.native
  def parent: typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  def path: String = js.native
}

