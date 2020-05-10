package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementTroubleshootingEvent extends Entity {
  // Id used for tracing the failure in the service.
  var correlationId: js.UndefOr[String] = js.native
  // Time when the event occurred .
  var eventDateTime: js.UndefOr[String] = js.native
}

object DeviceManagementTroubleshootingEvent {
  @scala.inline
  def apply(): DeviceManagementTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementTroubleshootingEvent]
  }
  @scala.inline
  implicit class DeviceManagementTroubleshootingEventOps[Self <: DeviceManagementTroubleshootingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDateTime")(js.undefined)
        ret
    }
  }
  
}

