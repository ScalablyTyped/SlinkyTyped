package typingsSlinky.chromeApps.chrome.vpnProvider

import typingsSlinky.chromeApps.AnonCONNECTEDFAILURE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.FAILURE
import typingsSlinky.chromeApps.chromeAppsStrings.connected__
import typingsSlinky.chromeApps.chromeAppsStrings.failure_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.notifyConnectionStateChanged")
@js.native
object notifyConnectionStateChanged extends js.Object {
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def apply(
    state: ToStringLiteral[
      AnonCONNECTEDFAILURE, 
      /* keyof chrome-apps.AnonCONNECTEDFAILURE */ CONNECTED | FAILURE, 
      Exclude[
        /* keyof chrome-apps.AnonCONNECTEDFAILURE */ CONNECTED | FAILURE, 
        connected__ | failure_
      ]
    ]
  ): Unit = js.native
  def apply(
    state: ToStringLiteral[
      AnonCONNECTEDFAILURE, 
      /* keyof chrome-apps.AnonCONNECTEDFAILURE */ CONNECTED | FAILURE, 
      Exclude[
        /* keyof chrome-apps.AnonCONNECTEDFAILURE */ CONNECTED | FAILURE, 
        connected__ | failure_
      ]
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

