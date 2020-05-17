package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.mod.InputMediaPhoto
  - typingsSlinky.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends js.Object

object InputMedia {
  @scala.inline
  implicit def apply(value: InputMediaPhoto): InputMedia = value.asInstanceOf[InputMedia]
  @scala.inline
  implicit def apply(value: InputMediaVideo): InputMedia = value.asInstanceOf[InputMedia]
}

