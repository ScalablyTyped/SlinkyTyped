package typingsSlinky.reactNativeSvgCharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.anon.Left
import typingsSlinky.reactNativeSvgCharts.anon.PartialTextProps
import typingsSlinky.reactNativeSvgCharts.mod.AccessorFunctionProps
import typingsSlinky.reactNativeSvgCharts.mod.ScaleType
import typingsSlinky.reactNativeSvgCharts.mod.XAxisProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object XAxis {
  @JSImport("react-native-svg-charts", "XAxis")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.XAxis[js.Any]] {
    @scala.inline
    def contentInset(value: Left): this.type = set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def formatLabel(value: (/* value */ js.Any, /* index */ Double) => Double | String): this.type = set("formatLabel", js.Any.fromFunction2(value))
    @scala.inline
    def numberOfTicks(value: Double): this.type = set("numberOfTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): this.type = set("scale", js.Any.fromFunction0(value))
    @scala.inline
    def spacingInner(value: Double): this.type = set("spacingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def spacingOuter(value: Double): this.type = set("spacingOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def svg(value: PartialTextProps): this.type = set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def xAccessor(value: /* props */ AccessorFunctionProps[T] => _): this.type = set("xAccessor", js.Any.fromFunction1(value))
  }
  
  def withProps[T](p: XAxisProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](data: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[XAxisProps[T]]))
  }
}

