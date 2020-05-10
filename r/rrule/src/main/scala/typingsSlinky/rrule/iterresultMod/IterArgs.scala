package typingsSlinky.rrule.iterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterArgs extends js.Object {
  var _value: js.Date | js.Array[js.Date] | Null = js.native
  var after: js.Date = js.native
  var before: js.Date = js.native
  var dt: js.Date = js.native
  var inc: Boolean = js.native
}

object IterArgs {
  @scala.inline
  def apply(after: js.Date, before: js.Date, dt: js.Date, inc: Boolean): IterArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
  @scala.inline
  implicit class IterArgsOps[Self <: IterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_valueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_value(value: js.Date | js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_valueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(null)
        ret
    }
  }
  
}

