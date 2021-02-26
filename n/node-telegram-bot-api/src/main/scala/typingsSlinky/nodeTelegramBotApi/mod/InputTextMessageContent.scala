package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ @js.native
trait InputTextMessageContent extends StObject {
  
  var disable_web_page_preview: js.UndefOr[Boolean] = js.native
  
  var message_text: String = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
}
object InputTextMessageContent {
  
  @scala.inline
  def apply(message_text: String): InputTextMessageContent = {
    val __obj = js.Dynamic.literal(message_text = message_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextMessageContent]
  }
  
  @scala.inline
  implicit class InputTextMessageContentMutableBuilder[Self <: InputTextMessageContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable_web_page_preview(value: Boolean): Self = StObject.set(x, "disable_web_page_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_web_page_previewUndefined: Self = StObject.set(x, "disable_web_page_preview", js.undefined)
    
    @scala.inline
    def setMessage_text(value: String): Self = StObject.set(x, "message_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
