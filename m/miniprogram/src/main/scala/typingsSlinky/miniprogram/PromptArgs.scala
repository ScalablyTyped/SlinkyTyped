package typingsSlinky.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptArgs extends AsyncCallback[Unit] {
  
  /**
    * Message alignment, supporting enumeration left/center/right, iOS center, android left.
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * Text of prompt box, which is “Enter contents here” by default.
    */
  var message: String = js.native
  
  /**
    * OK button text, which is “OK” by default.
    */
  var okButtonText: js.UndefOr[String] = js.native
  
  /**
    * Prompt text for the entry box.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Title of prompt box.
    */
  var title: js.UndefOr[String] = js.native
}
object PromptArgs {
  
  @scala.inline
  def apply(message: String): PromptArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptArgs]
  }
  
  @scala.inline
  implicit class PromptArgsMutableBuilder[Self <: PromptArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkButtonTextUndefined: Self = StObject.set(x, "okButtonText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
