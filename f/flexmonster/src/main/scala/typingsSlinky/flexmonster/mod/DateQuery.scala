package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateQuery extends js.Object {
  var after: js.UndefOr[String] = js.native
  var after_equal: js.UndefOr[String] = js.native
  var before: js.UndefOr[String] = js.native
  var before_equal: js.UndefOr[String] = js.native
  var between: js.UndefOr[js.Array[String]] = js.native
  var current: js.UndefOr[String] = js.native
  var equal: js.UndefOr[String] = js.native
  var last: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var not_between: js.UndefOr[js.Array[String]] = js.native
  var not_equal: js.UndefOr[String] = js.native
}

object DateQuery {
  @scala.inline
  def apply(): DateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateQuery]
  }
  @scala.inline
  implicit class DateQueryOps[Self <: DateQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter_equal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter_equal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_equal")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore_equal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore_equal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_equal")(js.undefined)
        ret
    }
    @scala.inline
    def withBetween(value: js.Array[String]): Self = {
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
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withEqual(value: String): Self = {
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
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withNot_between(value: js.Array[String]): Self = {
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
    def withNot_equal(value: String): Self = {
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

