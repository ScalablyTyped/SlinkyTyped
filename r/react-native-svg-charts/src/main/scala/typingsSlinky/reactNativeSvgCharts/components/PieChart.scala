package typingsSlinky.reactNativeSvgCharts.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.d3Shape.mod.CurveGenerator
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.anon.Bottom
import typingsSlinky.reactNativeSvgCharts.anon.PartialPathProps
import typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsSlinky.reactNativeSvgCharts.mod.GridProps
import typingsSlinky.reactNativeSvgCharts.mod.PieChartData
import typingsSlinky.reactNativeSvgCharts.mod.PieChartProps
import typingsSlinky.reactNativeSvgCharts.mod.ScaleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PieChart {
  
  @scala.inline
  def apply[T /* <: PieChartData */](data: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[PieChartProps[T]]))
  }
  
  @JSImport("react-native-svg-charts", "PieChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: PieChartData */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.PieChart[T]] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentInset(value: Bottom): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def curve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): this.type = set("curve", js.Any.fromFunction1(value))
    
    @scala.inline
    def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridMax(value: Double): this.type = set("gridMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridMin(value: Double): this.type = set("gridMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridProps(value: GridProps[_]): this.type = set("gridProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRadius(value: Double | String): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRadius(value: Double | String): this.type = set("labelRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRadius(value: Double | String): this.type = set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sort(value: (T, T) => Double): this.type = set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def svg(value: PartialPathProps): this.type = set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("valueAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("xAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def xMax(value: Double): this.type = set("xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xMin(value: Double): this.type = set("xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): this.type = set("xScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def yAccessor(value: /* props */ AccessorFunctionProps[T] => Double): this.type = set("yAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def yMax(value: Double): this.type = set("yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yMin(value: Double): this.type = set("yMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): this.type = set("yScale", js.Any.fromFunction0(value))
  }
  
  def withProps[T /* <: PieChartData */](p: PieChartProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
