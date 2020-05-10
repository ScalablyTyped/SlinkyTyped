package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignIpv6AddressesResult extends js.Object {
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The IPv6 addresses that have been unassigned from the network interface.
    */
  var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
}

object UnassignIpv6AddressesResult {
  @scala.inline
  def apply(): UnassignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnassignIpv6AddressesResult]
  }
  @scala.inline
  implicit class UnassignIpv6AddressesResultOps[Self <: UnassignIpv6AddressesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withUnassignedIpv6Addresses(value: Ipv6AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnassignedIpv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnassignedIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnassignedIpv6Addresses")(js.undefined)
        ret
    }
  }
  
}

