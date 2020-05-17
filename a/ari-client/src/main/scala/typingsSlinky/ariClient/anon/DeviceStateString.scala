package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStateString extends js.Object {
  var deviceState: String = js.native
}

object DeviceStateString {
  @scala.inline
  def apply(deviceState: String): DeviceStateString = {
    val __obj = js.Dynamic.literal(deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateString]
  }
  @scala.inline
  implicit class DeviceStateStringOps[Self <: DeviceStateString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

