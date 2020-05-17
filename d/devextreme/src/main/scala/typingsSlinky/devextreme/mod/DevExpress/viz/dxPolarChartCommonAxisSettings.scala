package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorOpacity
import typingsSlinky.devextreme.devextremeStrings.betweenLabels
import typingsSlinky.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettings extends js.Object {
  /** Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only. */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** Specifies the color of the line that represents an axis. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the appearance of all the widget's constant lines. */
  var constantLineStyle: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyle] = js.native
  /** Specifies whether ticks/grid lines of a discrete axis are located between labels or cross the labels. */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.native
  /** Specifies whether to force the axis to start and end on ticks. */
  var endOnTick: js.UndefOr[Boolean] = js.native
  /** An object defining the configuration options for the grid lines of an axis in the PolarChart widget. */
  var grid: js.UndefOr[ColorOpacity] = js.native
  /** Indicates whether or not an axis is inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** An object defining the label configuration options that are common for all axes in the PolarChart widget. */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsLabel] = js.native
  /** Specifies the options of the minor grid. */
  var minorGrid: js.UndefOr[ColorOpacity] = js.native
  /** Specifies the options of the minor ticks. */
  var minorTick: js.UndefOr[dxPolarChartCommonAxisSettingsMinorTick] = js.native
  /** Specifies the opacity of the line that represents an axis. */
  var opacity: js.UndefOr[Double] = js.native
  /** An object defining configuration options for strip style. */
  var stripStyle: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyle] = js.native
  /** An object defining the configuration options for axis ticks. */
  var tick: js.UndefOr[dxPolarChartCommonAxisSettingsTick] = js.native
  /** Indicates whether or not the line that represents an axis in a chart is visible. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the line that represents an axis in the chart. */
  var width: js.UndefOr[Double] = js.native
}

object dxPolarChartCommonAxisSettings {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettings]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsOps[Self <: dxPolarChartCommonAxisSettings] (val x: Self) extends AnyVal {
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
    def withConstantLineStyle(value: dxPolarChartCommonAxisSettingsConstantLineStyle): Self = {
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
    def withGrid(value: ColorOpacity): Self = {
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
    def withLabel(value: dxPolarChartCommonAxisSettingsLabel): Self = {
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
    def withMinorGrid(value: ColorOpacity): Self = {
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
    def withMinorTick(value: dxPolarChartCommonAxisSettingsMinorTick): Self = {
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
    def withStripStyle(value: dxPolarChartCommonAxisSettingsStripStyle): Self = {
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
    def withTick(value: dxPolarChartCommonAxisSettingsTick): Self = {
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

