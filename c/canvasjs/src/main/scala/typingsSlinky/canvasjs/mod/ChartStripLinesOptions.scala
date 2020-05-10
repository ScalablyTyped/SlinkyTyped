package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.AnonAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartStripLinesOptions extends js.Object {
  /**
    * Sets the color of the stripLine.
    * Default: "orange"
    * Example: "green", "#23EA23"
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Sets the point where the stripLine’s shaded region ends on the x-axis.
    * Default: null
    * Example: 50,60,200,300
    */
  var endValue: js.UndefOr[Double] = js.native
  /**
    * Sets the label of the stripLine. These are shown on top of axis labels.
    * Default: "" (empty string)
    * Example: "Threshold", "Deaths in 1920"
    */
  var label: js.UndefOr[String] = js.native
  /**
    * labelAlign allows you to place the stripline’s Label far, center or near the axis.
    * Default: “far”
    * Options: “far”, “center”, “near”
    */
  var labelAlign: js.UndefOr[String] = js.native
  /**
    * Sets the background color of stripLine’s label.
    * Default: "#eeeeee"
    * Example: "red","#fabd76"
    */
  var labelBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the font color of label.
    * Default: "orange"
    * Example: "blue","#4135e9"
    */
  var labelFontColor: js.UndefOr[String] = js.native
  /**
    * Sets the font-family of stripLine’s label. If the first font is not found in the system from the specified font-family list, it tries to use the next font in the list.
    * Default: "arial"
    * Example: "Arial, Trebuchet MS, Tahoma, sans-serif"
    */
  var labelFontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the font size of the label in pixels.
    * Default: 12
    * Example: 18,19,20,22
    */
  var labelFontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the font style of stripLine’s label.
    * Default: "normal"
    * Example: "normal","italic","oblique"
    */
  var labelFontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the font weight of stripLine’s label.
    * Default: "normal"
    * Example: "lighter","normal","bold","bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.native
  /**
    * A custom formatter function that returns stripLine’s label.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[AnonAxis], String]] = js.native
  /**
    * labelMaxWidth defines the maximum width of labels after which they get wrapped or clipped depending on labelWrap’s value.
    * It overrides the labelMaxWidth value set at axis level.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: Double = js.native
  /**
    * labelPlacement allows you to place stripline’s Label either inside or outside of plotArea.
    * Default: “inside”
    * Options: “inside”, “outside”
    */
  var labelPlacement: js.UndefOr[String] = js.native
  /**
    * Setting labelWrap to true wraps the labels at labelMaxWidth. Clips the same when set to false. It overrides the labelWrap set at axis level.
    * Default: true
    * Example: true, false.
    */
  var labelWrap: Boolean = js.native
  /**
    * Sets the Dash Type for stripLine.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets opacity of stripLine.
    * Default: null
    * Example: .1, .5, 1 etc.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * stripLine is displayed on top of dataPoints when showOnTop is set to true.
    * Default: false
    * Example: true, false
    */
  var showOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Sets the point where the stripLine’s shaded region begins on the x-axis.
    * Default: null
    * Example: 20,30,100,50
    */
  var startValue: js.UndefOr[Double] = js.native
  /**
    * Sets the thickness of the stripLine in pixels.
    * Default: 2
    * Example: 2,4,5,6
    */
  var thickness: js.UndefOr[Double] = js.native
  /**
    * Sets the point where the stripLine has to be plotted or drawn along the axis X.
    * Default: null
    * Example: 20,30,100,50
    */
  var value: js.UndefOr[Double] = js.native
}

object ChartStripLinesOptions {
  @scala.inline
  def apply(labelMaxWidth: Double, labelWrap: Boolean): ChartStripLinesOptions = {
    val __obj = js.Dynamic.literal(labelMaxWidth = labelMaxWidth.asInstanceOf[js.Any], labelWrap = labelWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStripLinesOptions]
  }
  @scala.inline
  implicit class ChartStripLinesOptionsOps[Self <: ChartStripLinesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
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
    def withLabelAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
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
    def withLabelFormatter(value: /* e */ js.UndefOr[AnonAxis] => String): Self = {
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
    def withLabelPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

