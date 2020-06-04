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

trait MainInterface extends CommonInterface {
  var BrowserView: TypeofBrowserView
  var BrowserWindow: TypeofBrowserWindow
  var ClientRequest: Instantiable1[
    /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
    typingsSlinky.electron.Electron.ClientRequest
  ]
  var Cookies: Instantiable0[typingsSlinky.electron.Electron.Cookies]
  var Debugger: Instantiable0[typingsSlinky.electron.Electron.Debugger]
  var DownloadItem: Instantiable0[typingsSlinky.electron.Electron.DownloadItem]
  var IncomingMessage: Instantiable0[typingsSlinky.electron.Electron.IncomingMessage]
  var Menu: TypeofMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typingsSlinky.electron.Electron.MenuItem]
  var Notification: TypeofNotification
  var TouchBar: TypeofTouchBar
  var Tray: Instantiable1[/* image */ NativeImage_ | String, typingsSlinky.electron.Electron.Tray]
  var WebRequest: Instantiable0[typingsSlinky.electron.Electron.WebRequest]
  var app: App
  var autoUpdater: AutoUpdater
  var contentTracing: ContentTracing
  var dialog: Dialog
  var globalShortcut: GlobalShortcut
  var inAppPurchase: InAppPurchase
  var ipcMain: IpcMain
  var net: Net
  var netLog: NetLog
  var powerMonitor: PowerMonitor
  var powerSaveBlocker: PowerSaveBlocker
  var protocol: Protocol
  var screen: Screen
  var session: TypeofSession
  var systemPreferences: SystemPreferences
  var webContents: TypeofWebContents
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserView(value: TypeofBrowserView): Self = this.set("BrowserView", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserWindow(value: TypeofBrowserWindow): Self = this.set("BrowserWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequest(
      value: Instantiable1[
          /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
          ClientRequest
        ]
    ): Self = this.set("ClientRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookies(value: Instantiable0[Cookies]): Self = this.set("Cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugger(value: Instantiable0[Debugger]): Self = this.set("Debugger", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadItem(value: Instantiable0[DownloadItem]): Self = this.set("DownloadItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingMessage(value: Instantiable0[IncomingMessage]): Self = this.set("IncomingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: TypeofMenu): Self = this.set("Menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = this.set("MenuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: TypeofNotification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchBar(value: TypeofTouchBar): Self = this.set("TouchBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTray(value: Instantiable1[/* image */ NativeImage_ | String, Tray]): Self = this.set("Tray", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRequest(value: Instantiable0[WebRequest]): Self = this.set("WebRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp(value: App): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoUpdater(value: AutoUpdater): Self = this.set("autoUpdater", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentTracing(value: ContentTracing): Self = this.set("contentTracing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialog(value: Dialog): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalShortcut(value: GlobalShortcut): Self = this.set("globalShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def setInAppPurchase(value: InAppPurchase): Self = this.set("inAppPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpcMain(value: IpcMain): Self = this.set("ipcMain", value.asInstanceOf[js.Any])
    @scala.inline
    def setNet(value: Net): Self = this.set("net", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetLog(value: NetLog): Self = this.set("netLog", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerMonitor(value: PowerMonitor): Self = this.set("powerMonitor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerSaveBlocker(value: PowerSaveBlocker): Self = this.set("powerSaveBlocker", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: Screen): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: TypeofSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemPreferences(value: SystemPreferences): Self = this.set("systemPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebContents(value: TypeofWebContents): Self = this.set("webContents", value.asInstanceOf[js.Any])
  }
  
}

