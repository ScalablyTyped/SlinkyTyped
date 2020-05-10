package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubnetworksExpandIpCidrRangeRequest extends js.Object {
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal
    * on this Subnetwork. This range should be disjoint from other subnetworks
    * within this network. This range can only be larger than (i.e. a superset
    * of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When expanding to a non-RFC 1918 range, this field must be
    * be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
}

object SchemaSubnetworksExpandIpCidrRangeRequest {
  @scala.inline
  def apply(): SchemaSubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksExpandIpCidrRangeRequest]
  }
  @scala.inline
  implicit class SchemaSubnetworksExpandIpCidrRangeRequestOps[Self <: SchemaSubnetworksExpandIpCidrRangeRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(js.undefined)
        ret
    }
  }
  
}

