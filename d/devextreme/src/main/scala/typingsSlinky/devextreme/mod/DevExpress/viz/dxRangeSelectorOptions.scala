package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.AggregateByCategory
import typingsSlinky.devextreme.anon.AllowSlidersSwap
import typingsSlinky.devextreme.anon.BarGroupPadding
import typingsSlinky.devextreme.anon.CancelComponentData
import typingsSlinky.devextreme.anon.ComponentTElementDxElementModelAny
import typingsSlinky.devextreme.anon.Element
import typingsSlinky.devextreme.anon.ElementEventModel
import typingsSlinky.devextreme.anon.FormatModel
import typingsSlinky.devextreme.anon.Image
import typingsSlinky.devextreme.anon.InvalidRangeColor
import typingsSlinky.devextreme.anon.Model
import typingsSlinky.devextreme.anon.Name
import typingsSlinky.devextreme.anon.Opacity
import typingsSlinky.devextreme.anon.OpacityWidth
import typingsSlinky.devextreme.anon.Right
import typingsSlinky.devextreme.anon.TargetAny
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.genericDotcarmine
import typingsSlinky.devextreme.devextremeStrings.genericDotcontrast
import typingsSlinky.devextreme.devextremeStrings.genericDotdark
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkmoon
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkviolet
import typingsSlinky.devextreme.devextremeStrings.genericDotgreenmist
import typingsSlinky.devextreme.devextremeStrings.genericDotlight
import typingsSlinky.devextreme.devextremeStrings.genericDotsoftblue
import typingsSlinky.devextreme.devextremeStrings.ios7Dotdefault
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.materialDotblueDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDottealDotlight
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxRangeSelectorOptions extends BaseWidgetOptions[dxRangeSelector] {
  /** @name dxRangeSelector.Options.background */
  var background: js.UndefOr[Image] = js.undefined
  /** @name dxRangeSelector.Options.behavior */
  var behavior: js.UndefOr[AllowSlidersSwap] = js.undefined
  /** @name dxRangeSelector.Options.chart */
  var chart: js.UndefOr[BarGroupPadding] = js.undefined
  /** @name dxRangeSelector.Options.containerBackgroundColor */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** @name dxRangeSelector.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name dxRangeSelector.Options.dataSourceField */
  var dataSourceField: js.UndefOr[String] = js.undefined
  /** @name dxRangeSelector.Options.indent */
  var indent: js.UndefOr[Right] = js.undefined
  /** @name dxRangeSelector.Options.onValueChanged */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ElementEventModel, _]] = js.undefined
  /** @name dxRangeSelector.Options.scale */
  var scale: js.UndefOr[AggregateByCategory] = js.undefined
  /** @name dxRangeSelector.Options.selectedRangeColor */
  var selectedRangeColor: js.UndefOr[String] = js.undefined
  /** @name dxRangeSelector.Options.selectedRangeUpdateMode */
  var selectedRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** @name dxRangeSelector.Options.shutter */
  var shutter: js.UndefOr[Opacity] = js.undefined
  /** @name dxRangeSelector.Options.sliderHandle */
  var sliderHandle: js.UndefOr[OpacityWidth] = js.undefined
  /** @name dxRangeSelector.Options.sliderMarker */
  var sliderMarker: js.UndefOr[InvalidRangeColor] = js.undefined
  /** @name dxRangeSelector.Options.value */
  var value: js.UndefOr[(js.Array[Double | String | js.Date]) | VizRange] = js.undefined
}

object dxRangeSelectorOptions {
  @scala.inline
  def apply(
    background: Image = null,
    behavior: AllowSlidersSwap = null,
    bindingOptions: js.Any = null,
    chart: BarGroupPadding = null,
    containerBackgroundColor: String = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    dataSourceField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    indent: Right = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ Model[dxRangeSelector] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[dxRangeSelector] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[dxRangeSelector] => _ = null,
    onExporting: /* e */ FormatModel[dxRangeSelector] => _ = null,
    onFileSaving: /* e */ CancelComponentData[dxRangeSelector] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[dxRangeSelector] => _ = null,
    onInitialized: /* e */ Element[dxRangeSelector] => _ = null,
    onOptionChanged: /* e */ Name[dxRangeSelector] => _ = null,
    onValueChanged: /* e */ ElementEventModel => _ = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: AggregateByCategory = null,
    selectedRangeColor: String = null,
    selectedRangeUpdateMode: auto | keep | reset | shift = null,
    shutter: Opacity = null,
    size: BaseWidgetSize = null,
    sliderHandle: OpacityWidth = null,
    sliderMarker: InvalidRangeColor = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseWidgetTooltip = null,
    value: (js.Array[Double | String | js.Date]) | VizRange = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceField != null) __obj.updateDynamic("dataSourceField")(dataSourceField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
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
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (selectedRangeColor != null) __obj.updateDynamic("selectedRangeColor")(selectedRangeColor.asInstanceOf[js.Any])
    if (selectedRangeUpdateMode != null) __obj.updateDynamic("selectedRangeUpdateMode")(selectedRangeUpdateMode.asInstanceOf[js.Any])
    if (shutter != null) __obj.updateDynamic("shutter")(shutter.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sliderHandle != null) __obj.updateDynamic("sliderHandle")(sliderHandle.asInstanceOf[js.Any])
    if (sliderMarker != null) __obj.updateDynamic("sliderMarker")(sliderMarker.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxRangeSelectorOptions]
  }
}

