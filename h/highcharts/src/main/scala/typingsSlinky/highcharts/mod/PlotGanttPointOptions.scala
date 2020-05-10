package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttPointOptions extends js.Object {
  /**
    * (Gantt) Events for each single point.
    */
  var events: js.UndefOr[PlotGanttPointEventsOptions] = js.native
}

object PlotGanttPointOptions {
  @scala.inline
  def apply(): PlotGanttPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttPointOptions]
  }
  @scala.inline
  implicit class PlotGanttPointOptionsOps[Self <: PlotGanttPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotGanttPointEventsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

