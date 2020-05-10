package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignIpv6AddressesResult extends js.Object {
  /**
    * The IPv6 addresses assigned to the network interface.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignIpv6AddressesResult {
  @scala.inline
  def apply(): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
  @scala.inline
  implicit class AssignIpv6AddressesResultOps[Self <: AssignIpv6AddressesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedIpv6Addresses(value: Ipv6AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedIpv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedIpv6Addresses")(js.undefined)
        ret
    }
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
  }
  
}

