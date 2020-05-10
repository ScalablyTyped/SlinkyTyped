package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
}

object GetDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: string): GetDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionRequest]
  }
  @scala.inline
  implicit class GetDeviceDefinitionRequestOps[Self <: GetDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

