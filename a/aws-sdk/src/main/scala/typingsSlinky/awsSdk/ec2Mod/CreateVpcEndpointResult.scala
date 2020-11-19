package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointResult extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the endpoint.
    */
  var VpcEndpoint: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcEndpoint] = js.native
}
object CreateVpcEndpointResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointResultOps[Self <: CreateVpcEndpointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setVpcEndpoint(value: VpcEndpoint): Self = this.set("VpcEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpoint: Self = this.set("VpcEndpoint", js.undefined)
  }
}
