package typingsSlinky.reactNativeSvgCharts.mod

import slinky.core.ReactComponentClass
import typingsSlinky.d3Shape.mod.Series
import typingsSlinky.reactNativeSvg.mod.LinearGradientProps
import typingsSlinky.reactNativeSvg.mod.RadialGradientProps
import typingsSlinky.reactNativeSvgCharts.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedBarChartProps[T] extends ChartProps[T] {
  var colors: js.Array[String] = js.native
  var extra: js.UndefOr[js.Function0[js.Object]] = js.native
  var extras: js.UndefOr[js.Array[_]] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var keys: js.Array[/* keyof T */ String] = js.native
  var offset: js.UndefOr[OffsetFunction] = js.native
  var order: js.UndefOr[OrderFunction] = js.native
  var renderGradient: js.UndefOr[
    js.Function1[/* props */ Id, ReactComponentClass[LinearGradientProps | RadialGradientProps]]
  ] = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var spacingInner: js.UndefOr[Double] = js.native
  var spacingOuter: js.UndefOr[Double] = js.native
  var strokeColor: js.UndefOr[String] = js.native
}

object StackedBarChartProps {
  @scala.inline
  def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): StackedBarChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedBarChartProps[T]]
  }
  @scala.inline
  implicit class StackedBarChartPropsOps[Self[t] <: StackedBarChartProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColors(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExtra: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withExtras(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOffset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: /* series */ Series[js.Any, js.Any] => js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOrder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderGradient(value: /* props */ Id => ReactComponentClass[LinearGradientProps | RadialGradientProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderGradient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderGradient: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingInner(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingInner: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingInner")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingOuter(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingOuter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingOuter")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
  }
  
}

