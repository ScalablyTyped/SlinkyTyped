package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.alarms
  - typingsSlinky.chromeApps.chromeAppsStrings.appview
  - typingsSlinky.chromeApps.chromeAppsStrings.audio_
  - typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typingsSlinky.chromeApps.chromeAppsStrings.audioCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.background_
  - typingsSlinky.chromeApps.chromeAppsStrings.browser
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite
  - typingsSlinky.chromeApps.chromeAppsStrings.contextMenus
  - typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.experimental
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.gcm
  - typingsSlinky.chromeApps.chromeAppsStrings.geolocation
  - typingsSlinky.chromeApps.chromeAppsStrings.hid
  - typingsSlinky.chromeApps.chromeAppsStrings.identity
  - typingsSlinky.chromeApps.chromeAppsStrings.idle
  - typingsSlinky.chromeApps.chromeAppsStrings.mdns
  - typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries
  - typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging
  - typingsSlinky.chromeApps.chromeAppsStrings.notifications
  - typingsSlinky.chromeApps.chromeAppsStrings.pointerLock
  - typingsSlinky.chromeApps.chromeAppsStrings.power
  - typingsSlinky.chromeApps.chromeAppsStrings.printerProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.runtime
  - typingsSlinky.chromeApps.chromeAppsStrings.serial
  - typingsSlinky.chromeApps.chromeAppsStrings.storage
  - typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage
  - typingsSlinky.chromeApps.chromeAppsStrings.tts
  - typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage
  - typingsSlinky.chromeApps.chromeAppsStrings.usb_
  - typingsSlinky.chromeApps.chromeAppsStrings.usbDevices
  - typingsSlinky.chromeApps.chromeAppsStrings.videoCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.webview
  - typingsSlinky.chromeApps.chrome.runtime.ChromeOSOnlyPermissions
  - typingsSlinky.chromeApps.chrome.runtime.KioskOnlyPermissions
  - typingsSlinky.chromeApps.chrome.runtime.MediaGalleriesPermission
  - typingsSlinky.chromeApps.chrome.runtime.SocketPermission
  - / **
  * Specifies a **host permission**.
  * Required if the app wants to interact with the code running on pages.
  * Many capabilities, such as cross-origin XMLHttpRequests,
  * programmatically injected content scripts require host permissions.
  * For details on the syntax:
  * @see[Match Patterns]{@link https://developer.chrome.com/apps/match_patterns}
  * A path is allowed but treated as / *
  * /
typingsSlinky.chromeApps.chrome.runtime.UrlMatches
  - typingsSlinky.chromeApps.chrome.runtime.USBDevicesPermission
*/
trait Permission extends js.Object

object Permission {
  @scala.inline
  def alarms: typingsSlinky.chromeApps.chromeAppsStrings.alarms = "alarms".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.alarms]
  @scala.inline
  def appview: typingsSlinky.chromeApps.chromeAppsStrings.appview = "appview".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appview]
  @scala.inline
  def audio_ : typingsSlinky.chromeApps.chromeAppsStrings.audio_ = "audio".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.audio_]
  @scala.inline
  def alwaysOnTopWindows: typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows = "alwaysOnTopWindows".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows]
  @scala.inline
  def appDotwindowDotalwaysOnTop: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop = "app.window.alwaysOnTop".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop]
  @scala.inline
  def appDotwindowDotfullscreen: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen = "app.window.fullscreen".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen]
  @scala.inline
  def appDotwindowDotfullscreenDotoverrideEsc: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc = "app.window.fullscreen.overrideEsc".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc]
  @scala.inline
  def appDotwindowDotshape: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape = "app.window.shape".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape]
  @scala.inline
  def audioCapture: typingsSlinky.chromeApps.chromeAppsStrings.audioCapture = "audioCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.audioCapture]
  @scala.inline
  def background_ : typingsSlinky.chromeApps.chromeAppsStrings.background_ = "background".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.background_]
  @scala.inline
  def browser: typingsSlinky.chromeApps.chromeAppsStrings.browser = "browser".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.browser]
  @scala.inline
  def clipboardRead: typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead = "clipboardRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead]
  @scala.inline
  def clipboardWrite: typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite = "clipboardWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite]
  @scala.inline
  def contextMenus: typingsSlinky.chromeApps.chromeAppsStrings.contextMenus = "contextMenus".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.contextMenus]
  @scala.inline
  def desktopCapture: typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture = "desktopCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture]
  @scala.inline
  def experimental: typingsSlinky.chromeApps.chromeAppsStrings.experimental = "experimental".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.experimental]
  @scala.inline
  def fileSystem: typingsSlinky.chromeApps.chromeAppsStrings.fileSystem = "fileSystem".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileSystem]
  @scala.inline
  def gcm: typingsSlinky.chromeApps.chromeAppsStrings.gcm = "gcm".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.gcm]
  @scala.inline
  def geolocation: typingsSlinky.chromeApps.chromeAppsStrings.geolocation = "geolocation".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.geolocation]
  @scala.inline
  def hid: typingsSlinky.chromeApps.chromeAppsStrings.hid = "hid".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.hid]
  @scala.inline
  def identity: typingsSlinky.chromeApps.chromeAppsStrings.identity = "identity".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.identity]
  @scala.inline
  def idle: typingsSlinky.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.idle]
  @scala.inline
  def mdns: typingsSlinky.chromeApps.chromeAppsStrings.mdns = "mdns".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.mdns]
  @scala.inline
  def mediaGalleries: typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries = "mediaGalleries".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries]
  @scala.inline
  def nativeMessaging: typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging = "nativeMessaging".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging]
  @scala.inline
  def notifications: typingsSlinky.chromeApps.chromeAppsStrings.notifications = "notifications".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.notifications]
  @scala.inline
  def pointerLock: typingsSlinky.chromeApps.chromeAppsStrings.pointerLock = "pointerLock".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.pointerLock]
  @scala.inline
  def power: typingsSlinky.chromeApps.chromeAppsStrings.power = "power".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.power]
  @scala.inline
  def printerProvider: typingsSlinky.chromeApps.chromeAppsStrings.printerProvider = "printerProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.printerProvider]
  @scala.inline
  def runtime: typingsSlinky.chromeApps.chromeAppsStrings.runtime = "runtime".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.runtime]
  @scala.inline
  def serial: typingsSlinky.chromeApps.chromeAppsStrings.serial = "serial".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.serial]
  @scala.inline
  def storage: typingsSlinky.chromeApps.chromeAppsStrings.storage = "storage".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.storage]
  @scala.inline
  def syncFileSystem: typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem = "syncFileSystem".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem]
  @scala.inline
  def systemDotcpu: typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu = "system.cpu".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu]
  @scala.inline
  def systemDotdisplay: typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay = "system.display".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay]
  @scala.inline
  def systemDotmemory: typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory = "system.memory".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory]
  @scala.inline
  def systemDotnetwork: typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork = "system.network".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork]
  @scala.inline
  def systemDotstorage: typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage = "system.storage".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage]
  @scala.inline
  def tts: typingsSlinky.chromeApps.chromeAppsStrings.tts = "tts".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.tts]
  @scala.inline
  def unlimitedStorage: typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage = "unlimitedStorage".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage]
  @scala.inline
  def usb_ : typingsSlinky.chromeApps.chromeAppsStrings.usb_ = "usb".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.usb_]
  @scala.inline
  def usbDevices: typingsSlinky.chromeApps.chromeAppsStrings.usbDevices = "usbDevices".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.usbDevices]
  @scala.inline
  def videoCapture: typingsSlinky.chromeApps.chromeAppsStrings.videoCapture = "videoCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.videoCapture]
  @scala.inline
  def webview: typingsSlinky.chromeApps.chromeAppsStrings.webview = "webview".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.webview]
  @scala.inline
  implicit def apply(value: ChromeOSOnlyPermissions): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: KioskOnlyPermissions): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: MediaGalleriesPermission): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: SocketPermission): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: USBDevicesPermission): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(
    value: /**
    * Specifies a **host permission**.
    * Required if the app wants to interact with the code running on pages.
    * Many capabilities, such as cross-origin XMLHttpRequests,
    * programmatically injected content scripts require host permissions.
    * For details on the syntax:
    * @see[Match Patterns]{@link https://developer.chrome.com/apps/match_patterns}
    * A path is allowed but treated as / *
    */
  UrlMatches
  ): Permission = value.asInstanceOf[Permission]
}

