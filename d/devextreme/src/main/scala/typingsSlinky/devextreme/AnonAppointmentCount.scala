package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppointmentCount extends js.Object {
  var appointmentCount: js.UndefOr[Double] = js.native
  var isCompact: js.UndefOr[Boolean] = js.native
}

object AnonAppointmentCount {
  @scala.inline
  def apply(): AnonAppointmentCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAppointmentCount]
  }
  @scala.inline
  implicit class AnonAppointmentCountOps[Self <: AnonAppointmentCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(js.undefined)
        ret
    }
  }
  
}

