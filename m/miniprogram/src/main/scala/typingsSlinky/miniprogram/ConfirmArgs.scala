package typingsSlinky.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmArgs extends AsyncCallback[Unit] {
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * OK button text, which is “OK” by default.
    */
  var confirmButtonText: js.UndefOr[String] = js.native
  
  /**
    * Content of the confirm box.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Title of the confirm box.
    */
  var title: js.UndefOr[String] = js.native
}
object ConfirmArgs {
  
  @scala.inline
  def apply(): ConfirmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmArgs]
  }
  
  @scala.inline
  implicit class ConfirmArgsMutableBuilder[Self <: ConfirmArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    @scala.inline
    def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmButtonTextUndefined: Self = StObject.set(x, "confirmButtonText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
