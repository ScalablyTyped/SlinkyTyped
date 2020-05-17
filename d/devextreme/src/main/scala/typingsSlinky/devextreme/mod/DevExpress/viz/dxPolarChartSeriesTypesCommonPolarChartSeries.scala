package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.BorderColor
import typingsSlinky.devextreme.anon.ColorDashStyle
import typingsSlinky.devextreme.anon.DisplayMode
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesCommonPolarChartSeries extends js.Object {
  /** Specifies the data source field that provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.native
  /** Controls the padding and consequently the angular width of all bars in a series using relative units. Ignored if the barWidth option is set. */
  var barPadding: js.UndefOr[Double] = js.native
  /** Specifies a fixed angular width for all bars in a series, measured in degrees. Takes precedence over the barPadding option. */
  var barWidth: js.UndefOr[Double] = js.native
  /** An object defining the series border configuration options. */
  var border: js.UndefOr[ColorDashStyle] = js.native
  /** Specifies whether or not to close the chart by joining the end point with the first point. */
  var closed: js.UndefOr[Boolean] = js.native
  /** Specifies a series color. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the dash style of the series' line. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** Specifies the series elements to highlight when a series is hovered over. */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.native
  /** An object defining configuration options for a hovered series. */
  var hoverStyle: js.UndefOr[BorderColor] = js.native
  /** Specifies whether the series should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  /** An object defining the label configuration options. */
  var label: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] = js.native
  /** Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed. */
  var maxLabelCount: js.UndefOr[Double] = js.native
  /** Specifies the minimal length of a displayed bar in pixels. */
  var minBarSize: js.UndefOr[Double] = js.native
  /** Specifies opacity for a series. */
  var opacity: js.UndefOr[Double] = js.native
  /** An object defining configuration options for points in line and area series. */
  var point: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint] = js.native
  /** Specifies the series elements to highlight when the series is selected. */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.native
  /** An object defining configuration options for a selected series. */
  var selectionStyle: js.UndefOr[BorderColor] = js.native
  /** Specifies whether or not to show the series in the chart's legend. */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the stack where the values of the 'stackedBar' series must be located. */
  var stack: js.UndefOr[String] = js.native
  /** Specifies the name of the data source field that provides data about a point. */
  var tagField: js.UndefOr[String] = js.native
  /** Configures error bars. */
  var valueErrorBar: js.UndefOr[DisplayMode] = js.native
  /** Specifies the data source field that provides values for series points. */
  var valueField: js.UndefOr[String] = js.native
  /** Specifies the visibility of a series. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies a line width. */
  var width: js.UndefOr[Double] = js.native
}

object dxPolarChartSeriesTypesCommonPolarChartSeries {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesCommonPolarChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeries]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesCommonPolarChartSeriesOps[Self <: dxPolarChartSeriesTypesCommonPolarChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(js.undefined)
        ret
    }
    @scala.inline
    def withBarPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ColorDashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
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
    def withDashStyle(value: dash | dot | longDash | solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(
      value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmptyPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptyPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel): Self = {
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
    def withMaxLabelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLabelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarSize")(js.undefined)
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
    def withPoint(value: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: BorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTagField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagField")(js.undefined)
        ret
    }
    @scala.inline
    def withValueErrorBar(value: DisplayMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueErrorBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueErrorBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueErrorBar")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
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

