package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorLevel
import typingsSlinky.devextreme.anon.DisplayMode
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.bubble
import typingsSlinky.devextreme.devextremeStrings.candlestick
import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.fullstackedarea
import typingsSlinky.devextreme.devextremeStrings.fullstackedbar
import typingsSlinky.devextreme.devextremeStrings.fullstackedline
import typingsSlinky.devextreme.devextremeStrings.fullstackedspline
import typingsSlinky.devextreme.devextremeStrings.fullstackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import typingsSlinky.devextreme.devextremeStrings.rangearea
import typingsSlinky.devextreme.devextremeStrings.rangebar_
import typingsSlinky.devextreme.devextremeStrings.scatter
import typingsSlinky.devextreme.devextremeStrings.solid
import typingsSlinky.devextreme.devextremeStrings.spline
import typingsSlinky.devextreme.devextremeStrings.splinearea
import typingsSlinky.devextreme.devextremeStrings.stackedarea
import typingsSlinky.devextreme.devextremeStrings.stackedbar
import typingsSlinky.devextreme.devextremeStrings.stackedline
import typingsSlinky.devextreme.devextremeStrings.stackedspline
import typingsSlinky.devextreme.devextremeStrings.stackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.steparea
import typingsSlinky.devextreme.devextremeStrings.stepline
import typingsSlinky.devextreme.devextremeStrings.stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonSeriesSettings extends dxChartSeriesTypesCommonSeries {
  /** @name dxChart.Options.commonSeriesSettings.area */
  var area: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.bar */
  var bar: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.bubble */
  var bubble: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.candlestick */
  var candlestick: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.fullstackedarea */
  var fullstackedarea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.fullstackedbar */
  var fullstackedbar: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.fullstackedline */
  var fullstackedline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.fullstackedspline */
  var fullstackedspline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.fullstackedsplinearea */
  var fullstackedsplinearea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.line */
  var line: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.rangearea */
  var rangearea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.rangebar */
  var rangebar: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.scatter */
  var scatter: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.spline */
  var spline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.splinearea */
  var splinearea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stackedarea */
  var stackedarea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stackedbar */
  var stackedbar: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stackedline */
  var stackedline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stackedspline */
  var stackedspline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stackedsplinearea */
  var stackedsplinearea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.steparea */
  var steparea: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stepline */
  var stepline: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.stock */
  var stock: js.UndefOr[js.Any] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings.type */
  var `type`: js.UndefOr[
    area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
  ] = js.undefined
}

object dxChartCommonSeriesSettings {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesCommonSeriesAggregation = null,
    area: js.Any = null,
    argumentField: String = null,
    axis: String = null,
    bar: js.Any = null,
    barOverlapGroup: String = null,
    barPadding: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    border: dxChartSeriesTypesCommonSeriesBorder = null,
    bubble: js.Any = null,
    candlestick: js.Any = null,
    closeValueField: String = null,
    color: String = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    dashStyle: dash | dot | longDash | solid = null,
    fullstackedarea: js.Any = null,
    fullstackedbar: js.Any = null,
    fullstackedline: js.Any = null,
    fullstackedspline: js.Any = null,
    fullstackedsplinearea: js.Any = null,
    highValueField: String = null,
    hoverMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint = null,
    hoverStyle: dxChartSeriesTypesCommonSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesCommonSeriesLabel = null,
    line: js.Any = null,
    lowValueField: String = null,
    maxLabelCount: js.UndefOr[Double] = js.undefined,
    minBarSize: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    openValueField: String = null,
    pane: String = null,
    point: dxChartSeriesTypesCommonSeriesPoint = null,
    rangeValue1Field: String = null,
    rangeValue2Field: String = null,
    rangearea: js.Any = null,
    rangebar: js.Any = null,
    reduction: ColorLevel = null,
    scatter: js.Any = null,
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: dxChartSeriesTypesCommonSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    spline: js.Any = null,
    splinearea: js.Any = null,
    stack: String = null,
    stackedarea: js.Any = null,
    stackedbar: js.Any = null,
    stackedline: js.Any = null,
    stackedspline: js.Any = null,
    stackedsplinearea: js.Any = null,
    steparea: js.Any = null,
    stepline: js.Any = null,
    stock: js.Any = null,
    tagField: String = null,
    `type`: area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock = null,
    valueErrorBar: DisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (barOverlapGroup != null) __obj.updateDynamic("barOverlapGroup")(barOverlapGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(barPadding)) __obj.updateDynamic("barPadding")(barPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (closeValueField != null) __obj.updateDynamic("closeValueField")(closeValueField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (fullstackedarea != null) __obj.updateDynamic("fullstackedarea")(fullstackedarea.asInstanceOf[js.Any])
    if (fullstackedbar != null) __obj.updateDynamic("fullstackedbar")(fullstackedbar.asInstanceOf[js.Any])
    if (fullstackedline != null) __obj.updateDynamic("fullstackedline")(fullstackedline.asInstanceOf[js.Any])
    if (fullstackedspline != null) __obj.updateDynamic("fullstackedspline")(fullstackedspline.asInstanceOf[js.Any])
    if (fullstackedsplinearea != null) __obj.updateDynamic("fullstackedsplinearea")(fullstackedsplinearea.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.get.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLabelCount)) __obj.updateDynamic("maxLabelCount")(maxLabelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBarSize)) __obj.updateDynamic("minBarSize")(minBarSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (openValueField != null) __obj.updateDynamic("openValueField")(openValueField.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (rangeValue1Field != null) __obj.updateDynamic("rangeValue1Field")(rangeValue1Field.asInstanceOf[js.Any])
    if (rangeValue2Field != null) __obj.updateDynamic("rangeValue2Field")(rangeValue2Field.asInstanceOf[js.Any])
    if (rangearea != null) __obj.updateDynamic("rangearea")(rangearea.asInstanceOf[js.Any])
    if (rangebar != null) __obj.updateDynamic("rangebar")(rangebar.asInstanceOf[js.Any])
    if (reduction != null) __obj.updateDynamic("reduction")(reduction.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (spline != null) __obj.updateDynamic("spline")(spline.asInstanceOf[js.Any])
    if (splinearea != null) __obj.updateDynamic("splinearea")(splinearea.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stackedarea != null) __obj.updateDynamic("stackedarea")(stackedarea.asInstanceOf[js.Any])
    if (stackedbar != null) __obj.updateDynamic("stackedbar")(stackedbar.asInstanceOf[js.Any])
    if (stackedline != null) __obj.updateDynamic("stackedline")(stackedline.asInstanceOf[js.Any])
    if (stackedspline != null) __obj.updateDynamic("stackedspline")(stackedspline.asInstanceOf[js.Any])
    if (stackedsplinearea != null) __obj.updateDynamic("stackedsplinearea")(stackedsplinearea.asInstanceOf[js.Any])
    if (steparea != null) __obj.updateDynamic("steparea")(steparea.asInstanceOf[js.Any])
    if (stepline != null) __obj.updateDynamic("stepline")(stepline.asInstanceOf[js.Any])
    if (stock != null) __obj.updateDynamic("stock")(stock.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonSeriesSettings]
  }
}

