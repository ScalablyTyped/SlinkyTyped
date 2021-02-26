package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySubnetAttributeRequest extends StObject {
  
  /**
    * Specify true to indicate that network interfaces created in the specified subnet should be assigned an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the instance therefore receives an IPv6 address).  If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an IPv6 address if it's created using version 2016-11-15 or later of the Amazon EC2 API.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * The customer-owned IPv4 address pool associated with the subnet. You must set this value when you specify true for MapCustomerOwnedIpOnLaunch.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[CoipPoolId] = js.native
  
  /**
    * Specify true to indicate that network interfaces attached to instances created in the specified subnet should be assigned a customer-owned IPv4 address. When this value is true, you must specify the customer-owned IP pool using CustomerOwnedIpv4Pool.
    */
  var MapCustomerOwnedIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Specify true to indicate that network interfaces attached to instances created in the specified subnet should be assigned a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: typingsSlinky.awsSdk.ec2Mod.SubnetId = js.native
}
object ModifySubnetAttributeRequest {
  
  @scala.inline
  def apply(SubnetId: SubnetId): ModifySubnetAttributeRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySubnetAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifySubnetAttributeRequestMutableBuilder[Self <: ModifySubnetAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignIpv6AddressOnCreation(value: AttributeBooleanValue): Self = StObject.set(x, "AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "AssignIpv6AddressOnCreation", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: CoipPoolId): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setMapCustomerOwnedIpOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapCustomerOwnedIpOnLaunchUndefined: Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", js.undefined)
    
    @scala.inline
    def setMapPublicIpOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "MapPublicIpOnLaunch", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
