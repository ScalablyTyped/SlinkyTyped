package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.reactNativeSvgCharts.anon.PartialLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps[T] extends js.Object {
  var belowChart: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[GridDirection] = js.native
  var svg: js.UndefOr[PartialLineProps] = js.native
  var ticks: js.UndefOr[js.Array[T]] = js.native
  var x: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
  var y: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
}

object GridProps {
  @scala.inline
  def apply[T](): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[T]]
  }
  @scala.inline
  implicit class GridPropsOps[Self[t] <: GridProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBelowChart(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelowChart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowChart")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: GridDirection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: PartialLineProps): Self[T] = {
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
    @scala.inline
    def withTicks(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: /* t */ T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutX: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: /* t */ T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutY: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

