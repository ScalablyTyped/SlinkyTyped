package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignPrivateIpAddressesResult extends js.Object {
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignPrivateIpAddressesResult {
  @scala.inline
  def apply(): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
  @scala.inline
  implicit class AssignPrivateIpAddressesResultOps[Self <: AssignPrivateIpAddressesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedPrivateIpAddresses(value: AssignedPrivateIpAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedPrivateIpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedPrivateIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedPrivateIpAddresses")(js.undefined)
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

