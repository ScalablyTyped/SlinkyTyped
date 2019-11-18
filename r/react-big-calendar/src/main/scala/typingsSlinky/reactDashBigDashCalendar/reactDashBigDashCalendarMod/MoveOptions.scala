package typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var action: NavigateAction
  var date: js.Date
  var today: js.Date
}

object MoveOptions {
  @scala.inline
  def apply(action: NavigateAction, date: js.Date, today: js.Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoveOptions]
  }
}

