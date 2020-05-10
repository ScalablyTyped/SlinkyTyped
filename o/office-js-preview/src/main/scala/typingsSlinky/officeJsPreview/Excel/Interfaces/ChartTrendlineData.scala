package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartTrendlineType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exponential
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Linear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MovingAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Polynomial
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTrendline.toJSON()`. */
@js.native
trait ChartTrendlineData extends js.Object {
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatData] = js.native
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelData] = js.native
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Double] = js.native
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
  ] = js.native
}

object ChartTrendlineData {
  @scala.inline
  def apply(): ChartTrendlineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineData]
  }
  @scala.inline
  implicit class ChartTrendlineDataOps[Self <: ChartTrendlineData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackwardPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwardPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackwardPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwardPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartTrendlineFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withIntercept(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: ChartTrendlineLabelData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingAveragePeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingAveragePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingAveragePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingAveragePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPolynomialOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polynomialOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolynomialOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polynomialOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEquation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEquation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEquation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEquation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRSquared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRSquared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRSquared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRSquared")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

