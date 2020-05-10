package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotScatterPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotScatterPointEventsOptions] = js.native
}

object PlotScatterPointOptions {
  @scala.inline
  def apply(): PlotScatterPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterPointOptions]
  }
  @scala.inline
  implicit class PlotScatterPointOptionsOps[Self <: PlotScatterPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotScatterPointEventsOptions): Self = {
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

