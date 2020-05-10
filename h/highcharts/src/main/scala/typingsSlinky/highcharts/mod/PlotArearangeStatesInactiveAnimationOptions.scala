package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotArearangeStatesInactiveAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
}

object PlotArearangeStatesInactiveAnimationOptions {
  @scala.inline
  def apply(): PlotArearangeStatesInactiveAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotArearangeStatesInactiveAnimationOptions]
  }
  @scala.inline
  implicit class PlotArearangeStatesInactiveAnimationOptionsOps[Self <: PlotArearangeStatesInactiveAnimationOptions] (val x: Self) extends AnyVal {
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

