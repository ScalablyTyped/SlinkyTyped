package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterBgpPeer extends js.Object {
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String] = js.native
  /**
    * User-specified list of prefix groups to advertise in custom mode. This
    * field can only be populated if advertise_mode is CUSTOM and overrides the
    * list defined for the router (in Bgp message). These groups will be
    * advertised in addition to any specified prefixes. Leave this field blank
    * to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * User-specified list of individual IP ranges to advertise in custom mode.
    * This field can only be populated if advertise_mode is CUSTOM and
    * overrides the list defined for the router (in Bgp message). These IP
    * ranges will be advertised in addition to any specified groups. Leave this
    * field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.native
  /**
    * The priority of routes advertised to this BGP peer. In the case where
    * there is more than one matching route of maximum length, the routes with
    * lowest priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double] = js.native
  /**
    * Name of the interface the BGP peer is associated with.
    */
  var interfaceName: js.UndefOr[String] = js.native
  /**
    * IP address of the interface inside Google Cloud Platform. Only IPv4 is
    * supported.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource that configures and manages this BGP peer.
    * MANAGED_BY_USER is the default value and can be managed by you or other
    * users; MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed
    * by Cloud Interconnect, specifically by an InterconnectAttachment of type
    * PARTNER. Google will automatically create, update, and delete this type
    * of BGP peer when the PARTNER InterconnectAttachment is created, updated,
    * or deleted.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * Name of this BGP peer. The name must be 1-63 characters long and comply
    * with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Peer BGP Autonomous System Number (ASN). For VPN use case, this value can
    * be different for every tunnel.
    */
  var peerAsn: js.UndefOr[Double] = js.native
  /**
    * IP address of the BGP interface outside Google cloud. Only IPv4 is
    * supported.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
}

object SchemaRouterBgpPeer {
  @scala.inline
  def apply(): SchemaRouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeer]
  }
  @scala.inline
  implicit class SchemaRouterBgpPeerOps[Self <: SchemaRouterBgpPeer] (val x: Self) extends AnyVal {
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
    def withAdvertisedRoutePriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedRoutePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withManagementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(js.undefined)
        ret
    }
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
    def withPeerAsn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIpAddress")(js.undefined)
        ret
    }
  }
  
}

