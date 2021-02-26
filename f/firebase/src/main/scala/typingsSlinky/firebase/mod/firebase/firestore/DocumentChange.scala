package typingsSlinky.firebase.mod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentChange[T] extends StObject {
  
  /** The document affected by this change. */
  val doc: QueryDocumentSnapshot[T] = js.native
  
  /**
    * The index of the changed document in the result set immediately after
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange`
    * objects and the current `DocumentChange` object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: Double = js.native
  
  /**
    * The index of the changed document in the result set immediately prior to
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange` objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: Double = js.native
  
  /** The type of change ('added', 'modified', or 'removed'). */
  val `type`: DocumentChangeType = js.native
}
object DocumentChange {
  
  @scala.inline
  def apply[T](doc: QueryDocumentSnapshot[T], newIndex: Double, oldIndex: Double, `type`: DocumentChangeType): DocumentChange[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange[T]]
  }
  
  @scala.inline
  implicit class DocumentChangeMutableBuilder[Self <: DocumentChange[_], T] (val x: Self with DocumentChange[T]) extends AnyVal {
    
    @scala.inline
    def setDoc(value: QueryDocumentSnapshot[T]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DocumentChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
