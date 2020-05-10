package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSeriesPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events for each single point.
    */
  var events: js.UndefOr[PlotSeriesPointEventsOptions] = js.native
}

object PlotSeriesPointOptions {
  @scala.inline
  def apply(): PlotSeriesPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesPointOptions]
  }
  @scala.inline
  implicit class PlotSeriesPointOptionsOps[Self <: PlotSeriesPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotSeriesPointEventsOptions): Self = {
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

