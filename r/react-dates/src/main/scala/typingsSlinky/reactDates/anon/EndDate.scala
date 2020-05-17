package typingsSlinky.reactDates.anon

import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndDate extends js.Object {
  var endDate: momentObj | Null = js.native
  var startDate: momentObj | Null = js.native
}

object EndDate {
  @scala.inline
  def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: momentObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(null)
        ret
    }
    @scala.inline
    def withStartDate(value: momentObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(null)
        ret
    }
  }
  
}

