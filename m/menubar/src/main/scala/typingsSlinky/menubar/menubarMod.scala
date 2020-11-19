package typingsSlinky.menubar

import typingsSlinky.electron.Electron.App
import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.LoadURLOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electron.Electron.Rectangle
import typingsSlinky.electron.mod.BrowserWindow
import typingsSlinky.electron.mod.Tray
import typingsSlinky.menubar.anon.PartialOptions
import typingsSlinky.menubar.menubarBooleans.`false`
import typingsSlinky.menubar.menubarStrings.bottomCenter
import typingsSlinky.menubar.menubarStrings.bottomLeft
import typingsSlinky.menubar.menubarStrings.bottomRight
import typingsSlinky.menubar.menubarStrings.browserWindow
import typingsSlinky.menubar.menubarStrings.center
import typingsSlinky.menubar.menubarStrings.dir
import typingsSlinky.menubar.menubarStrings.icon
import typingsSlinky.menubar.menubarStrings.index
import typingsSlinky.menubar.menubarStrings.leftCenter
import typingsSlinky.menubar.menubarStrings.loadUrlOptions
import typingsSlinky.menubar.menubarStrings.preloadWindow
import typingsSlinky.menubar.menubarStrings.rightCenter
import typingsSlinky.menubar.menubarStrings.showDockIcon
import typingsSlinky.menubar.menubarStrings.showOnAllWorkspaces
import typingsSlinky.menubar.menubarStrings.showOnRightClick
import typingsSlinky.menubar.menubarStrings.tooltip
import typingsSlinky.menubar.menubarStrings.topCenter
import typingsSlinky.menubar.menubarStrings.topLeft
import typingsSlinky.menubar.menubarStrings.topRight
import typingsSlinky.menubar.menubarStrings.tray
import typingsSlinky.menubar.menubarStrings.trayBottomCenter
import typingsSlinky.menubar.menubarStrings.trayBottomLeft
import typingsSlinky.menubar.menubarStrings.trayBottomRight
import typingsSlinky.menubar.menubarStrings.trayCenter
import typingsSlinky.menubar.menubarStrings.trayLeft
import typingsSlinky.menubar.menubarStrings.trayRight
import typingsSlinky.menubar.menubarStrings.windowPosition
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("menubar/lib/Menubar", JSImport.Namespace)
@js.native
object menubarMod extends js.Object {
  
  @js.native
  class Menubar protected () extends EventEmitter {
    def this(app: App) = this()
    def this(app: App, options: PartialOptions) = this()
    
    var _app: js.Any = js.native
    
    var _blurTimeout: js.Any = js.native
    
    var _browserWindow: js.Any = js.native
    
    var _cachedBounds: js.Any = js.native
    
    var _isVisible: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _positioner: js.Any = js.native
    
    var _tray: js.Any = js.native
    
    /**
      * The Electron [App](https://electronjs.org/docs/api/app)
      * instance.
      */
    def app: App = js.native
    
    var appReady: js.Any = js.native
    
    /**
      * Callback on tray icon click or double-click.
      *
      * @param e
      * @param bounds
      */
    var clicked: js.Any = js.native
    
    var createWindow: js.Any = js.native
    
    /**
      * Retrieve a menubar option.
      *
      * @param key - The option key to retrieve, see {@link Options}.
      */
    @JSName("getOption")
    def getOption_browserWindow(key: browserWindow): BrowserWindowConstructorOptions = js.native
    @JSName("getOption")
    def getOption_dir(key: dir): String = js.native
    @JSName("getOption")
    def getOption_icon(key: icon): js.UndefOr[String | NativeImage_] = js.native
    @JSName("getOption")
    def getOption_index(key: index): String | `false` = js.native
    @JSName("getOption")
    def getOption_loadUrlOptions(key: loadUrlOptions): js.UndefOr[LoadURLOptions] = js.native
    @JSName("getOption")
    def getOption_preloadWindow(key: preloadWindow): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showDockIcon(key: showDockIcon): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showOnAllWorkspaces(key: showOnAllWorkspaces): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_showOnRightClick(key: showOnRightClick): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_tooltip(key: tooltip): String = js.native
    @JSName("getOption")
    def getOption_tray(key: tray): js.UndefOr[Tray] = js.native
    @JSName("getOption")
    def getOption_windowPosition(key: windowPosition): js.UndefOr[
        trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ] = js.native
    
    /**
      * Hide the menubar window.
      */
    def hideWindow(): Unit = js.native
    
    /**
      * The [electron-positioner](https://github.com/jenslind/electron-positioner)
      * instance.
      */
    def positioner: js.Any = js.native
    
    def setOption(key: index, value: `false`): Unit = js.native
    def setOption(key: windowPosition, value: bottomCenter): Unit = js.native
    def setOption(key: windowPosition, value: bottomLeft): Unit = js.native
    def setOption(key: windowPosition, value: bottomRight): Unit = js.native
    def setOption(key: windowPosition, value: center): Unit = js.native
    def setOption(key: windowPosition, value: leftCenter): Unit = js.native
    def setOption(key: windowPosition, value: rightCenter): Unit = js.native
    def setOption(key: windowPosition, value: topCenter): Unit = js.native
    def setOption(key: windowPosition, value: topLeft): Unit = js.native
    def setOption(key: windowPosition, value: topRight): Unit = js.native
    def setOption(key: windowPosition, value: trayBottomCenter): Unit = js.native
    def setOption(key: windowPosition, value: trayBottomLeft): Unit = js.native
    def setOption(key: windowPosition, value: trayBottomRight): Unit = js.native
    def setOption(key: windowPosition, value: trayCenter): Unit = js.native
    def setOption(key: windowPosition, value: trayLeft): Unit = js.native
    def setOption(key: windowPosition, value: trayRight): Unit = js.native
    /**
      * Change an option after menubar is created.
      *
      * @param key - The option key to modify, see {@link Options}.
      * @param value - The value to set.
      */
    @JSName("setOption")
    def setOption_browserWindow(key: browserWindow, value: BrowserWindowConstructorOptions): Unit = js.native
    @JSName("setOption")
    def setOption_dir(key: dir, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_icon(key: icon, value: NativeImage_): Unit = js.native
    @JSName("setOption")
    def setOption_index(key: index, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_loadUrlOptions(key: loadUrlOptions): Unit = js.native
    @JSName("setOption")
    def setOption_loadUrlOptions(key: loadUrlOptions, value: LoadURLOptions): Unit = js.native
    @JSName("setOption")
    def setOption_preloadWindow(key: preloadWindow): Unit = js.native
    @JSName("setOption")
    def setOption_preloadWindow(key: preloadWindow, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showDockIcon(key: showDockIcon): Unit = js.native
    @JSName("setOption")
    def setOption_showDockIcon(key: showDockIcon, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnAllWorkspaces(key: showOnAllWorkspaces): Unit = js.native
    @JSName("setOption")
    def setOption_showOnAllWorkspaces(key: showOnAllWorkspaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showOnRightClick(key: showOnRightClick): Unit = js.native
    @JSName("setOption")
    def setOption_showOnRightClick(key: showOnRightClick, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_tooltip(key: tooltip, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_tray(key: tray): Unit = js.native
    @JSName("setOption")
    def setOption_tray(key: tray, value: Tray): Unit = js.native
    @JSName("setOption")
    def setOption_windowPosition(key: windowPosition): Unit = js.native
    
    /**
      * Show the menubar window.
      *
      * @param trayPos - The bounds to show the window in.
      */
    def showWindow(): js.Promise[Unit] = js.native
    def showWindow(trayPos: Rectangle): js.Promise[Unit] = js.native
    
    /**
      * The Electron [Tray](https://electronjs.org/docs/api/tray) instance.
      */
    def tray: Tray = js.native
    
    /**
      * The Electron [BrowserWindow](https://electronjs.org/docs/api/browser-window)
      * instance, if it's present.
      */
    def window: js.UndefOr[BrowserWindow] = js.native
    
    var windowClear: js.Any = js.native
  }
}
