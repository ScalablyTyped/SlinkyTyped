package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the IP ranges that want to use NAT for a subnetwork.
  */
@js.native
trait SchemaRouterNatSubnetworkToNat extends js.Object {
  /**
    * URL for the subnetwork resource to use NAT.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of the secondary ranges of the Subnetwork that are allowed to use
    * NAT. This can be populated only if
    * &quot;LIST_OF_SECONDARY_IP_RANGES&quot; is one of the values in
    * source_ip_ranges_to_nat.
    */
  var secondaryIpRangeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the options for NAT ranges in the Subnetwork. All usages of
    * single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only
    * valid option with multiple values is: [&quot;PRIMARY_IP_RANGE&quot;,
    * &quot;LIST_OF_SECONDARY_IP_RANGES&quot;] Default: [ALL_IP_RANGES]
    */
  var sourceIpRangesToNat: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRouterNatSubnetworkToNat {
  @scala.inline
  def apply(): SchemaRouterNatSubnetworkToNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatSubnetworkToNat]
  }
  @scala.inline
  implicit class SchemaRouterNatSubnetworkToNatOps[Self <: SchemaRouterNatSubnetworkToNat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryIpRangeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRangeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIpRangeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRangeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIpRangesToNat(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIpRangesToNat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpRangesToNat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIpRangesToNat")(js.undefined)
        ret
    }
  }
  
}

