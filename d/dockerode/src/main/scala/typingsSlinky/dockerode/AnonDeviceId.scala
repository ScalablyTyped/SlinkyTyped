package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeviceId extends js.Object {
  var DeviceId: String = js.native
  var DeviceName: String = js.native
  var DeviceSize: String = js.native
}

object AnonDeviceId {
  @scala.inline
  def apply(DeviceId: String, DeviceName: String, DeviceSize: String): AnonDeviceId = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceSize = DeviceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceId]
  }
  @scala.inline
  implicit class AnonDeviceIdOps[Self <: AnonDeviceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

