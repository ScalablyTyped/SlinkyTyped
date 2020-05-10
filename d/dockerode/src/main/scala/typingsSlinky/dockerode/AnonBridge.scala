package typingsSlinky.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBridge extends js.Object {
  var Bridge: String = js.native
  var EndpointID: String = js.native
  var Gateway: String = js.native
  var GlobalIPv6Address: String = js.native
  var GlobalIPv6PrefixLen: Double = js.native
  var HairpinMode: Boolean = js.native
  var IPAddress: String = js.native
  var IPPrefixLen: Double = js.native
  var IPv6Gateway: String = js.native
  var LinkLocalIPv6Address: String = js.native
  var LinkLocalIPv6PrefixLen: Double = js.native
  var MacAddress: String = js.native
  var Networks: StringDictionary[AnonAliases] = js.native
  var Node: js.UndefOr[AnonAddr] = js.native
  var Ports: StringDictionary[js.Array[AnonHostIp]] = js.native
  var SandboxID: String = js.native
  var SandboxKey: String = js.native
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.native
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.native
}

object AnonBridge {
  @scala.inline
  def apply(
    Bridge: String,
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    HairpinMode: Boolean,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    LinkLocalIPv6Address: String,
    LinkLocalIPv6PrefixLen: Double,
    MacAddress: String,
    Networks: StringDictionary[AnonAliases],
    Ports: StringDictionary[js.Array[AnonHostIp]],
    SandboxID: String,
    SandboxKey: String
  ): AnonBridge = {
    val __obj = js.Dynamic.literal(Bridge = Bridge.asInstanceOf[js.Any], EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], HairpinMode = HairpinMode.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], LinkLocalIPv6Address = LinkLocalIPv6Address.asInstanceOf[js.Any], LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any], Ports = Ports.asInstanceOf[js.Any], SandboxID = SandboxID.asInstanceOf[js.Any], SandboxKey = SandboxKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBridge]
  }
  @scala.inline
  implicit class AnonBridgeOps[Self <: AnonBridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalIPv6PrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6PrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHairpinMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HairpinMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPPrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPPrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv6Gateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkLocalIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkLocalIPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkLocalIPv6PrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkLocalIPv6PrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworks(value: StringDictionary[AnonAliases]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Networks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPorts(value: StringDictionary[js.Array[AnonHostIp]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandboxID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SandboxID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandboxKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SandboxKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: AnonAddr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryIPAddresses(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryIPAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIPAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryIPAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryIPv6Addresses(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryIPv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIPv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryIPv6Addresses")(js.undefined)
        ret
    }
  }
  
}

