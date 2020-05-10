package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePoolCompatibilityResult extends js.Object {
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.native
  /**
    * The device (phone or tablet) to return information about.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.native
}

object DevicePoolCompatibilityResult {
  @scala.inline
  def apply(): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
  @scala.inline
  implicit class DevicePoolCompatibilityResultOps[Self <: DevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatible")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompatibilityMessages(value: IncompatibilityMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibilityMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompatibilityMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibilityMessages")(js.undefined)
        ret
    }
  }
  
}

