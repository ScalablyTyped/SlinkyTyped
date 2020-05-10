package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorOpacity
import typingsSlinky.devextreme.AnonLength
import typingsSlinky.devextreme.AnonLine
import typingsSlinky.devextreme.devextremeStrings.betweenLabels
import typingsSlinky.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettings extends js.Object {
  /** Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only. */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** Configures the scale breaks' appearance. */
  var breakStyle: js.UndefOr[AnonLine] = js.native
  /** Specifies the color of the axis line. */
  var color: js.UndefOr[String] = js.native
  /** Configures the appearance of all constant lines in the widget. */
  var constantLineStyle: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyle] = js.native
  /** Specifies whether ticks and grid lines should cross axis labels or lie between them. Applies only to the axes of the "discrete" type. */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.native
  /** Specifies whether to force the axis to start and end on ticks. */
  var endOnTick: js.UndefOr[Boolean] = js.native
  /** Configures the grid. */
  var grid: js.UndefOr[AnonColorOpacity] = js.native
  /** Inverts the axis. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Configures axis labels. */
  var label: js.UndefOr[dxChartCommonAxisSettingsLabel] = js.native
  /** Controls the empty space between the maximum series points and the axis. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var maxValueMargin: js.UndefOr[Double] = js.native
  /** Controls the empty space between the minimum series points and the axis. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var minValueMargin: js.UndefOr[Double] = js.native
  /** Configures the minor grid. */
  var minorGrid: js.UndefOr[AnonColorOpacity] = js.native
  /** Configures the appearance of minor axis ticks. */
  var minorTick: js.UndefOr[AnonLength] = js.native
  /** Specifies how transparent the axis line should be. */
  var opacity: js.UndefOr[Double] = js.native
  /** Reserves a pixel-measured space for the axis. */
  var placeholderSize: js.UndefOr[Double] = js.native
  /** Configures the appearance of strips. */
  var stripStyle: js.UndefOr[dxChartCommonAxisSettingsStripStyle] = js.native
  /** Configures the appearance of major axis ticks. */
  var tick: js.UndefOr[AnonLength] = js.native
  /** Configures axis titles. */
  var title: js.UndefOr[dxChartCommonAxisSettingsTitle] = js.native
  /** Adds an empty space between the axis and the minimum and maximum series points. */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.native
  /** Makes the axis line visible. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the axis line in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object dxChartCommonAxisSettings {
  @scala.inline
  def apply(): dxChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettings]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsOps[Self <: dxChartCommonAxisSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakStyle(value: AnonLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakStyle")(js.undefined)
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
    def withConstantLineStyle(value: dxChartCommonAxisSettingsConstantLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscreteAxisDivisionMode(value: betweenLabels | crossLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteAxisDivisionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscreteAxisDivisionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteAxisDivisionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOnTick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOnTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: AnonColorOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxChartCommonAxisSettingsLabel): Self = {
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
    def withMaxValueMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGrid(value: AnonColorOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTick(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(js.undefined)
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
    def withPlaceholderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStripStyle(value: dxChartCommonAxisSettingsStripStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: dxChartCommonAxisSettingsTitle): Self = {
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
    def withValueMarginsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarginsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMarginsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarginsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

