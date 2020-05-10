package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStateChanged extends Event {
  /* Properties */
  var device_state: DeviceState = js.native
}

object DeviceStateChanged {
  @scala.inline
  def apply(application: String, device_state: DeviceState, timestamp: js.Date, `type`: String): DeviceStateChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], device_state = device_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateChanged]
  }
  @scala.inline
  implicit class DeviceStateChangedOps[Self <: DeviceStateChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice_state(value: DeviceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

