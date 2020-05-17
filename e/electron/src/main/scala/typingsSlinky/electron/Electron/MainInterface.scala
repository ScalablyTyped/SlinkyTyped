package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.anon.TypeofBrowserView
import typingsSlinky.electron.anon.TypeofBrowserWindow
import typingsSlinky.electron.anon.TypeofMenu
import typingsSlinky.electron.anon.TypeofNativeImage
import typingsSlinky.electron.anon.TypeofNotification
import typingsSlinky.electron.anon.TypeofSession
import typingsSlinky.electron.anon.TypeofTouchBar
import typingsSlinky.electron.anon.TypeofWebContents
import typingsSlinky.electron.electronStrings.host
import typingsSlinky.electron.electronStrings.hostname
import typingsSlinky.electron.electronStrings.method
import typingsSlinky.electron.electronStrings.partition
import typingsSlinky.electron.electronStrings.path
import typingsSlinky.electron.electronStrings.port
import typingsSlinky.electron.electronStrings.protocol
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
    /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
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
  var app: App = js.native
  var autoUpdater: AutoUpdater = js.native
  var contentTracing: ContentTracing = js.native
  var dialog: Dialog = js.native
  var globalShortcut: GlobalShortcut = js.native
  var inAppPurchase: InAppPurchase = js.native
  var ipcMain: IpcMain = js.native
  var net: Net = js.native
  var netLog: NetLog = js.native
  var powerMonitor: PowerMonitor = js.native
  var powerSaveBlocker: PowerSaveBlocker = js.native
  var protocol: Protocol = js.native
  var screen: Screen = js.native
  var session: TypeofSession = js.native
  var systemPreferences: SystemPreferences = js.native
  var webContents: TypeofWebContents = js.native
}

object MainInterface {
  @scala.inline
  def apply(
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    ClientRequest: Instantiable1[
      /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
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
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    dialog: Dialog,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: TypeofNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: TypeofSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
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
          /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
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
    def withApp(value: App): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoUpdater(value: AutoUpdater): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTracing(value: ContentTracing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialog(value: Dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalShortcut(value: GlobalShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAppPurchase(value: InAppPurchase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcMain(value: IpcMain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcMain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNet(value: Net): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetLog(value: NetLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerMonitor(value: PowerMonitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerSaveBlocker(value: PowerSaveBlocker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSaveBlocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Protocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: Screen): Self = {
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
    def withSystemPreferences(value: SystemPreferences): Self = {
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

