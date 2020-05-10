package typingsSlinky.gldatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlDatePickerDate extends js.Object {
  var date: js.Date = js.native
  var repeatMonth: js.UndefOr[Boolean] = js.native
  var repeatYear: js.UndefOr[Boolean] = js.native
}

object GlDatePickerDate {
  @scala.inline
  def apply(date: js.Date): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDate]
  }
  @scala.inline
  implicit class GlDatePickerDateOps[Self <: GlDatePickerDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatYear")(js.undefined)
        ret
    }
  }
  
}

