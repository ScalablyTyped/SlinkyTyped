package typingsSlinky.electron.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.electron.Electron.Accelerator
import typingsSlinky.electron.Electron.App
import typingsSlinky.electron.Electron.AutoUpdater
import typingsSlinky.electron.Electron.BrowserWindowProxy
import typingsSlinky.electron.Electron.ClientRequest
import typingsSlinky.electron.Electron.Clipboard
import typingsSlinky.electron.Electron.ContentTracing
import typingsSlinky.electron.Electron.ContextBridge
import typingsSlinky.electron.Electron.Cookies
import typingsSlinky.electron.Electron.CrashReporter
import typingsSlinky.electron.Electron.Debugger
import typingsSlinky.electron.Electron.DesktopCapturer
import typingsSlinky.electron.Electron.Dialog
import typingsSlinky.electron.Electron.DownloadItem
import typingsSlinky.electron.Electron.EventEmitter
import typingsSlinky.electron.Electron.GlobalShortcut
import typingsSlinky.electron.Electron.InAppPurchase
import typingsSlinky.electron.Electron.IncomingMessage
import typingsSlinky.electron.Electron.IpcMain
import typingsSlinky.electron.Electron.IpcRenderer
import typingsSlinky.electron.Electron.MenuItem
import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electron.Electron.Net
import typingsSlinky.electron.Electron.NetLog
import typingsSlinky.electron.Electron.PowerMonitor
import typingsSlinky.electron.Electron.PowerSaveBlocker
import typingsSlinky.electron.Electron.Protocol
import typingsSlinky.electron.Electron.Remote
import typingsSlinky.electron.Electron.Screen
import typingsSlinky.electron.Electron.Shell
import typingsSlinky.electron.Electron.SystemPreferences
import typingsSlinky.electron.Electron.TouchBarButton
import typingsSlinky.electron.Electron.TouchBarButtonConstructorOptions
import typingsSlinky.electron.Electron.TouchBarColorPicker
import typingsSlinky.electron.Electron.TouchBarColorPickerConstructorOptions
import typingsSlinky.electron.Electron.TouchBarGroup
import typingsSlinky.electron.Electron.TouchBarGroupConstructorOptions
import typingsSlinky.electron.Electron.TouchBarLabel
import typingsSlinky.electron.Electron.TouchBarLabelConstructorOptions
import typingsSlinky.electron.Electron.TouchBarPopover
import typingsSlinky.electron.Electron.TouchBarPopoverConstructorOptions
import typingsSlinky.electron.Electron.TouchBarScrubber
import typingsSlinky.electron.Electron.TouchBarScrubberConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSegmentedControl
import typingsSlinky.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSlider
import typingsSlinky.electron.Electron.TouchBarSliderConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSpacer
import typingsSlinky.electron.Electron.TouchBarSpacerConstructorOptions
import typingsSlinky.electron.Electron.Tray
import typingsSlinky.electron.Electron.WebFrame
import typingsSlinky.electron.Electron.WebRequest
import typingsSlinky.electron.Electron.WebviewTag
import typingsSlinky.electron.electronStrings.host
import typingsSlinky.electron.electronStrings.hostname
import typingsSlinky.electron.electronStrings.method
import typingsSlinky.electron.electronStrings.partition
import typingsSlinky.electron.electronStrings.path
import typingsSlinky.electron.electronStrings.port
import typingsSlinky.electron.electronStrings.protocol
import typingsSlinky.electron.electronStrings.redirect
import typingsSlinky.electron.electronStrings.session
import typingsSlinky.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofElectron extends js.Object {
  var Accelerator: Instantiable0[typingsSlinky.electron.Electron.Accelerator]
  var BrowserView: TypeofBrowserView
  var BrowserWindow: TypeofBrowserWindow
  var BrowserWindowProxy: Instantiable0[typingsSlinky.electron.Electron.BrowserWindowProxy]
  var ClientRequest: Instantiable1[
    /* options */ method | url | session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typingsSlinky.electron.Electron.ClientRequest
  ]
  var Cookies: Instantiable0[typingsSlinky.electron.Electron.Cookies]
  var Debugger: Instantiable0[typingsSlinky.electron.Electron.Debugger]
  var DownloadItem: Instantiable0[typingsSlinky.electron.Electron.DownloadItem]
  // TODO: Replace this declaration with NodeJS.EventEmitter
  var EventEmitter: Instantiable0[typingsSlinky.electron.Electron.EventEmitter]
  var IncomingMessage: Instantiable0[typingsSlinky.electron.Electron.IncomingMessage]
  var Menu: TypeofMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typingsSlinky.electron.Electron.MenuItem]
  var NativeImage: TypeofNativeImage
  var Notification: TypeofNotification
  var Session: TypeofSession
  var TouchBar: TypeofTouchBar
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarButton
  ]
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarColorPicker
  ]
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarGroup
  ]
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarLabel
  ]
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarPopover
  ]
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarScrubber
  ]
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSegmentedControl
  ]
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSlider
  ]
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typingsSlinky.electron.Electron.TouchBarSpacer
  ]
  var Tray: Instantiable1[/* image */ NativeImage_ | String, typingsSlinky.electron.Electron.Tray]
  var WebContents: TypeofWebContents
  var WebRequest: Instantiable0[typingsSlinky.electron.Electron.WebRequest]
  val app: App
  val autoUpdater: AutoUpdater
  val clipboard: Clipboard
  val contentTracing: ContentTracing
  val contextBridge: ContextBridge
  val crashReporter: CrashReporter
  val desktopCapturer: DesktopCapturer
  val dialog: Dialog
  val globalShortcut: GlobalShortcut
  val inAppPurchase: InAppPurchase
  val ipcMain: IpcMain
  val ipcRenderer: IpcRenderer
  val net: Net
  val netLog: NetLog
  val powerMonitor: PowerMonitor
  val powerSaveBlocker: PowerSaveBlocker
  val protocol: Protocol
  val remote: Remote
  val screen: Screen
  val shell: Shell
  val systemPreferences: SystemPreferences
  val webFrame: WebFrame
  val webviewTag: WebviewTag
}

object TypeofElectron {
  @scala.inline
  def apply(
    Accelerator: Instantiable0[Accelerator],
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    ClientRequest: Instantiable1[
      /* options */ method | url | session | partition | protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    EventEmitter: Instantiable0[EventEmitter],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    NativeImage: TypeofNativeImage,
    Notification: TypeofNotification,
    Session: TypeofSession,
    TouchBar: TypeofTouchBar,
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable1[/* image */ NativeImage_ | String, Tray],
    WebContents: TypeofWebContents,
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
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    remote: Remote,
    screen: Screen,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): TypeofElectron = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], EventEmitter = EventEmitter.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], NativeImage = NativeImage.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofElectron]
  }
}

