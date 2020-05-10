package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolCompatibilityResult extends js.Object {
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
}

object GetDevicePoolCompatibilityResult {
  @scala.inline
  def apply(): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
  @scala.inline
  implicit class GetDevicePoolCompatibilityResultOps[Self <: GetDevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleDevices(value: DevicePoolCompatibilityResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompatibleDevices(value: DevicePoolCompatibilityResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompatibleDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleDevices")(js.undefined)
        ret
    }
  }
  
}

