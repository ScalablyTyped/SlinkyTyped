package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorText
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorHtml
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorHtmlElement
*/
trait LoadingMessageDescriptor extends js.Object

object LoadingMessageDescriptor {
  @scala.inline
  implicit def apply(value: LoadingMessageDescriptorHtml): LoadingMessageDescriptor = value.asInstanceOf[LoadingMessageDescriptor]
  @scala.inline
  implicit def apply(value: LoadingMessageDescriptorHtmlElement): LoadingMessageDescriptor = value.asInstanceOf[LoadingMessageDescriptor]
  @scala.inline
  implicit def apply(value: LoadingMessageDescriptorText): LoadingMessageDescriptor = value.asInstanceOf[LoadingMessageDescriptor]
}

