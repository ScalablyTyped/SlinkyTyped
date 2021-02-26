package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarActivateEvent extends PanelBarEvent {
  
  var item: js.UndefOr[Element] = js.native
}
object PanelBarActivateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PanelBar): PanelBarActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarActivateEvent]
  }
  
  @scala.inline
  implicit class PanelBarActivateEventMutableBuilder[Self <: PanelBarActivateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
