package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typingsSlinky.chromeApps.chromeAppsStrings.DevicePolicy
import typingsSlinky.chromeApps.chromeAppsStrings.Device_
import typingsSlinky.chromeApps.chromeAppsStrings.None
import typingsSlinky.chromeApps.chromeAppsStrings.User
import typingsSlinky.chromeApps.chromeAppsStrings.UserPolicy
import typingsSlinky.chromeApps.chromeAppsStrings.getter
import typingsSlinky.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */] extends NetworkConfigBase[M, IF, getter] {
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[Boolean] = js.native
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.native
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[String] = js.native
  /** The network's IP configuration. */
  var IPConfigs: js.UndefOr[
    js.Array[
      IPConfigProperties[
        unmanaged, 
        Boolean | ManagedBoolean, 
        String | ManagedDOMString, 
        js.Array[String] | ManagedDOMStringList, 
        integer | ManagedLong
      ]
    ]
  ] = js.native
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[String] = js.native
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    typingsSlinky.chromeApps.chrome.networking.onc.ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
  ] = js.native
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[Boolean] = js.native
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      unmanaged, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[Device_ | DevicePolicy | User | UserPolicy | None] = js.native
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
}

object NetworkProperties {
  @scala.inline
  def apply[M, IF](): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
  @scala.inline
  implicit class NetworkPropertiesOps[Self[m, `if`] <: NetworkProperties[m, `if`], M, IF] (val x: Self[M, IF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, IF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, IF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, IF]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, IF]) with Other]
    @scala.inline
    def withConnectable(value: Boolean): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectable: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connectable")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionState(value: ConnectionStateType): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionState: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorState(value: String): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorState: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorState")(js.undefined)
        ret
    }
    @scala.inline
    def withIPConfigs(
      value: js.Array[
          IPConfigProperties[
            unmanaged, 
            Boolean | ManagedBoolean, 
            String | ManagedDOMString, 
            js.Array[String] | ManagedDOMStringList, 
            integer | ManagedLong
          ]
        ]
    ): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPConfigs: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withProxySettings(
      value: ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
    ): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProxySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxySettings: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProxySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedConnectivity(value: Boolean): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestrictedConnectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedConnectivity: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestrictedConnectivity")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedIPConfig(
      value: IPConfigProperties[
          unmanaged, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavedIPConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedIPConfig: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavedIPConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Device_ | DevicePolicy | User | UserPolicy | None): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticIPConfig(
      value: IPConfigProperties[
          M, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticIPConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticIPConfig: Self[M, IF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticIPConfig")(js.undefined)
        ret
    }
  }
  
}

