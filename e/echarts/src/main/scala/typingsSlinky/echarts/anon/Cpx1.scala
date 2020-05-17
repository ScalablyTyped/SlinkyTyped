package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cpx1 extends js.Object {
  /**
    * x of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx1
    */
  var cpx1: js.UndefOr[Double] = js.native
  /**
    * x of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx2
    */
  var cpx2: js.UndefOr[Double] = js.native
  /**
    * y of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy1
    */
  var cpy1: js.UndefOr[Double] = js.native
  /**
    * y of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy2
    */
  var cpy2: js.UndefOr[Double] = js.native
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.percent
    */
  var percent: js.UndefOr[Double] = js.native
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x1
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x2
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y1
    */
  var y1: js.UndefOr[Double] = js.native
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y2
    */
  var y2: js.UndefOr[Double] = js.native
}

object Cpx1 {
  @scala.inline
  def apply(): Cpx1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cpx1]
  }
  @scala.inline
  implicit class Cpx1Ops[Self <: Cpx1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpx1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpx1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpx1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpx1")(js.undefined)
        ret
    }
    @scala.inline
    def withCpx2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpx2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpx2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpx2")(js.undefined)
        ret
    }
    @scala.inline
    def withCpy1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpy1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpy1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpy1")(js.undefined)
        ret
    }
    @scala.inline
    def withCpy2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpy2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpy2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpy2")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withX1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(js.undefined)
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
    @scala.inline
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(js.undefined)
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
  }
  
}

