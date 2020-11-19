package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointGroupResponse extends js.Object {
  
  /**
    * The information about the endpoint group that was updated.
    */
  var EndpointGroup: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}
object UpdateEndpointGroupResponse {
  
  @scala.inline
  def apply(): UpdateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateEndpointGroupResponseOps[Self <: UpdateEndpointGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointGroup(value: EndpointGroup): Self = this.set("EndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointGroup: Self = this.set("EndpointGroup", js.undefined)
  }
}
