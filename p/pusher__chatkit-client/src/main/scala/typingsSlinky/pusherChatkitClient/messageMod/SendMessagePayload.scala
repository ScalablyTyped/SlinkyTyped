package typingsSlinky.pusherChatkitClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pusherChatkitClient.messageMod.InlinePayload
  - typingsSlinky.pusherChatkitClient.messageMod.UrlPayload
  - typingsSlinky.pusherChatkitClient.messageMod.FilePayload
*/
trait SendMessagePayload extends js.Object

object SendMessagePayload {
  @scala.inline
  implicit def apply(value: FilePayload): SendMessagePayload = value.asInstanceOf[SendMessagePayload]
  @scala.inline
  implicit def apply(value: InlinePayload): SendMessagePayload = value.asInstanceOf[SendMessagePayload]
  @scala.inline
  implicit def apply(value: UrlPayload): SendMessagePayload = value.asInstanceOf[SendMessagePayload]
}

