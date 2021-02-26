package typingsSlinky.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InUndoRedo extends StObject {
  
  val InUndoRedo: Boolean = js.native
  
  val NewContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}
object InUndoRedo {
  
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: typingsSlinky.activexWord.Word.ContentControl): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
  
  @scala.inline
  implicit class InUndoRedoMutableBuilder[Self <: InUndoRedo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewContentControl(value: typingsSlinky.activexWord.Word.ContentControl): Self = StObject.set(x, "NewContentControl", value.asInstanceOf[js.Any])
  }
}
