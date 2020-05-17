package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.ReminderMethod
import typingsSlinky.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  var method: ReminderMethod = js.native
  var minutes: integer = js.native
}

object Method {
  @scala.inline
  def apply(method: ReminderMethod, minutes: integer): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: ReminderMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinutes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

