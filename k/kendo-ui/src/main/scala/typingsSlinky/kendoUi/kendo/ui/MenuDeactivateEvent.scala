package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuDeactivateEvent extends MenuEvent {
  
  var item: js.UndefOr[HTMLElement] = js.native
}
object MenuDeactivateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Menu): MenuDeactivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDeactivateEvent]
  }
  
  @scala.inline
  implicit class MenuDeactivateEventMutableBuilder[Self <: MenuDeactivateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
