package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultPhoto
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var photo_height: js.UndefOr[Double] = js.native
  
  var photo_url: String = js.native
  
  var photo_width: js.UndefOr[Double] = js.native
  
  var thumb_url: String = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: photo = js.native
}
object InlineQueryResultPhoto {
  
  @scala.inline
  def apply(id: String, photo_url: String, thumb_url: String, `type`: photo): InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultPhoto]
  }
  
  @scala.inline
  implicit class InlineQueryResultPhotoMutableBuilder[Self <: InlineQueryResultPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setPhoto_height(value: Double): Self = StObject.set(x, "photo_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_heightUndefined: Self = StObject.set(x, "photo_height", js.undefined)
    
    @scala.inline
    def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_width(value: Double): Self = StObject.set(x, "photo_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_widthUndefined: Self = StObject.set(x, "photo_width", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
