package typingsSlinky.pulumiAws.outputMod.transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEndpointDetails extends js.Object {
  
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: String = js.native
}
object ServerEndpointDetails {
  
  @scala.inline
  def apply(vpcEndpointId: String): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEndpointDetails]
  }
  
  @scala.inline
  implicit class ServerEndpointDetailsOps[Self <: ServerEndpointDetails] (val x: Self) extends AnyVal {
    
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
    def setVpcEndpointId(value: String): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
  }
}
