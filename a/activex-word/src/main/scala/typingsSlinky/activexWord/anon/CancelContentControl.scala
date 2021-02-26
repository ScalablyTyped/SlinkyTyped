package typingsSlinky.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelContentControl extends StObject {
  
  var Cancel: Boolean = js.native
  
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}
object CancelContentControl {
  
  @scala.inline
  def apply(Cancel: Boolean, ContentControl: typingsSlinky.activexWord.Word.ContentControl): CancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContentControl]
  }
  
  @scala.inline
  implicit class CancelContentControlMutableBuilder[Self <: CancelContentControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControl(value: typingsSlinky.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
