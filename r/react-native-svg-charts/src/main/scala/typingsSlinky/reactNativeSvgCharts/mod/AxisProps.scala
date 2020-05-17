package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.anon.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisProps[T] extends js.Object {
  var data: js.Array[T] = js.native
  var formatLabel: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, Double | String]] = js.native
  var numberOfTicks: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[ScaleFunction] = js.native
  var spacingInner: js.UndefOr[Double] = js.native
  var spacingOuter: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var svg: js.UndefOr[PartialTextProps] = js.native
}

object AxisProps {
  @scala.inline
  def apply[T](data: js.Array[T]): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps[T]]
  }
  @scala.inline
  implicit class AxisPropsOps[Self[t] <: AxisProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatLabel(value: (/* value */ js.Any, /* index */ Double) => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTicks(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTicks: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
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
    def withStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withSvg(value: PartialTextProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
  }
  
}

