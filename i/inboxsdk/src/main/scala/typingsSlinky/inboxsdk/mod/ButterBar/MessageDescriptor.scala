package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorText
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtml
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement
*/
trait MessageDescriptor extends js.Object

object MessageDescriptor {
  @scala.inline
  implicit def apply(value: MessageDescriptorHtml): MessageDescriptor = value.asInstanceOf[MessageDescriptor]
  @scala.inline
  implicit def apply(value: MessageDescriptorHtmlElement): MessageDescriptor = value.asInstanceOf[MessageDescriptor]
  @scala.inline
  implicit def apply(value: MessageDescriptorText): MessageDescriptor = value.asInstanceOf[MessageDescriptor]
}

