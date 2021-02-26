package typingsSlinky.menubar

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<menubar.menubar/lib/types.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
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
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindowUndefined: Self = StObject.set(x, "browserWindow", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLoadUrlOptions(value: LoadURLOptions): Self = StObject.set(x, "loadUrlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUrlOptionsUndefined: Self = StObject.set(x, "loadUrlOptions", js.undefined)
      
      @scala.inline
      def setPreloadWindow(value: Boolean): Self = StObject.set(x, "preloadWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadWindowUndefined: Self = StObject.set(x, "preloadWindow", js.undefined)
      
      @scala.inline
      def setShowDockIcon(value: Boolean): Self = StObject.set(x, "showDockIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDockIconUndefined: Self = StObject.set(x, "showDockIcon", js.undefined)
      
      @scala.inline
      def setShowOnAllWorkspaces(value: Boolean): Self = StObject.set(x, "showOnAllWorkspaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnAllWorkspacesUndefined: Self = StObject.set(x, "showOnAllWorkspaces", js.undefined)
      
      @scala.inline
      def setShowOnRightClick(value: Boolean): Self = StObject.set(x, "showOnRightClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnRightClickUndefined: Self = StObject.set(x, "showOnRightClick", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTray(value: Tray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrayUndefined: Self = StObject.set(x, "tray", js.undefined)
      
      @scala.inline
      def setWindowPosition(
        value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
}
