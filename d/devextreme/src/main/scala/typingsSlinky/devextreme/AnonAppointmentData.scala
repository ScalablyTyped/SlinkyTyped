package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppointmentData extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.native
  var targetedAppointmentData: js.UndefOr[js.Any] = js.native
}

object AnonAppointmentData {
  @scala.inline
  def apply(): AnonAppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAppointmentData]
  }
  @scala.inline
  implicit class AnonAppointmentDataOps[Self <: AnonAppointmentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentData")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetedAppointmentData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedAppointmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetedAppointmentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedAppointmentData")(js.undefined)
        ret
    }
  }
  
}

