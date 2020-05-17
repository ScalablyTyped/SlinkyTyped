package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.ButterBar.SavingMessageDescriptorText
  - typingsSlinky.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml
  - typingsSlinky.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement
*/
trait SavingMessageDescriptor extends js.Object

object SavingMessageDescriptor {
  @scala.inline
  implicit def apply(value: SavingMessageDescriptorHtml): SavingMessageDescriptor = value.asInstanceOf[SavingMessageDescriptor]
  @scala.inline
  implicit def apply(value: SavingMessageDescriptorHtmlElement): SavingMessageDescriptor = value.asInstanceOf[SavingMessageDescriptor]
  @scala.inline
  implicit def apply(value: SavingMessageDescriptorText): SavingMessageDescriptor = value.asInstanceOf[SavingMessageDescriptor]
}

