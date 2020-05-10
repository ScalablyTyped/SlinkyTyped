package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiViewCalendarMessages extends js.Object {
  var weekColumnHeader: js.UndefOr[String] = js.native
}

object MultiViewCalendarMessages {
  @scala.inline
  def apply(): MultiViewCalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarMessages]
  }
  @scala.inline
  implicit class MultiViewCalendarMessagesOps[Self <: MultiViewCalendarMessages] (val x: Self) extends AnyVal {
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

