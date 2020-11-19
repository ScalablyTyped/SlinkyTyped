package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableResize extends js.Object {
  
  var handles: js.UndefOr[DiagramEditableResizeHandles] = js.native
}
object DiagramEditableResize {
  
  @scala.inline
  def apply(): DiagramEditableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResize]
  }
  
  @scala.inline
  implicit class DiagramEditableResizeOps[Self <: DiagramEditableResize] (val x: Self) extends AnyVal {
    
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
    def setHandles(value: DiagramEditableResizeHandles): Self = this.set("handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
  }
}
