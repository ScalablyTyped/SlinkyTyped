package typingsSlinky.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.SignedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.DeclinedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.CanceledMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.SentMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.TemplateCreatedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.ErrorMessageEvent
*/
trait MessageEvent extends js.Object

object MessageEvent {
  @scala.inline
  implicit def apply(value: CanceledMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
  @scala.inline
  implicit def apply(value: DeclinedMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
  @scala.inline
  implicit def apply(value: ErrorMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
  @scala.inline
  implicit def apply(value: SentMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
  @scala.inline
  implicit def apply(value: SignedMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
  @scala.inline
  implicit def apply(value: TemplateCreatedMessageEvent): MessageEvent = value.asInstanceOf[MessageEvent]
}

