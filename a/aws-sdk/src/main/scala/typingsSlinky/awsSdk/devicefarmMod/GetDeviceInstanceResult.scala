package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceInstanceResult extends js.Object {
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.native
}

object GetDeviceInstanceResult {
  @scala.inline
  def apply(): GetDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceInstanceResult]
  }
  @scala.inline
  implicit class GetDeviceInstanceResultOps[Self <: GetDeviceInstanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceInstance(value: DeviceInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInstance")(js.undefined)
        ret
    }
  }
  
}

