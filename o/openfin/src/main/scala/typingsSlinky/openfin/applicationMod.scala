package typingsSlinky.openfin

import typingsSlinky.openfin.anon.Version
import typingsSlinky.openfin.applicationOptionMod.ApplicationOption
import typingsSlinky.openfin.baseMod.Base
import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.baseMod.Reply
import typingsSlinky.openfin.eventsApplicationMod.ApplicationEvents
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.monitorMod.MonitorInfo
import typingsSlinky.openfin.openfinStrings.`tray-icon-clicked`
import typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`
import typingsSlinky.openfin.openfinStrings.application
import typingsSlinky.openfin.pointMod.Point
import typingsSlinky.openfin.shapesMod.Bounds
import typingsSlinky.openfin.viewViewMod.View
import typingsSlinky.openfin.windowWindowMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationMod {
  
  @JSImport("openfin/_v2/api/application/application", JSImport.Default)
  @js.native
  class default () extends ApplicationModule
  
  @JSImport("openfin/_v2/api/application/application", "Application")
  @js.native
  class Application protected () extends EmitterBase[ApplicationEvents] {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
    
    var _close: js.Any = js.native
    
    var _manifestUrl: js.UndefOr[String] = js.native
    
    var _run: js.Any = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(force: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Retrieves an array of wrapped fin.Windows for each of the application’s child windows.
      * @return {Promise.Array.<_Window>}
      * @tutorial Application.getChildWindows
      */
    def getChildWindows(): js.Promise[js.Array[Window]] = js.native
    
    /**
      * Retrieves an array of active window groups for all of the application's windows. Each group is
      * represented as an array of wrapped fin.Windows.
      * @return {Promise.Array.Array.<_Window>}
      * @tutorial Application.getGroups
      */
    def getGroups(): js.Promise[js.Array[js.Array[Window]]] = js.native
    
    /**
      * Retrieves information about the application.
      * @return {Promise.<ApplicationInfo>}
      * @tutorial Application.getInfo
      */
    def getInfo(): js.Promise[ApplicationInfo] = js.native
    
    /**
      * Retrieves the JSON manifest that was used to create the application. Invokes the error callback
      * if the application was not created from a manifest.
      * @return {Promise.<any>}
      * @tutorial Application.getManifest
      */
    def getManifest(): js.Promise[_] = js.native
    
    /**
      * Retrieves UUID of the application that launches this application. Invokes the error callback
      * if the application was created from a manifest.
      * @return {Promise.<string>}
      * @tutorial Application.getParentUuid
      */
    def getParentUuid(): js.Promise[String] = js.native
    
    /**
      * Retrieves current application's shortcut configuration.
      * @return {Promise.<ShortCutConfig>}
      * @tutorial Application.getShortcuts
      */
    def getShortcuts(): js.Promise[ShortCutConfig] = js.native
    
    /**
      * @summary Retrieves information about the system tray.
      * @desc The only information currently returned is the position and dimensions.
      * @return {Promise.<TrayInfo>}
      * @tutorial Application.getTrayIconInfo
      */
    def getTrayIconInfo(): js.Promise[TrayInfo] = js.native
    
    /**
      * Retrieves current application's views.
      * @experimental
      * @return {Promise.Array.<View>}
      * @tutorial Application.getViews
      */
    def getViews(): js.Promise[js.Array[View]] = js.native
    
    /**
      * Returns an instance of the main Window of the application
      * @return {Promise.<_Window>}
      * @tutorial Application.getWindow
      */
    def getWindow(): js.Promise[Window] = js.native
    
    /**
      * Returns the current zoom level of the application.
      * @return {Promise.<number>}
      * @tutorial Application.getZoomLevel
      */
    def getZoomLevel(): js.Promise[Double] = js.native
    
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function addListener
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function on
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function once
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Adds a listener to the beginning of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependListener
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * The listener is added to the beginning of the listeners array.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependOnceListener
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Remove a listener from the listener array for the specified event.
      * Caution: Calling this method changes the array indices in the listener array behind the listener.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function removeListener
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Removes all listeners, or those of the specified event.
      * @param { string | symbol } [eventType]  - The type of the event.
      * @return {Promise.<this>}
      * @function removeAllListeners
      * @memberof Application
      * @instance
      * @tutorial Application.EventEmitter
      */
    /**
      * Determines if the application is currently running.
      * @return {Promise.<boolean>}
      * @tutorial Application.isRunning
      */
    def isRunning(): js.Promise[Boolean] = js.native
    
    /**
      * Closes the application and any child windows created by the application.
      * Cleans the application from state so it is no longer found in getAllApplications.
      * @param { boolean } [force = false] Close will be prevented from closing when force is false and
      *  ‘close-requested’ has been subscribed to for application’s main window.
      * @return {Promise.<boolean>}
      * @tutorial Application.quit
      */
    def quit(): js.Promise[Unit] = js.native
    def quit(force: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Manually registers a user with the licensing service. The only data sent by this call is userName and appName.
      * @param { string } userName - username to be passed to the RVM.
      * @param { string } appName - app name to be passed to the RVM.
      * @return {Promise.<void>}
      * @tutorial Application.registerUser
      */
    def registerUser(userName: String, appName: String): js.Promise[Unit] = js.native
    
    /**
      * Removes the application’s icon from the tray.
      * @return {Promise.<void>}
      * @tutorial Application.removeTrayIcon
      */
    def removeTrayIcon(): js.Promise[Unit] = js.native
    
    /**
      * Restarts the application.
      * @return {Promise.<void>}
      * @tutorial Application.restart
      */
    def restart(): js.Promise[Unit] = js.native
    
    /**
      * DEPRECATED method to run the application.
      * Needed when starting application via {@link Application.create}, but NOT needed when starting via {@link Application.start}.
      * @return {Promise.<void>}
      * @tutorial Application.run
      * @ignore
      */
    def run(): js.Promise[Unit] = js.native
    
    /**
      * Instructs the RVM to schedule one restart of the application.
      * @return {Promise.<void>}
      * @tutorial Application.scheduleRestart
      */
    def scheduleRestart(): js.Promise[Unit] = js.native
    
    /**
      * Sends a message to the RVM to upload the application's logs. On success,
      * an object containing logId is returned.
      * @return {Promise.<LogInfo>}
      * @tutorial Application.sendApplicationLog
      */
    def sendApplicationLog(): js.Promise[LogInfo] = js.native
    
    /**
      * Sets a username to correlate with App Log Management.
      * @param { string } username Username to correlate with App's Log.
      * @return {Promise.<void>}
      * @tutorial Application.setAppLogUsername
      */
    def setAppLogUsername(username: String): js.Promise[Unit] = js.native
    
    /**
      * Sets the query string in all shortcuts for this app. Requires RVM 5.5+.
      * @param { string } queryString The new query string for this app's shortcuts.
      * @return {Promise.<void>}
      * @tutorial Application.setShortcutQueryParams
      */
    def setShortcutQueryParams(queryString: String): js.Promise[Unit] = js.native
    
    /**
      * Sets new application's shortcut configuration. Windows only.
      * @param { ShortCutConfig } config New application's shortcut configuration.
      * @param { boolean } [config.desktop] - Enable/disable desktop shortcut.
      * @param { boolean } [config.startMenu] - Enable/disable start menu shortcut.
      * @param { boolean } [config.systemStartup] - Enable/disable system startup shortcut.
      * @return {Promise.<void>}
      * @tutorial Application.setShortcuts
      */
    def setShortcuts(config: ShortCutConfig): js.Promise[Unit] = js.native
    
    /**
      * Adds a customizable icon in the system tray.  To listen for a click on the icon use the `tray-icon-clicked` event.
      * @param { string } icon Image URL or base64 encoded string to be used as the icon
      * @return {Promise.<void>}
      * @tutorial Application.setTrayIcon
      */
    def setTrayIcon(icon: String): js.Promise[Unit] = js.native
    
    /**
      * Sets the zoom level of the application. The original size is 0 and each increment above or below represents zooming 20%
      * larger or smaller to default limits of 300% and 50% of original size, respectively.
      * @param { number } level The zoom level
      * @return {Promise.<void>}
      * @tutorial Application.setZoomLevel
      */
    def setZoomLevel(level: Double): js.Promise[Unit] = js.native
    
    /**
      * Closes the application by terminating its process.
      * @return {Promise.<void>}
      * @tutorial Application.terminate
      */
    def terminate(): js.Promise[Unit] = js.native
    
    var window: js.Any = js.native
    
    var windowListFromIdentityList: js.Any = js.native
  }
  
  @JSImport("openfin/_v2/api/application/application", "NavigationRejectedReply")
  @js.native
  class NavigationRejectedReply () extends Reply[`window-navigation-rejected`, Unit] {
    
    var sourceName: String = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait ApplicationInfo extends StObject {
    
    var initialOptions: ApplicationOption = js.native
    
    var launchMode: String = js.native
    
    var manifest: js.Object = js.native
    
    var manifestUrl: String = js.native
    
    var parentUuid: js.UndefOr[String] = js.native
    
    var runtime: Version = js.native
  }
  object ApplicationInfo {
    
    @scala.inline
    def apply(
      initialOptions: ApplicationOption,
      launchMode: String,
      manifest: js.Object,
      manifestUrl: String,
      runtime: Version
    ): ApplicationInfo = {
      val __obj = js.Dynamic.literal(initialOptions = initialOptions.asInstanceOf[js.Any], launchMode = launchMode.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationInfo]
    }
    
    @scala.inline
    implicit class ApplicationInfoMutableBuilder[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialOptions(value: ApplicationOption): Self = StObject.set(x, "initialOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchMode(value: String): Self = StObject.set(x, "launchMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifest(value: js.Object): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUuid(value: String): Self = StObject.set(x, "parentUuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUuidUndefined: Self = StObject.set(x, "parentUuid", js.undefined)
      
      @scala.inline
      def setRuntime(value: Version): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApplicationModule extends Base {
    
    var _create: js.Any = js.native
    
    var _createFromManifest: js.Any = js.native
    
    /**
      * DEPRECATED method to create a new Application. Use {@link Application.start} instead.
      * @param { ApplicationOption } appOptions
      * @return {Promise.<Application>}
      * @tutorial Application.create
      * @ignore
      */
    def create(appOptions: ApplicationOption): js.Promise[Application] = js.native
    
    def createFromManifest(manifestUrl: String): js.Promise[Application] = js.native
    
    /**
      * Asynchronously returns an Application object that represents the current application
      * @return {Promise.<Application>}
      * @tutorial Application.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Application] = js.native
    
    /**
      * Synchronously returns an Application object that represents the current application
      * @return {Application}
      * @tutorial Application.getCurrentSync
      * @static
      */
    def getCurrentSync(): Application = js.native
    
    /**
      * Creates and starts a new Application.
      * @param { ApplicationOption } appOptions
      * @return {Promise.<Application>}
      * @tutorial Application.start
      * @static
      */
    def start(appOptions: ApplicationOption): js.Promise[Application] = js.native
    
    /**
      * Retrieves application's manifest and returns a running instance of the application.
      * @param {string} manifestUrl - The URL of app's manifest.
      * @param {RvmLaunchOptions} [opts] - Parameters that the RVM will use.
      * @return {Promise.<Application>}
      * @tutorial Application.startFromManifest
      * @static
      */
    def startFromManifest(manifestUrl: String): js.Promise[Application] = js.native
    def startFromManifest(manifestUrl: String, opts: RvmLaunchOptions): js.Promise[Application] = js.native
    
    /**
      * Asynchronously starts a batch of applications given an array of application identifiers and manifestUrls.
      * Returns once the RVM is finished attempting to launch the applications.
      * @param { Array.<ManifestInfo> } applications
      * @return {Promise.<void>}
      * @static
      * @tutorial Application.startManyManifests
      * @experimental
      */
    def startManyManifests(applications: js.Array[ManifestInfo]): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously returns an Application object that represents an existing application.
      * @param { Identity } identity
      * @return {Promise.<Application>}
      * @tutorial Application.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Application] = js.native
    
    /**
      * Synchronously returns an Application object that represents an existing application.
      * @param { Identity } identity
      * @return {Application}
      * @tutorial Application.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Application = js.native
  }
  
  @js.native
  trait LogInfo extends StObject {
    
    var logId: String = js.native
  }
  object LogInfo {
    
    @scala.inline
    def apply(logId: String): LogInfo = {
      val __obj = js.Dynamic.literal(logId = logId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    @scala.inline
    implicit class LogInfoMutableBuilder[Self <: LogInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogId(value: String): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManifestInfo extends StObject {
    
    var manifestUrl: String = js.native
    
    var uuid: String = js.native
  }
  object ManifestInfo {
    
    @scala.inline
    def apply(manifestUrl: String, uuid: String): ManifestInfo = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestInfo]
    }
    
    @scala.inline
    implicit class ManifestInfoMutableBuilder[Self <: ManifestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RvmLaunchOptions extends StObject {
    
    var noUi: js.UndefOr[Boolean] = js.native
    
    var userAppConfigArgs: js.UndefOr[js.Object] = js.native
  }
  object RvmLaunchOptions {
    
    @scala.inline
    def apply(): RvmLaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RvmLaunchOptions]
    }
    
    @scala.inline
    implicit class RvmLaunchOptionsMutableBuilder[Self <: RvmLaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoUi(value: Boolean): Self = StObject.set(x, "noUi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUiUndefined: Self = StObject.set(x, "noUi", js.undefined)
      
      @scala.inline
      def setUserAppConfigArgs(value: js.Object): Self = StObject.set(x, "userAppConfigArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAppConfigArgsUndefined: Self = StObject.set(x, "userAppConfigArgs", js.undefined)
    }
  }
  
  @js.native
  trait ShortCutConfig extends StObject {
    
    var desktop: js.UndefOr[Boolean] = js.native
    
    var startMenu: js.UndefOr[Boolean] = js.native
    
    var systemStartup: js.UndefOr[Boolean] = js.native
  }
  object ShortCutConfig {
    
    @scala.inline
    def apply(): ShortCutConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortCutConfig]
    }
    
    @scala.inline
    implicit class ShortCutConfigMutableBuilder[Self <: ShortCutConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setStartMenu(value: Boolean): Self = StObject.set(x, "startMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartMenuUndefined: Self = StObject.set(x, "startMenu", js.undefined)
      
      @scala.inline
      def setSystemStartup(value: Boolean): Self = StObject.set(x, "systemStartup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemStartupUndefined: Self = StObject.set(x, "systemStartup", js.undefined)
    }
  }
  
  @js.native
  trait TrayIconClickReply
    extends Reply[application, `tray-icon-clicked`]
       with Point {
    
    var button: Double = js.native
    
    var monitorInfo: MonitorInfo = js.native
  }
  
  @js.native
  trait TrayInfo extends StObject {
    
    var bounds: Bounds = js.native
    
    var monitorInfo: MonitorInfo = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object TrayInfo {
    
    @scala.inline
    def apply(bounds: Bounds, monitorInfo: MonitorInfo, x: Double, y: Double): TrayInfo = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrayInfo]
    }
    
    @scala.inline
    implicit class TrayInfoMutableBuilder[Self <: TrayInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorInfo(value: MonitorInfo): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
