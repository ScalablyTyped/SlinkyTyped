package typingsSlinky.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeTargetPlatform extends js.Object {
  var devices: js.Array[NativeDeviceTarget] = js.native
  var virtualDevices: js.Array[NativeVirtualDeviceTarget] = js.native
}

object NativeTargetPlatform {
  @scala.inline
  def apply(devices: js.Array[NativeDeviceTarget], virtualDevices: js.Array[NativeVirtualDeviceTarget]): NativeTargetPlatform = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], virtualDevices = virtualDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTargetPlatform]
  }
  @scala.inline
  implicit class NativeTargetPlatformOps[Self <: NativeTargetPlatform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[NativeDeviceTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualDevices(value: js.Array[NativeVirtualDeviceTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDevices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

