package typingsSlinky.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/iterresult.IterArgs> */
@js.native
trait PartialIterArgs extends js.Object {
  var _value: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
  var after: js.UndefOr[js.Date] = js.native
  var before: js.UndefOr[js.Date] = js.native
  var dt: js.UndefOr[js.Date] = js.native
  var inc: js.UndefOr[Boolean] = js.native
}

object PartialIterArgs {
  @scala.inline
  def apply(): PartialIterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIterArgs]
  }
  @scala.inline
  implicit class PartialIterArgsOps[Self <: PartialIterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: js.Date): Self = {
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
    def withBefore(value: js.Date): Self = {
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
    def withDt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(js.undefined)
        ret
    }
    @scala.inline
    def withInc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(js.undefined)
        ret
    }
  }
  
}

