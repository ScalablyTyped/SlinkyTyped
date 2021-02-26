package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDescriptorHtmlElement
  extends MessageDescriptorBase
     with MessageDescriptor {
  
  var el: HTMLElement = js.native
}
object MessageDescriptorHtmlElement {
  
  @scala.inline
  def apply(el: HTMLElement): MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtmlElement]
  }
  
  @scala.inline
  implicit class MessageDescriptorHtmlElementMutableBuilder[Self <: MessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
