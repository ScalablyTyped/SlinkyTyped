package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeviceState extends js.Object {
  var deviceName: String = js.native
  var deviceState: String = js.native
}

object AnonDeviceState {
  @scala.inline
  def apply(deviceName: String, deviceState: String): AnonDeviceState = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceState]
  }
  @scala.inline
  implicit class AnonDeviceStateOps[Self <: AnonDeviceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

