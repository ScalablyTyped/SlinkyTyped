package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withHandles(value: DiagramEditableResizeHandles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(js.undefined)
        ret
    }
  }
  
}

