package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMaplinePointOptions extends js.Object {
  /**
    * (Highmaps) Events for each single point.
    */
  var events: js.UndefOr[PlotMaplinePointEventsOptions] = js.native
}

object PlotMaplinePointOptions {
  @scala.inline
  def apply(): PlotMaplinePointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMaplinePointOptions]
  }
  @scala.inline
  implicit class PlotMaplinePointOptionsOps[Self <: PlotMaplinePointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: PlotMaplinePointEventsOptions): Self = {
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

