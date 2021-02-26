package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.mod.InputMediaPhoto
  - typingsSlinky.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends StObject
object InputMedia {
  
  @scala.inline
  def InputMediaPhoto(media: String, `type`: photo): typingsSlinky.nodeTelegramBotApi.mod.InputMediaPhoto = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InputMediaPhoto]
  }
  
  @scala.inline
  def InputMediaVideo(media: String, `type`: video): typingsSlinky.nodeTelegramBotApi.mod.InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeTelegramBotApi.mod.InputMediaVideo]
  }
}
