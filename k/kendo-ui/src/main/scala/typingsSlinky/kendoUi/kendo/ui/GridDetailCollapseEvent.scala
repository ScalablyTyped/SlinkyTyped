package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridDetailCollapseEvent extends GridEvent {
  
  var detailRow: js.UndefOr[JQuery] = js.native
  
  var masterRow: js.UndefOr[JQuery] = js.native
}
object GridDetailCollapseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
  
  @scala.inline
  implicit class GridDetailCollapseEventMutableBuilder[Self <: GridDetailCollapseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailRow(value: JQuery): Self = StObject.set(x, "detailRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailRowUndefined: Self = StObject.set(x, "detailRow", js.undefined)
    
    @scala.inline
    def setMasterRow(value: JQuery): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
  }
}
