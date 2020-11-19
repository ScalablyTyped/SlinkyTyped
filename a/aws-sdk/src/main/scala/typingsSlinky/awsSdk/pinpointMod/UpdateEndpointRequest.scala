package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointRequest extends js.Object {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string = js.native
  
  var EndpointRequest: typingsSlinky.awsSdk.pinpointMod.EndpointRequest = js.native
}
object UpdateEndpointRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EndpointId: string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateEndpointRequestOps[Self <: UpdateEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: string): Self = this.set("EndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointRequest(value: EndpointRequest): Self = this.set("EndpointRequest", value.asInstanceOf[js.Any])
  }
}
