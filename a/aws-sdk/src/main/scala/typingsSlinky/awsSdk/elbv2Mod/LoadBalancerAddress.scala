package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerAddress extends StObject {
  
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
    */
  var AllocationId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.AllocationId] = js.native
  
  /**
    * [Network Load Balancers] The IPv6 address.
    */
  var IPv6Address: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.IPv6Address] = js.native
  
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.IpAddress] = js.native
  
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
}
object LoadBalancerAddress {
  
  @scala.inline
  def apply(): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAddress]
  }
  
  @scala.inline
  implicit class LoadBalancerAddressMutableBuilder[Self <: LoadBalancerAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setIPv6Address(value: IPv6Address): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIPv4Address(value: PrivateIPv4Address): Self = StObject.set(x, "PrivateIPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIPv4AddressUndefined: Self = StObject.set(x, "PrivateIPv4Address", js.undefined)
  }
}
