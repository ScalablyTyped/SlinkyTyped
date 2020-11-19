package typingsSlinky.chromeApps.global.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.networking.onc.DeviceStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.getDeviceStates")
@js.native
object getDeviceStates extends js.Object {
  
  /**
    * Returns states of available networking devices.
    * @param callback Called with a list of devices and their state.
    */
  def apply(callback: js.Function1[/* result */ js.Array[DeviceStates], Unit]): Unit = js.native
}
