package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.TypeofBrowserView
import typingsSlinky.electron.TypeofBrowserWindow
import typingsSlinky.electron.TypeofMenu
import typingsSlinky.electron.TypeofNativeImage
import typingsSlinky.electron.TypeofNotification
import typingsSlinky.electron.TypeofSession
import typingsSlinky.electron.TypeofTouchBar
import typingsSlinky.electron.TypeofWebContents
import typingsSlinky.electron.electronStrings.host
import typingsSlinky.electron.electronStrings.hostname
import typingsSlinky.electron.electronStrings.method
import typingsSlinky.electron.electronStrings.partition
import typingsSlinky.electron.electronStrings.path
import typingsSlinky.electron.electronStrings.port
import typingsSlinky.electron.electronStrings.redirect
import typingsSlinky.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainInterface extends CommonInterface {
  var BrowserView: TypeofBrowserView = js.native
  var BrowserWindow: TypeofBrowserWindow = js.native
  var ClientRequest: Instantiable1[
    /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typingsSlinky.electron.Electron.ClientRequest
  ] = js.native
  var Cookies: Instantiable0[typingsSlinky.electron.Electron.Cookies] = js.native
  var Debugger: Instantiable0[typingsSlinky.electron.Electron.Debugger] = js.native
  var DownloadItem: Instantiable0[typingsSlinky.electron.Electron.DownloadItem] = js.native
  var IncomingMessage: Instantiable0[typingsSlinky.electron.Electron.IncomingMessage] = js.native
  var Menu: TypeofMenu = js.native
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typingsSlinky.electron.Electron.MenuItem] = js.native
  var Notification: TypeofNotification = js.native
  var TouchBar: TypeofTouchBar = js.native
  var Tray: Instantiable1[/* image */ NativeImage_ | String, typingsSlinky.electron.Electron.Tray] = js.native
  var WebRequest: Instantiable0[typingsSlinky.electron.Electron.WebRequest] = js.native
  var app: App_ = js.native
  var autoUpdater: AutoUpdater_ = js.native
  var contentTracing: ContentTracing_ = js.native
  var dialog: Dialog_ = js.native
  var globalShortcut: GlobalShortcut_ = js.native
  var inAppPurchase: InAppPurchase_ = js.native
  var ipcMain: IpcMain_ = js.native
  var net: Net_ = js.native
  var netLog: NetLog_ = js.native
  var powerMonitor: PowerMonitor_ = js.native
  var powerSaveBlocker: PowerSaveBlocker_ = js.native
  var protocol: Protocol_ = js.native
  var screen: Screen_ = js.native
  var session: TypeofSession = js.native
  var systemPreferences: SystemPreferences_ = js.native
  var webContents: TypeofWebContents = js.native
}

object MainInterface {
  @scala.inline
  def apply(
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    ClientRequest: Instantiable1[
      /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: TypeofNotification,
    TouchBar: TypeofTouchBar,
    Tray: Instantiable1[/* image */ NativeImage_ | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App_,
    autoUpdater: AutoUpdater_,
    clipboard: Clipboard_,
    contentTracing: ContentTracing_,
    crashReporter: CrashReporter_,
    dialog: Dialog_,
    globalShortcut: GlobalShortcut_,
    inAppPurchase: InAppPurchase_,
    ipcMain: IpcMain_,
    nativeImage: TypeofNativeImage,
    net: Net_,
    netLog: NetLog_,
    powerMonitor: PowerMonitor_,
    powerSaveBlocker: PowerSaveBlocker_,
    protocol: Protocol_,
    screen: Screen_,
    session: TypeofSession,
    shell: Shell_,
    systemPreferences: SystemPreferences_,
    webContents: TypeofWebContents
  ): MainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainInterface]
  }
  @scala.inline
  implicit class MainInterfaceOps[Self <: MainInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserView(value: TypeofBrowserView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrowserView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserWindow(value: TypeofBrowserWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrowserWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequest(
      value: Instantiable1[
          /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
          ClientRequest
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: Instantiable0[Cookies]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugger(value: Instantiable0[Debugger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Debugger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadItem(value: Instantiable0[DownloadItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingMessage(value: Instantiable0[IncomingMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: TypeofMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: TypeofNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchBar(value: TypeofTouchBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTray(value: Instantiable1[/* image */ NativeImage_ | String, Tray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebRequest(value: Instantiable0[WebRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp(value: App_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoUpdater(value: AutoUpdater_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTracing(value: ContentTracing_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialog(value: Dialog_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalShortcut(value: GlobalShortcut_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAppPurchase(value: InAppPurchase_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcMain(value: IpcMain_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcMain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNet(value: Net_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetLog(value: NetLog_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerMonitor(value: PowerMonitor_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerSaveBlocker(value: PowerSaveBlocker_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSaveBlocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Protocol_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: Screen_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: TypeofSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemPreferences(value: SystemPreferences_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebContents(value: TypeofWebContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webContents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

