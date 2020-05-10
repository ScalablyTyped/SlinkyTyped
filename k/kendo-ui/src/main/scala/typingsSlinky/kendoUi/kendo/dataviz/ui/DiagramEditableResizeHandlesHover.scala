package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEditableResizeHandlesHover extends js.Object {
  var fill: js.UndefOr[String | DiagramEditableResizeHandlesHoverFill] = js.native
  var stroke: js.UndefOr[DiagramEditableResizeHandlesHoverStroke] = js.native
}

object DiagramEditableResizeHandlesHover {
  @scala.inline
  def apply(): DiagramEditableResizeHandlesHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResizeHandlesHover]
  }
  @scala.inline
  implicit class DiagramEditableResizeHandlesHoverOps[Self <: DiagramEditableResizeHandlesHover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String | DiagramEditableResizeHandlesHoverFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: DiagramEditableResizeHandlesHoverStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

