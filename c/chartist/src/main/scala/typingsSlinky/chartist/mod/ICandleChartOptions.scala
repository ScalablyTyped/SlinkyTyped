package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleChartOptions extends IChartOptions {
  /**
    * Options for X-Axis
    */
  var axisX: js.UndefOr[ICandleChartAxis] = js.native
  /**
    * Options for Y-Axis
    */
  var axisY: js.UndefOr[ICandleChartAxis] = js.native
  /**
    * Width of candle wick in pixel (IMO is 1 px best minimum value)
    */
  var candleWickWidth: js.UndefOr[Double | String] = js.native
  /**
    * Width of candle body in pixel (IMO is 2 px best minimum value)
    */
  var candleWidth: js.UndefOr[Double | String] = js.native
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | Double] = js.native
  /**
    * Override the class names that get used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[ICandleChartClasses] = js.native
  /**
    * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawncorrectly you might need to add chart padding or offset the last label with a draw event handler.
    */
  var fullWidth: js.UndefOr[Boolean | String] = js.native
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
    */
  var hight: js.UndefOr[Double | String] = js.native
  /**
    * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
    */
  var low: js.UndefOr[Double | String] = js.native
  /**
    * Use 1/3 of candle body width as width for the candle wick, otherwise the candleWickWidth is being used.
    */
  var useOneThirdAsCandleWickWidth: js.UndefOr[Boolean | String] = js.native
  /**
    * Use calculated x-axis step length, depending on the number of quotes to display, as candle width. Otherwise the candleWidth is being used.
    */
  var useStepLengthAsCandleWidth: js.UndefOr[Boolean | String] = js.native
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.native
}

object ICandleChartOptions {
  @scala.inline
  def apply(): ICandleChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartOptions]
  }
  @scala.inline
  implicit class ICandleChartOptionsOps[Self <: ICandleChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisX(value: ICandleChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisY(value: ICandleChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(js.undefined)
        ret
    }
    @scala.inline
    def withCandleWickWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleWickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandleWickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleWickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCandleWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withChartPadding(value: IChartPadding | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ICandleChartClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hight")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOneThirdAsCandleWickWidth(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOneThirdAsCandleWickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOneThirdAsCandleWickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOneThirdAsCandleWickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStepLengthAsCandleWidth(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStepLengthAsCandleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStepLengthAsCandleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStepLengthAsCandleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

