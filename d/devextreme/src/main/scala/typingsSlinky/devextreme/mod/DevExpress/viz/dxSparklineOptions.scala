package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonCancelComponentData
import typingsSlinky.devextreme.AnonComponentTElementDxElementModelAny
import typingsSlinky.devextreme.AnonElement
import typingsSlinky.devextreme.AnonElementDxElementModelAny
import typingsSlinky.devextreme.AnonFormatModel
import typingsSlinky.devextreme.AnonModel
import typingsSlinky.devextreme.AnonName
import typingsSlinky.devextreme.AnonTargetAny
import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.genericDotcarmine
import typingsSlinky.devextreme.devextremeStrings.genericDotcontrast
import typingsSlinky.devextreme.devextremeStrings.genericDotdark
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkmoon
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkviolet
import typingsSlinky.devextreme.devextremeStrings.genericDotgreenmist
import typingsSlinky.devextreme.devextremeStrings.genericDotlight
import typingsSlinky.devextreme.devextremeStrings.genericDotsoftblue
import typingsSlinky.devextreme.devextremeStrings.ios7Dotdefault
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.materialDotblueDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDottealDotlight
import typingsSlinky.devextreme.devextremeStrings.polygon
import typingsSlinky.devextreme.devextremeStrings.spline
import typingsSlinky.devextreme.devextremeStrings.splinearea
import typingsSlinky.devextreme.devextremeStrings.square
import typingsSlinky.devextreme.devextremeStrings.steparea
import typingsSlinky.devextreme.devextremeStrings.stepline
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.winloss
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSparklineOptions extends BaseSparklineOptions[dxSparkline] {
  /** Specifies the data source field that provides arguments for a sparkline. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating negative values. Available for a sparkline of the bar type only. */
  var barNegativeColor: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating positive values. Available for a sparkline of the bar type only. */
  var barPositiveColor: js.UndefOr[String] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Sets a color for the boundary of both the first and last points on a sparkline. */
  var firstLastColor: js.UndefOr[String] = js.undefined
  /** Specifies whether the sparkline should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** Sets a color for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Specifies a width for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Sets a color for the bars indicating the values that are less than the winloss threshold. Available for a sparkline of the winloss type only. */
  var lossColor: js.UndefOr[String] = js.undefined
  /** Sets a color for the boundary of the maximum point on a sparkline. */
  var maxColor: js.UndefOr[String] = js.undefined
  /** Specifies the maximum value of the sparkline's value axis. */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Sets a color for the boundary of the minimum point on a sparkline. */
  var minColor: js.UndefOr[String] = js.undefined
  /** Specifies the minimum value of the sparkline value axis. */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Sets a color for points on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointColor: js.UndefOr[String] = js.undefined
  /** Specifies the diameter of sparkline points in pixels. Available for the sparklines of line- and area-like types. */
  var pointSize: js.UndefOr[Double] = js.undefined
  /** Specifies a symbol to use as a point marker on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  /** Specifies whether or not to indicate both the first and last values on a sparkline. */
  var showFirstLast: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to indicate both the minimum and maximum values on a sparkline. */
  var showMinMax: js.UndefOr[Boolean] = js.undefined
  /** Determines the type of a sparkline. */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.undefined
  /** Specifies the data source field that provides values for a sparkline. */
  var valueField: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating the values greater than a winloss threshold. Available for a sparkline of the winloss type only. */
  var winColor: js.UndefOr[String] = js.undefined
  /** Specifies a value that serves as a threshold for the sparkline of the winloss type. */
  var winlossThreshold: js.UndefOr[Double] = js.undefined
}

object dxSparklineOptions {
  @scala.inline
  def apply(
    argumentField: String = null,
    barNegativeColor: String = null,
    barPositiveColor: String = null,
    bindingOptions: js.Any = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    firstLastColor: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    lossColor: String = null,
    margin: BaseWidgetMargin = null,
    maxColor: String = null,
    maxValue: Int | Double = null,
    minColor: String = null,
    minValue: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxSparkline] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxSparkline] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxSparkline] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxSparkline] => _ = null,
    onInitialized: /* e */ AnonElement[dxSparkline] => _ = null,
    onOptionChanged: /* e */ AnonName[dxSparkline] => _ = null,
    onTooltipHidden: /* e */ AnonElementDxElementModelAny[dxSparkline] => _ = null,
    onTooltipShown: /* e */ AnonElementDxElementModelAny[dxSparkline] => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointColor: String = null,
    pointSize: Int | Double = null,
    pointSymbol: circle | cross | polygon | square | triangle = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showFirstLast: js.UndefOr[Boolean] = js.undefined,
    showMinMax: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseSparklineTooltip = null,
    `type`: area | bar | line | spline | splinearea | steparea | stepline | winloss = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    winColor: String = null,
    winlossThreshold: Int | Double = null
  ): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (barNegativeColor != null) __obj.updateDynamic("barNegativeColor")(barNegativeColor.asInstanceOf[js.Any])
    if (barPositiveColor != null) __obj.updateDynamic("barPositiveColor")(barPositiveColor.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (firstLastColor != null) __obj.updateDynamic("firstLastColor")(firstLastColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (lossColor != null) __obj.updateDynamic("lossColor")(lossColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(pointSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLast)) __obj.updateDynamic("showFirstLast")(showFirstLast.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinMax)) __obj.updateDynamic("showMinMax")(showMinMax.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (winColor != null) __obj.updateDynamic("winColor")(winColor.asInstanceOf[js.Any])
    if (winlossThreshold != null) __obj.updateDynamic("winlossThreshold")(winlossThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSparklineOptions]
  }
}

