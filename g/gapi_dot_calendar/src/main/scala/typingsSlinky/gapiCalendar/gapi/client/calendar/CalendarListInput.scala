package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.Method
import typingsSlinky.gapiCalendar.anon.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListInput extends js.Object {
  // Optional Properties
  var backgroundColor: js.UndefOr[String] = js.native
  var colorId: js.UndefOr[String] = js.native
  var defaultReminders: js.UndefOr[js.Array[Method]] = js.native
  var foregroundColor: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  // Required Properties
  var id: String = js.native
  var notificationSettings: js.UndefOr[Notifications] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var summaryOverride: js.UndefOr[String] = js.native
}

object CalendarListInput {
  @scala.inline
  def apply(id: String): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInput]
  }
  @scala.inline
  implicit class CalendarListInputOps[Self <: CalendarListInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultReminders(value: js.Array[Method]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultReminders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReminders")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationSettings(value: Notifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOverride")(js.undefined)
        ret
    }
  }
  
}

