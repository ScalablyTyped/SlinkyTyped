package typingsSlinky.nivoScatterplot.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScatterplot.mod.CustomCanvasLayer
import typingsSlinky.nivoScatterplot.mod.CustomLayerId
import typingsSlinky.nivoScatterplot.mod.Datum
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

object ScatterPlotCanvas {
  @JSImport("@nivo/scatterplot", "ScatterPlotCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoScatterplot.mod.ScatterPlotCanvas] {
    @scala.inline
    def axisBottom(value: AxisProps): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def axisBottomNull: this.type = set("axisBottom", null)
    @scala.inline
    def axisLeft(value: AxisProps): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def axisLeftNull: this.type = set("axisLeft", null)
    @scala.inline
    def axisRight(value: AxisProps): this.type = set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def axisRightNull: this.type = set("axisRight", null)
    @scala.inline
    def axisTop(value: AxisProps): this.type = set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def axisTopNull: this.type = set("axisTop", null)
    @scala.inline
    def blendMode(value: CssMixBlendMode): this.type = set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def debugMesh(value: Boolean): this.type = set("debugMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def layers(value: js.Array[CustomLayerId | CustomCanvasLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeSizeFunction1(value: /* node */ Datum => Double): this.type = set("nodeSize", js.Any.fromFunction1(value))
    @scala.inline
    def nodeSize(value: Double | DerivedDatumProp[Double] | DynamicSizeSpec): this.type = set("nodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseEnter(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseLeave(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseMove(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def renderNode(value: (/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps) => Unit): this.type = set("renderNode", js.Any.fromFunction2(value))
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: /* hasNode */ js.Any => TagMod[Any]): this.type = set("tooltip", js.Any.fromFunction1(value))
    @scala.inline
    def useMesh(value: Boolean): this.type = set("useMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def xFormatFunction1(value: /* value */ Value => String | Double): this.type = set("xFormat", js.Any.fromFunction1(value))
    @scala.inline
    def xFormat(value: String | ValueFormatter): this.type = set("xFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def xScale(value: /* value */ Value => Double): this.type = set("xScale", js.Any.fromFunction1(value))
    @scala.inline
    def yFormatFunction1(value: /* value */ Value => String | Double): this.type = set("yFormat", js.Any.fromFunction1(value))
    @scala.inline
    def yFormat(value: String | ValueFormatter): this.type = set("yFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def yScale(value: /* value */ Value => Double): this.type = set("yScale", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ScatterPlotCanvasProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[Serie], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScatterPlotCanvasProps with Dimensions]))
  }
}

