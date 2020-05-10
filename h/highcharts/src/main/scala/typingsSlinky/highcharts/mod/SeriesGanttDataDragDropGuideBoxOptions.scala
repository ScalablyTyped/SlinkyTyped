package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesGanttDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Gantt) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesGanttDataDragDropGuideBoxDefaultOptions] = js.native
}

object SeriesGanttDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(): SeriesGanttDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGanttDataDragDropGuideBoxOptions]
  }
  @scala.inline
  implicit class SeriesGanttDataDragDropGuideBoxOptionsOps[Self <: SeriesGanttDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: SeriesGanttDataDragDropGuideBoxDefaultOptions): Self = {
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

