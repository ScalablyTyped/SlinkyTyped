package typingsSlinky.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageViewLinkDescriptor extends StObject {
  
  var element: HTMLElement = js.native
  
  var href: String = js.native
  
  var html: String = js.native
  
  var isInQuotedArea: Boolean = js.native
  
  var text: String = js.native
}
object MessageViewLinkDescriptor {
  
  @scala.inline
  def apply(element: HTMLElement, href: String, html: String, isInQuotedArea: Boolean, text: String): MessageViewLinkDescriptor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isInQuotedArea = isInQuotedArea.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
  
  @scala.inline
  implicit class MessageViewLinkDescriptorMutableBuilder[Self <: MessageViewLinkDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInQuotedArea(value: Boolean): Self = StObject.set(x, "isInQuotedArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
