package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeDeviceMethodRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.DeviceMethod] = js.native
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[string] = js.native
}

object InvokeDeviceMethodRequest {
  @scala.inline
  def apply(DeviceId: string): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
  @scala.inline
  implicit class InvokeDeviceMethodRequestOps[Self <: InvokeDeviceMethodRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceMethod(value: DeviceMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMethodParameters(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethodParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMethodParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethodParameters")(js.undefined)
        ret
    }
  }
  
}

