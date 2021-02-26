package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputMediaBase extends StObject {
  
  var caption: js.UndefOr[String] = js.native
  
  var media: String = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
}
object InputMediaBase {
  
  @scala.inline
  def apply(media: String): InputMediaBase = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaBase]
  }
  
  @scala.inline
  implicit class InputMediaBaseMutableBuilder[Self <: InputMediaBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
