package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPriceenvelopesParamsOptions extends js.Object {
  /**
    * (Highstock) Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.
    */
  var bottomBand: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.
    */
  var topBand: js.UndefOr[Double] = js.native
}

object PlotPriceenvelopesParamsOptions {
  @scala.inline
  def apply(): PlotPriceenvelopesParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesParamsOptions]
  }
  @scala.inline
  implicit class PlotPriceenvelopesParamsOptionsOps[Self <: PlotPriceenvelopesParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomBand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBand")(js.undefined)
        ret
    }
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
    def withTopBand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBand")(js.undefined)
        ret
    }
  }
  
}

