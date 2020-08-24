package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.background_
import typingsSlinky.chromeApps.chromeAppsStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional permissions
  * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
  */
/* Inlined std.Exclude<chrome-apps.chrome.runtime.Permission, chrome-apps.chrome.runtime.NotAllowedAsOptionalPermissions> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.pointerLock
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite
  - typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork
  - typingsSlinky.chromeApps.chromeAppsStrings.background_
  - typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typingsSlinky.chromeApps.chromeAppsStrings.webview
  - typingsSlinky.chromeApps.chromeAppsStrings.hid
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay
  - typingsSlinky.chromeApps.chromeAppsStrings.browser
  - typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries
  - typingsSlinky.chromeApps.chromeAppsStrings.alarms
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory
  - typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsSlinky.chromeApps.chromeAppsStrings.idle
  - typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.documentScan
  - typingsSlinky.chromeApps.chromeAppsStrings.power
  - typingsSlinky.chromeApps.chromeAppsStrings.dns
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage
  - typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsSlinky.chromeApps.chromeAppsStrings.notifications
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.usbDevices
  - typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typingsSlinky.chromeApps.chromeAppsStrings.audioCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.videoCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.socket
  - typingsSlinky.chromeApps.chromeAppsStrings.gcm
  - typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsSlinky.chromeApps.chromeAppsStrings.usb_
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard
  - typingsSlinky.chromeApps.chromeAppsStrings.runtime
  - typingsSlinky.chromeApps.chromeAppsStrings.audio_
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboard
  - typingsSlinky.chromeApps.chromeAppsStrings.platformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.contextMenus
  - typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
  - typingsSlinky.chromeApps.chromeAppsStrings.storage
  - typingsSlinky.chromeApps.chromeAppsStrings.printerProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.appview
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu
  - typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.serial
  - typingsSlinky.chromeApps.chromeAppsStrings.identity
*/
trait OptionalPermission extends js.Object

object OptionalPermission {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign]
  @scala.inline
  def alarms: typingsSlinky.chromeApps.chromeAppsStrings.alarms = "alarms".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.alarms]
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
  def appview: typingsSlinky.chromeApps.chromeAppsStrings.appview = "appview".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.appview]
  @scala.inline
  def audio: audio_ = "audio".asInstanceOf[audio_]
  @scala.inline
  def audioCapture: typingsSlinky.chromeApps.chromeAppsStrings.audioCapture = "audioCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.audioCapture]
  @scala.inline
  def background: background_ = "background".asInstanceOf[background_]
  @scala.inline
  def browser: typingsSlinky.chromeApps.chromeAppsStrings.browser = "browser".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.browser]
  @scala.inline
  def certificateProvider: typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider = "certificateProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider]
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = "chrome://favicon/".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash]
  @scala.inline
  def clipboard: typingsSlinky.chromeApps.chromeAppsStrings.clipboard = "clipboard".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboard]
  @scala.inline
  def clipboardRead: typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead = "clipboardRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead]
  @scala.inline
  def clipboardWrite: typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite = "clipboardWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite]
  @scala.inline
  def contextMenus: typingsSlinky.chromeApps.chromeAppsStrings.contextMenus = "contextMenus".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.contextMenus]
  @scala.inline
  def desktopCapture: typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture = "desktopCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture]
  @scala.inline
  def dns: typingsSlinky.chromeApps.chromeAppsStrings.dns = "dns".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.dns]
  @scala.inline
  def documentScan: typingsSlinky.chromeApps.chromeAppsStrings.documentScan = "documentScan".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.documentScan]
  @scala.inline
  def enterpriseDotdeviceAttributes: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes]
  @scala.inline
  def enterpriseDotplatformKeys: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys]
  @scala.inline
  def fileBrowserHandler: typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler = "fileBrowserHandler".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler]
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = "file:///*/*".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk]
  @scala.inline
  def fileSystem: typingsSlinky.chromeApps.chromeAppsStrings.fileSystem = "fileSystem".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileSystem]
  @scala.inline
  def fileSystemProvider: typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider = "fileSystemProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider]
  @scala.inline
  def gcm: typingsSlinky.chromeApps.chromeAppsStrings.gcm = "gcm".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.gcm]
  @scala.inline
  def hid: typingsSlinky.chromeApps.chromeAppsStrings.hid = "hid".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.hid]
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = "http://*/*".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk]
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = "https://*/*".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk]
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = "https://www.google-analytics.com/*".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`]
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = "https://www.googleapis.com/*".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk]
  @scala.inline
  def identity: typingsSlinky.chromeApps.chromeAppsStrings.identity = "identity".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.identity]
  @scala.inline
  def idle: typingsSlinky.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.idle]
  @scala.inline
  def mediaGalleries: typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries = "mediaGalleries".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries]
  @scala.inline
  def nativeMessaging: typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging = "nativeMessaging".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging]
  @scala.inline
  def networkingDotconfig: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig = "networking.config".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig]
  @scala.inline
  def networkingDotonc: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc = "networking.onc".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc]
  @scala.inline
  def notifications: typingsSlinky.chromeApps.chromeAppsStrings.notifications = "notifications".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.notifications]
  @scala.inline
  def platformKeys: typingsSlinky.chromeApps.chromeAppsStrings.platformKeys = "platformKeys".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.platformKeys]
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
  def socket: typingsSlinky.chromeApps.chromeAppsStrings.socket = "socket".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.socket]
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
  def systemDotpowerSource: typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource = "system.powerSource".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource]
  @scala.inline
  def systemDotstorage: typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage = "system.storage".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage]
  @scala.inline
  def unlimitedStorage: typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage = "unlimitedStorage".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage]
  @scala.inline
  def usb: usb_ = "usb".asInstanceOf[usb_]
  @scala.inline
  def usbDevices: typingsSlinky.chromeApps.chromeAppsStrings.usbDevices = "usbDevices".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.usbDevices]
  @scala.inline
  def videoCapture: typingsSlinky.chromeApps.chromeAppsStrings.videoCapture = "videoCapture".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.videoCapture]
  @scala.inline
  def virtualKeyboard: typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard = "virtualKeyboard".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard]
  @scala.inline
  def vpnProvider: typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider = "vpnProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider]
  @scala.inline
  def webview: typingsSlinky.chromeApps.chromeAppsStrings.webview = "webview".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.webview]
}

