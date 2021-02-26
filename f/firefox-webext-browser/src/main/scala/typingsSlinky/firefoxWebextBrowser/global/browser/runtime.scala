package typingsSlinky.firefoxWebextBrowser.global.browser

import org.scalajs.dom.raw.Window
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifest
import typingsSlinky.firefoxWebextBrowser.browser.runtime.BrowserInfo
import typingsSlinky.firefoxWebextBrowser.browser.runtime.ConnectConnectInfo
import typingsSlinky.firefoxWebextBrowser.browser.runtime.DirectoryEntry
import typingsSlinky.firefoxWebextBrowser.browser.runtime.LastError
import typingsSlinky.firefoxWebextBrowser.browser.runtime.MessageSender
import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnInstalledDetails
import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnRestartRequiredReason
import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnUpdateAvailableDetails
import typingsSlinky.firefoxWebextBrowser.browser.runtime.PlatformInfo
import typingsSlinky.firefoxWebextBrowser.browser.runtime.Port
import typingsSlinky.firefoxWebextBrowser.browser.runtime.SendMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  */
object runtime {
  
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  @JSGlobal("browser.runtime.connect")
  @js.native
  def connect(): Port = js.native
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  @JSGlobal("browser.runtime.connect")
  @js.native
  def connect(connectInfo: ConnectConnectInfo): Port = js.native
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @param extensionId The ID of the extension or app to connect to. If omitted, a connection will be attempted with your own extension. Required if sending messages from a web page for web messaging.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  @JSGlobal("browser.runtime.connect")
  @js.native
  def connect(extensionId: String): Port = js.native
  @JSGlobal("browser.runtime.connect")
  @js.native
  def connect(extensionId: String, connectInfo: ConnectConnectInfo): Port = js.native
  
  /**
    * Connects to a native application in the host machine.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the registered application to connect to.
    * @returns Port through which messages can be sent and received with the application
    */
  @JSGlobal("browser.runtime.connectNative")
  @js.native
  def connectNative(application: String): Port = js.native
  
  /* runtime functions */
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app. If the background page is an event page, the system will ensure it is loaded before calling the callback. If there is no background page, an error is set.
    */
  @JSGlobal("browser.runtime.getBackgroundPage")
  @js.native
  def getBackgroundPage(): js.Promise[Window] = js.native
  
  /** Returns information about the current browser. */
  @JSGlobal("browser.runtime.getBrowserInfo")
  @js.native
  def getBrowserInfo(): js.Promise[BrowserInfo] = js.native
  
  /**
    * Returns details about the app or extension from the manifest. The object returned is a serialization of the full manifest file.
    */
  @JSGlobal("browser.runtime.getManifest")
  @js.native
  def getManifest(): WebExtensionManifest = js.native
  
  /**
    * Returns a DirectoryEntry for the package directory.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.getPackageDirectoryEntry")
  @js.native
  def getPackageDirectoryEntry(): js.Promise[DirectoryEntry] = js.native
  
  /** Returns information about the current platform. */
  @JSGlobal("browser.runtime.getPlatformInfo")
  @js.native
  def getPlatformInfo(): js.Promise[PlatformInfo] = js.native
  
  /**
    * Converts a relative path within an app/extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an app/extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  @JSGlobal("browser.runtime.getURL")
  @js.native
  def getURL(path: String): String = js.native
  
  /** The ID of the extension/app. */
  @JSGlobal("browser.runtime.id")
  @js.native
  val id: String = js.native
  
  /* runtime properties */
  /** This will be defined during an API method callback if there was an error */
  @JSGlobal("browser.runtime.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  /**
    * Fired when an update for the browser is available, but isn't installed immediately because a browser restart is required.
    * @deprecated Please use `runtime.onRestartRequired`.
    */
  @JSGlobal("browser.runtime.onBrowserUpdateAvailable")
  @js.native
  val onBrowserUpdateAvailable: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  /** Fired when a connection is made from either an extension process or a content script. */
  @JSGlobal("browser.runtime.onConnect")
  @js.native
  val onConnect: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  /** Fired when a connection is made from another extension. */
  @JSGlobal("browser.runtime.onConnectExternal")
  @js.native
  val onConnectExternal: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  /**
    * Fired when the extension is first installed, when the extension is updated to a new version, and when the browser is updated to a new version.
    */
  @JSGlobal("browser.runtime.onInstalled")
  @js.native
  val onInstalled: WebExtEvent[js.Function1[/* details */ OnInstalledDetails, Unit]] = js.native
  
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may send a response. This function becomes invalid when the event listener returns, unless you return true from the event listener to indicate you wish to send a response asynchronously (this will keep the message channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener returns.
    */
  @JSGlobal("browser.runtime.onMessage")
  @js.native
  val onMessage: WebExtEvent[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
      Boolean | js.Promise[js.Any] | Unit
    ]
  ] = js.native
  
  /**
    * Fired when a message is sent from another extension/app. Cannot be used in a content script.
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may send a response. This function becomes invalid when the event listener returns, unless you return true from the event listener to indicate you wish to send a response asynchronously (this will keep the message channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener returns.
    */
  @JSGlobal("browser.runtime.onMessageExternal")
  @js.native
  val onMessageExternal: WebExtEvent[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
      Boolean | js.Promise[js.Any] | Unit
    ]
  ] = js.native
  
  /**
    * Fired when an app or the device that it runs on needs to be restarted. The app should close all its windows at its earliest convenient time to let the restart to happen. If the app does nothing, a restart will be enforced after a 24-hour grace period has passed. Currently, this event is only fired for Chrome OS kiosk apps.
    * @param reason The reason that the event is being dispatched.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.onRestartRequired")
  @js.native
  val onRestartRequired: js.UndefOr[WebExtEvent[js.Function1[/* reason */ OnRestartRequiredReason, Unit]]] = js.native
  
  /* runtime events */
  /**
    * Fired when a profile that has this extension installed first starts up. This event is not fired for incognito profiles.
    */
  @JSGlobal("browser.runtime.onStartup")
  @js.native
  val onStartup: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.onSuspend")
  @js.native
  val onSuspend: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  /**
    * Sent after onSuspend to indicate that the app won't be unloaded after all.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.onSuspendCanceled")
  @js.native
  val onSuspendCanceled: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running. If you do nothing, the update will be installed the next time the background page gets unloaded, if you want it to be installed sooner you can explicitly call `runtime.reload`. If your extension is using a persistent background page, the background page of course never gets unloaded, so unless you call `runtime.reload` manually in response to this event the update will not get installed until the next time the browser itself restarts. If no handlers are listening for this event, and your extension has a persistent background page, it behaves as if `runtime.reload` is called in response to this event.
    * @param details The manifest details of the available update.
    */
  @JSGlobal("browser.runtime.onUpdateAvailable")
  @js.native
  val onUpdateAvailable: WebExtEvent[js.Function1[/* details */ OnUpdateAvailableDetails, Unit]] = js.native
  
  /**
    * Open your Extension's options page, if possible.
    *
    * The precise behavior may depend on your manifest's `options_ui` or `options_page` key, or what the browser happens to support at the time.
    *
    * If your Extension does not declare an options page, or the browser failed to create one for some other reason, the callback will set `lastError`.
    */
  @JSGlobal("browser.runtime.openOptionsPage")
  @js.native
  def openOptionsPage(): js.Promise[Unit] = js.native
  
  /** Reloads the app or extension. */
  @JSGlobal("browser.runtime.reload")
  @js.native
  def reload(): Unit = js.native
  
  /**
    * Requests an update check for this app/extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.requestUpdateCheck")
  @js.native
  def requestUpdateCheck(): js.Promise[js.Object] = js.native
  
  /**
    * Restart the device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.restart")
  @js.native
  def restart(): Unit = js.native
  
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension. Note that extensions cannot send messages to content scripts using this method. To send messages to content scripts, use `tabs.sendMessage`.
    * @param extensionId The ID of the extension/app to send the message to. If omitted, the message will be sent to your own extension/app. Required if sending messages from a web page for web messaging.
    */
  @JSGlobal("browser.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any): js.Promise[_] = js.native
  @JSGlobal("browser.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any, options: SendMessageOptions): js.Promise[_] = js.native
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension. Note that extensions cannot send messages to content scripts using this method. To send messages to content scripts, use `tabs.sendMessage`.
    */
  @JSGlobal("browser.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any): js.Promise[_] = js.native
  @JSGlobal("browser.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, options: SendMessageOptions): js.Promise[_] = js.native
  
  /**
    * Send a single message to a native application.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    */
  @JSGlobal("browser.runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage(application: String, message: js.Any): js.Promise[_] = js.native
  
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @param [url] URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    */
  @JSGlobal("browser.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(): js.Promise[Unit] = js.native
  @JSGlobal("browser.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(url: String): js.Promise[Unit] = js.native
}
