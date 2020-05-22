package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.CancelComponentData
import typingsSlinky.devextreme.anon.ComponentDxBarGauge
import typingsSlinky.devextreme.anon.ComponentTElementDxElementModelAny
import typingsSlinky.devextreme.anon.ConnectorColor
import typingsSlinky.devextreme.anon.Element
import typingsSlinky.devextreme.anon.EndAngle
import typingsSlinky.devextreme.anon.FormatModel
import typingsSlinky.devextreme.anon.Model
import typingsSlinky.devextreme.anon.Name
import typingsSlinky.devextreme.anon.TargetAny
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
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBarGaugeOptions extends BaseWidgetOptions[dxBarGauge] {
  /** @name dxBarGauge.Options.animation */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** @name dxBarGauge.Options.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name dxBarGauge.Options.barSpacing */
  var barSpacing: js.UndefOr[Double] = js.undefined
  /** @name dxBarGauge.Options.baseValue */
  var baseValue: js.UndefOr[Double] = js.undefined
  /** @name dxBarGauge.Options.endValue */
  var endValue: js.UndefOr[Double] = js.undefined
  /** @name dxBarGauge.Options.geometry */
  var geometry: js.UndefOr[EndAngle] = js.undefined
  /** @name dxBarGauge.Options.label */
  var label: js.UndefOr[ConnectorColor] = js.undefined
  /** @name dxBarGauge.Options.legend */
  var legend: js.UndefOr[dxBarGaugeLegend] = js.undefined
  /** @name dxBarGauge.Options.loadingIndicator */
  @JSName("loadingIndicator")
  var loadingIndicator_dxBarGaugeOptions: js.UndefOr[dxBarGaugeLoadingIndicator] = js.undefined
  /** @name dxBarGauge.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ComponentDxBarGauge, _]] = js.undefined
  /** @name dxBarGauge.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ComponentDxBarGauge, _]] = js.undefined
  /** @name dxBarGauge.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** @name dxBarGauge.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** @name dxBarGauge.Options.relativeInnerRadius */
  var relativeInnerRadius: js.UndefOr[Double] = js.undefined
  /** @name dxBarGauge.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.undefined
  /** @name dxBarGauge.Options.startValue */
  var startValue: js.UndefOr[Double] = js.undefined
  /** @name dxBarGauge.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxBarGaugeOptions: js.UndefOr[dxBarGaugeTooltip] = js.undefined
  /** @name dxBarGauge.Options.values */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object dxBarGaugeOptions {
  @scala.inline
  def apply(
    animation: js.Any = null,
    backgroundColor: String = null,
    barSpacing: js.UndefOr[Double] = js.undefined,
    baseValue: js.UndefOr[Double] = js.undefined,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    endValue: js.UndefOr[Double] = js.undefined,
    export: BaseWidgetExport = null,
    geometry: EndAngle = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    label: ConnectorColor = null,
    legend: dxBarGaugeLegend = null,
    loadingIndicator: dxBarGaugeLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ Model[dxBarGauge] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[dxBarGauge] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[dxBarGauge] => _ = null,
    onExporting: /* e */ FormatModel[dxBarGauge] => _ = null,
    onFileSaving: /* e */ CancelComponentData[dxBarGauge] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[dxBarGauge] => _ = null,
    onInitialized: /* e */ Element[dxBarGauge] => _ = null,
    onOptionChanged: /* e */ Name[dxBarGauge] => _ = null,
    onTooltipHidden: /* e */ ComponentDxBarGauge => _ = null,
    onTooltipShown: /* e */ ComponentDxBarGauge => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    relativeInnerRadius: js.UndefOr[Double] = js.undefined,
    resolveLabelOverlapping: hide | none = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    startValue: js.UndefOr[Double] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxBarGaugeTooltip = null,
    values: js.Array[Double] = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxBarGaugeOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(barSpacing)) __obj.updateDynamic("barSpacing")(barSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseValue)) __obj.updateDynamic("baseValue")(baseValue.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
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
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeInnerRadius)) __obj.updateDynamic("relativeInnerRadius")(relativeInnerRadius.get.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBarGaugeOptions]
  }
}

