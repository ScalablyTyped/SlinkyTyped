package typingsSlinky.flatpickr.weekSelectMod

import typingsSlinky.flatpickr.globalsMod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlusWeeks extends js.Object {
  var weekEndDay: Date = js.native
  var weekStartDay: Date = js.native
}

object PlusWeeks {
  @scala.inline
  def apply(weekEndDay: Date, weekStartDay: Date): PlusWeeks = {
    val __obj = js.Dynamic.literal(weekEndDay = weekEndDay.asInstanceOf[js.Any], weekStartDay = weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWeeks]
  }
  @scala.inline
  implicit class PlusWeeksOps[Self <: PlusWeeks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeekEndDay(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekEndDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekStartDay(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartDay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

