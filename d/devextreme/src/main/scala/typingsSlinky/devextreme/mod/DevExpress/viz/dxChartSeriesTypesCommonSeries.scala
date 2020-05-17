package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorLevel
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

/** An object that defines configuration options for chart series. */
@js.native
trait dxChartSeriesTypesCommonSeries extends js.Object {
  /** Configures data aggregation for the series. */
  var aggregation: js.UndefOr[dxChartSeriesTypesCommonSeriesAggregation] = js.native
  /** Specifies which data source field provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.native
  /** Binds the series to a value axis. */
  var axis: js.UndefOr[String] = js.native
  /** Allows you to group bar series so that bars with the same argument overlap. */
  var barOverlapGroup: js.UndefOr[String] = js.native
  /** Controls the padding and consequently the width of all bars in a series using relative units. Ignored if the barWidth option is set. */
  var barPadding: js.UndefOr[Double] = js.native
  /** Specifies a fixed width for all bars in a series, measured in pixels. Takes precedence over the barPadding option. */
  var barWidth: js.UndefOr[Double] = js.native
  /** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesBorder] = js.native
  /** Specifies which data source field provides close values for points of a financial series. */
  var closeValueField: js.UndefOr[String] = js.native
  /** Specifies the color of the series. */
  var color: js.UndefOr[String] = js.native
  /** Makes bars look rounded. Applies only to bar-like series. */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** Specifies the dash style of the series line. Applies only to line-like series. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** Specifies which data source field provides high values for points of a financial series. */
  var highValueField: js.UndefOr[String] = js.native
  /** Specifies series elements to be highlighted when a user points to a series. */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.native
  /** Configures the appearance adopted by the series when a user points to it. */
  var hoverStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyle] = js.native
  /** Specifies whether the series should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  /** Specifies a filling color for the body of a series point that visualizes a non-reduced value. Applies only to candlestick series. */
  var innerColor: js.UndefOr[String] = js.native
  /** Configures point labels. */
  var label: js.UndefOr[dxChartSeriesTypesCommonSeriesLabel] = js.native
  /** Specifies which data source field provides low values for points of a financial series. */
  var lowValueField: js.UndefOr[String] = js.native
  /** Specifies a limit for the number of point labels. */
  var maxLabelCount: js.UndefOr[Double] = js.native
  /** Specifies the minimal possible height (or length if the chart is rotated) of a bar in pixels. Applies only to bar-like series. */
  var minBarSize: js.UndefOr[Double] = js.native
  /** Specifies how transparent the series should be. */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies which data source field provides open values for points of a financial series. */
  var openValueField: js.UndefOr[String] = js.native
  /** Specifies which pane the series should belong to. Accepts the name of the pane. */
  var pane: js.UndefOr[String] = js.native
  /** Configures series points in scatter, line- and area-like series. */
  var point: js.UndefOr[dxChartSeriesTypesCommonSeriesPoint] = js.native
  /** Coupled with the rangeValue2Field option, specifies which data source field provides values for a range-like series. */
  var rangeValue1Field: js.UndefOr[String] = js.native
  /** Coupled with the rangeValue1Field option, specifies which data source field provides values for a range-like series. */
  var rangeValue2Field: js.UndefOr[String] = js.native
  /** Specifies reduction options for financial series. */
  var reduction: js.UndefOr[ColorLevel] = js.native
  /** Specifies series elements to be highlighted when a user selects a series. */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.native
  /** Configures the appearance adopted by the series when a user selects it. */
  var selectionStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyle] = js.native
  /** Specifies whether to show the series in the legend or not. */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** Specifies which data source field provides size values for bubbles. Required by and applies only to bubble series. */
  var sizeField: js.UndefOr[String] = js.native
  /** Specifies which stack the series should belongs to. Applies only to stacked bar and full-stacked bar series. */
  var stack: js.UndefOr[String] = js.native
  /** Specifies which data source field provides auxiliary data for series points. */
  var tagField: js.UndefOr[String] = js.native
  /** Configures error bars. */
  var valueErrorBar: js.UndefOr[DisplayMode] = js.native
  /** Specifies which data source field provides values for series points. */
  var valueField: js.UndefOr[String] = js.native
  /** Specifies whether the series is visible or not. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the series line in pixels. Applies only to line-like series. */
  var width: js.UndefOr[Double] = js.native
}

object dxChartSeriesTypesCommonSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesOps[Self <: dxChartSeriesTypesCommonSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesCommonSeriesAggregation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(js.undefined)
        ret
    }
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
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBarOverlapGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barOverlapGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarOverlapGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barOverlapGroup")(js.undefined)
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
    def withBorder(value: dxChartSeriesTypesCommonSeriesBorder): Self = {
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
    def withCloseValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeValueField")(js.undefined)
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
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
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
    def withHighValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueField")(js.undefined)
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
    def withHoverStyle(value: dxChartSeriesTypesCommonSeriesHoverStyle): Self = {
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
    def withInnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxChartSeriesTypesCommonSeriesLabel): Self = {
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
    def withLowValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueField")(js.undefined)
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
    def withOpenValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: dxChartSeriesTypesCommonSeriesPoint): Self = {
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
    def withRangeValue1Field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeValue1Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeValue1Field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeValue1Field")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeValue2Field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeValue2Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeValue2Field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeValue2Field")(js.undefined)
        ret
    }
    @scala.inline
    def withReduction(value: ColorLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduction")(js.undefined)
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
    def withSelectionStyle(value: dxChartSeriesTypesCommonSeriesSelectionStyle): Self = {
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
    def withSizeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(js.undefined)
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

