package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateDate extends js.Object {
  var date: js.Date = js.native
}

object DateDate {
  @scala.inline
  def apply(date: js.Date): DateDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateDate]
  }
  @scala.inline
  implicit class DateDateOps[Self <: DateDate] (val x: Self) extends AnyVal {
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
  }
  
}

