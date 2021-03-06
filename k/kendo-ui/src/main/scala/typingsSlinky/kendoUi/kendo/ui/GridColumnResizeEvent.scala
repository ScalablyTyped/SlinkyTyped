package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnResizeEvent extends GridEvent {
  
  var column: js.UndefOr[js.Any] = js.native
  
  var newWidth: js.UndefOr[Double] = js.native
  
  var oldWidth: js.UndefOr[Double] = js.native
}
object GridColumnResizeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnResizeEvent]
  }
  
  @scala.inline
  implicit class GridColumnResizeEventMutableBuilder[Self <: GridColumnResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
    
    @scala.inline
    def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
  }
}
