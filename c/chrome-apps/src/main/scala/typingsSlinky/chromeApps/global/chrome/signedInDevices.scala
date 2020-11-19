package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.signedInDevices.DeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.signedInDevices
//////////////////////
// SignedIn Devices //
//////////////////////
/**
  * @requires(dev) Requires Chrome *dev*
  * Use the *chrome.signedInDevices* API to get a list of devices
  * signed into chrome with the same account as the current profile.
  */
@JSGlobal("chrome.signedInDevices")
@js.native
object signedInDevices extends js.Object {
  
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param isLocal If true only return the information for the local device.
    * If false or omitted return the list of all devices including the local device.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  def get(isLocal: Boolean, callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = js.native
  
  /**
    * Fired when the DeviceInfo object of any of the signed in devices
    * changes, or when a device is added or removed.
    * Provides *devices*:
    * The array of all signed in devices.
    */
  val onDeviceInfoChange: typingsSlinky.chromeApps.chrome.events.Event[js.Function1[/* devices */ js.Array[DeviceInfo], Unit]] = js.native
}
