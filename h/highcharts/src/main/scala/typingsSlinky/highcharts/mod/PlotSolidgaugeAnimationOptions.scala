package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSolidgaugeAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
}

object PlotSolidgaugeAnimationOptions {
  @scala.inline
  def apply(): PlotSolidgaugeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSolidgaugeAnimationOptions]
  }
  @scala.inline
  implicit class PlotSolidgaugeAnimationOptionsOps[Self <: PlotSolidgaugeAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

