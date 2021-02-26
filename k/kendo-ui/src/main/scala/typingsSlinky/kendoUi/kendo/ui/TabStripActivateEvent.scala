package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripActivateEvent extends TabStripEvent {
  
  var contentElement: js.UndefOr[Element] = js.native
  
  var item: js.UndefOr[Element] = js.native
}
object TabStripActivateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TabStrip): TabStripActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripActivateEvent]
  }
  
  @scala.inline
  implicit class TabStripActivateEventMutableBuilder[Self <: TabStripActivateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentElement(value: Element): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    @scala.inline
    def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
