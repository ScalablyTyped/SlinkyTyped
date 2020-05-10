package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReminderSettings extends js.Object {
  /** Sets the timing, when the reminders are to be alerted for the Schedule appointments.
    * @Default {5}
    */
  var alertBefore: js.UndefOr[Double] = js.native
  /** When set to true, enables the reminder option available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object ReminderSettings {
  @scala.inline
  def apply(): ReminderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReminderSettings]
  }
  @scala.inline
  implicit class ReminderSettingsOps[Self <: ReminderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
  }
  
}

