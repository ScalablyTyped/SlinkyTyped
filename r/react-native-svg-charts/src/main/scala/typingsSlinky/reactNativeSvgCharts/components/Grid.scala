package typingsSlinky.reactNativeSvgCharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvgCharts.anon.PartialLineProps
import typingsSlinky.reactNativeSvgCharts.mod.GridDirection
import typingsSlinky.reactNativeSvgCharts.mod.GridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[T]] {
    @scala.inline
    def belowChart(value: Boolean): this.type = set("belowChart", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: GridDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def svg(value: PartialLineProps): this.type = set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def ticksVarargs(value: T*): this.type = set("ticks", js.Array(value :_*))
    @scala.inline
    def ticks(value: js.Array[T]): this.type = set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def x(value: T => Double): this.type = set("x", js.Any.fromFunction1(value))
    @scala.inline
    def y(value: T => Double): this.type = set("y", js.Any.fromFunction1(value))
  }
  
  def withProps[T](p: GridProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GridProps[T]]))
  }
  implicit def make[T](companion: Grid.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

