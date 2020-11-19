package typingsSlinky.chromeApps.global.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.networking.onc.NetworkProperties
import typingsSlinky.chromeApps.chromeAppsStrings.full
import typingsSlinky.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.getProperties")
@js.native
object getProperties extends js.Object {
  
  /**
    * Gets all the properties of the network with id *networkGuid*.
    * Includes all properties of the network (read-only and read/write values).
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called with the network properties when received.
    */
  def apply(networkGuid: String, callback: js.Function1[/* result */ NetworkProperties[unmanaged, full], Unit]): Unit = js.native
}
