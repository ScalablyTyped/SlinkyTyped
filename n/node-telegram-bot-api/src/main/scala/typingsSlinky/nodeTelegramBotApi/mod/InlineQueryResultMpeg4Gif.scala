package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var mpeg4_duration: js.UndefOr[Double] = js.native
  
  var mpeg4_height: js.UndefOr[Double] = js.native
  
  var mpeg4_url: String = js.native
  
  var mpeg4_width: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: mpeg4_gif = js.native
}
object InlineQueryResultMpeg4Gif {
  
  @scala.inline
  def apply(id: String, mpeg4_url: String, `type`: mpeg4_gif): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
  
  @scala.inline
  implicit class InlineQueryResultMpeg4GifMutableBuilder[Self <: InlineQueryResultMpeg4Gif] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setMpeg4_duration(value: Double): Self = StObject.set(x, "mpeg4_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg4_durationUndefined: Self = StObject.set(x, "mpeg4_duration", js.undefined)
    
    @scala.inline
    def setMpeg4_height(value: Double): Self = StObject.set(x, "mpeg4_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg4_heightUndefined: Self = StObject.set(x, "mpeg4_height", js.undefined)
    
    @scala.inline
    def setMpeg4_url(value: String): Self = StObject.set(x, "mpeg4_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg4_width(value: Double): Self = StObject.set(x, "mpeg4_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg4_widthUndefined: Self = StObject.set(x, "mpeg4_width", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: mpeg4_gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
