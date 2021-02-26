package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDetails extends StObject {
  
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.  This property can only be set when EndpointType is set to VPC and it is only valid in the UpdateServer API. 
    */
  var AddressAllocationIds: js.UndefOr[typingsSlinky.awsSdk.transferMod.AddressAllocationIds] = js.native
  
  /**
    * A list of security groups IDs that are available to attach to your server's endpoint.  This property can only be set when EndpointType is set to VPC. You can only edit the SecurityGroupIds property in the UpdateServer API and only if you are changing the EndpointType from PUBLIC or VPC_ENDPOINT to VPC. 
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.transferMod.SecurityGroupIds] = js.native
  
  /**
    * A list of subnet IDs that are required to host your server endpoint in your VPC.  This property can only be set when EndpointType is set to VPC. 
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.transferMod.SubnetIds] = js.native
  
  /**
    * The ID of the VPC endpoint.  This property can only be set when EndpointType is set to VPC_ENDPOINT. 
    */
  var VpcEndpointId: js.UndefOr[typingsSlinky.awsSdk.transferMod.VpcEndpointId] = js.native
  
  /**
    * The VPC ID of the VPC in which a server's endpoint will be hosted.  This property can only be set when EndpointType is set to VPC. 
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.transferMod.VpcId] = js.native
}
object EndpointDetails {
  
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  @scala.inline
  implicit class EndpointDetailsMutableBuilder[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressAllocationIds(value: AddressAllocationIds): Self = StObject.set(x, "AddressAllocationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressAllocationIdsUndefined: Self = StObject.set(x, "AddressAllocationIds", js.undefined)
    
    @scala.inline
    def setAddressAllocationIdsVarargs(value: AddressAllocationId*): Self = StObject.set(x, "AddressAllocationIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
