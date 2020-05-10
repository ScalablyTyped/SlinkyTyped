package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarCustomDisabledDateEventArgs extends EventArgs {
  val date: js.Date = js.native
  var isDisabled: Boolean = js.native
}

object CalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: js.Date, isDisabled: Boolean, sender: Control): CalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarCustomDisabledDateEventArgs]
  }
  @scala.inline
  implicit class CalendarCustomDisabledDateEventArgsOps[Self <: CalendarCustomDisabledDateEventArgs] (val x: Self) extends AnyVal {
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
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

