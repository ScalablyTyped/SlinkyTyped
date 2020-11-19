package typingsSlinky.menubar.anon

import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.LoadURLOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electron.mod.Tray
import typingsSlinky.menubar.menubarBooleans.`false`
import typingsSlinky.menubar.menubarStrings.bottomCenter
import typingsSlinky.menubar.menubarStrings.bottomLeft
import typingsSlinky.menubar.menubarStrings.bottomRight
import typingsSlinky.menubar.menubarStrings.center
import typingsSlinky.menubar.menubarStrings.leftCenter
import typingsSlinky.menubar.menubarStrings.rightCenter
import typingsSlinky.menubar.menubarStrings.topCenter
import typingsSlinky.menubar.menubarStrings.topLeft
import typingsSlinky.menubar.menubarStrings.topRight
import typingsSlinky.menubar.menubarStrings.trayBottomCenter
import typingsSlinky.menubar.menubarStrings.trayBottomLeft
import typingsSlinky.menubar.menubarStrings.trayBottomRight
import typingsSlinky.menubar.menubarStrings.trayCenter
import typingsSlinky.menubar.menubarStrings.trayLeft
import typingsSlinky.menubar.menubarStrings.trayRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<menubar.menubar/lib/types.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String | NativeImage_] = js.native
  
  var index: js.UndefOr[String | `false`] = js.native
  
  var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.native
  
  var preloadWindow: js.UndefOr[Boolean] = js.native
  
  var showDockIcon: js.UndefOr[Boolean] = js.native
  
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.native
  
  var showOnRightClick: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
  
  var tray: js.UndefOr[Tray] = js.native
  
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = this.set("browserWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserWindow: Self = this.set("browserWindow", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setIcon(value: String | NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIndex(value: String | `false`): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLoadUrlOptions(value: LoadURLOptions): Self = this.set("loadUrlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadUrlOptions: Self = this.set("loadUrlOptions", js.undefined)
    
    @scala.inline
    def setPreloadWindow(value: Boolean): Self = this.set("preloadWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadWindow: Self = this.set("preloadWindow", js.undefined)
    
    @scala.inline
    def setShowDockIcon(value: Boolean): Self = this.set("showDockIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDockIcon: Self = this.set("showDockIcon", js.undefined)
    
    @scala.inline
    def setShowOnAllWorkspaces(value: Boolean): Self = this.set("showOnAllWorkspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnAllWorkspaces: Self = this.set("showOnAllWorkspaces", js.undefined)
    
    @scala.inline
    def setShowOnRightClick(value: Boolean): Self = this.set("showOnRightClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnRightClick: Self = this.set("showOnRightClick", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTray(value: Tray): Self = this.set("tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTray: Self = this.set("tray", js.undefined)
    
    @scala.inline
    def setWindowPosition(
      value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
    ): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
  }
}
