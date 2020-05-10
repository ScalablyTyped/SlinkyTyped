package typingsSlinky.nivoScatterplot.mod

import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @nivo/scatterplot.Omit<@nivo/scatterplot.@nivo/scatterplot.ScatterPlotSvgProps, 'xScale' | 'yScale'> */
/* Inlined parent @nivo/scatterplot.@nivo/scatterplot.ScatterPlotComputedProps */
@js.native
trait CustomSvgLayerProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var axisBottom: js.UndefOr[AxisProps] = js.native
  var axisLeft: js.UndefOr[AxisProps] = js.native
  var axisRight: js.UndefOr[AxisProps] = js.native
  var axisTop: js.UndefOr[AxisProps] = js.native
  var blendMode: js.UndefOr[CssMixBlendMode] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var data: js.Array[Serie] = js.native
  var debugMesh: js.UndefOr[Boolean] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var innerHeight: Double = js.native
  var innerWidth: Double = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var nodeSize: js.UndefOr[Double | DerivedDatumProp[Double] | DynamicSizeSpec] = js.native
  var nodes: js.Array[Node] = js.native
  var onClick: js.UndefOr[MouseHandler] = js.native
  var onMouseEnter: js.UndefOr[MouseHandler] = js.native
  var onMouseLeave: js.UndefOr[MouseHandler] = js.native
  var onMouseMove: js.UndefOr[MouseHandler] = js.native
  var outerHeight: Double = js.native
  var outerWidth: Double = js.native
  var renderNode: js.UndefOr[NodeComponent] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[CustomTooltip] = js.native
  var useMesh: js.UndefOr[Boolean] = js.native
  var xFormat: js.UndefOr[String | ValueFormatter] = js.native
  var xScale: Scale = js.native
  var yFormat: js.UndefOr[String | ValueFormatter] = js.native
  var yScale: Scale = js.native
}

object CustomSvgLayerProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: /* value */ Value => Double,
    yScale: /* value */ Value => Double
  ): CustomSvgLayerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[CustomSvgLayerProps]
  }
  @scala.inline
  implicit class CustomSvgLayerPropsOps[Self <: CustomSvgLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Serie]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXScale(value: /* value */ Value => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYScale(value: /* value */ Value => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisBottom(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLeft(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRight(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTop(value: AxisProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendMode(value: CssMixBlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[CustomLayerId | CustomSvgLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[CartesianMarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSizeFunction1(value: /* node */ Datum => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNodeSize(value: Double | DerivedDatumProp[Double] | DynamicSizeSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNode(value: /* props */ NodeProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: /* hasNode */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withXFormatFunction1(value: /* value */ Value => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXFormat(value: String | ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withYFormatFunction1(value: /* value */ Value => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYFormat(value: String | ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormat")(js.undefined)
        ret
    }
  }
  
}

