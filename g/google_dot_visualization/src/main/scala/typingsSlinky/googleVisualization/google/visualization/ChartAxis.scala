package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxis extends js.Object {
  var allowContainerBoundaryTextCufoff: js.UndefOr[Boolean] = js.native
  var baseline: js.UndefOr[Double] = js.native
   // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[String] = js.native
   // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[Double] = js.native
   // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[String] = js.native
   // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.native
  var logScale: js.UndefOr[Boolean] = js.native
  var maxAlternation: js.UndefOr[Double] = js.native
  var maxTextLines: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
  var minTextSpacing: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
  var minorGridlines: js.UndefOr[ChartGridlines] = js.native
  var showTextEvery: js.UndefOr[Double] = js.native
  var slantedText: js.UndefOr[Boolean] = js.native
  var slantedTextAngle: js.UndefOr[Double] = js.native
  var textPosition: js.UndefOr[String] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  var ticks: js.UndefOr[js.Array[_]] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  var viewWindow: js.UndefOr[ChartViewWindow] = js.native
  var viewWindowMode: js.UndefOr[String] = js.native
}

object ChartAxis {
  @scala.inline
  def apply(): ChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxis]
  }
  @scala.inline
  implicit class ChartAxisOps[Self <: ChartAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowContainerBoundaryTextCufoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerBoundaryTextCufoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowContainerBoundaryTextCufoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerBoundaryTextCufoff")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withGridlines(value: ChartGridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withLogScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAlternation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAlternation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTextLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTextLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTextLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTextLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double | js.Date | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTextSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTextSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTextSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTextSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double | js.Date | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridlines(value: ChartGridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTextEvery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTextEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTextEvery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTextEvery")(js.undefined)
        ret
    }
    @scala.inline
    def withSlantedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slantedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlantedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slantedText")(js.undefined)
        ret
    }
    @scala.inline
    def withSlantedTextAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slantedTextAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlantedTextAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slantedTextAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withViewWindow(value: ChartViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withViewWindowMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewWindowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewWindowMode")(js.undefined)
        ret
    }
  }
  
}

