package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceMethodsResponse extends js.Object {
  /**
    * List of available device APIs.
    */
  var DeviceMethods: js.UndefOr[listOfDeviceMethod] = js.native
}

object GetDeviceMethodsResponse {
  @scala.inline
  def apply(): GetDeviceMethodsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceMethodsResponse]
  }
  @scala.inline
  implicit class GetDeviceMethodsResponseOps[Self <: GetDeviceMethodsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceMethods(value: listOfDeviceMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceMethods")(js.undefined)
        ret
    }
  }
  
}

