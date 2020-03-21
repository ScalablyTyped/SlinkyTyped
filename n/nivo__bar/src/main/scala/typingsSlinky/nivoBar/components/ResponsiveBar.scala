package typingsSlinky.nivoBar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGRectElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.rect.tag
import typingsSlinky.nivoBar.dataFromindexeskeysLegend
import typingsSlinky.nivoBar.mod.AccessorFunc
import typingsSlinky.nivoBar.mod.Axis
import typingsSlinky.nivoBar.mod.BarDatum
import typingsSlinky.nivoBar.mod.BarDatumWithColor
import typingsSlinky.nivoBar.mod.BarExtendedDatum
import typingsSlinky.nivoBar.mod.BarItemProps
import typingsSlinky.nivoBar.mod.BarSvgProps
import typingsSlinky.nivoBar.mod.IndexByFunc
import typingsSlinky.nivoBar.mod.LabelFormatter
import typingsSlinky.nivoBar.mod.Layer
import typingsSlinky.nivoBar.mod.ValueFormatter
import typingsSlinky.nivoBar.nivoBarStrings.auto
import typingsSlinky.nivoBar.nivoBarStrings.grouped
import typingsSlinky.nivoBar.nivoBarStrings.horizontal
import typingsSlinky.nivoBar.nivoBarStrings.stacked
import typingsSlinky.nivoBar.nivoBarStrings.vertical
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.AnonDictkey
import typingsSlinky.nivoCore.AnonId
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoBar.mod.ResponsiveBar] {
  @JSImport("@nivo/bar", "ResponsiveBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[js.Object],
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    barComponent: ReactComponentClass[BarItemProps] = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    defs: js.Array[AnonDictkey] = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    fill: js.Array[AnonId[BarDatum]] = null,
    groupMode: stacked | grouped = null,
    indexBy: String | IndexByFunc = null,
    innerPadding: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelLinkColor: InheritedColorProp[BarDatumWithColor] = null,
    labelSkipHeight: Int | Double = null,
    labelSkipWidth: Int | Double = null,
    labelTextColor: InheritedColorProp[BarDatumWithColor] = null,
    layers: js.Array[Layer] = null,
    layout: horizontal | vertical = null,
    legends: js.Array[dataFromindexeskeysLegend] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[SVGRectElement]) => Unit = null,
    padding: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    tooltip: ReactComponentClass[BarExtendedDatum] = null,
    tooltipFormat: String | ValueFormatter = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoBar.mod.ResponsiveBar] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (barComponent != null) __obj.updateDynamic("barComponent")(barComponent.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (groupMode != null) __obj.updateDynamic("groupMode")(groupMode.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelLinkColor != null) __obj.updateDynamic("labelLinkColor")(labelLinkColor.asInstanceOf[js.Any])
    if (labelSkipHeight != null) __obj.updateDynamic("labelSkipHeight")(labelSkipHeight.asInstanceOf[js.Any])
    if (labelSkipWidth != null) __obj.updateDynamic("labelSkipWidth")(labelSkipWidth.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BarSvgProps
}

