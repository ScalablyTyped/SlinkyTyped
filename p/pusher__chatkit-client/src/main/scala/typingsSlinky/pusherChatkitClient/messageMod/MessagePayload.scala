package typingsSlinky.pusherChatkitClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pusherChatkitClient.messageMod.InlinePayload
  - typingsSlinky.pusherChatkitClient.messageMod.UrlPayload
  - typingsSlinky.pusherChatkitClient.messageMod.AttachmentPayload
*/
trait MessagePayload extends js.Object

object MessagePayload {
  @scala.inline
  implicit def apply(value: AttachmentPayload): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: InlinePayload): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: UrlPayload): MessagePayload = value.asInstanceOf[MessagePayload]
}

