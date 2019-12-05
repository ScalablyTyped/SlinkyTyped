package typingsSlinky.atNivoScatterplot

import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atNivoAxes.atNivoAxesMod.AxisProps
import typingsSlinky.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.CartesianMarkerProps
import typingsSlinky.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoLegends.atNivoLegendsMod.LegendProps
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.CustomLayerId
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.CustomSvgLayer
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.CustomTooltip
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.DerivedDatumProp
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.DynamicSizeSpec
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.MouseHandler
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.Node
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.NodeComponent
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.NodeProps
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.Scale
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.Serie
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.Value
import typingsSlinky.atNivoScatterplot.atNivoScatterplotMod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/scatterplot.@nivo/scatterplot.ScatterPlotSvgProps & @nivo/core.@nivo/core.Dimensions */
trait ScatterPlotSvgPropsDimensions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var axisBottom: js.UndefOr[AxisProps | Null] = js.undefined
  var axisLeft: js.UndefOr[AxisProps | Null] = js.undefined
  var axisRight: js.UndefOr[AxisProps | Null] = js.undefined
  var axisTop: js.UndefOr[AxisProps | Null] = js.undefined
  var blendMode: js.UndefOr[CssMixBlendMode] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var data: js.Array[Serie]
  var debugMesh: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var nodeSize: js.UndefOr[Double | DerivedDatumProp[Double] | DynamicSizeSpec] = js.undefined
  var onClick: js.UndefOr[MouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MouseHandler] = js.undefined
  var onMouseMove: js.UndefOr[MouseHandler] = js.undefined
  var renderNode: js.UndefOr[NodeComponent] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[CustomTooltip] = js.undefined
  var useMesh: js.UndefOr[Boolean] = js.undefined
  var width: Double
  var xFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var xScale: js.UndefOr[Scale] = js.undefined
  var yFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var yScale: js.UndefOr[Scale] = js.undefined
}

object ScatterPlotSvgPropsDimensions {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    height: Double,
    width: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    blendMode: CssMixBlendMode = null,
    colors: OrdinalColorsInstruction[_] = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[CustomLayerId | CustomSvgLayer] = null,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseEnter: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseLeave: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseMove: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    renderNode: /* props */ NodeProps => TagMod[Any] = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => TagMod[Any] = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => Double = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => Double = null
  ): ScatterPlotSvgPropsDimensions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction1(renderNode))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1(xScale))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[ScatterPlotSvgPropsDimensions]
  }
}

