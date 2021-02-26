package typingsSlinky.openfin

import typingsSlinky.openfin.applicationMod.RvmLaunchOptions
import typingsSlinky.openfin.baseMod.Base
import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.clientMod.ChannelClient
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.interappbusChannelMod.Channel
import typingsSlinky.openfin.platformMod.PlatformEvents
import typingsSlinky.openfin.shapesPlatformMod.ApplySnapshotOptions
import typingsSlinky.openfin.shapesPlatformMod.InitPlatformOptions
import typingsSlinky.openfin.shapesPlatformMod.PlatformOptions
import typingsSlinky.openfin.shapesPlatformMod.PlatformWindowCreationOptions
import typingsSlinky.openfin.shapesPlatformMod.Snapshot
import typingsSlinky.openfin.viewViewMod.View
import typingsSlinky.openfin.viewViewMod.ViewCreationOptions
import typingsSlinky.openfin.windowWindowMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformPlatformMod {
  
  @JSImport("openfin/_v2/api/platform/platform", JSImport.Default)
  @js.native
  class default protected () extends PlatformModule {
    def this(wire: typingsSlinky.openfin.transportMod.default, channel: Channel) = this()
  }
  
  @JSImport("openfin/_v2/api/platform/platform", "Platform")
  @js.native
  class Platform protected () extends EmitterBase[PlatformEvents] {
    def this(identity: Identity, channel: Channel) = this()
    
    var Application: typingsSlinky.openfin.applicationMod.Application = js.native
    
    var Layout: typingsSlinky.openfin.layoutMod.default = js.native
    
    var _channel: js.Any = js.native
    
    def applySnapshot(requestedSnapshot: String): js.Promise[Platform] = js.native
    def applySnapshot(requestedSnapshot: String, options: ApplySnapshotOptions): js.Promise[Platform] = js.native
    /**
      * Adds a snapshot to a running Platform.
      *
      * Can optionally close existing windows and overwrite current platform state with that of a snapshot.
      *
      * The function accepts either a snapshot taken using {@link Platform#getSnapshot getSnapshot},
      * or a url or filepath to a snapshot JSON object.
      * @param { Snapshot | string } requestedSnapshot Snapshot to apply, or a url or filepath.
      * @param { ApplySnapshotOptions } [options] Optional parameters to specify whether existing windows should be closed.
      * @return { Promise<Platform> }
      * @tutorial Platform.applySnapshot
      */
    def applySnapshot(requestedSnapshot: Snapshot): js.Promise[Platform] = js.native
    def applySnapshot(requestedSnapshot: Snapshot, options: ApplySnapshotOptions): js.Promise[Platform] = js.native
    
    /**
      * Closes a specified view in a target window.
      * @param { Identity } viewIdentity View identity
      * @return { Promise<void> }
      * @tutorial Platform.closeView
      */
    def closeView(viewIdentity: Identity): js.Promise[Unit] = js.native
    
    /**
      * Creates a new view and attaches it to a specified target window.
      * @param { View~options } viewOptions View creation options
      * @param { Identity } [target] The window to which the new view is to be attached. If no target, create a view in a new window.
      * @return { Promise<View> }
      * @tutorial Platform.createView
      */
    def createView(viewOptions: ViewCreationOptions): js.Promise[View] = js.native
    def createView(viewOptions: ViewCreationOptions, target: Identity): js.Promise[View] = js.native
    
    /**
      * Creates a new Window.
      * @param { Window~options } options Window creation options
      * @return { Promise<_Window> }
      * @tutorial Platform.createWindow
      */
    def createWindow(options: PlatformWindowCreationOptions): js.Promise[Window with Identity] = js.native
    
    def getClient(): js.Promise[ChannelClient] = js.native
    def getClient(identity: Identity): js.Promise[ChannelClient] = js.native
    
    /**
      * Returns a snapshot of the platform in its current state.
      *
      * Can be used to restore an application to a previous state.
      * @return { Promise<Snapshot> }
      * @tutorial Platform.getSnapshot
      */
    def getSnapshot(): js.Promise[Snapshot] = js.native
    
    /**
      * Get the context context of a host window that was previously set using {@link Platform#setWindowContext setWindowContext}.
      * The context will be saved in any platform snapshots.  Returns a promise that resolves to the context.
      * @param {Identity} [target] - A target window or view may optionally be provided. If no target is provided, target will be
      * the current window (if called from a Window) or the current host window (if called from a View).
      * @return {Promise<any>}
      * @tutorial Platform.getWindowContext
      * @experimental
      */
    def getWindowContext(): js.Promise[_] = js.native
    def getWindowContext(target: Identity): js.Promise[_] = js.native
    
    /**
      * Retrieves a manifest by url and launches a legacy application manifest or snapshot into the platform.  Returns a promise that
      * resolves to the wrapped Platform.
      * @param {string} manifestUrl - The URL of the manifest of the app to launch into the platform.  If this app manifest
      * contains a snapshot, that will be launched into the platform.  If not, the application described in startup_app options
      * will be launched into the platform. The applicable startup_app options will become {@link View~options View Options}.
      * @return {Promise<Platform>}
      * @tutorial Platform.launchContentManifest
      * @experimental
      */
    def launchContentManifest(manifestUrl: String): js.Promise[Platform] = js.native
    
    def launchLegacyManifest(manifestUrl: String): js.Promise[Platform] = js.native
    
    /**
      * Closes current platform, all its windows, and their views.
      * @return { Promise<void> }
      * @tutorial Platform.quit
      */
    def quit(): js.Promise[Unit] = js.native
    
    /**
      * Reparents a specified view in a new target window.
      * @param { Identity } viewIdentity View identity
      * @param { Identity } target new owner window identity
      * @return { Promise<View> }
      * @tutorial Platform.reparentView
      */
    def reparentView(viewIdentity: Identity, target: Identity): js.Promise[View] = js.native
    
    /**
      * Set the context of a host window. The context will be available to the window itself, and to its child Views. It will be saved in any platform snapshots.
      * It can be retrieved using {@link Platform#getWindowContext getWindowContext}.
      * @param {any} context - A field where serializable context data can be stored to be saved in platform snapshots.
      * @param {Identity} [target] - A target window or view may optionally be provided. If no target is provided, the update will be applied
      * to the current window (if called from a Window) or the current host window (if called from a View).
      * @return {Promise<void>}
      * @tutorial Platform.setWindowContext
      * @experimental
      */
    def setWindowContext(): js.Promise[Unit] = js.native
    def setWindowContext(context: js.UndefOr[scala.Nothing], target: Identity): js.Promise[Unit] = js.native
    def setWindowContext(context: js.Any): js.Promise[Unit] = js.native
    def setWindowContext(context: js.Any, target: Identity): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait PlatformModule extends Base {
    
    var Layout: typingsSlinky.openfin.layoutMod.default = js.native
    
    var _channel: js.Any = js.native
    
    var _initializer: js.Any = js.native
    
    /**
      * Asynchronously returns a Platform object that represents the current platform.
      * @return {Promise.<Platform>}
      * @tutorial Platform.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Platform] = js.native
    
    /**
      * Synchronously returns a Platform object that represents the current platform.
      * @return {Platform}
      * @tutorial Platform.getCurrentSync
      * @static
      */
    def getCurrentSync(): Platform = js.native
    
    /**
      * Initializes a Platform. Must be called from the Provider when using a custom provider.
      * @param { InitPlatformOptions } [options] - platform options including a callback function that can be used to extend or replace
      * default Provider behavior.
      * @return {Promise.<void>}
      * @tutorial Platform.init
      * @experimental
      * @static
      */
    def init(): js.Promise[_] = js.native
    def init(options: InitPlatformOptions): js.Promise[_] = js.native
    
    /**
      * Creates and starts a Platform and returns a wrapped and running Platform instance. The wrapped Platform methods can
      * be used to launch content into the platform.  Promise will reject if the platform is already running.
      * @param { PlatformOptions } platformOptions
      * @return {Promise.<Platform>}
      * @tutorial Platform.start
      * @static
      */
    def start(platformOptions: PlatformOptions): js.Promise[Platform] = js.native
    
    /**
      * Retrieves platforms's manifest and returns a wrapped and running Platform.  If there is a snapshot in the manifest,
      * it will be launched into the platform.
      * @param {string} manifestUrl - The URL of platform's manifest.
      * @param {RvmLaunchOptions} [opts] - Parameters that the RVM will use.
      * @return {Promise.<Platform>}
      * @tutorial Platform.startFromManifest
      * @static
      */
    def startFromManifest(manifestUrl: String): js.Promise[Platform] = js.native
    def startFromManifest(manifestUrl: String, opts: RvmLaunchOptions): js.Promise[Platform] = js.native
    
    /**
      * Asynchronously returns a Platform object that represents an existing platform.
      * @param { Identity } identity
      * @return {Promise.<Platform>}
      * @tutorial Platform.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Platform] = js.native
    
    /**
      * Synchronously returns a Platform object that represents an existing platform.
      * @param { Identity } identity
      * @return {Platform}
      * @tutorial Platform.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Platform = js.native
  }
}
