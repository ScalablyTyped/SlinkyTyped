package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMappointPointOptions extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMappointPointEventsOptions] = js.native
}

object PlotMappointPointOptions {
  @scala.inline
  def apply(): PlotMappointPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMappointPointOptions]
  }
  @scala.inline
  implicit class PlotMappointPointOptionsOps[Self <: PlotMappointPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotMappointPointEventsOptions): Self = {
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

