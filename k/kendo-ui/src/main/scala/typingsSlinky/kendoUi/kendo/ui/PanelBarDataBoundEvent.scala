package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarDataBoundEvent extends PanelBarEvent {
  
  var node: js.UndefOr[JQuery] = js.native
}
object PanelBarDataBoundEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PanelBar): PanelBarDataBoundEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarDataBoundEvent]
  }
  
  @scala.inline
  implicit class PanelBarDataBoundEventMutableBuilder[Self <: PanelBarDataBoundEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: JQuery): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
