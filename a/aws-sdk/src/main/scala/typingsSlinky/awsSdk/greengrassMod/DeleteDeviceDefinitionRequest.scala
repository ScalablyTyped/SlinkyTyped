package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeviceDefinitionRequest extends js.Object {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
}
object DeleteDeviceDefinitionRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteDeviceDefinitionRequestOps[Self <: DeleteDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = this.set("DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
