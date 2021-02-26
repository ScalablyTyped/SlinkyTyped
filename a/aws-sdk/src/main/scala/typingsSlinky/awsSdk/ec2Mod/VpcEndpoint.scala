package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpoint extends StObject {
  
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  
  /**
    * (Interface endpoint) Information about the security groups that are associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.native
  
  /**
    * The last error that occurred for VPC endpoint.
    */
  var LastError: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LastError] = js.native
  
  /**
    * (Interface endpoint) One or more network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the VPC endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gateway endpoint) One or more route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.native
  
  /**
    * The state of the VPC endpoint.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.State] = js.native
  
  /**
    * (Interface endpoint) One or more subnets in which the endpoint is located.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Any tags assigned to the VPC endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcEndpointType] = js.native
  
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object VpcEndpoint {
  
  @scala.inline
  def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  @scala.inline
  implicit class VpcEndpointMutableBuilder[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDnsEntries(value: DnsEntrySet): Self = StObject.set(x, "DnsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsEntriesUndefined: Self = StObject.set(x, "DnsEntries", js.undefined)
    
    @scala.inline
    def setDnsEntriesVarargs(value: DnsEntry*): Self = StObject.set(x, "DnsEntries", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdentifierSet): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setLastError(value: LastError): Self = StObject.set(x, "LastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorUndefined: Self = StObject.set(x, "LastError", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    @scala.inline
    def setPrivateDnsEnabled(value: Boolean): Self = StObject.set(x, "PrivateDnsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "PrivateDnsEnabled", js.undefined)
    
    @scala.inline
    def setRequesterManaged(value: Boolean): Self = StObject.set(x, "RequesterManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterManagedUndefined: Self = StObject.set(x, "RequesterManaged", js.undefined)
    
    @scala.inline
    def setRouteTableIds(value: ValueStringList): Self = StObject.set(x, "RouteTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableIdsUndefined: Self = StObject.set(x, "RouteTableIds", js.undefined)
    
    @scala.inline
    def setRouteTableIdsVarargs(value: String*): Self = StObject.set(x, "RouteTableIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: ValueStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcEndpointType(value: VpcEndpointType): Self = StObject.set(x, "VpcEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointTypeUndefined: Self = StObject.set(x, "VpcEndpointType", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
