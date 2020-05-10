package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotAroonParamsOptions extends js.Object {
  /**
    * (Highstock) Period for Aroon indicator
    */
  var period: js.UndefOr[Double] = js.native
}

object PlotAroonParamsOptions {
  @scala.inline
  def apply(): PlotAroonParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonParamsOptions]
  }
  @scala.inline
  implicit class PlotAroonParamsOptionsOps[Self <: PlotAroonParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
  }
  
}

