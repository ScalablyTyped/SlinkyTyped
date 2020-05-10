package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeDeviceMethodResponse extends js.Object {
  /**
    * A JSON encoded string containing the device method response.
    */
  var DeviceMethodResponse: js.UndefOr[string] = js.native
}

object InvokeDeviceMethodResponse {
  @scala.inline
  def apply(): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
  @scala.inline
  implicit class InvokeDeviceMethodResponseOps[Self <: InvokeDeviceMethodResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceMethodResponse(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethodResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMethodResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethodResponse")(js.undefined)
        ret
    }
  }
  
}

