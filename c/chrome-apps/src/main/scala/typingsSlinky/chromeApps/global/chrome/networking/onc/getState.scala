package typingsSlinky.chromeApps.global.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.networking.onc.NetworkStateProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.getState")
@js.native
object getState extends js.Object {
  
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
  def apply(networkGuid: String, callback: js.Function1[/* result */ NetworkStateProperties, Unit]): Unit = js.native
}
