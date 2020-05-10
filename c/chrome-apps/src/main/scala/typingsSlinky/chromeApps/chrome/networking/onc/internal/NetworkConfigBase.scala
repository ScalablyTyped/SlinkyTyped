package typingsSlinky.chromeApps.chrome.networking.onc.internal

import typingsSlinky.chromeApps.AnonAuthentication
import typingsSlinky.chromeApps.AnonSignalStrength
import typingsSlinky.chromeApps.AnonType
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.networking.onc.CellularBase
import typingsSlinky.chromeApps.chrome.networking.onc.CellularProperties
import typingsSlinky.chromeApps.chrome.networking.onc.EthernetProperties
import typingsSlinky.chromeApps.chrome.networking.onc.IPConfigType
import typingsSlinky.chromeApps.chrome.networking.onc.InterfaceType
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedBoolean
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedDOMString
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedIPConfigType
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedLong
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedObject
import typingsSlinky.chromeApps.chrome.networking.onc.NetworkType
import typingsSlinky.chromeApps.chrome.networking.onc.VPNProperties
import typingsSlinky.chromeApps.chrome.networking.onc.WiFiProperties
import typingsSlinky.chromeApps.chrome.networking.onc.WiFiPropertiesBase
import typingsSlinky.chromeApps.chrome.networking.onc.WiMAXProperties
import typingsSlinky.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.native
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[EthernetProperties[M] | AnonAuthentication] = js.native
  /** The network GUID. */
  var GUID: js.UndefOr[String] = js.native
  /** The network's IP address configuration type. */
  var IPAddressConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
  /** A user friendly network name. */
  var Name: js.UndefOr[String | ManagedDOMString] = js.native
  /** The IP configuration type for the name servers used by the network. */
  var NameServersConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
  /** The network priority. */
  var Priority: js.UndefOr[integer | ManagedLong] = js.native
  /** The network type. */
  var Type: js.UndefOr[NetworkType] = js.native
  /** For VPN networks, the network VPN properties. */
  var VPN: js.UndefOr[
    (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | AnonType
  ] = js.native
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
  ] = js.native
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | AnonSignalStrength] = js.native
}

object NetworkConfigBase {
  @scala.inline
  def apply[M, IF, OF](): NetworkConfigBase[M, IF, OF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
  }
  @scala.inline
  implicit class NetworkConfigBaseOps[Self[m, `if`, of] <: NetworkConfigBase[m, `if`, of], M, IF, OF] (val x: Self[M, IF, OF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, IF, OF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, IF, OF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, IF, OF]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, IF, OF]) with Other]
    @scala.inline
    def withCellular(value: CellularProperties[M] | CellularBase): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cellular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellular: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cellular")(js.undefined)
        ret
    }
    @scala.inline
    def withEthernet(value: EthernetProperties[M] | AnonAuthentication): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ethernet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEthernet: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ethernet")(js.undefined)
        ret
    }
    @scala.inline
    def withGUID(value: String): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGUID: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAddressConfigType(value: IPConfigType | ManagedIPConfigType): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddressConfigType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddressConfigType: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddressConfigType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | ManagedDOMString): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameServersConfigType(value: IPConfigType | ManagedIPConfigType): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameServersConfigType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameServersConfigType: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameServersConfigType")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: integer | ManagedLong): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NetworkType): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVPN(value: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | AnonType): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPN: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPN")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFi(
      value: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
    ): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WiFi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFi: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WiFi")(js.undefined)
        ret
    }
    @scala.inline
    def withWiMAX(value: (WiMAXProperties[M, Boolean | ManagedBoolean]) | AnonSignalStrength): Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WiMAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiMAX: Self[M, IF, OF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WiMAX")(js.undefined)
        ret
    }
  }
  
}

