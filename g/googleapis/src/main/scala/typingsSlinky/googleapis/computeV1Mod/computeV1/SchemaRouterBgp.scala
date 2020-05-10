package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterBgp extends js.Object {
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String] = js.native
  /**
    * User-specified list of prefix groups to advertise in custom mode. This
    * field can only be populated if advertise_mode is CUSTOM and is advertised
    * to all peers of the router. These groups will be advertised in addition
    * to any specified prefixes. Leave this field blank to advertise no custom
    * groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * User-specified list of individual IP ranges to advertise in custom mode.
    * This field can only be populated if advertise_mode is CUSTOM and is
    * advertised to all peers of the router. These IP ranges will be advertised
    * in addition to any specified groups. Leave this field blank to advertise
    * no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.native
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN,
    * either 16-bit or 32-bit. The value will be fixed for this router
    * resource. All VPN tunnels that link to this router will have the same
    * local ASN.
    */
  var asn: js.UndefOr[Double] = js.native
}

object SchemaRouterBgp {
  @scala.inline
  def apply(): SchemaRouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgp]
  }
  @scala.inline
  implicit class SchemaRouterBgpOps[Self <: SchemaRouterBgp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiseMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiseMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisedGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedIpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedIpRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withAsn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn")(js.undefined)
        ret
    }
  }
  
}

