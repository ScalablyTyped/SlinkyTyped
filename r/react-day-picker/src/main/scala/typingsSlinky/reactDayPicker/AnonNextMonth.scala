package typingsSlinky.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextMonth extends js.Object {
  var nextMonth: String = js.native
  var previousMonth: String = js.native
}

object AnonNextMonth {
  @scala.inline
  def apply(nextMonth: String, previousMonth: String): AnonNextMonth = {
    val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextMonth]
  }
  @scala.inline
  implicit class AnonNextMonthOps[Self <: AnonNextMonth] (val x: Self) extends AnyVal {
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

