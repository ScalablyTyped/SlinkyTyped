package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMacdParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The long period for indicator calculations.
    */
  var longPeriod: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The short period for indicator calculations.
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.native
}

object PlotMacdParamsOptions {
  @scala.inline
  def apply(): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
  @scala.inline
  implicit class PlotMacdParamsOptionsOps[Self <: PlotMacdParamsOptions] (val x: Self) extends AnyVal {
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
    def withLongPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(js.undefined)
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
    def withShortPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalPeriod")(js.undefined)
        ret
    }
  }
  
}

