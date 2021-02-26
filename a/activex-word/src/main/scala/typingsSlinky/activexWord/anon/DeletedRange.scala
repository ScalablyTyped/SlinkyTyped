package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletedRange extends StObject {
  
  val DeletedRange: Range = js.native
  
  val InUndoRedo: Boolean = js.native
  
  val OldXMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
}
object DeletedRange {
  
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: typingsSlinky.activexWord.Word.XMLNode): DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedRange]
  }
  
  @scala.inline
  implicit class DeletedRangeMutableBuilder[Self <: DeletedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedRange(value: Range): Self = StObject.set(x, "DeletedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldXMLNode(value: typingsSlinky.activexWord.Word.XMLNode): Self = StObject.set(x, "OldXMLNode", value.asInstanceOf[js.Any])
  }
}
