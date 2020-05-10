package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotKeltnerchannelsParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The ATR multiplier.
    */
  var multiplierATR: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The ATR period.
    */
  var periodATR: js.UndefOr[Double] = js.native
}

object PlotKeltnerchannelsParamsOptions {
  @scala.inline
  def apply(): PlotKeltnerchannelsParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsParamsOptions]
  }
  @scala.inline
  implicit class PlotKeltnerchannelsParamsOptionsOps[Self <: PlotKeltnerchannelsParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplierATR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplierATR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplierATR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplierATR")(js.undefined)
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
    @scala.inline
    def withPeriodATR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodATR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodATR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodATR")(js.undefined)
        ret
    }
  }
  
}

