package typingsSlinky.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Split extends Pair {
  var _t1: js.UndefOr[Double] = js.native
  var _t2: js.UndefOr[Double] = js.native
  var span: js.Array[Point] = js.native
}

object Split {
  @scala.inline
  def apply(left: Bezier, right: Bezier, span: js.Array[Point]): Split = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split]
  }
  @scala.inline
  implicit class SplitOps[Self <: Split] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpan(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_t1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_t1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_t1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_t1")(js.undefined)
        ret
    }
    @scala.inline
    def with_t2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_t2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_t2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_t2")(js.undefined)
        ret
    }
  }
  
}

