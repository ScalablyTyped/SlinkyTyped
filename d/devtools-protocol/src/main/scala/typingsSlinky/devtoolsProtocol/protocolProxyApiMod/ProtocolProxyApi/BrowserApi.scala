package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetBrowserCommandLineResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetVersionResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GrantPermissionsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.ResetPermissionsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.SetDockTileRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.SetPermissionRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.SetWindowBoundsRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserApi extends js.Object {
  
  /**
    * Close browser gracefully.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Crashes browser on the main thread.
    */
  def crash(): js.Promise[Unit] = js.native
  
  /**
    * Crashes GPU process.
    */
  def crashGpuProcess(): js.Promise[Unit] = js.native
  
  /**
    * Returns the command line switches for the browser process if, and only if
    * --enable-automation is on the commandline.
    */
  def getBrowserCommandLine(): js.Promise[GetBrowserCommandLineResponse] = js.native
  
  /**
    * Get a Chrome histogram by name.
    */
  def getHistogram(params: GetHistogramRequest): js.Promise[GetHistogramResponse] = js.native
  
  /**
    * Get Chrome histograms.
    */
  def getHistograms(params: GetHistogramsRequest): js.Promise[GetHistogramsResponse] = js.native
  
  /**
    * Returns version information.
    */
  def getVersion(): js.Promise[GetVersionResponse] = js.native
  
  /**
    * Get position and size of the browser window.
    */
  def getWindowBounds(params: GetWindowBoundsRequest): js.Promise[GetWindowBoundsResponse] = js.native
  
  /**
    * Get the browser window that contains the devtools target.
    */
  def getWindowForTarget(params: GetWindowForTargetRequest): js.Promise[GetWindowForTargetResponse] = js.native
  
  /**
    * Grant specific permissions to the given origin and reject all others.
    */
  def grantPermissions(params: GrantPermissionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Reset all permission management for all origins.
    */
  def resetPermissions(params: ResetPermissionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Set dock tile details, platform-specific.
    */
  def setDockTile(params: SetDockTileRequest): js.Promise[Unit] = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  def setDownloadBehavior(params: SetDownloadBehaviorRequest): js.Promise[Unit] = js.native
  
  /**
    * Set permission settings for given origin.
    */
  def setPermission(params: SetPermissionRequest): js.Promise[Unit] = js.native
  
  /**
    * Set position and/or size of the browser window.
    */
  def setWindowBounds(params: SetWindowBoundsRequest): js.Promise[Unit] = js.native
}
object BrowserApi {
  
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    crash: () => js.Promise[Unit],
    crashGpuProcess: () => js.Promise[Unit],
    getBrowserCommandLine: () => js.Promise[GetBrowserCommandLineResponse],
    getHistogram: GetHistogramRequest => js.Promise[GetHistogramResponse],
    getHistograms: GetHistogramsRequest => js.Promise[GetHistogramsResponse],
    getVersion: () => js.Promise[GetVersionResponse],
    getWindowBounds: GetWindowBoundsRequest => js.Promise[GetWindowBoundsResponse],
    getWindowForTarget: GetWindowForTargetRequest => js.Promise[GetWindowForTargetResponse],
    grantPermissions: GrantPermissionsRequest => js.Promise[Unit],
    resetPermissions: ResetPermissionsRequest => js.Promise[Unit],
    setDockTile: SetDockTileRequest => js.Promise[Unit],
    setDownloadBehavior: SetDownloadBehaviorRequest => js.Promise[Unit],
    setPermission: SetPermissionRequest => js.Promise[Unit],
    setWindowBounds: SetWindowBoundsRequest => js.Promise[Unit]
  ): BrowserApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), crash = js.Any.fromFunction0(crash), crashGpuProcess = js.Any.fromFunction0(crashGpuProcess), getBrowserCommandLine = js.Any.fromFunction0(getBrowserCommandLine), getHistogram = js.Any.fromFunction1(getHistogram), getHistograms = js.Any.fromFunction1(getHistograms), getVersion = js.Any.fromFunction0(getVersion), getWindowBounds = js.Any.fromFunction1(getWindowBounds), getWindowForTarget = js.Any.fromFunction1(getWindowForTarget), grantPermissions = js.Any.fromFunction1(grantPermissions), resetPermissions = js.Any.fromFunction1(resetPermissions), setDockTile = js.Any.fromFunction1(setDockTile), setDownloadBehavior = js.Any.fromFunction1(setDownloadBehavior), setPermission = js.Any.fromFunction1(setPermission), setWindowBounds = js.Any.fromFunction1(setWindowBounds))
    __obj.asInstanceOf[BrowserApi]
  }
  
  @scala.inline
  implicit class BrowserApiOps[Self <: BrowserApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCrash(value: () => js.Promise[Unit]): Self = this.set("crash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCrashGpuProcess(value: () => js.Promise[Unit]): Self = this.set("crashGpuProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBrowserCommandLine(value: () => js.Promise[GetBrowserCommandLineResponse]): Self = this.set("getBrowserCommandLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHistogram(value: GetHistogramRequest => js.Promise[GetHistogramResponse]): Self = this.set("getHistogram", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHistograms(value: GetHistogramsRequest => js.Promise[GetHistogramsResponse]): Self = this.set("getHistograms", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersion(value: () => js.Promise[GetVersionResponse]): Self = this.set("getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWindowBounds(value: GetWindowBoundsRequest => js.Promise[GetWindowBoundsResponse]): Self = this.set("getWindowBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowForTarget(value: GetWindowForTargetRequest => js.Promise[GetWindowForTargetResponse]): Self = this.set("getWindowForTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGrantPermissions(value: GrantPermissionsRequest => js.Promise[Unit]): Self = this.set("grantPermissions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetPermissions(value: ResetPermissionsRequest => js.Promise[Unit]): Self = this.set("resetPermissions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDockTile(value: SetDockTileRequest => js.Promise[Unit]): Self = this.set("setDockTile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDownloadBehavior(value: SetDownloadBehaviorRequest => js.Promise[Unit]): Self = this.set("setDownloadBehavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPermission(value: SetPermissionRequest => js.Promise[Unit]): Self = this.set("setPermission", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWindowBounds(value: SetWindowBoundsRequest => js.Promise[Unit]): Self = this.set("setWindowBounds", js.Any.fromFunction1(value))
  }
}
