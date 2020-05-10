package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias IP range attached to an instance&#39;s network interface.
  */
@js.native
trait SchemaAliasIpRange extends js.Object {
  /**
    * The IP CIDR range represented by this alias IP range. This IP CIDR range
    * must belong to the specified subnetwork and cannot contain IP addresses
    * reserved by system or used by other network interfaces. This range may be
    * a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24) or a CIDR
    * format string (e.g. 10.1.2.0/24).
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Optional subnetwork secondary range name specifying the secondary range
    * from which to allocate the IP CIDR range for this alias IP range. If left
    * unspecified, the primary range of the subnetwork will be used.
    */
  var subnetworkRangeName: js.UndefOr[String] = js.native
}

object SchemaAliasIpRange {
  @scala.inline
  def apply(): SchemaAliasIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliasIpRange]
  }
  @scala.inline
  implicit class SchemaAliasIpRangeOps[Self <: SchemaAliasIpRange] (val x: Self) extends AnyVal {
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
    def withSubnetworkRangeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkRangeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworkRangeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkRangeName")(js.undefined)
        ret
    }
  }
  
}

