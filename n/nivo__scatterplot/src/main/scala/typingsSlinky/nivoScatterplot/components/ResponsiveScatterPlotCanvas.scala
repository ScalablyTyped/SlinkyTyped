package typingsSlinky.nivoScatterplot.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScatterplot.mod.CustomCanvasLayer
import typingsSlinky.nivoScatterplot.mod.CustomLayerId
import typingsSlinky.nivoScatterplot.mod.DerivedDatumProp
import typingsSlinky.nivoScatterplot.mod.DynamicSizeSpec
import typingsSlinky.nivoScatterplot.mod.Node
import typingsSlinky.nivoScatterplot.mod.NodeProps
import typingsSlinky.nivoScatterplot.mod.ScatterPlotCanvasProps
import typingsSlinky.nivoScatterplot.mod.Serie
import typingsSlinky.nivoScatterplot.mod.Value
import typingsSlinky.nivoScatterplot.mod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveScatterPlotCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoScatterplot.mod.ResponsiveScatterPlotCanvas] {
  @JSImport("@nivo/scatterplot", "ResponsiveScatterPlotCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[Serie],
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
    layers: js.Array[CustomLayerId | CustomCanvasLayer] = null,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseEnter: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseLeave: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseMove: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    pixelRatio: Int | Double = null,
    renderNode: (/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps) => Unit = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => TagMod[Any] = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => Double = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoScatterplot.mod.ResponsiveScatterPlotCanvas] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
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
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2(renderNode))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1(xScale))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1(yScale))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScatterPlotCanvasProps
}

