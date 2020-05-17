package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReminderNotifyEmail extends js.Object {
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
}

object ReminderNotifyEmail {
  @scala.inline
  def apply(): ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReminderNotifyEmail]
  }
  @scala.inline
  implicit class ReminderNotifyEmailOps[Self <: ReminderNotifyEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReminderNotifyEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderNotifyEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderNotifyEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderNotifyEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderNotifyInApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderNotifyInApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderNotifyInApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderNotifyInApp")(js.undefined)
        ret
    }
  }
  
}

