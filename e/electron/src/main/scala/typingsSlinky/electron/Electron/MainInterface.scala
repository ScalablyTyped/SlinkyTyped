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

trait MainInterface extends CommonInterface {
  var BrowserView: TypeofBrowserView
  var BrowserWindow: TypeofBrowserWindow
  var ClientRequest: Instantiable1[
    /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
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
  var app: App_
  var autoUpdater: AutoUpdater_
  var contentTracing: ContentTracing_
  var dialog: Dialog_
  var globalShortcut: GlobalShortcut_
  var inAppPurchase: InAppPurchase_
  var ipcMain: IpcMain_
  var net: Net_
  var netLog: NetLog_
  var powerMonitor: PowerMonitor_
  var powerSaveBlocker: PowerSaveBlocker_
  var protocol: Protocol_
  var screen: Screen_
  var session: TypeofSession
  var systemPreferences: SystemPreferences_
  var webContents: TypeofWebContents
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
}

