package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMethod extends js.Object {
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.native
  /**
    * The name of the method applicable to the deviceType.
    */
  var MethodName: js.UndefOr[string] = js.native
}

object DeviceMethod {
  @scala.inline
  def apply(): DeviceMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMethod]
  }
  @scala.inline
  implicit class DeviceMethodOps[Self <: DeviceMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodName")(js.undefined)
        ret
    }
  }
  
}

