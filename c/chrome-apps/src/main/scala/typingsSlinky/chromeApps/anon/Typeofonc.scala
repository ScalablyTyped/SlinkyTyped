package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.networking.onc.CaptivePortalStatus
import typingsSlinky.chromeApps.chrome.networking.onc.DeviceStates
import typingsSlinky.chromeApps.chrome.networking.onc.Filter
import typingsSlinky.chromeApps.chrome.networking.onc.GlobalPolicy
import typingsSlinky.chromeApps.chrome.networking.onc.ManagedProperties
import typingsSlinky.chromeApps.chrome.networking.onc.NetworkConfigProperties
import typingsSlinky.chromeApps.chrome.networking.onc.NetworkProperties
import typingsSlinky.chromeApps.chrome.networking.onc.NetworkStateProperties
import typingsSlinky.chromeApps.chrome.networking.onc.NetworkType
import typingsSlinky.chromeApps.chromeAppsBooleans.`false`
import typingsSlinky.chromeApps.chromeAppsStrings.full
import typingsSlinky.chromeApps.chromeAppsStrings.setter
import typingsSlinky.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofonc extends js.Object {
  
  /**
    * Partial classes for internal use
    * @internal
    * @private
    */
  val _internal_ : js.Any = js.native
  
  /**
    * Creates a new network configuration from properties.
    * If a matching configured network already exists, this will fail.
    * Otherwise returns the GUID of the new network.
    * @param shared If true, share this network configuration with other users.
    *               Note: This option is exposed only to Chrome's Web UI.
    *               When called by apps, false is the only allowed value.
    * @param properties The properties to configure the new network with.
    * @param [callback] Called with the GUID for the new network configuration once the network has been created.
    */
  def createNetwork(shared: `false`, properties: NetworkConfigProperties[setter]): Unit = js.native
  def createNetwork(shared: `false`, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Disables any devices matching the specified network type.
    * Note, the type might represent multiple network types (e.g. 'Wireless').
    * @param networkType The type of network to disable.
    */
  def disableNetworkType(networkType: NetworkType): Unit = js.native
  
  /**
    * Enables any devices matching the specified network type.
    * Note, the type might represent multiple network types (e.g. 'Wireless').
    * @param networkType The type of network to enable.
    */
  def enableNetworkType(networkType: NetworkType): Unit = js.native
  
  /**
    * Forgets a network configuration by clearing any configured properties for the network with GUID networkGuid.
    * This may also include any other networks with matching identifiers (e.g. WiFi SSID and Security).
    * If no such configuration exists, an error will be set and the operation will fail.
    * **In kiosk sessions, this method will not be able to forget shared network configurations.**
    * @param networkGuid The GUID of the network to forget.
    * @param [callback] Called when the operation has completed.
    */
  def forgetNetwork(networkGuid: String): Unit = js.native
  def forgetNetwork(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns captive portal status for the network matching 'networkGuid'.
    * @param networkGuid The GUID of the network to get captive portal status for.
    * @param callback A callback function that returns the results of the query for network captive portal status.
    */
  def getCaptivePortalStatus(networkGuid: String, callback: js.Function1[/* result */ CaptivePortalStatus, Unit]): Unit = js.native
  
  /**
    * Returns states of available networking devices.
    * @param callback Called with a list of devices and their state.
    */
  def getDeviceStates(callback: js.Function1[/* result */ js.Array[DeviceStates], Unit]): Unit = js.native
  
  /**
    * Gets the global policy properties.
    * These properties are not expected to change during a session.
    */
  def getGlobalPolicy(callback: js.Function1[/* result */ GlobalPolicy, Unit]): Unit = js.native
  
  /**
    * Gets the merged properties of the network with id networkGuid from the sources:
    * User settings, shared settings, user policy, device policy and the currently active settings.
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called with the managed network properties when received.
    */
  def getManagedProperties(networkGuid: String, callback: js.Function1[/* result */ ManagedProperties, Unit]): Unit = js.native
  
  /**
    * Returns a list of network objects with the same properties provided by *getState*.
    * A filter is provided to specify the type of networks returned and to limit the number of networks.
    * Networks are ordered by the system based on their priority, with connected or connecting networks listed first.
    * @param callback Called with a interface of networks and their state properties when received.
    */
  def getNetworks(filter: Filter, callback: js.Function1[/* result */ js.Array[NetworkStateProperties], Unit]): Unit = js.native
  
  /**
    * Gets all the properties of the network with id *networkGuid*.
    * Includes all properties of the network (read-only and read/write values).
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called with the network properties when received.
    */
  def getProperties(networkGuid: String, callback: js.Function1[/* result */ NetworkProperties[unmanaged, full], Unit]): Unit = js.native
  
  /**
    * Gets the cached read-only properties of the network with id *networkGuid*.
    * This is meant to be a higher performance function than *getProperties*,
    * which requires a round trip to query the networking subsystem.
    * The following properties are returned for all networks:
    * GUID, Type, Name, WiFi.Security.
    * Additional properties are provided for visible networks:
    * ConnectionState, ErrorState, WiFi.SignalStrength,
    * Cellular.NetworkTechnology, Cellular.ActivationState, Cellular.RoamingState.
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called immediately with the network state properties.
    */
  def getState(networkGuid: String, callback: js.Function1[/* result */ NetworkStateProperties, Unit]): Unit = js.native
  
  /**
    * Fired when the list of devices has changed or any device state properties have changed.
    */
  val onDeviceStateListChanged: Event[js.Function0[Unit]] = js.native
  
  /**
    * Fired when the list of networks has changed. Sends a complete list of GUIDs for all the current networks.
    */
  val onNetworkListChanged: Event[js.Function1[/* changes */ js.Array[String], Unit]] = js.native
  
  //
  // EVENTS
  //
  /**
    * Fired when the properties change on any of the networks.
    * Sends a list of GUIDs for networks whose properties have changed.
    */
  val onNetworksChanged: Event[js.Function1[/* changes */ js.Array[String], Unit]] = js.native
  
  /**
    * Fired when a portal detection for a network completes.
    * Sends the GUID of the network and the corresponding captive portal status.
    */
  val onPortalDetectionCompleted: Event[js.Function2[/* networkGuid */ String, /* status */ CaptivePortalStatus, Unit]] = js.native
  
  /**
    * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
    * This is only a request: the network subsystem can choose to ignore it.
    * If the list is updated, then the *onNetworkListChanged* event will be fired.
    */
  def requestNetworkScan(): Unit = js.native
  /**
    * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
    * This is only a request: the network subsystem can choose to ignore it.
    * If the list is updated, then the *onNetworkListChanged* event will be fired.
    * @param networkType If provided, requests a scan specific to the type. For Cellular a mobile network scan will be requested if supported.
    * @since Chrome 63.
    */
  def requestNetworkScan(networkType: NetworkType): Unit = js.native
  
  /**
    * Sets the properties of the network with id *networkGuid*.
    * This is only valid for configured networks (Source != None).
    * Unconfigured visible networks should use **createNetwork** instead.
    * **In kiosk sessions, calling this method on a shared network will fail.**
    * @param networkGuid The GUID of the network to set properties for.
    * @param properties The properties to set.
    * @param [callback] Called when the operation has completed.
    */
  @JSName("setProperties")
  def setProperties_setter(networkGuid: String, properties: NetworkConfigProperties[setter]): Unit = js.native
  @JSName("setProperties")
  def setProperties_setter(networkGuid: String, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description Starts a connection to the network with networkGuid.
    * @param networkGuid The GUID of the network to connect to.
    * @param [callback] Creates a new network configuration from properties.
    *                   If a matching configured network already exists, this will fail.
    *                   Otherwise returns the GUID of the new network.
    */
  def startConnect(networkGuid: String): Unit = js.native
  def startConnect(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description Starts a disconnect from the network with networkGuid.
    * @param networkGuid The GUID of the network to connect to.
    * @param [callback] Called when the disconnect request has been sent. See note for *startConnect*.
    */
  def startDisconnect(networkGuid: String): Unit = js.native
  def startDisconnect(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
}
