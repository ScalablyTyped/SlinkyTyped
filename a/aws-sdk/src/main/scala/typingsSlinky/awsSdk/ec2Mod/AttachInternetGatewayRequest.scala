package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachInternetGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: typingsSlinky.awsSdk.ec2Mod.InternetGatewayId = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typingsSlinky.awsSdk.ec2Mod.VpcId = js.native
}
object AttachInternetGatewayRequest {
  
  @scala.inline
  def apply(InternetGatewayId: InternetGatewayId, VpcId: VpcId): AttachInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInternetGatewayRequest]
  }
  
  @scala.inline
  implicit class AttachInternetGatewayRequestMutableBuilder[Self <: AttachInternetGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInternetGatewayId(value: InternetGatewayId): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
