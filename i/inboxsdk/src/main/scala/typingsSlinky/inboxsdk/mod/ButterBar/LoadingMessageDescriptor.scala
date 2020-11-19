package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorText
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorHtml
  - typingsSlinky.inboxsdk.mod.ButterBar.LoadingMessageDescriptorHtmlElement
*/
trait LoadingMessageDescriptor extends js.Object
object LoadingMessageDescriptor {
  
  @scala.inline
  def LoadingMessageDescriptorText(text: String): LoadingMessageDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptor]
  }
  
  @scala.inline
  def LoadingMessageDescriptorHtml(html: String): LoadingMessageDescriptor = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptor]
  }
  
  @scala.inline
  def LoadingMessageDescriptorHtmlElement(el: HTMLElement): LoadingMessageDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptor]
  }
}
