package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectVpcEndpointConnectionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
  
  /**
    * The IDs of one or more VPC endpoints.
    */
  var VpcEndpointIds: VpcEndpointIdList = js.native
}
object RejectVpcEndpointConnectionsRequest {
  
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId, VpcEndpointIds: VpcEndpointIdList): RejectVpcEndpointConnectionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any], VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectVpcEndpointConnectionsRequest]
  }
  
  @scala.inline
  implicit class RejectVpcEndpointConnectionsRequestMutableBuilder[Self <: RejectVpcEndpointConnectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIds(value: VpcEndpointIdList): Self = StObject.set(x, "VpcEndpointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "VpcEndpointIds", js.Array(value :_*))
  }
}
