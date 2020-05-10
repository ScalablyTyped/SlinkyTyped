package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSupertrendParamsOptions extends js.Object {
  /**
    * (Highstock) Multiplier for Supertrend Indicator.
    */
  var multiplier: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator Supertrend Indicator
    * calculations. This is the number of data points which are taken into
    * account for the indicator calculations.
    */
  var period: js.UndefOr[Double] = js.native
}

object PlotSupertrendParamsOptions {
  @scala.inline
  def apply(): PlotSupertrendParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendParamsOptions]
  }
  @scala.inline
  implicit class PlotSupertrendParamsOptionsOps[Self <: PlotSupertrendParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(js.undefined)
        ret
    }
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

