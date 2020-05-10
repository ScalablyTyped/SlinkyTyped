package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotLinearregressionParamsOptions extends js.Object {
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
    * (Highstock) Unit (in milliseconds) for the x axis distances used to
    * compute the regression line paramters (slope & intercept) for every
    * range. In Highstock the x axis values are always represented in
    * milliseconds which may cause that distances between points are "big"
    * integer numbers.
    *
    * Highstock's linear regression algorithm (least squares method) will
    * utilize these "big" integers for finding the slope and the intercept of
    * the regression line for each period. In consequence, this value may be a
    * very "small" decimal number that's hard to interpret by a human.
    *
    * For instance: `xAxisUnit` equealed to `86400000` ms (1 day) forces the
    * algorithm to treat `86400000` as `1` while computing the slope and the
    * intercept. This may enchance the legiblitity of the indicator's values.
    *
    * Default value is the closest distance between two data points.
    */
  var xAxisUnit: js.UndefOr[Double] = js.native
}

object PlotLinearregressionParamsOptions {
  @scala.inline
  def apply(): PlotLinearregressionParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressionParamsOptions]
  }
  @scala.inline
  implicit class PlotLinearregressionParamsOptionsOps[Self <: PlotLinearregressionParamsOptions] (val x: Self) extends AnyVal {
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
    def withXAxisUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisUnit")(js.undefined)
        ret
    }
  }
  
}

