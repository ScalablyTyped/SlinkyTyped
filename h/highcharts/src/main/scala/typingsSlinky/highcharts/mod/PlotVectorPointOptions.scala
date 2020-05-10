package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVectorPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotVectorPointEventsOptions] = js.native
}

object PlotVectorPointOptions {
  @scala.inline
  def apply(): PlotVectorPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorPointOptions]
  }
  @scala.inline
  implicit class PlotVectorPointOptionsOps[Self <: PlotVectorPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotVectorPointEventsOptions): Self = {
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

