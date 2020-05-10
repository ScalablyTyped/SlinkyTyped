package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarMessages extends js.Object {
  var weekColumnHeader: js.UndefOr[String] = js.native
}

object CalendarMessages {
  @scala.inline
  def apply(): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMessages]
  }
  @scala.inline
  implicit class CalendarMessagesOps[Self <: CalendarMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeekColumnHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekColumnHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekColumnHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekColumnHeader")(js.undefined)
        ret
    }
  }
  
}

