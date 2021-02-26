package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorText
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtml
  - typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement
*/
trait MessageDescriptor extends StObject
object MessageDescriptor {
  
  @scala.inline
  def MessageDescriptorHtml(html: String): typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtml]
  }
  
  @scala.inline
  def MessageDescriptorHtmlElement(el: HTMLElement): typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement]
  }
  
  @scala.inline
  def MessageDescriptorText(text: String): typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.ButterBar.MessageDescriptorText]
  }
}
