package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultCachedMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var mpeg4_file_id: String = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: mpeg4_gif = js.native
}
object InlineQueryResultCachedMpeg4Gif {
  
  @scala.inline
  def apply(id: String, mpeg4_file_id: String, `type`: mpeg4_gif): InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultCachedMpeg4Gif]
  }
  
  @scala.inline
  implicit class InlineQueryResultCachedMpeg4GifMutableBuilder[Self <: InlineQueryResultCachedMpeg4Gif] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setMpeg4_file_id(value: String): Self = StObject.set(x, "mpeg4_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: mpeg4_gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
