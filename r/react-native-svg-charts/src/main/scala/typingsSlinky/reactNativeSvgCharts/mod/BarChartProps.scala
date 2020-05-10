package typingsSlinky.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartProps[T] extends ChartProps[T] {
  var spacingInner: js.UndefOr[Double] = js.native
  var spacingOuter: js.UndefOr[Double] = js.native
}

object BarChartProps {
  @scala.inline
  def apply[T](data: js.Array[T]): BarChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps[T]]
  }
  @scala.inline
  implicit class BarChartPropsOps[Self[t] <: BarChartProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
  }
  
}

