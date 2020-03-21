package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonCancelComponentData
import typingsSlinky.devextreme.AnonComponentTElementDxElementModelAny
import typingsSlinky.devextreme.AnonConnector
import typingsSlinky.devextreme.AnonElement
import typingsSlinky.devextreme.AnonElementItem
import typingsSlinky.devextreme.AnonEventItem
import typingsSlinky.devextreme.AnonFormatModel
import typingsSlinky.devextreme.AnonHoverStyle
import typingsSlinky.devextreme.AnonKeepLabels
import typingsSlinky.devextreme.AnonModel
import typingsSlinky.devextreme.AnonName
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
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.dynamicHeight
import typingsSlinky.devextreme.devextremeStrings.dynamicSlope
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
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelOptions extends BaseWidgetOptions[dxFunnel] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[AnonKeepLabels] = js.undefined
  /** Specifies the algorithm for building the funnel. */
  var algorithm: js.UndefOr[dynamicHeight | dynamicSlope] = js.undefined
  /** Specifies which data source field provides arguments for funnel items. The argument identifies a funnel item and represents it on the legend. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Specifies which data source field provides colors for funnel items. If this field is absent, the palette provides the colors. */
  var colorField: js.UndefOr[String] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Specifies whether funnel items change their style when a user pauses on them. */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** Turns the funnel upside down. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Configures funnel items' appearance. */
  var item: js.UndefOr[AnonHoverStyle] = js.undefined
  /** Configures funnel item labels. */
  var label: js.UndefOr[AnonConnector] = js.undefined
  /** Configures the legend. */
  var legend: js.UndefOr[dxFunnelLegend] = js.undefined
  /** Specifies the ratio between the height of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is "dynamicHeight". */
  var neckHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the ratio between the width of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is "dynamicHeight". */
  var neckWidth: js.UndefOr[Double] = js.undefined
  /** A function that is executed after the pointer enters or leaves a funnel item. */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementItem, _]] = js.undefined
  /** A function that is executed when a funnel item is clicked or tapped. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonEventItem, _]) | String] = js.undefined
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonEventItem, _]) | String] = js.undefined
  /** A function that is executed when a funnel item is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItem, _]] = js.undefined
  /** Sets the palette to be used to colorize funnel items. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** Specifies what to do with colors in the palette when their number is less than the number of funnel items. */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** Specifies how item labels should behave when they overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.undefined
  /** Specifies whether a single or multiple funnel items can be in the selected state at a time. Assigning "none" disables the selection feature. */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  /** Specifies whether to sort funnel items. */
  var sortData: js.UndefOr[Boolean] = js.undefined
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxFunnelOptions: js.UndefOr[dxFunnelTooltip] = js.undefined
  /** Specifies which data source field provides values for funnel items. The value defines a funnel item's area. */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxFunnelOptions {
  @scala.inline
  def apply(
    adaptiveLayout: AnonKeepLabels = null,
    algorithm: dynamicHeight | dynamicSlope = null,
    argumentField: String = null,
    bindingOptions: js.Any = null,
    colorField: String = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    item: AnonHoverStyle = null,
    label: AnonConnector = null,
    legend: dxFunnelLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    neckHeight: Int | Double = null,
    neckWidth: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxFunnel] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxFunnel] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxFunnel] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxFunnel] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxFunnel] => _ = null,
    onHoverChanged: /* e */ AnonElementItem => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxFunnel] => _ = null,
    onInitialized: /* e */ AnonElement[dxFunnel] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEventItem, _]) | String = null,
    onLegendClick: (js.Function1[/* e */ AnonEventItem, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxFunnel] => _ = null,
    onSelectionChanged: /* e */ AnonElementItem => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | shift = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | none | single_ = null,
    size: BaseWidgetSize = null,
    sortData: js.UndefOr[Boolean] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxFunnelTooltip = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFunnelOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (neckHeight != null) __obj.updateDynamic("neckHeight")(neckHeight.asInstanceOf[js.Any])
    if (neckWidth != null) __obj.updateDynamic("neckWidth")(neckWidth.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onHoverChanged != null) __obj.updateDynamic("onHoverChanged")(js.Any.fromFunction1(onHoverChanged))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortData)) __obj.updateDynamic("sortData")(sortData.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFunnelOptions]
  }
}

