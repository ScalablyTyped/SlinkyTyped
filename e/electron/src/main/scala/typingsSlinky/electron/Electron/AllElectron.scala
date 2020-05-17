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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.electron.Electron.CommonInterface because Already inherited
- typingsSlinky.electron.Electron.RendererInterface because var conflicts: clipboard, crashReporter, nativeImage, shell. Inlined BrowserWindowProxy, contextBridge, desktopCapturer, ipcRenderer, remote, webFrame, webviewTag */ @js.native
trait AllElectron extends MainInterface {
  var BrowserWindowProxy: Instantiable0[typingsSlinky.electron.Electron.BrowserWindowProxy] = js.native
  var contextBridge: ContextBridge = js.native
  var desktopCapturer: DesktopCapturer = js.native
  var ipcRenderer: IpcRenderer = js.native
  var remote: Remote = js.native
  var webFrame: WebFrame = js.native
  var webviewTag: WebviewTag = js.native
}

object AllElectron {
  @scala.inline
  def apply(
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
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
    contextBridge: ContextBridge,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    dialog: Dialog,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    ipcRenderer: IpcRenderer,
    nativeImage: TypeofNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    remote: Remote,
    screen: Screen,
    session: TypeofSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): AllElectron = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllElectron]
  }
  @scala.inline
  implicit class AllElectronOps[Self <: AllElectron] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrowserWindowProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextBridge(value: ContextBridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextBridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktopCapturer(value: DesktopCapturer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopCapturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcRenderer(value: IpcRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: Remote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebFrame(value: WebFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebviewTag(value: WebviewTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

