package typingsSlinky.atNivoHeatmap.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoAxes.atNivoAxesMod.Axis
import typingsSlinky.atNivoColors.atNivoColorsMod.InheritedColorProp
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.Colors
import typingsSlinky.atNivoCore.atNivoCoreMod.GetColor
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.HeatMapCanvasProps
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.HeatMapDatum
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.HeatMapDatumWithColor
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.IndexByFunc
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.NodeData
import typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.ValueFormatter
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.auto
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.cell
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.circle
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.column
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.rect
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.row
import typingsSlinky.atNivoHeatmap.atNivoHeatmapStrings.rowColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveHeatMapCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.ResponsiveHeatMapCanvas] {
  @JSImport("@nivo/heatmap", "ResponsiveHeatMapCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[HeatMapDatum],
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    cellBorderColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    cellBorderWidth: Int | Double = null,
    cellHoverOpacity: Int | Double = null,
    cellHoverOthersOpacity: Int | Double = null,
    cellOpacity: Int | Double = null,
    cellShape: rect | circle | ReactComponentClass[_] = null,
    colorBy: String | GetColor[HeatMapDatum] = null,
    colors: Colors = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    forceSquare: js.UndefOr[Boolean] = js.undefined,
    hoverTarget: cell | row | column | rowColumn = null,
    indexBy: String | IndexByFunc = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    labelTextColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    margin: Box = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    onClick: (/* datum */ NodeData, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit = null,
    padding: Int | Double = null,
    pixelRatio: Int | Double = null,
    sizeVariation: Int | Double = null,
    theme: Theme = null,
    tooltipFormat: String | ValueFormatter = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoHeatmap.atNivoHeatmapMod.ResponsiveHeatMapCanvas] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (cellBorderColor != null) __obj.updateDynamic("cellBorderColor")(cellBorderColor.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHoverOpacity != null) __obj.updateDynamic("cellHoverOpacity")(cellHoverOpacity.asInstanceOf[js.Any])
    if (cellHoverOthersOpacity != null) __obj.updateDynamic("cellHoverOthersOpacity")(cellHoverOthersOpacity.asInstanceOf[js.Any])
    if (cellOpacity != null) __obj.updateDynamic("cellOpacity")(cellOpacity.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquare)) __obj.updateDynamic("forceSquare")(forceSquare.asInstanceOf[js.Any])
    if (hoverTarget != null) __obj.updateDynamic("hoverTarget")(hoverTarget.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (sizeVariation != null) __obj.updateDynamic("sizeVariation")(sizeVariation.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeatMapCanvasProps
}

