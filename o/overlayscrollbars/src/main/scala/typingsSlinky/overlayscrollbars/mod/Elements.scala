package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.overlayscrollbars.anon.Handle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends StObject {
  
  var content: HTMLElement = js.native
  
  var host: HTMLElement = js.native
  
  var padding: HTMLElement = js.native
  
  var scrollbarCorner: HTMLElement = js.native
  
  var scrollbarHorizontal: Handle = js.native
  
  var scrollbarVertical: Handle = js.native
  
  var target: HTMLElement = js.native
  
  var viewport: HTMLElement = js.native
}
object Elements {
  
  @scala.inline
  def apply(
    content: HTMLElement,
    host: HTMLElement,
    padding: HTMLElement,
    scrollbarCorner: HTMLElement,
    scrollbarHorizontal: Handle,
    scrollbarVertical: Handle,
    target: HTMLElement,
    viewport: HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scrollbarCorner = scrollbarCorner.asInstanceOf[js.Any], scrollbarHorizontal = scrollbarHorizontal.asInstanceOf[js.Any], scrollbarVertical = scrollbarVertical.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  @scala.inline
  implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: HTMLElement): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarCorner(value: HTMLElement): Self = StObject.set(x, "scrollbarCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarHorizontal(value: Handle): Self = StObject.set(x, "scrollbarHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarVertical(value: Handle): Self = StObject.set(x, "scrollbarVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
