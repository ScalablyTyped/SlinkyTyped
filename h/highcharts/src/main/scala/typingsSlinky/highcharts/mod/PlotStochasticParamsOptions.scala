package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotStochasticParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Stochastic oscillator: [%K, %D].
    */
  var periods: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object PlotStochasticParamsOptions {
  @scala.inline
  def apply(): PlotStochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticParamsOptions]
  }
  @scala.inline
  implicit class PlotStochasticParamsOptionsOps[Self <: PlotStochasticParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriods(value: js.Tuple2[Double, Double]): Self = {
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

