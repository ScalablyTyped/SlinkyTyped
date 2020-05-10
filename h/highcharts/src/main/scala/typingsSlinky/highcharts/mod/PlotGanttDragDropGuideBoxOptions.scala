package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttDragDropGuideBoxOptions extends js.Object {
  /**
    * (Gantt) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotGanttDragDropGuideBoxDefaultOptions] = js.native
}

object PlotGanttDragDropGuideBoxOptions {
  @scala.inline
  def apply(): PlotGanttDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttDragDropGuideBoxOptions]
  }
  @scala.inline
  implicit class PlotGanttDragDropGuideBoxOptionsOps[Self <: PlotGanttDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: PlotGanttDragDropGuideBoxDefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

