package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetworksExpandIpCidrRangeRequest extends js.Object {
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within
    * this network. This range can only be larger than (i.e. a superset of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
}

object SubnetworksExpandIpCidrRangeRequest {
  @scala.inline
  def apply(): SubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksExpandIpCidrRangeRequest]
  }
  @scala.inline
  implicit class SubnetworksExpandIpCidrRangeRequestOps[Self <: SubnetworksExpandIpCidrRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpCidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(js.undefined)
        ret
    }
  }
  
}

