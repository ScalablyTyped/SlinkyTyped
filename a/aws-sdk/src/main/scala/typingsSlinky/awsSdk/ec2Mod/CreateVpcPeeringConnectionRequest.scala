package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcPeeringConnectionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS account ID of the owner of the accepter VPC. Default: Your AWS account ID
    */
  var PeerOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request. Default: The Region in which you make the request.
    */
  var PeerRegion: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
    */
  var PeerVpcId: js.UndefOr[String] = js.native
  
  /**
    * The tags to assign to the peering connection.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The ID of the requester VPC. You must specify this parameter in the request.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
}
object CreateVpcPeeringConnectionRequest {
  
  @scala.inline
  def apply(): CreateVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateVpcPeeringConnectionRequestMutableBuilder[Self <: CreateVpcPeeringConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPeerOwnerId(value: String): Self = StObject.set(x, "PeerOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerOwnerIdUndefined: Self = StObject.set(x, "PeerOwnerId", js.undefined)
    
    @scala.inline
    def setPeerRegion(value: String): Self = StObject.set(x, "PeerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerRegionUndefined: Self = StObject.set(x, "PeerRegion", js.undefined)
    
    @scala.inline
    def setPeerVpcId(value: String): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerVpcIdUndefined: Self = StObject.set(x, "PeerVpcId", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
