package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisXOptions extends ChartAxisOptions {
  /**
    * Sets the Color of Grid Lines. Value of gridColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#FEFDDF" ..
    */
  var gridColor: js.UndefOr[String] = js.native
  /**
    * Sets the Dash Type for grid lines on axisX.
    * Default: solid
    */
  var gridDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets the Thickness of Grid Lines. To display grid on Axis X, set the Grid Thickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var gridThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the Interlacing Color that alternates between the set interval.
    * If the interval is not set explicitly, then the auto calculated interval is considered. The value of interlacedColor can be a “HTML Color Name” or “hex” code.
    * Default: null
    * Example: "#F8F1E4", "#FEFDDF"...
    */
  var interlacedColor: js.UndefOr[String] = js.native
  /**
    * Sets the distance between Tick Marks, Grid Lines and Interlaced Colors.
    * Default: Automatically Calculated
    * Example: 50, 75..
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * intervalType is the unit of interval property.
    *  intervalType is by default set to "number" and hence you need to specify the interval type (eg "week", "month", etc) depending on the type of interval you intend to set.
    * If required interval is 3 months, you need to provide interval as 3 and intervalType as "month"
    * Default: Automatically handled when interval property is not set. Defaults to "number" when you set the interval.
    * Option: "number","millisecond" ,"second"," minute", "hour", "day", "month" ,"year"
    * Example: for interval as 15 minutes, set interval as 15, and set intervalType as "minute",
    */
  var intervalType: js.UndefOr[String] = js.native
  /**
    * Sets the angle for Axis Labels.
    * Notes:
    * 1.Units in degrees.
    * 2.Values can be positive or negative.
    * Default: null;
    * Example: 20, 45, -30..
    */
  var labelAngle: js.UndefOr[Double] = js.native
  /**
    * Setting labelAutoFit to true automatically wraps and/or rotates and/or reduces font size of label when they are too long and overlaps,
    * finds the best-fit and automatically manages label overlapping.
    * Default: true
    * Options: true, false
    */
  var labelAutoFit: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Axis Label background color. The value of labelBackgroundColor can be a “HTML Color Name” or “hex” code.
    * Default: “transparent”
    * Example: “red”,”#fabd76″
    */
  var labelBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the Axis Label color. The value of labelFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var labelFontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of Axis labels.
    * Default: “calibri, optima, Candara, Verdana, Geneva, sans-serif”
    * Example: “calibri”, “tahoma”, “verdana” ..
    */
  var labelFontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the Axis Label Font Size in pixels.
    * Default: Automatically Calculated based on Chart Size
    * Example: 16, 18, 22..
    */
  var labelFontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the Font Style of Axis Labels. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var labelFontStyle: js.UndefOr[String] = js.native
  /**
    * Set the font Weight used in Axis Labels. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.native
  /**
    * A custom formatter function that returns label to be displayed on axisX.
    * Notes:
    * 1.labelFormatter function should return a string.
    * 2.You can use formatNumber and formatDate functions to format number/date values inside the formatter function.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ AnonLabel, String]] = js.native
  /**
    * Sets the maximum width of label after which it gets wrapped or clipped depending on whether labelWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: js.UndefOr[Double] = js.native
  /**
    * labelWrap specifies whether to wrap or clip label once its width crosses labelMaxWidth.
    * Default: true
    * Example: true, false
    */
  var labelWrap: js.UndefOr[Boolean] = js.native
  /**
    * Sets the logarithm base for Axis X. Works only when logarithm property is set to true.
    * Default: 10
    * Options: 2, 16, Math.E, ..
    */
  var logarithmBase: js.UndefOr[Double] = js.native
  /**
    * Setting logarithmic property to true changes axis scale to logarithmic scale. Default Logarithm Base is 10 – which you can customize using logarithmBase property.
    * Default: false
    * Options: true, false
    */
  var logarithmic: js.UndefOr[Boolean] = js.native
  /**
    * A string that prepends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Setting reversed property to true shows axis in reverse order.
    * Default: false
    * Options: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * Strip Lines / Trend Lines are vertical or horizontal lines used to highlight/mark a certain region on the plot area.
    * You can choose whether to draw a line at a specific position or shade a region on the plot area. Strip Lines are also referred to as Trend Lines.
    */
  var stripLines: js.UndefOr[ChartStripLinesOptions | js.Array[ChartStripLinesOptions]] = js.native
  /**
    * A string that appends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Sets the color of Tick Marks drawn on the axis. The value of tickColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#006400".
    */
  var tickColor: js.UndefOr[String] = js.native
  /**
    * Sets the length of Tick Marks that are drawn on the Axis.
    * Default: 5
    * Example: 10, 14..
    */
  var tickLength: js.UndefOr[Double] = js.native
  /**
    * Sets the thickness of the Tick Marks in pixels.
    * Default: 2
    * Example: 3, 4..
    */
  var tickThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether titleWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of axis.
    * Example: 100, 200...
    */
  var titleMaxWidth: js.UndefOr[Double] = js.native
  /**
    * TitleWrap specifies whether to wrap or clip axis title once its width crosses titleMaxWidth.
    * Default: true
    * Options: true, false
    */
  var titleWrap: js.UndefOr[Boolean] = js.native
  /**
    * Defines how values must be formatted before they appear on Axis X.
    * You can format numbers and date time values using this property.
    * More Detail: https://canvasjs.com/docs/charts/chart-options/axisx/valueformatstring/
    */
  var valueFormatString: js.UndefOr[String] = js.native
}

object ChartAxisXOptions {
  @scala.inline
  def apply(): ChartAxisXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisXOptions]
  }
  @scala.inline
  implicit class ChartAxisXOptionsOps[Self <: ChartAxisXOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withGridThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withInterlacedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlacedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterlacedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlacedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAutoFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAutoFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAutoFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAutoFit")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatter(value: /* e */ AnonLabel => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withLogarithmic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmic")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLines(value: ChartStripLinesOptions | js.Array[ChartStripLinesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTickThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatString")(js.undefined)
        ret
    }
  }
  
}

