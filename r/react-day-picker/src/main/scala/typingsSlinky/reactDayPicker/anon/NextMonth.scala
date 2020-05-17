package typingsSlinky.reactDayPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextMonth extends js.Object {
  var nextMonth: String = js.native
  var previousMonth: String = js.native
}

object NextMonth {
  @scala.inline
  def apply(nextMonth: String, previousMonth: String): NextMonth = {
    val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextMonth]
  }
  @scala.inline
  implicit class NextMonthOps[Self <: NextMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

