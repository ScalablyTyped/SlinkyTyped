package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.anon.CONNECTEDFAILURE
import typingsSlinky.chromeApps.anon.DISCONNECTED
import typingsSlinky.chromeApps.anon.SHOWADDDIALOG
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.vpnProvider.VpnSessionParameters
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.FAILURE
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_CHANGED
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_DOWN
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_UP
import typingsSlinky.chromeApps.chromeAppsStrings.RESUME
import typingsSlinky.chromeApps.chromeAppsStrings.SHOW_ADD_DIALOG
import typingsSlinky.chromeApps.chromeAppsStrings.SHOW_CONFIGURE_DIALOG
import typingsSlinky.chromeApps.chromeAppsStrings.SUSPEND
import typingsSlinky.chromeApps.chromeAppsStrings.connected__
import typingsSlinky.chromeApps.chromeAppsStrings.disconnected__
import typingsSlinky.chromeApps.chromeAppsStrings.error_
import typingsSlinky.chromeApps.chromeAppsStrings.failure_
import typingsSlinky.chromeApps.chromeAppsStrings.linkChanged
import typingsSlinky.chromeApps.chromeAppsStrings.linkDown
import typingsSlinky.chromeApps.chromeAppsStrings.linkUp
import typingsSlinky.chromeApps.chromeAppsStrings.resume_
import typingsSlinky.chromeApps.chromeAppsStrings.showAddDialog
import typingsSlinky.chromeApps.chromeAppsStrings.showConfigureDialog
import typingsSlinky.chromeApps.chromeAppsStrings.suspend_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.vpnProvider
//////////////////
// VPN Provider //
//////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * @requires(CrOS) Important: This API works only on Chrome OS.
  * @requires Permissions: 'vpnProvider'
  * @since Chrome 43.
  */
@JSGlobal("chrome.vpnProvider")
@js.native
object vpnProvider extends js.Object {
  
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  def destroyConfig(id: String): Unit = js.native
  def destroyConfig(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def notifyConnectionStateChanged(
    state: ToStringLiteral[
      CONNECTEDFAILURE, 
      /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
      Exclude[
        /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
        connected__ | failure_
      ]
    ]
  ): Unit = js.native
  def notifyConnectionStateChanged(
    state: ToStringLiteral[
      CONNECTEDFAILURE, 
      /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
      Exclude[
        /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
        connected__ | failure_
      ]
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  /** Triggered when a configuration is created by the platform for the extension. */
  val onConfigCreated: typingsSlinky.chromeApps.chrome.events.Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]] = js.native
  
  /** Triggered when a configuration created by the extension is removed by the platform. */
  val onConfigRemoved: typingsSlinky.chromeApps.chrome.events.Event[js.Function1[/* id */ String, Unit]] = js.native
  
  /** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
  val onPacketReceived: typingsSlinky.chromeApps.chrome.events.Event[js.Function1[/* data */ js.typedarray.ArrayBuffer, Unit]] = js.native
  
  /** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
  val onPlatformMessage: typingsSlinky.chromeApps.chrome.events.Event[
    js.Function3[
      /* id */ String, 
      /* message */ ToStringLiteral[
        DISCONNECTED, 
        /* keyof chrome-apps.anon.DISCONNECTED */ CONNECTED | typingsSlinky.chromeApps.chromeAppsStrings.DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
        Exclude[
          /* keyof chrome-apps.anon.DISCONNECTED */ CONNECTED | typingsSlinky.chromeApps.chromeAppsStrings.DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
          linkUp | linkChanged | suspend_ | resume_ | linkDown | connected__ | error_ | disconnected__
        ]
      ], 
      /* error */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * Triggered when there is a UI event for the extension.
    * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
    */
  val onUIEvent: typingsSlinky.chromeApps.chrome.events.Event[
    js.Function2[
      /* event */ ToStringLiteral[
        SHOWADDDIALOG, 
        /* keyof chrome-apps.anon.SHOWADDDIALOG */ SHOW_ADD_DIALOG | SHOW_CONFIGURE_DIALOG, 
        Exclude[
          /* keyof chrome-apps.anon.SHOWADDDIALOG */ SHOW_ADD_DIALOG | SHOW_CONFIGURE_DIALOG, 
          showAddDialog | showConfigureDialog
        ]
      ], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  def sendPacket(data: js.typedarray.ArrayBuffer): Unit = js.native
  def sendPacket(data: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  def setParameters(parameters: VpnSessionParameters, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * The enum is used by the platform to notify the client of the VPN session status.
    *
    * **'connected'**
    * VPN configuration connected.
    * **'disconnected'**
    * VPN configuration disconnected.
    * **'error'**
    * An error occurred in VPN connection, for example a timeout. A description
    * of the error is given as the error argument to *onPlatformMessage*.
    * **'linkDown'**
    * The default physical network connection is down.
    * **'linkUp'**
    * The default physical network connection is back up.
    * **'linkChanged'**
    * The default physical network connection changed, e.g. wifi->mobile.
    * **'suspend'**
    * The OS is preparing to suspend, so the VPN should drop its connection.
    * The extension is not guaranteed to receive this event prior to suspending.
    * **'resume'**
    * The OS has resumed and the user has logged back in, so the VPN should try to reconnect.
    * @enum
    */
  @js.native
  object PlatformMessage extends js.Object {
    
    var CONNECTED: connected__ = js.native
    
    var DISCONNECTED: disconnected__ = js.native
    
    var ERROR: error_ = js.native
    
    var LINK_CHANGED: linkChanged = js.native
    
    var LINK_DOWN: linkDown = js.native
    
    var LINK_UP: linkUp = js.native
    
    var RESUME: resume_ = js.native
    
    var SUSPEND: suspend_ = js.native
  }
  
  /**
    * The enum is used by the platform to indicate the event that triggered *onUIEvent*
    *
    * **'showAddDialog'**
    * Request the VPN client to show add configuration dialog to the user.
    * **'showConfigureDialog'**
    * Request the VPN client to show configuration settings dialog to the user.
    * @enum
    */
  @js.native
  object UIEvent extends js.Object {
    
    var SHOW_ADD_DIALOG: showAddDialog = js.native
    
    var SHOW_CONFIGURE_DIALOG: showConfigureDialog = js.native
  }
  
  /**
    * The enum is used by the VPN client to inform the platform of its current state.
    * This helps provide meaningful messages to the user.
    *
    * **'connected'**
    * VPN connection was successful.
    * **'failure'**
    * VPN connection failed.
    * @enum
    */
  @js.native
  object VpnConnectionState extends js.Object {
    
    var CONNECTED: connected__ = js.native
    
    var FAILURE: failure_ = js.native
  }
}
