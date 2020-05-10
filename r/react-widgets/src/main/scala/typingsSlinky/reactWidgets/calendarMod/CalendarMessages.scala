package typingsSlinky.reactWidgets.calendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default: "navigate back"
    */
  var moveBack: js.UndefOr[String] = js.native
  /**
    * Title and screen reader text for the right arrow button.
    * @default: "navigate forward"
    */
  var moveForward: js.UndefOr[String] = js.native
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
    def withMoveBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBack")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveForward")(js.undefined)
        ret
    }
  }
  
}

