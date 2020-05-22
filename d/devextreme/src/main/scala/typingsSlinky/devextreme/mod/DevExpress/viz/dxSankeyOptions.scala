package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.CancelComponentData
import typingsSlinky.devextreme.anon.ColorMode
import typingsSlinky.devextreme.anon.ComponentDxSankey
import typingsSlinky.devextreme.anon.ComponentElementEventModel
import typingsSlinky.devextreme.anon.ComponentTElementDxElementModelAny
import typingsSlinky.devextreme.anon.Element
import typingsSlinky.devextreme.anon.EventModelTarget
import typingsSlinky.devextreme.anon.FormatModel
import typingsSlinky.devextreme.anon.HorizontalOffset
import typingsSlinky.devextreme.anon.KeepLabels
import typingsSlinky.devextreme.anon.Model
import typingsSlinky.devextreme.anon.Name
import typingsSlinky.devextreme.anon.Padding
import typingsSlinky.devextreme.anon.TargetAny
import typingsSlinky.devextreme.anon.TargetDxSankeyNode
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
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.genericDotcarmine
import typingsSlinky.devextreme.devextremeStrings.genericDotcontrast
import typingsSlinky.devextreme.devextremeStrings.genericDotdark
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkmoon
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkviolet
import typingsSlinky.devextreme.devextremeStrings.genericDotgreenmist
import typingsSlinky.devextreme.devextremeStrings.genericDotlight
import typingsSlinky.devextreme.devextremeStrings.genericDotsoftblue
import typingsSlinky.devextreme.devextremeStrings.ios7Dotdefault
import typingsSlinky.devextreme.devextremeStrings.materialDotblueDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDottealDotlight
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyOptions extends BaseWidgetOptions[dxSankey] {
  /** @name dxSankey.Options.adaptiveLayout */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.undefined
  /** @name dxSankey.Options.alignment */
  var alignment: js.UndefOr[bottom | center | top | (js.Array[bottom | center | top])] = js.undefined
  /** @name dxSankey.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name dxSankey.Options.hoverEnabled */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxSankey.Options.label */
  var label: js.UndefOr[HorizontalOffset] = js.undefined
  /** @name dxSankey.Options.link */
  var link: js.UndefOr[ColorMode] = js.undefined
  /** @name dxSankey.Options.node */
  var node: js.UndefOr[Padding] = js.undefined
  /** @name dxSankey.Options.onLinkClick */
  var onLinkClick: js.UndefOr[(js.Function1[/* e */ EventModelTarget, _]) | String] = js.undefined
  /** @name dxSankey.Options.onLinkHoverChanged */
  var onLinkHoverChanged: js.UndefOr[js.Function1[/* e */ ComponentDxSankey, _]] = js.undefined
  /** @name dxSankey.Options.onNodeClick */
  var onNodeClick: js.UndefOr[(js.Function1[/* e */ ComponentElementEventModel, _]) | String] = js.undefined
  /** @name dxSankey.Options.onNodeHoverChanged */
  var onNodeHoverChanged: js.UndefOr[js.Function1[/* e */ TargetDxSankeyNode, _]] = js.undefined
  /** @name dxSankey.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** @name dxSankey.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** @name dxSankey.Options.sortData */
  var sortData: js.UndefOr[js.Any] = js.undefined
  /** @name dxSankey.Options.sourceField */
  var sourceField: js.UndefOr[String] = js.undefined
  /** @name dxSankey.Options.targetField */
  var targetField: js.UndefOr[String] = js.undefined
  /** @name dxSankey.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxSankeyOptions: js.UndefOr[dxSankeyTooltip] = js.undefined
  /** @name dxSankey.Options.weightField */
  var weightField: js.UndefOr[String] = js.undefined
}

object dxSankeyOptions {
  @scala.inline
  def apply(
    adaptiveLayout: KeepLabels = null,
    alignment: bottom | center | top | (js.Array[bottom | center | top]) = null,
    bindingOptions: js.Any = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    label: HorizontalOffset = null,
    link: ColorMode = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    node: Padding = null,
    onDisposing: /* e */ Model[dxSankey] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[dxSankey] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[dxSankey] => _ = null,
    onExporting: /* e */ FormatModel[dxSankey] => _ = null,
    onFileSaving: /* e */ CancelComponentData[dxSankey] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[dxSankey] => _ = null,
    onInitialized: /* e */ Element[dxSankey] => _ = null,
    onLinkClick: (js.Function1[/* e */ EventModelTarget, _]) | String = null,
    onLinkHoverChanged: /* e */ ComponentDxSankey => _ = null,
    onNodeClick: (js.Function1[/* e */ ComponentElementEventModel, _]) | String = null,
    onNodeHoverChanged: /* e */ TargetDxSankeyNode => _ = null,
    onOptionChanged: /* e */ Name[dxSankey] => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    sortData: js.Any = null,
    sourceField: String = null,
    targetField: String = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxSankeyTooltip = null,
    weightField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSankeyOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(onLinkClick.asInstanceOf[js.Any])
    if (onLinkHoverChanged != null) __obj.updateDynamic("onLinkHoverChanged")(js.Any.fromFunction1(onLinkHoverChanged))
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(onNodeClick.asInstanceOf[js.Any])
    if (onNodeHoverChanged != null) __obj.updateDynamic("onNodeHoverChanged")(js.Any.fromFunction1(onNodeHoverChanged))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sortData != null) __obj.updateDynamic("sortData")(sortData.asInstanceOf[js.Any])
    if (sourceField != null) __obj.updateDynamic("sourceField")(sourceField.asInstanceOf[js.Any])
    if (targetField != null) __obj.updateDynamic("targetField")(targetField.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (weightField != null) __obj.updateDynamic("weightField")(weightField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyOptions]
  }
}

