package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reserved address resource. (== resource_for beta.addresses ==) (==
  * resource_for v1.addresses ==) (== resource_for beta.globalAddresses ==) (==
  * resource_for v1.globalAddresses ==)
  */
@js.native
trait SchemaAddress extends js.Object {
  /**
    * The static IP address represented by this resource.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The type of address to reserve, either INTERNAL or EXTERNAL. If
    * unspecified, defaults to EXTERNAL.
    */
  var addressType: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The IP Version that will be used by this address. Valid options are IPV4
    * or IPV6. This can only be specified for a global address.
    */
  var ipVersion: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#address for addresses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network in which to reserve the address. This field can
    * only be used with INTERNAL type with VPC_PEERING purpose.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This signifies the networking tier used for configuring this Address and
    * can only take the following values: PREMIUM, STANDARD. Global forwarding
    * rules can only be Premium Tier. Regional forwarding rules can be either
    * Premium or Standard Tier. Standard Tier addresses applied to regional
    * forwarding rules can be used with any external load balancer. Regional
    * forwarding rules in Premium Tier can only be used with a Network load
    * balancer.  If this field is not specified, it is assumed to be PREMIUM.
    */
  var networkTier: js.UndefOr[String] = js.native
  /**
    * The prefix length if the resource reprensents an IP range.
    */
  var prefixLength: js.UndefOr[Double] = js.native
  /**
    * The purpose of resource, only used with INTERNAL type.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the regional address resides. This
    * field is not applicable to global addresses. You must specify this field
    * as part of the HTTP request URL. You cannot set this field in the request
    * body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the address, which can be one of RESERVING,
    * RESERVED, or IN_USE. An address that is RESERVING is currently in the
    * process of being reserved. A RESERVED address is currently reserved and
    * available to use. An IN_USE address is currently being used by another
    * resource and is not available.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The URL of the subnetwork in which to reserve the address. If an IP
    * address is specified, it must be within the subnetwork&#39;s IP range.
    * This field can only be used with INTERNAL type with
    * GCE_ENDPOINT/DNS_RESOLVER purposes.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URLs of the resources that are using this address.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAddress {
  @scala.inline
  def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  @scala.inline
  implicit class SchemaAddressOps[Self <: SchemaAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTier")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

