package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarCollapseEvent extends PanelBarEvent {
  
  var item: js.UndefOr[Element] = js.native
}
object PanelBarCollapseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PanelBar): PanelBarCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarCollapseEvent]
  }
  
  @scala.inline
  implicit class PanelBarCollapseEventMutableBuilder[Self <: PanelBarCollapseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
