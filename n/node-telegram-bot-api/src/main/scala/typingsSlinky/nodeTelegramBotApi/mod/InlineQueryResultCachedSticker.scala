package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.sticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultCachedSticker
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var sticker_file_id: String = js.native
  
  var `type`: sticker = js.native
}
object InlineQueryResultCachedSticker {
  
  @scala.inline
  def apply(id: String, sticker_file_id: String, `type`: sticker): InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultCachedSticker]
  }
  
  @scala.inline
  implicit class InlineQueryResultCachedStickerMutableBuilder[Self <: InlineQueryResultCachedSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setSticker_file_id(value: String): Self = StObject.set(x, "sticker_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sticker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
