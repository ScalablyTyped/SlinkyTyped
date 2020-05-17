package typingsSlinky.rmcCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstDate extends js.Object {
  var firstDate: js.Date = js.native
  var lastDate: js.Date = js.native
}

object FirstDate {
  @scala.inline
  def apply(firstDate: js.Date, lastDate: js.Date): FirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDate]
  }
  @scala.inline
  implicit class FirstDateOps[Self <: FirstDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

