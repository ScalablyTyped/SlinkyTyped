package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignIpv6AddressesRequest extends js.Object {
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: Ipv6AddressList = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}

object UnassignIpv6AddressesRequest {
  @scala.inline
  def apply(Ipv6Addresses: Ipv6AddressList, NetworkInterfaceId: NetworkInterfaceId): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(Ipv6Addresses = Ipv6Addresses.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
  @scala.inline
  implicit class UnassignIpv6AddressesRequestOps[Self <: UnassignIpv6AddressesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv6Addresses(value: Ipv6AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

