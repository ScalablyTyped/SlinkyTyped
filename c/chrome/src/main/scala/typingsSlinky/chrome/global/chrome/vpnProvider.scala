package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.vpnProvider.VpnConfigCreationEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnConfigRemovalEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnPacketReceptionEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnPlatformMessageEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnSessionParameters
import typingsSlinky.chrome.chrome.vpnProvider.VpnUiEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// VPN Provider
////////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * Permissions:  "vpnProvider"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
@JSGlobal("chrome.vpnProvider")
@js.native
object vpnProvider extends js.Object {
  var onConfigCreated: VpnConfigCreationEvent = js.native
  var onConfigRemoved: VpnConfigRemovalEvent = js.native
  var onPacketReceived: VpnPacketReceptionEvent = js.native
  var onPlatformMessage: VpnPlatformMessageEvent = js.native
  var onUIEvent: VpnUiEvent = js.native
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  def destroyConfig(id: String): Unit = js.native
  def destroyConfig(id: String, callback: js.Function): Unit = js.native
  def notifyConnectionStateChanged(state: String): Unit = js.native
  def notifyConnectionStateChanged(state: String, callback: js.Function): Unit = js.native
  def sendPacket(data: js.typedarray.ArrayBuffer): Unit = js.native
  def sendPacket(data: js.typedarray.ArrayBuffer, callback: js.Function): Unit = js.native
  def setParameters(parameters: VpnSessionParameters, callback: js.Function): Unit = js.native
}

