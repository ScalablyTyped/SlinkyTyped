package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.AnonCancelComponentData
import typingsSlinky.devextreme.AnonComponentTElementDxElement
import typingsSlinky.devextreme.AnonComponentTElementDxElementModelAny
import typingsSlinky.devextreme.AnonDuration
import typingsSlinky.devextreme.AnonElement
import typingsSlinky.devextreme.AnonElementModelTarget
import typingsSlinky.devextreme.AnonElementTarget
import typingsSlinky.devextreme.AnonFormatModel
import typingsSlinky.devextreme.AnonModel
import typingsSlinky.devextreme.AnonModelTarget
import typingsSlinky.devextreme.AnonName
import typingsSlinky.devextreme.AnonNameField
import typingsSlinky.devextreme.AnonPoints
import typingsSlinky.devextreme.AnonTargetAny
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.anticlockwise
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.clockwise
import typingsSlinky.devextreme.devextremeStrings.donut
import typingsSlinky.devextreme.devextremeStrings.doughnut
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.genericDotcarmine
import typingsSlinky.devextreme.devextremeStrings.genericDotcontrast
import typingsSlinky.devextreme.devextremeStrings.genericDotdark
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkmoon
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkviolet
import typingsSlinky.devextreme.devextremeStrings.genericDotgreenmist
import typingsSlinky.devextreme.devextremeStrings.genericDotlight
import typingsSlinky.devextreme.devextremeStrings.genericDotsoftblue
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.ios7Dotdefault
import typingsSlinky.devextreme.devextremeStrings.materialDotblueDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDottealDotlight
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.pie
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartOptions extends BaseChartOptions[dxPieChart] {
  /** Specifies adaptive layout options. */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPieChartOptions: js.UndefOr[dxPieChartAdaptiveLayout] = js.undefined
  /** Specifies a custom template for content in the pie's center. */
  var centerTemplate: js.UndefOr[
    template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
  ] = js.undefined
  /** An object defining the configuration options that are common for all series of the PieChart widget. */
  var commonSeriesSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the diameter of the pie. */
  var diameter: js.UndefOr[Double] = js.undefined
  /** Specifies the fraction of the inner radius relative to the total radius in the series of the 'doughnut' type. The value should be between 0 and 1. */
  var innerRadius: js.UndefOr[Double] = js.undefined
  /** Specifies PieChart legend options. */
  @JSName("legend")
  var legend_dxPieChartOptions: js.UndefOr[dxPieChartLegend] = js.undefined
  /** Specifies the minimum diameter of the pie. */
  var minDiameter: js.UndefOr[Double] = js.undefined
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonPoints, _]) | String] = js.undefined
  /** Specifies how a chart must behave when point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.undefined
  /** Specifies the direction that the pie chart segments will occupy. */
  var segmentsDirection: js.UndefOr[anticlockwise | clockwise] = js.undefined
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonNameField] = js.undefined
  /** Specifies options for the series of the PieChart widget. */
  @JSName("series")
  var series_dxPieChartOptions: js.UndefOr[PieChartSeries | js.Array[PieChartSeries]] = js.undefined
  /** Allows you to display several adjoining pies in the same size. */
  var sizeGroup: js.UndefOr[String] = js.undefined
  /** Specifies the angle in arc degrees from which the first segment of a pie chart should start. */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** Specifies the type of the pie chart series. */
  var `type`: js.UndefOr[donut | doughnut | pie] = js.undefined
}

object dxPieChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: dxPieChartAdaptiveLayout = null,
    animation: AnonDuration | Boolean = null,
    bindingOptions: js.Any = null,
    centerTemplate: template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery]) = null,
    commonSeriesSettings: js.Any = null,
    customizeLabel: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel = null,
    customizePoint: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    diameter: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    innerRadius: Int | Double = null,
    legend: dxPieChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    minDiameter: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxPieChart] => _ = null,
    onDone: /* e */ AnonComponentTElementDxElement[dxPieChart] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxPieChart] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxPieChart] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxPieChart] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxPieChart] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxPieChart] => _ = null,
    onInitialized: /* e */ AnonElement[dxPieChart] => _ = null,
    onLegendClick: (js.Function1[/* e */ AnonPoints, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxPieChart] => _ = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[dxPieChart], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => _ = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => _ = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[dxPieChart] => _ = null,
    onTooltipShown: /* e */ AnonElementModelTarget[dxPieChart] => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | shift = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    segmentsDirection: anticlockwise | clockwise = null,
    series: PieChartSeries | js.Array[PieChartSeries] = null,
    seriesTemplate: AnonNameField = null,
    size: BaseWidgetSize = null,
    sizeGroup: String = null,
    startAngle: Int | Double = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseChartTooltip = null,
    `type`: donut | doughnut | pie = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (centerTemplate != null) __obj.updateDynamic("centerTemplate")(centerTemplate.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1(customizeLabel))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1(customizePoint))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (minDiameter != null) __obj.updateDynamic("minDiameter")(minDiameter.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction1(onDone))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPointClick != null) __obj.updateDynamic("onPointClick")(onPointClick.asInstanceOf[js.Any])
    if (onPointHoverChanged != null) __obj.updateDynamic("onPointHoverChanged")(js.Any.fromFunction1(onPointHoverChanged))
    if (onPointSelectionChanged != null) __obj.updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1(onPointSelectionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (segmentsDirection != null) __obj.updateDynamic("segmentsDirection")(segmentsDirection.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeGroup != null) __obj.updateDynamic("sizeGroup")(sizeGroup.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartOptions]
  }
}

