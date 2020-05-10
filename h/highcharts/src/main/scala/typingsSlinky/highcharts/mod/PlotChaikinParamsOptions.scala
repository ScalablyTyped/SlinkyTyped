package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotChaikinParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Chaikin Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.native
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}

object PlotChaikinParamsOptions {
  @scala.inline
  def apply(): PlotChaikinParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotChaikinParamsOptions]
  }
  @scala.inline
  implicit class PlotChaikinParamsOptionsOps[Self <: PlotChaikinParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withVolumeSeriesID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSeriesID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSeriesID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSeriesID")(js.undefined)
        ret
    }
  }
  
}

