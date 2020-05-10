package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotZigzagParamsOptions extends js.Object {
  /**
    * (Highstock) The threshold for the value change.
    *
    * For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.
    */
  var deviation: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The point index which indicator calculations will base - high
    * value.
    *
    * For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.
    */
  var highIndex: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The point index which indicator calculations will base - low
    * value.
    *
    * For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.
    */
  var lowIndex: js.UndefOr[Double] = js.native
}

object PlotZigzagParamsOptions {
  @scala.inline
  def apply(): PlotZigzagParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotZigzagParamsOptions]
  }
  @scala.inline
  implicit class PlotZigzagParamsOptionsOps[Self <: PlotZigzagParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviation")(js.undefined)
        ret
    }
    @scala.inline
    def withHighIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowIndex")(js.undefined)
        ret
    }
  }
  
}

