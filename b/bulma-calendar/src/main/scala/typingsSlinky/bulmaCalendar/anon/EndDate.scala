package typingsSlinky.bulmaCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndDate extends js.Object {
  var endDate: js.UndefOr[js.Date] = js.native
  var startDate: js.Date = js.native
}

object EndDate {
  @scala.inline
  def apply(startDate: js.Date): EndDate = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
  }
  
}

