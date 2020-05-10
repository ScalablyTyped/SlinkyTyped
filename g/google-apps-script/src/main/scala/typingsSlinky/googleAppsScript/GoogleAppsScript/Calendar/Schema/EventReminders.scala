package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventReminders extends js.Object {
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object EventReminders {
  @scala.inline
  def apply(): EventReminders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventReminders]
  }
  @scala.inline
  implicit class EventRemindersOps[Self <: EventReminders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrides(value: js.Array[EventReminder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(js.undefined)
        ret
    }
  }
  
}

