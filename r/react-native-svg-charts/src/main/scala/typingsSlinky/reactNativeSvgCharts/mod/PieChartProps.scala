package typingsSlinky.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartProps[T /* <: PieChartData */] extends ChartProps[T] {
  var innerRadius: js.UndefOr[Double | String] = js.native
  var labelRadius: js.UndefOr[Double | String] = js.native
  var outerRadius: js.UndefOr[Double | String] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[SortFunction[T]] = js.native
  var valueAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
}

object PieChartProps {
  @scala.inline
  def apply[T](data: js.Array[T]): PieChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps[T]]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self[t] <: PieChartProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInnerRadius(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRadius(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRadius: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRadius: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPadAngle(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadAngle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (T, T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueAccessor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAccessor")(js.undefined)
        ret
    }
  }
  
}

