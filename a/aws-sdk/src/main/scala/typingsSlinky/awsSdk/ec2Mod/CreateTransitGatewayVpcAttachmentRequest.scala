package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayVpcAttachmentRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[CreateTransitGatewayVpcAttachmentRequestOptions] = js.native
  
  /**
    * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one IP address from each specified subnet.
    */
  var SubnetIds: TransitGatewaySubnetIdList = js.native
  
  /**
    * The tags to apply to the VPC attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayId = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typingsSlinky.awsSdk.ec2Mod.VpcId = js.native
}
object CreateTransitGatewayVpcAttachmentRequest {
  
  @scala.inline
  def apply(SubnetIds: TransitGatewaySubnetIdList, TransitGatewayId: TransitGatewayId, VpcId: VpcId): CreateTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentRequest]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayVpcAttachmentRequestMutableBuilder[Self <: CreateTransitGatewayVpcAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setOptions(value: CreateTransitGatewayVpcAttachmentRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
