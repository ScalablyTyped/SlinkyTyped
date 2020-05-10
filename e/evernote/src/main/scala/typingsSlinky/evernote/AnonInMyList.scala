package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInMyList extends js.Object {
  var inMyList: js.UndefOr[Boolean] = js.native
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[String] = js.native
}

object AnonInMyList {
  @scala.inline
  def apply(): AnonInMyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInMyList]
  }
  @scala.inline
  implicit class AnonInMyListOps[Self <: AnonInMyList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInMyList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInMyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMyList")(js.undefined)
        ret
    }
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
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}

