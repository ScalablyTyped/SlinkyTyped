package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointResponse extends js.Object {
  
  var EndpointResponse: typingsSlinky.awsSdk.pinpointMod.EndpointResponse = js.native
}
object DeleteEndpointResponse {
  
  @scala.inline
  def apply(EndpointResponse: EndpointResponse): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
  
  @scala.inline
  implicit class DeleteEndpointResponseOps[Self <: DeleteEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointResponse(value: EndpointResponse): Self = this.set("EndpointResponse", value.asInstanceOf[js.Any])
  }
}
