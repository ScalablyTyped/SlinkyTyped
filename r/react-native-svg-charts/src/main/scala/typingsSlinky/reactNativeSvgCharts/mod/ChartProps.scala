package typingsSlinky.reactNativeSvgCharts.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Scale.mod.ScaleBand_
import typingsSlinky.d3Shape.mod.CurveFactory
import typingsSlinky.d3Shape.mod.CurveGenerator
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.AnonBottom
import typingsSlinky.reactNativeSvgCharts.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var contentInset: js.UndefOr[AnonBottom] = js.native
  var curve: js.UndefOr[CurveFactory] = js.native
  var data: js.Array[T] = js.native
  var gridMax: js.UndefOr[Double] = js.native
  var gridMin: js.UndefOr[Double] = js.native
  var gridProps: js.UndefOr[GridProps[_]] = js.native
  var height: js.UndefOr[Double] = js.native
  var numberOfTicks: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var svg: js.UndefOr[PartialPathProps] = js.native
  var width: js.UndefOr[Double] = js.native
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
  var xMax: js.UndefOr[Double] = js.native
  var xMin: js.UndefOr[Double] = js.native
  var xScale: js.UndefOr[ScaleFunction] = js.native
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
  var yMax: js.UndefOr[Double] = js.native
  var yMin: js.UndefOr[Double] = js.native
  var yScale: js.UndefOr[ScaleFunction] = js.native
}

object ChartProps {
  @scala.inline
  def apply[T](data: js.Array[T]): ChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps[T]]
  }
  @scala.inline
  implicit class ChartPropsOps[Self[t] <: ChartProps[t], T] (val x: Self[T]) extends AnyVal {
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
    def withAnimate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInset(value: AnonBottom): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(js.undefined)
        ret
    }
    @scala.inline
    def withCurve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCurve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMax")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMin(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMin")(js.undefined)
        ret
    }
    @scala.inline
    def withGridProps(value: GridProps[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withSvg(value: PartialPathProps): Self[T] = {
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
    def withWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXAccessor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withXMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(js.undefined)
        ret
    }
    @scala.inline
    def withXMin(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(js.undefined)
        ret
    }
    @scala.inline
    def withXScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutXScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.undefined)
        ret
    }
    @scala.inline
    def withYAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutYAccessor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withYMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(js.undefined)
        ret
    }
    @scala.inline
    def withYMin(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(js.undefined)
        ret
    }
    @scala.inline
    def withYScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutYScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.undefined)
        ret
    }
  }
  
}

