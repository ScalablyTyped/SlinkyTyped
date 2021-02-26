package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnassignPrivateIpAddressesRequest extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  
  /**
    * The secondary private IP addresses to unassign from the network interface. You can specify this option multiple times to unassign more than one IP address.
    */
  var PrivateIpAddresses: PrivateIpAddressStringList = js.native
}
object UnassignPrivateIpAddressesRequest {
  
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId, PrivateIpAddresses: PrivateIpAddressStringList): UnassignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], PrivateIpAddresses = PrivateIpAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignPrivateIpAddressesRequest]
  }
  
  @scala.inline
  implicit class UnassignPrivateIpAddressesRequestMutableBuilder[Self <: UnassignPrivateIpAddressesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
  }
}
