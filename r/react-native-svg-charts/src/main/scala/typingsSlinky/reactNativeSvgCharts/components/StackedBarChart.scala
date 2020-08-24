package typingsSlinky.reactNativeSvgCharts.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.d3Shape.mod.CurveGenerator
import typingsSlinky.d3Shape.mod.Series
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvg.mod.LinearGradientProps
import typingsSlinky.reactNativeSvg.mod.RadialGradientProps
import typingsSlinky.reactNativeSvgCharts.anon.Bottom
import typingsSlinky.reactNativeSvgCharts.anon.Id
import typingsSlinky.reactNativeSvgCharts.anon.PartialPathProps
import typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsSlinky.reactNativeSvgCharts.mod.GridProps
import typingsSlinky.reactNativeSvgCharts.mod.ScaleType
import typingsSlinky.reactNativeSvgCharts.mod.StackedBarChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackedBarChart {
  @JSImport("react-native-svg-charts", "StackedBarChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.StackedBarChart[T]] {
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def contentInset(value: Bottom): this.type = set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def curve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): this.type = set("curve", js.Any.fromFunction1(value))
    @scala.inline
    def extra(value: () => js.Object): this.type = set("extra", js.Any.fromFunction0(value))
    @scala.inline
    def extrasVarargs(value: js.Any*): this.type = set("extras", js.Array(value :_*))
    @scala.inline
    def extras(value: js.Array[_]): this.type = set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def gridMax(value: Double): this.type = set("gridMax", value.asInstanceOf[js.Any])
    @scala.inline
    def gridMin(value: Double): this.type = set("gridMin", value.asInstanceOf[js.Any])
    @scala.inline
    def gridProps(value: GridProps[_]): this.type = set("gridProps", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit): this.type = set("offset", js.Any.fromFunction2(value))
    @scala.inline
    def order(value: /* series */ Series[js.Any, js.Any] => js.Array[Double]): this.type = set("order", js.Any.fromFunction1(value))
    @scala.inline
    def renderGradient(value: /* props */ Id => ReactComponentClass[LinearGradientProps | RadialGradientProps]): this.type = set("renderGradient", js.Any.fromFunction1(value))
    @scala.inline
    def showGrid(value: Boolean): this.type = set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def spacingInner(value: Double): this.type = set("spacingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def spacingOuter(value: Double): this.type = set("spacingOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeColor(value: String): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def svg(value: PartialPathProps): this.type = set("svg", value.asInstanceOf[js.Any])
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
  
  def withProps[T](p: StackedBarChartProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): Builder[T] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[StackedBarChartProps[T]]))
  }
}

