package typingsSlinky.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "QuerySnapshot")
@js.native
class QuerySnapshot[T] protected () extends StObject {
  
  def docChanges(): js.Array[DocumentChange[T]] = js.native
  def docChanges(options: SnapshotListenOptions): js.Array[DocumentChange[T]] = js.native
  
  val docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  val empty: Boolean = js.native
  
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit], thisArg: js.Any): Unit = js.native
  
  def isEqual(other: QuerySnapshot[T]): Boolean = js.native
  
  val metadata: SnapshotMetadata = js.native
  
  val query: Query[T] = js.native
  
  val size: Double = js.native
}
