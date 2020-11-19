package typingsSlinky.agGrid.gridOptionsMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcessPopupParams extends js.Object {
  
  var column: js.UndefOr[Column] = js.native
  
  var ePopup: HTMLElement = js.native
  
  var eventSource: js.UndefOr[HTMLElement] = js.native
  
  var mouseEvent: js.UndefOr[MouseEvent | Touch] = js.native
  
  var rowNode: js.UndefOr[RowNode] = js.native
  
  var `type`: String = js.native
}
object PostProcessPopupParams {
  
  @scala.inline
  def apply(ePopup: HTMLElement, `type`: String): PostProcessPopupParams = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessPopupParams]
  }
  
  @scala.inline
  implicit class PostProcessPopupParamsOps[Self <: PostProcessPopupParams] (val x: Self) extends AnyVal {
    
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
    def setEPopup(value: HTMLElement): Self = this.set("ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setEventSource(value: HTMLElement): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSource: Self = this.set("eventSource", js.undefined)
    
    @scala.inline
    def setMouseEventTouch(value: Touch): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventMouseEvent(value: MouseEvent): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: MouseEvent | Touch): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseEvent: Self = this.set("mouseEvent", js.undefined)
    
    @scala.inline
    def setRowNode(value: RowNode): Self = this.set("rowNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowNode: Self = this.set("rowNode", js.undefined)
  }
}
