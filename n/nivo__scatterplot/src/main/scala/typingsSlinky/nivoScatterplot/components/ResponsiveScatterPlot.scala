package typingsSlinky.nivoScatterplot.components

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScales.mod.Scale
import typingsSlinky.nivoScatterplot.mod.CustomLayerId
import typingsSlinky.nivoScatterplot.mod.CustomSvgLayer
import typingsSlinky.nivoScatterplot.mod.Datum
import typingsSlinky.nivoScatterplot.mod.DerivedDatumProp
import typingsSlinky.nivoScatterplot.mod.DynamicSizeSpec
import typingsSlinky.nivoScatterplot.mod.Node
import typingsSlinky.nivoScatterplot.mod.NodeProps
import typingsSlinky.nivoScatterplot.mod.ScatterPlotSvgProps
import typingsSlinky.nivoScatterplot.mod.Serie
import typingsSlinky.nivoScatterplot.mod.TooltipProps
import typingsSlinky.nivoScatterplot.mod.Value
import typingsSlinky.nivoScatterplot.mod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveScatterPlot {
  
  @JSImport("@nivo/scatterplot", "ResponsiveScatterPlot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoScatterplot.mod.ResponsiveScatterPlot] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
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
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
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
    def gridXValuesVarargs(value: (js.Date | Double | String)*): this.type = set("gridXValues", js.Array(value :_*))
    
    @scala.inline
    def gridXValues(value: GridValues[Value]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridYValuesVarargs(value: (js.Date | Double | String)*): this.type = set("gridYValues", js.Array(value :_*))
    
    @scala.inline
    def gridYValues(value: GridValues[Value]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layersVarargs(value: (CustomLayerId | CustomSvgLayer)*): this.type = set("layers", js.Array(value :_*))
    
    @scala.inline
    def layers(value: js.Array[CustomLayerId | CustomSvgLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value :_*))
    
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markersVarargs(value: CartesianMarkerProps*): this.type = set("markers", js.Array(value :_*))
    
    @scala.inline
    def markers(value: js.Array[CartesianMarkerProps]): this.type = set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    
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
    def renderNode(value: /* props */ NodeProps => ReactElement): this.type = set("renderNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: /* props */ TooltipProps => ReactElement): this.type = set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def useMesh(value: Boolean): this.type = set("useMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xFormatFunction1(value: /* value */ Value => String | Double): this.type = set("xFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def xFormat(value: String | ValueFormatter): this.type = set("xFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yFormatFunction1(value: /* value */ Value => String | Double): this.type = set("yFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def yFormat(value: String | ValueFormatter): this.type = set("yFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScatterPlotSvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[Serie]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScatterPlotSvgProps]))
  }
}
