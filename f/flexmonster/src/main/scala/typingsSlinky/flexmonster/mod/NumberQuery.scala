package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberQuery extends js.Object {
  var between: js.UndefOr[js.Array[Double]] = js.native
  var equal: js.UndefOr[Double] = js.native
  var greater: js.UndefOr[Double] = js.native
  var greater_equal: js.UndefOr[Double] = js.native
  var less: js.UndefOr[Double] = js.native
  var less_equal: js.UndefOr[Double] = js.native
  var not_between: js.UndefOr[js.Array[Double]] = js.native
  var not_equal: js.UndefOr[Double] = js.native
}

object NumberQuery {
  @scala.inline
  def apply(): NumberQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberQuery]
  }
  @scala.inline
  implicit class NumberQueryOps[Self <: NumberQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetween(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.undefined)
        ret
    }
    @scala.inline
    def withEqual(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.undefined)
        ret
    }
    @scala.inline
    def withGreater(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greater")(js.undefined)
        ret
    }
    @scala.inline
    def withGreater_equal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greater_equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreater_equal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greater_equal")(js.undefined)
        ret
    }
    @scala.inline
    def withLess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.undefined)
        ret
    }
    @scala.inline
    def withLess_equal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less_equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLess_equal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less_equal")(js.undefined)
        ret
    }
    @scala.inline
    def withNot_between(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not_between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot_between: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not_between")(js.undefined)
        ret
    }
    @scala.inline
    def withNot_equal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not_equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot_equal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not_equal")(js.undefined)
        ret
    }
  }
  
}

