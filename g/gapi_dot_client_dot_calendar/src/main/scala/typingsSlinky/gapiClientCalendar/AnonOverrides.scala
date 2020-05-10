package typingsSlinky.gapiClientCalendar

import typingsSlinky.gapiClientCalendar.gapi.client.calendar.EventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverrides extends js.Object {
  /**
    * If the event doesn't use the default reminders, this lists the reminders specific to the event, or, if not set, indicates that no reminders are set for
    * this event. The maximum number of override reminders is 5.
    */
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
  /** Whether the default reminders of the calendar apply to the event. */
  var useDefault: js.UndefOr[Boolean] = js.native
}

object AnonOverrides {
  @scala.inline
  def apply(): AnonOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOverrides]
  }
  @scala.inline
  implicit class AnonOverridesOps[Self <: AnonOverrides] (val x: Self) extends AnyVal {
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

