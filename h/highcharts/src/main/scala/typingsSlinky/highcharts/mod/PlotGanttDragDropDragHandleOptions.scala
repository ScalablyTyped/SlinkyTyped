package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttDragDropDragHandleOptions extends js.Object {
  /**
    * (Gantt) The class name of the drag handles. Defaults to
    * `highcharts-drag-handle`.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Gantt) The fill color of the drag handles.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Gantt) The mouse cursor to use for the drag handles. By default this is
    * intelligently switching between `ew-resize` and `ns-resize` depending on
    * the direction the point is being dragged.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * (Gantt) The line color of the drag handles.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  /**
    * (Gantt) The line width for the drag handles.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Function to define the SVG path to use for the drag handles.
    * Takes the point as argument. Should return an SVG path in array format.
    * The SVG path is automatically positioned on the point.
    */
  var pathFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Gantt) The z index for the drag handles.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object PlotGanttDragDropDragHandleOptions {
  @scala.inline
  def apply(): PlotGanttDragDropDragHandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttDragDropDragHandleOptions]
  }
  @scala.inline
  implicit class PlotGanttDragDropDragHandleOptionsOps[Self <: PlotGanttDragDropDragHandleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPathFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

