package typingsSlinky.nivoScatterplot.mod

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScales.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterPlotProps extends js.Object {
  
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  
  var blendMode: js.UndefOr[CssMixBlendMode] = js.native
  
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  
  var data: js.Array[Serie] = js.native
  
  var debugMesh: js.UndefOr[Boolean] = js.native
  
  var enableGridX: js.UndefOr[Boolean] = js.native
  
  var enableGridY: js.UndefOr[Boolean] = js.native
  
  var gridXValues: js.UndefOr[GridValues[Value]] = js.native
  
  var gridYValues: js.UndefOr[GridValues[Value]] = js.native
  
  var isInteractive: js.UndefOr[Boolean] = js.native
  
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  
  var margin: js.UndefOr[Box] = js.native
  
  var nodeSize: js.UndefOr[Double | DerivedDatumProp[Double] | DynamicSizeSpec] = js.native
  
  var onClick: js.UndefOr[MouseHandler] = js.native
  
  var onMouseEnter: js.UndefOr[MouseHandler] = js.native
  
  var onMouseLeave: js.UndefOr[MouseHandler] = js.native
  
  var onMouseMove: js.UndefOr[MouseHandler] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
  
  var tooltip: js.UndefOr[CustomTooltip] = js.native
  
  var useMesh: js.UndefOr[Boolean] = js.native
  
  var xFormat: js.UndefOr[String | ValueFormatter] = js.native
  
  var xScale: js.UndefOr[Scale] = js.native
  
  var yFormat: js.UndefOr[String | ValueFormatter] = js.native
  
  var yScale: js.UndefOr[Scale] = js.native
}
object ScatterPlotProps {
  
  @scala.inline
  def apply(data: js.Array[Serie]): ScatterPlotProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotProps]
  }
  
  @scala.inline
  implicit class ScatterPlotPropsOps[Self <: ScatterPlotProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: Serie*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Serie]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisBottom(value: AxisProps): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisBottom: Self = this.set("axisBottom", js.undefined)
    
    @scala.inline
    def setAxisBottomNull: Self = this.set("axisBottom", null)
    
    @scala.inline
    def setAxisLeft(value: AxisProps): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLeft: Self = this.set("axisLeft", js.undefined)
    
    @scala.inline
    def setAxisLeftNull: Self = this.set("axisLeft", null)
    
    @scala.inline
    def setAxisRight(value: AxisProps): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisRight: Self = this.set("axisRight", js.undefined)
    
    @scala.inline
    def setAxisRightNull: Self = this.set("axisRight", null)
    
    @scala.inline
    def setAxisTop(value: AxisProps): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTop: Self = this.set("axisTop", js.undefined)
    
    @scala.inline
    def setAxisTopNull: Self = this.set("axisTop", null)
    
    @scala.inline
    def setBlendMode(value: CssMixBlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDebugMesh(value: Boolean): Self = this.set("debugMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMesh: Self = this.set("debugMesh", js.undefined)
    
    @scala.inline
    def setEnableGridX(value: Boolean): Self = this.set("enableGridX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridX: Self = this.set("enableGridX", js.undefined)
    
    @scala.inline
    def setEnableGridY(value: Boolean): Self = this.set("enableGridY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridY: Self = this.set("enableGridY", js.undefined)
    
    @scala.inline
    def setGridXValuesVarargs(value: (js.Date | Double | String)*): Self = this.set("gridXValues", js.Array(value :_*))
    
    @scala.inline
    def setGridXValues(value: GridValues[Value]): Self = this.set("gridXValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridXValues: Self = this.set("gridXValues", js.undefined)
    
    @scala.inline
    def setGridYValuesVarargs(value: (js.Date | Double | String)*): Self = this.set("gridYValues", js.Array(value :_*))
    
    @scala.inline
    def setGridYValues(value: GridValues[Value]): Self = this.set("gridYValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridYValues: Self = this.set("gridYValues", js.undefined)
    
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setNodeSizeFunction1(value: /* node */ Datum => Double): Self = this.set("nodeSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNodeSize(value: Double | DerivedDatumProp[Double] | DynamicSizeSpec): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeSize: Self = this.set("nodeSize", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: (/* node */ Node, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: /* props */ TooltipProps => ReactElement): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUseMesh(value: Boolean): Self = this.set("useMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMesh: Self = this.set("useMesh", js.undefined)
    
    @scala.inline
    def setXFormatFunction1(value: /* value */ Value => String | Double): Self = this.set("xFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXFormat(value: String | ValueFormatter): Self = this.set("xFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXFormat: Self = this.set("xFormat", js.undefined)
    
    @scala.inline
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    
    @scala.inline
    def setYFormatFunction1(value: /* value */ Value => String | Double): Self = this.set("yFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYFormat(value: String | ValueFormatter): Self = this.set("yFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYFormat: Self = this.set("yFormat", js.undefined)
    
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
}
