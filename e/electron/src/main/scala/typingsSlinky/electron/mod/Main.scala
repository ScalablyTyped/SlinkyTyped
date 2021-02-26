package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.App
import typingsSlinky.electron.Electron.AutoUpdater
import typingsSlinky.electron.Electron.ContentTracing
import typingsSlinky.electron.Electron.Dialog
import typingsSlinky.electron.Electron.GlobalShortcut
import typingsSlinky.electron.Electron.InAppPurchase
import typingsSlinky.electron.Electron.IpcMain
import typingsSlinky.electron.Electron.NativeTheme
import typingsSlinky.electron.Electron.Net
import typingsSlinky.electron.Electron.NetLog
import typingsSlinky.electron.Electron.PowerMonitor
import typingsSlinky.electron.Electron.PowerSaveBlocker
import typingsSlinky.electron.Electron.Protocol
import typingsSlinky.electron.Electron.Screen
import typingsSlinky.electron.Electron.SystemPreferences
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Main {
  
  @JSImport("electron", "Main.BrowserView")
  @js.native
  class BrowserView ()
    extends typingsSlinky.electron.Electron.BrowserView
  
  @JSImport("electron", "Main.BrowserWindow")
  @js.native
  class BrowserWindow ()
    extends typingsSlinky.electron.Electron.BrowserWindow
  
  @JSImport("electron", "Main.ClientRequest")
  @js.native
  class ClientRequest ()
    extends typingsSlinky.electron.Electron.ClientRequest
  
  @JSImport("electron", "Main.CommandLine")
  @js.native
  class CommandLine ()
    extends typingsSlinky.electron.Electron.CommandLine
  
  @JSImport("electron", "Main.Cookies")
  @js.native
  class Cookies ()
    extends typingsSlinky.electron.Electron.Cookies
  
  @JSImport("electron", "Main.Debugger")
  @js.native
  class Debugger ()
    extends typingsSlinky.electron.Electron.Debugger
  
  @JSImport("electron", "Main.Dock")
  @js.native
  class Dock ()
    extends typingsSlinky.electron.Electron.Dock
  
  @JSImport("electron", "Main.DownloadItem")
  @js.native
  class DownloadItem ()
    extends typingsSlinky.electron.Electron.DownloadItem
  
  @JSImport("electron", "Main.IncomingMessage")
  @js.native
  class IncomingMessage ()
    extends typingsSlinky.electron.Electron.IncomingMessage
  
  @JSImport("electron", "Main.Menu")
  @js.native
  class Menu ()
    extends typingsSlinky.electron.Electron.Menu
  
  @JSImport("electron", "Main.MenuItem")
  @js.native
  class MenuItem ()
    extends typingsSlinky.electron.Electron.MenuItem
  
  @JSImport("electron", "Main.MessageChannelMain")
  @js.native
  class MessageChannelMain ()
    extends typingsSlinky.electron.Electron.MessageChannelMain
  
  @JSImport("electron", "Main.MessagePortMain")
  @js.native
  class MessagePortMain ()
    extends typingsSlinky.electron.Electron.MessagePortMain
  
  @JSImport("electron", "Main.Notification")
  @js.native
  class Notification ()
    extends typingsSlinky.electron.Electron.Notification
  
  @JSImport("electron", "Main.ServiceWorkers")
  @js.native
  class ServiceWorkers ()
    extends typingsSlinky.electron.Electron.ServiceWorkers
  
  @JSImport("electron", "Main.Session")
  @js.native
  class Session_ ()
    extends typingsSlinky.electron.Electron.Session_
  
  @JSImport("electron", "Main.TouchBar")
  @js.native
  class TouchBar ()
    extends typingsSlinky.electron.Electron.TouchBar
  
  @JSImport("electron", "Main.TouchBarButton")
  @js.native
  class TouchBarButton ()
    extends typingsSlinky.electron.Electron.TouchBarButton
  
  @JSImport("electron", "Main.TouchBarColorPicker")
  @js.native
  class TouchBarColorPicker ()
    extends typingsSlinky.electron.Electron.TouchBarColorPicker
  
  @JSImport("electron", "Main.TouchBarGroup")
  @js.native
  class TouchBarGroup () extends EventEmitter
  
  @JSImport("electron", "Main.TouchBarLabel")
  @js.native
  class TouchBarLabel ()
    extends typingsSlinky.electron.Electron.TouchBarLabel
  
  @JSImport("electron", "Main.TouchBarOtherItemsProxy")
  @js.native
  class TouchBarOtherItemsProxy () extends EventEmitter
  
  @JSImport("electron", "Main.TouchBarPopover")
  @js.native
  class TouchBarPopover ()
    extends typingsSlinky.electron.Electron.TouchBarPopover
  
  @JSImport("electron", "Main.TouchBarScrubber")
  @js.native
  class TouchBarScrubber ()
    extends typingsSlinky.electron.Electron.TouchBarScrubber
  
  @JSImport("electron", "Main.TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControl ()
    extends typingsSlinky.electron.Electron.TouchBarSegmentedControl
  
  @JSImport("electron", "Main.TouchBarSlider")
  @js.native
  class TouchBarSlider ()
    extends typingsSlinky.electron.Electron.TouchBarSlider
  
  @JSImport("electron", "Main.TouchBarSpacer")
  @js.native
  class TouchBarSpacer ()
    extends typingsSlinky.electron.Electron.TouchBarSpacer
  
  @JSImport("electron", "Main.Tray")
  @js.native
  class Tray ()
    extends typingsSlinky.electron.Electron.Tray
  
  @JSImport("electron", "Main.WebContents")
  @js.native
  class WebContents_ ()
    extends typingsSlinky.electron.Electron.WebContents_
  
  @JSImport("electron", "Main.WebRequest")
  @js.native
  class WebRequest ()
    extends typingsSlinky.electron.Electron.WebRequest
  
  @JSImport("electron", "Main.app")
  @js.native
  val app: App = js.native
  
  @JSImport("electron", "Main.autoUpdater")
  @js.native
  val autoUpdater: AutoUpdater = js.native
  
  @JSImport("electron", "Main.contentTracing")
  @js.native
  val contentTracing: ContentTracing = js.native
  
  @JSImport("electron", "Main.dialog")
  @js.native
  val dialog: Dialog = js.native
  
  @JSImport("electron", "Main.globalShortcut")
  @js.native
  val globalShortcut: GlobalShortcut = js.native
  
  @JSImport("electron", "Main.inAppPurchase")
  @js.native
  val inAppPurchase: InAppPurchase = js.native
  
  @JSImport("electron", "Main.ipcMain")
  @js.native
  val ipcMain: IpcMain = js.native
  
  @JSImport("electron", "Main.nativeTheme")
  @js.native
  val nativeTheme: NativeTheme = js.native
  
  @JSImport("electron", "Main.net")
  @js.native
  val net: Net = js.native
  
  @JSImport("electron", "Main.netLog")
  @js.native
  val netLog: NetLog = js.native
  
  @JSImport("electron", "Main.powerMonitor")
  @js.native
  val powerMonitor: PowerMonitor = js.native
  
  @JSImport("electron", "Main.powerSaveBlocker")
  @js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  
  @JSImport("electron", "Main.protocol")
  @js.native
  val protocol: Protocol = js.native
  
  @JSImport("electron", "Main.screen")
  @js.native
  val screen: Screen = js.native
  
  /* was `typeof Session` */
  @JSImport("electron", "Main.session")
  @js.native
  class session ()
    extends typingsSlinky.electron.Electron.Session_
  
  @JSImport("electron", "Main.systemPreferences")
  @js.native
  val systemPreferences: SystemPreferences = js.native
  
  /* was `typeof WebContents` */
  @JSImport("electron", "Main.webContents")
  @js.native
  class webContents ()
    extends typingsSlinky.electron.Electron.WebContents_
}
