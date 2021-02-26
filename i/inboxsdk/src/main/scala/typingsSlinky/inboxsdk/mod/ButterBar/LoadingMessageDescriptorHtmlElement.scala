package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingMessageDescriptorHtmlElement
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  
  var el: HTMLElement = js.native
}
object LoadingMessageDescriptorHtmlElement {
  
  @scala.inline
  def apply(el: HTMLElement): LoadingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtmlElement]
  }
  
  @scala.inline
  implicit class LoadingMessageDescriptorHtmlElementMutableBuilder[Self <: LoadingMessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
