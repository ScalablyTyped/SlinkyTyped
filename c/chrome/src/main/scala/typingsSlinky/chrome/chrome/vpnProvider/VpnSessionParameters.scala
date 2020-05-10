package typingsSlinky.chrome.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnSessionParameters extends js.Object {
  /** IP address for the VPN interface in CIDR notation. IPv4 is currently the only supported mode. */
  var address: String = js.native
  /** Optional. Broadcast address for the VPN interface. (default: deduced from IP address and mask) */
  var broadcastAddress: js.UndefOr[String] = js.native
  /** A list of IPs for the DNS servers. */
  var dnsServer: js.Array[String] = js.native
  /** Optional. A list of search domains. (default: no search domain) */
  var domainSearch: js.UndefOr[js.Array[String]] = js.native
  /**
    * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel. This can be used to bypass traffic to and from the VPN server. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var exclusionList: js.Array[String] = js.native
  /**
    * Include network traffic to the list of IP blocks in CIDR notation to the tunnel. This parameter can be used to set up a split tunnel. By default no traffic is directed to the tunnel. Adding the entry "0.0.0.0/0" to this list gets all the user traffic redirected to the tunnel. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var inclusionList: js.Array[String] = js.native
  /** Optional. MTU setting for the VPN interface. (default: 1500 bytes) */
  var mtu: js.UndefOr[String] = js.native
}

object VpnSessionParameters {
  @scala.inline
  def apply(
    address: String,
    dnsServer: js.Array[String],
    exclusionList: js.Array[String],
    inclusionList: js.Array[String]
  ): VpnSessionParameters = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dnsServer = dnsServer.asInstanceOf[js.Any], exclusionList = exclusionList.asInstanceOf[js.Any], inclusionList = inclusionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnSessionParameters]
  }
  @scala.inline
  implicit class VpnSessionParametersOps[Self <: VpnSessionParameters] (val x: Self) extends AnyVal {
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
    def withDnsServer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusionList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusionList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcastAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcastAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainSearch(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withMtu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(js.undefined)
        ret
    }
  }
  
}

