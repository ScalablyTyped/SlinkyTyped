package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  /**
    * Indicates whether Elastic Network Adapter (ENA) is supported.
    */
  var EnaSupport: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EnaSupport] = js.native
  /**
    * The maximum number of IPv4 addresses per network interface.
    */
  var Ipv4AddressesPerInterface: js.UndefOr[MaxIpv4AddrPerInterface] = js.native
  /**
    * The maximum number of IPv6 addresses per network interface.
    */
  var Ipv6AddressesPerInterface: js.UndefOr[MaxIpv6AddrPerInterface] = js.native
  /**
    * Indicates whether IPv6 is supported.
    */
  var Ipv6Supported: js.UndefOr[Ipv6Flag] = js.native
  /**
    * The maximum number of network interfaces for the instance type.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.native
  /**
    * Describes the network performance.
    */
  var NetworkPerformance: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkPerformance] = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnaSupport(value: EnaSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnaSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnaSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnaSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4AddressesPerInterface(value: MaxIpv4AddrPerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv4AddressesPerInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4AddressesPerInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv4AddressesPerInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6AddressesPerInterface(value: MaxIpv6AddrPerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6AddressesPerInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6AddressesPerInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6AddressesPerInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Supported(value: Ipv6Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Supported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Supported")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNetworkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNetworkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkPerformance(value: NetworkPerformance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPerformance")(js.undefined)
        ret
    }
  }
  
}

