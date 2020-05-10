package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentEditingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the original appointment.
  	 */
  var appointment: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the appointment with the edited values.
  	 */
  var newAppointment: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object AppointmentEditingEventUIParam {
  @scala.inline
  def apply(): AppointmentEditingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentEditingEventUIParam]
  }
  @scala.inline
  implicit class AppointmentEditingEventUIParamOps[Self <: AppointmentEditingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(js.undefined)
        ret
    }
    @scala.inline
    def withNewAppointment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAppointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewAppointment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAppointment")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

