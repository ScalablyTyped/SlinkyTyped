package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.TypeofClassBrowserView
import typingsSlinky.electron.TypeofClassBrowserWindow
import typingsSlinky.electron.TypeofClassMenu
import typingsSlinky.electron.TypeofClassNativeImage
import typingsSlinky.electron.TypeofClassNotification
import typingsSlinky.electron.TypeofClassSession
import typingsSlinky.electron.TypeofClassTouchBar
import typingsSlinky.electron.TypeofClassWebContents
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

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.electron.Electron.CommonInterface because Already inherited
- typings.electron.Electron.RendererInterface because var conflicts: clipboard, crashReporter, nativeImage, shell. Inlined BrowserWindowProxy, contextBridge, desktopCapturer, ipcRenderer, remote, webFrame, webviewTag */ trait AllElectron extends MainInterface {
  var BrowserWindowProxy: Instantiable0[typingsSlinky.electron.Electron.BrowserWindowProxy]
  var contextBridge: ContextBridge
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

object AllElectron {
  @scala.inline
  def apply(
    BrowserView: TypeofClassBrowserView,
    BrowserWindow: TypeofClassBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    ClientRequest: Instantiable1[
      /* options */ method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofClassMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: TypeofClassNotification,
    TouchBar: TypeofClassTouchBar,
    Tray: Instantiable1[/* image */ NativeImage | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    contextBridge: ContextBridge,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    dialog: Dialog,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    ipcRenderer: IpcRenderer,
    nativeImage: TypeofClassNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    remote: Remote,
    screen: Screen,
    session: TypeofClassSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofClassWebContents,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): AllElectron = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllElectron]
  }
}

