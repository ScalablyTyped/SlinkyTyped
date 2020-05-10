package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoCalendarOptions extends InfoUnitOptions {
  var outputCalendar: js.UndefOr[CalendarSystem] = js.native
}

object InfoCalendarOptions {
  @scala.inline
  def apply(): InfoCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoCalendarOptions]
  }
  @scala.inline
  implicit class InfoCalendarOptionsOps[Self <: InfoCalendarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputCalendar(value: CalendarSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCalendar")(js.undefined)
        ret
    }
  }
  
}

