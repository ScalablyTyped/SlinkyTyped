package typingsSlinky.chromeApps.global.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.networking.onc.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.requestNetworkScan")
@js.native
object requestNetworkScan extends js.Object {
  
  /**
    * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
    * This is only a request: the network subsystem can choose to ignore it.
    * If the list is updated, then the *onNetworkListChanged* event will be fired.
    */
  def apply(): Unit = js.native
  /**
    * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
    * This is only a request: the network subsystem can choose to ignore it.
    * If the list is updated, then the *onNetworkListChanged* event will be fired.
    * @param networkType If provided, requests a scan specific to the type. For Cellular a mobile network scan will be requested if supported.
    * @since Chrome 63.
    */
  def apply(networkType: NetworkType): Unit = js.native
}
