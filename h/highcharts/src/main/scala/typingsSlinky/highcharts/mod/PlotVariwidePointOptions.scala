package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVariwidePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotVariwidePointEventsOptions] = js.native
}

object PlotVariwidePointOptions {
  @scala.inline
  def apply(): PlotVariwidePointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVariwidePointOptions]
  }
  @scala.inline
  implicit class PlotVariwidePointOptionsOps[Self <: PlotVariwidePointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotVariwidePointEventsOptions): Self = {
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

