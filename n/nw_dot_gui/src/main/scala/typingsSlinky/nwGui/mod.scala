package typingsSlinky.nwGui

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.nwGui.anon.Datatype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nw.gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait App extends EventEmitter {
    
    def addOriginAccessWhitelistEntry(
      sourceOrigin: String,
      destinationProtocol: String,
      destinationHost: String,
      allowDestinationSubdomains: Boolean
    ): Unit = js.native
    
    var argv: js.Any = js.native
    
    def clearCache(): Unit = js.native
    
    def closeAllWindows(): Unit = js.native
    
    def crashBrowser(): Unit = js.native
    
    def crashRenderer(): Unit = js.native
    
    var dataPath: String = js.native
    
    var fullArgv: js.Any = js.native
    
    def getProxyForURL(url: String): Unit = js.native
    
    var manifest: js.Any = js.native
    
    def quit(): Unit = js.native
    
    def registerGlobalHotKey(shortcut: Shortcut): Unit = js.native
    
    def removeOriginAccessWhitelistEntry(
      sourceOrigin: String,
      destinationProtocol: String,
      destinationHost: String,
      allowDestinationSubdomains: Boolean
    ): Unit = js.native
    
    def setCrashDumpDir(dir: String): Unit = js.native
    
    def unregisterGlobalHotKey(shortcut: Shortcut): Unit = js.native
  }
  @JSImport("nw.gui", "App")
  @js.native
  def App: App = js.native
  @scala.inline
  def App_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Clipboard")
  @js.native
  class Clipboard () extends StObject {
    
    def clear(): Unit = js.native
    
    def get(): String = js.native
    def get(`type`: String): String = js.native
    
    def set(data: String): Unit = js.native
    def set(data: String, `type`: String): Unit = js.native
  }
  /* static members */
  object Clipboard {
    
    @JSImport("nw.gui", "Clipboard.get")
    @js.native
    def get(): Clipboard = js.native
  }
  
  @JSImport("nw.gui", "Menu")
  @js.native
  class Menu () extends StObject {
    def this(config: MenuConfig) = this()
    
    def append(item: MenuItem): Unit = js.native
    
    // since v0.10.0-rc1
    def createMacBuiltin(appname: String): Unit = js.native
    def createMacBuiltin(appname: String, options: HideMenusOptions): Unit = js.native
    
    def insert(item: MenuItem, atPosition: Double): Unit = js.native
    
    var items: js.Array[MenuItem] = js.native
    
    def popup(x: Double, y: Double): Unit = js.native
    
    def remove(item: MenuItem): Unit = js.native
    
    def removeAt(index: Double): Unit = js.native
  }
  
  @JSImport("nw.gui", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends EventEmitter
       with MenuItemConfig {
    def this(config: MenuItemConfig) = this()
    
    @JSName("checked")
    var checked_MenuItem: Boolean = js.native
    
    @JSName("click")
    var click_MenuItem: js.Function = js.native
    
    @JSName("enabled")
    var enabled_MenuItem: Boolean = js.native
    
    @JSName("icon")
    var icon_MenuItem: String = js.native
    
    @JSName("key")
    var key_MenuItem: String = js.native
    
    @JSName("label")
    var label_MenuItem: String = js.native
    
    @JSName("modifiers")
    var modifiers_MenuItem: String = js.native
    
    @JSName("submenu")
    var submenu_MenuItem: Menu = js.native
    
    @JSName("tooltip")
    var tooltip_MenuItem: String = js.native
    
    @JSName("type")
    var type_MenuItem: String = js.native
  }
  
  @js.native
  trait Shell extends StObject {
    
    def openExternal(uri: String): Unit = js.native
    
    def openItem(file_path: String): Unit = js.native
    
    def showItemInFolder(file_path: String): Unit = js.native
  }
  object Shell {
    
    @JSImport("nw.gui", "Shell")
    @js.native
    val ^ : Shell = js.native
    
    @scala.inline
    implicit class ShellMutableBuilder[Self <: Shell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenExternal(value: String => Unit): Self = StObject.set(x, "openExternal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenItem(value: String => Unit): Self = StObject.set(x, "openItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowItemInFolder(value: String => Unit): Self = StObject.set(x, "showItemInFolder", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("nw.gui", "Shortcut")
  @js.native
  class Shortcut protected () extends EventEmitter {
    def this(option: ShortcutOption) = this()
    
    var active: js.Function = js.native
    
    var failed: js.Function = js.native
    
    var key: String = js.native
  }
  
  @JSImport("nw.gui", "Tray")
  @js.native
  class Tray protected ()
    extends EventEmitter
       with TrayOption {
    def this(option: TrayOption) = this()
    
    @JSName("alticon")
    var alticon_Tray: String = js.native
    
    @JSName("icon")
    var icon_Tray: String = js.native
    
    @JSName("menu")
    var menu_Tray: Menu = js.native
    
    def remove(): Unit = js.native
    
    @JSName("title")
    var title_Tray: String = js.native
    
    @JSName("tooltip")
    var tooltip_Tray: String = js.native
  }
  
  @JSImport("nw.gui", "Window")
  @js.native
  class Window () extends EventEmitter {
    
    def blur(): Unit = js.native
    
    def capturePage(callback: js.Function): Unit = js.native
    def capturePage(callback: js.Function, config_object: Datatype): Unit = js.native
    def capturePage(callback: js.Function, imageformat: String): Unit = js.native
    
    def close(): Unit = js.native
    def close(force: Boolean): Unit = js.native
    
    def closeDevTools(): Unit = js.native
    
    def enterFullscreen(): Unit = js.native
    
    def enterKioskMode(): Unit = js.native
    
    def eval(frame: HTMLIFrameElement, script: String): Unit = js.native
    
    def focus(): Unit = js.native
    
    var height: Double = js.native
    
    def hide(): Unit = js.native
    
    def isDevToolsOpen(): Boolean = js.native
    
    var isFullScreen: Boolean = js.native
    
    var isKioskMode: Boolean = js.native
    
    def leaveFullscreen(): Unit = js.native
    
    def leaveKioskMode(): Unit = js.native
    
    def maximize(): Unit = js.native
    
    var menu: Menu = js.native
    
    def minimize(): Unit = js.native
    
    def moveBy(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def reload(): Unit = js.native
    
    def reloadIgnoringCache(): Unit = js.native
    
    def requestAttention(attention: Boolean): Unit = js.native
    def requestAttention(attention: Double): Unit = js.native
    
    def resizeBy(width: Double, height: Double): Unit = js.native
    
    def resizeTo(width: Double, height: Double): Unit = js.native
    
    def restore(): Unit = js.native
    
    def setAlwaysOnTop(top: Boolean): Unit = js.native
    
    def setBadgeLabel(label: String): Unit = js.native
    
    def setMaximumSize(width: Double, height: Double): Unit = js.native
    
    def setMinimumSize(width: Double, height: Double): Unit = js.native
    
    def setPosition(position: String): Unit = js.native
    
    def setProgressBar(progress: Double): Unit = js.native
    
    def setResizable(resizable: Boolean): Unit = js.native
    
    def setShowInTaskbar(show: Boolean): Unit = js.native
    
    def show(): Unit = js.native
    
    def showDevTools(): Unit = js.native
    def showDevTools(id: js.UndefOr[scala.Nothing], headless: Boolean): Unit = js.native
    def showDevTools(id: String): Unit = js.native
    def showDevTools(id: String, headless: Boolean): Unit = js.native
    def showDevTools(id: HTMLIFrameElement): Unit = js.native
    def showDevTools(id: HTMLIFrameElement, headless: Boolean): Unit = js.native
    
    var title: String = js.native
    
    def toggleFullscreen(): Unit = js.native
    
    def toggleKioskMode(): Unit = js.native
    
    def unmaximize(): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var zoomLevel: Double = js.native
  }
  /* static members */
  object Window {
    
    @JSImport("nw.gui", "Window.get")
    @js.native
    def get(): Window = js.native
    @JSImport("nw.gui", "Window.get")
    @js.native
    def get(windowObject: js.Any): Window = js.native
    
    @JSImport("nw.gui", "Window.open")
    @js.native
    def open(url: String): Window = js.native
    @JSImport("nw.gui", "Window.open")
    @js.native
    def open(url: String, options: WindowManifestOptions): Window = js.native
  }
  
  @js.native
  trait EventEmitter extends IEventEmitter
  
  @js.native
  trait HideMenusOptions extends StObject {
    
    var hideEdit: Boolean = js.native
    
    var hideWindow: Boolean = js.native
  }
  object HideMenusOptions {
    
    @scala.inline
    def apply(hideEdit: Boolean, hideWindow: Boolean): HideMenusOptions = {
      val __obj = js.Dynamic.literal(hideEdit = hideEdit.asInstanceOf[js.Any], hideWindow = hideWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[HideMenusOptions]
    }
    
    @scala.inline
    implicit class HideMenusOptionsMutableBuilder[Self <: HideMenusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideEdit(value: Boolean): Self = StObject.set(x, "hideEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideWindow(value: Boolean): Self = StObject.set(x, "hideWindow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEventEmitter extends StObject {
    
    def addListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): EventEmitter = js.native
    
    def once(event: String, listener: js.Function): EventEmitter = js.native
    
    def removeAllListeners(): EventEmitter = js.native
    def removeAllListeners(event: String): EventEmitter = js.native
    
    def removeListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
  }
  
  @js.native
  trait MenuConfig extends StObject {
    
    var `type`: js.UndefOr[String] = js.native
  }
  object MenuConfig {
    
    @scala.inline
    def apply(): MenuConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuConfig]
    }
    
    @scala.inline
    implicit class MenuConfigMutableBuilder[Self <: MenuConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MenuItemConfig extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var click: js.UndefOr[js.Function] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var modifiers: js.UndefOr[String] = js.native
    
    var submenu: js.UndefOr[Menu] = js.native
    
    var tooltip: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object MenuItemConfig {
    
    @scala.inline
    def apply(): MenuItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemConfig]
    }
    
    @scala.inline
    implicit class MenuItemConfigMutableBuilder[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setModifiers(value: String): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ShortcutOption extends StObject {
    
    var active: js.Function = js.native
    
    var failed: js.Function = js.native
    
    var key: String = js.native
  }
  object ShortcutOption {
    
    @scala.inline
    def apply(active: js.Function, failed: js.Function, key: String): ShortcutOption = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutOption]
    }
    
    @scala.inline
    implicit class ShortcutOptionMutableBuilder[Self <: ShortcutOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: js.Function): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: js.Function): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrayOption extends StObject {
    
    var alticon: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var menu: js.UndefOr[Menu] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[String] = js.native
  }
  object TrayOption {
    
    @scala.inline
    def apply(): TrayOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrayOption]
    }
    
    @scala.inline
    implicit class TrayOptionMutableBuilder[Self <: TrayOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlticon(value: String): Self = StObject.set(x, "alticon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlticonUndefined: Self = StObject.set(x, "alticon", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait WindowManifestOptions extends StObject {
    
    var frame: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var max_height: js.UndefOr[Double] = js.native
    
    var max_width: js.UndefOr[Double] = js.native
    
    var min_height: js.UndefOr[Double] = js.native
    
    var min_width: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var toolbar: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object WindowManifestOptions {
    
    @scala.inline
    def apply(): WindowManifestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowManifestOptions]
    }
    
    @scala.inline
    implicit class WindowManifestOptionsMutableBuilder[Self <: WindowManifestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMax_height(value: Double): Self = StObject.set(x, "max_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_heightUndefined: Self = StObject.set(x, "max_height", js.undefined)
      
      @scala.inline
      def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
      
      @scala.inline
      def setMin_height(value: Double): Self = StObject.set(x, "min_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_heightUndefined: Self = StObject.set(x, "min_height", js.undefined)
      
      @scala.inline
      def setMin_width(value: Double): Self = StObject.set(x, "min_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_widthUndefined: Self = StObject.set(x, "min_width", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
