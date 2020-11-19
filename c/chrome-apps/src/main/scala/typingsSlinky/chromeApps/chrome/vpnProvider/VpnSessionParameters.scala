package typingsSlinky.chromeApps.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnSessionParameters extends js.Object {
  
  /**
    * IP address for the VPN interface in CIDR notation.
    * IPv4 is currently the only supported mode.
    */
  var address: String = js.native
  
  /**
    * Broadcast address for the VPN interface.
    * (default: deduced from IP address and mask)
    */
  var broadcastAddress: js.UndefOr[String] = js.native
  
  /** A list of IPs for the DNS servers. */
  var dnsServers: js.Array[String] = js.native
  
  /** A list of search domains. (default: no search domain) */
  var domainSearch: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel.
    * This can be used to bypass traffic to and from the VPN server.
    * When many rules match a destination, the rule with the longest matching prefix wins.
    * Entries that correspond to the same CIDR block are treated as duplicates.
    * Such duplicates in the collated (exclusionList + inclusionList) list
    * are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var exclusionList: js.Array[String] = js.native
  
  /**
    * Include network traffic to the list of IP blocks in CIDR notation to the tunnel.
    * This parameter can be used to set up a split tunnel.
    * By default no traffic is directed to the tunnel.
    * Adding the entry '0.0.0.0/0' to this list gets all the user traffic redirected to the tunnel.
    * When many rules match a destination, the rule with the longest matching prefix wins.
    * Entries that correspond to the same CIDR block are treated as duplicates.
    * Such duplicates in the collated (exclusionList + inclusionList) list are
    * eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var inclusionList: js.Array[String] = js.native
  
  /**
    * MTU setting for the VPN interface (default 1500 bytes).
    * @default '1500'
    */
  var mtu: js.UndefOr[String] = js.native
  
  /**
    * @since Chrome 51.
    * Whether or not the VPN extension implements auto-reconnection.
    * If true, the *linkDown*, *linkUp*, *linkChanged*, *suspend*, and *resume*
    * platform messages will be used to signal the respective events.
    *
    * If false, the system will forcibly disconnect the VPN if the network
    * topology changes, and the user will need to reconnect manually.
    *
    * This property is new in Chrome 51; it will generate an exception in
    * earlier versions. try/catch can be used to conditionally enable the
    * feature based on browser support.
    * @default false
    */
  var reconnect: Boolean = js.native
}
object VpnSessionParameters {
  
  @scala.inline
  def apply(
    address: String,
    dnsServers: js.Array[String],
    exclusionList: js.Array[String],
    inclusionList: js.Array[String],
    reconnect: Boolean
  ): VpnSessionParameters = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dnsServers = dnsServers.asInstanceOf[js.Any], exclusionList = exclusionList.asInstanceOf[js.Any], inclusionList = inclusionList.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnSessionParameters]
  }
  
  @scala.inline
  implicit class VpnSessionParametersOps[Self <: VpnSessionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = this.set("dnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: js.Array[String]): Self = this.set("dnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionListVarargs(value: String*): Self = this.set("exclusionList", js.Array(value :_*))
    
    @scala.inline
    def setExclusionList(value: js.Array[String]): Self = this.set("exclusionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionListVarargs(value: String*): Self = this.set("inclusionList", js.Array(value :_*))
    
    @scala.inline
    def setInclusionList(value: js.Array[String]): Self = this.set("inclusionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastAddress(value: String): Self = this.set("broadcastAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcastAddress: Self = this.set("broadcastAddress", js.undefined)
    
    @scala.inline
    def setDomainSearchVarargs(value: String*): Self = this.set("domainSearch", js.Array(value :_*))
    
    @scala.inline
    def setDomainSearch(value: js.Array[String]): Self = this.set("domainSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainSearch: Self = this.set("domainSearch", js.undefined)
    
    @scala.inline
    def setMtu(value: String): Self = this.set("mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtu: Self = this.set("mtu", js.undefined)
  }
}
