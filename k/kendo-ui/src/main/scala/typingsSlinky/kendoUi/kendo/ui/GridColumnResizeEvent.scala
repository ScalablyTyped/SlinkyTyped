package typingsSlinky.kendoUi.kendo.ui

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
  implicit class GridColumnResizeEventOps[Self <: GridColumnResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setNewWidth(value: Double): Self = this.set("newWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewWidth: Self = this.set("newWidth", js.undefined)
    
    @scala.inline
    def setOldWidth(value: Double): Self = this.set("oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldWidth: Self = this.set("oldWidth", js.undefined)
  }
}
