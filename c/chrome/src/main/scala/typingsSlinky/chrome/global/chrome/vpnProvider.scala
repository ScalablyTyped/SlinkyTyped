package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.vpnProvider.VpnConfigCreationEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnConfigRemovalEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnPacketReceptionEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnPlatformMessageEvent
import typingsSlinky.chrome.chrome.vpnProvider.VpnSessionParameters
import typingsSlinky.chrome.chrome.vpnProvider.VpnUiEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// VPN Provider
////////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * Permissions:  "vpnProvider"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object vpnProvider {
  
  @JSGlobal("chrome.vpnProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.vpnProvider.createConfig")
  @js.native
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.vpnProvider.destroyConfig")
  @js.native
  def destroyConfig(id: String): Unit = js.native
  @JSGlobal("chrome.vpnProvider.destroyConfig")
  @js.native
  def destroyConfig(id: String, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.vpnProvider.notifyConnectionStateChanged")
  @js.native
  def notifyConnectionStateChanged(state: String): Unit = js.native
  @JSGlobal("chrome.vpnProvider.notifyConnectionStateChanged")
  @js.native
  def notifyConnectionStateChanged(state: String, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.vpnProvider.onConfigCreated")
  @js.native
  def onConfigCreated: VpnConfigCreationEvent = js.native
  @scala.inline
  def onConfigCreated_=(x: VpnConfigCreationEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfigCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onConfigRemoved")
  @js.native
  def onConfigRemoved: VpnConfigRemovalEvent = js.native
  @scala.inline
  def onConfigRemoved_=(x: VpnConfigRemovalEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfigRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onPacketReceived")
  @js.native
  def onPacketReceived: VpnPacketReceptionEvent = js.native
  @scala.inline
  def onPacketReceived_=(x: VpnPacketReceptionEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPacketReceived")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onPlatformMessage")
  @js.native
  def onPlatformMessage: VpnPlatformMessageEvent = js.native
  @scala.inline
  def onPlatformMessage_=(x: VpnPlatformMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlatformMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onUIEvent")
  @js.native
  def onUIEvent: VpnUiEvent = js.native
  @scala.inline
  def onUIEvent_=(x: VpnUiEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUIEvent")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.sendPacket")
  @js.native
  def sendPacket(data: js.typedarray.ArrayBuffer): Unit = js.native
  @JSGlobal("chrome.vpnProvider.sendPacket")
  @js.native
  def sendPacket(data: js.typedarray.ArrayBuffer, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.vpnProvider.setParameters")
  @js.native
  def setParameters(parameters: VpnSessionParameters, callback: js.Function): Unit = js.native
}
