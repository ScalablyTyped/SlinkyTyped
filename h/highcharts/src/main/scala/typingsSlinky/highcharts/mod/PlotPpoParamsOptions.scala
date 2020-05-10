package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPpoParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    *
    * By default index value used to be set to 0. Since Highstock 7 by default
    * index is set to 3 which means that the ema indicator will be calculated
    * using Close values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Periods for Percentage Price Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.native
}

object PlotPpoParamsOptions {
  @scala.inline
  def apply(): PlotPpoParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPpoParamsOptions]
  }
  @scala.inline
  implicit class PlotPpoParamsOptionsOps[Self <: PlotPpoParamsOptions] (val x: Self) extends AnyVal {
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
    def withPeriods(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periods")(js.undefined)
        ret
    }
  }
  
}

