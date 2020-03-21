package typingsSlinky.chromeApps.chrome.runtime

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
  - typingsSlinky.chromeApps.chromeAppsStrings.browser
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typingsSlinky.chromeApps.chromeAppsStrings.alarms
  - typingsSlinky.chromeApps.chromeAppsStrings.contextMenus
  - typingsSlinky.chromeApps.chromeAppsStrings.audio
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.gcm
  - typingsSlinky.chromeApps.chromeAppsStrings.idle
  - typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork
  - typingsSlinky.chromeApps.chromeAppsStrings.platformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.background
  - typingsSlinky.chromeApps.chromeAppsStrings.dns
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.webview
  - typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage
  - typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.usbDevices
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay
  - typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typingsSlinky.chromeApps.chromeAppsStrings.serial
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig
  - typingsSlinky.chromeApps.chromeAppsStrings.videoCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.appview
  - typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging
  - typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite
  - typingsSlinky.chromeApps.chromeAppsStrings.printerProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboard
  - typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsSlinky.chromeApps.chromeAppsStrings.pointerLock
  - typingsSlinky.chromeApps.chromeAppsStrings.usb_
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typingsSlinky.chromeApps.chromeAppsStrings.storage
  - typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typingsSlinky.chromeApps.chromeAppsStrings.audioCapture
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage
  - typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typingsSlinky.chromeApps.chromeAppsStrings.power
  - typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard
  - typingsSlinky.chromeApps.chromeAppsStrings.socket
  - typingsSlinky.chromeApps.chromeAppsStrings.documentScan
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory
  - typingsSlinky.chromeApps.chromeAppsStrings.identity
  - typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.notifications
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystem
  - typingsSlinky.chromeApps.chromeAppsStrings.runtime
  - typingsSlinky.chromeApps.chromeAppsStrings.hid
*/
trait OptionalPermission extends js.Object

object OptionalPermission {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  def alarms: typingsSlinky.chromeApps.chromeAppsStrings.alarms = this.cast("alarms")
  @scala.inline
  def alwaysOnTopWindows: typingsSlinky.chromeApps.chromeAppsStrings.alwaysOnTopWindows = this.cast("alwaysOnTopWindows")
  @scala.inline
  def appDotwindowDotalwaysOnTop: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop = this.cast("app.window.alwaysOnTop")
  @scala.inline
  def appDotwindowDotfullscreen: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen = this.cast("app.window.fullscreen")
  @scala.inline
  def appDotwindowDotfullscreenDotoverrideEsc: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc = this.cast("app.window.fullscreen.overrideEsc")
  @scala.inline
  def appDotwindowDotshape: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotshape = this.cast("app.window.shape")
  @scala.inline
  def appview: typingsSlinky.chromeApps.chromeAppsStrings.appview = this.cast("appview")
  @scala.inline
  def audio: typingsSlinky.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  def audioCapture: typingsSlinky.chromeApps.chromeAppsStrings.audioCapture = this.cast("audioCapture")
  @scala.inline
  def background: typingsSlinky.chromeApps.chromeAppsStrings.background = this.cast("background")
  @scala.inline
  def browser: typingsSlinky.chromeApps.chromeAppsStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateProvider: typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider = this.cast("certificateProvider")
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def clipboard: typingsSlinky.chromeApps.chromeAppsStrings.clipboard = this.cast("clipboard")
  @scala.inline
  def clipboardRead: typingsSlinky.chromeApps.chromeAppsStrings.clipboardRead = this.cast("clipboardRead")
  @scala.inline
  def clipboardWrite: typingsSlinky.chromeApps.chromeAppsStrings.clipboardWrite = this.cast("clipboardWrite")
  @scala.inline
  def contextMenus: typingsSlinky.chromeApps.chromeAppsStrings.contextMenus = this.cast("contextMenus")
  @scala.inline
  def desktopCapture: typingsSlinky.chromeApps.chromeAppsStrings.desktopCapture = this.cast("desktopCapture")
  @scala.inline
  def dns: typingsSlinky.chromeApps.chromeAppsStrings.dns = this.cast("dns")
  @scala.inline
  def documentScan: typingsSlinky.chromeApps.chromeAppsStrings.documentScan = this.cast("documentScan")
  @scala.inline
  def enterpriseDotdeviceAttributes: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = this.cast("enterprise.deviceAttributes")
  @scala.inline
  def enterpriseDotplatformKeys: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = this.cast("enterprise.platformKeys")
  @scala.inline
  def fileBrowserHandler: typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler = this.cast("fileBrowserHandler")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def fileSystem: typingsSlinky.chromeApps.chromeAppsStrings.fileSystem = this.cast("fileSystem")
  @scala.inline
  def fileSystemProvider: typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider = this.cast("fileSystemProvider")
  @scala.inline
  def gcm: typingsSlinky.chromeApps.chromeAppsStrings.gcm = this.cast("gcm")
  @scala.inline
  def hid: typingsSlinky.chromeApps.chromeAppsStrings.hid = this.cast("hid")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
  @scala.inline
  def identity: typingsSlinky.chromeApps.chromeAppsStrings.identity = this.cast("identity")
  @scala.inline
  def idle: typingsSlinky.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def mediaGalleries: typingsSlinky.chromeApps.chromeAppsStrings.mediaGalleries = this.cast("mediaGalleries")
  @scala.inline
  def nativeMessaging: typingsSlinky.chromeApps.chromeAppsStrings.nativeMessaging = this.cast("nativeMessaging")
  @scala.inline
  def networkingDotconfig: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig = this.cast("networking.config")
  @scala.inline
  def networkingDotonc: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def notifications: typingsSlinky.chromeApps.chromeAppsStrings.notifications = this.cast("notifications")
  @scala.inline
  def platformKeys: typingsSlinky.chromeApps.chromeAppsStrings.platformKeys = this.cast("platformKeys")
  @scala.inline
  def pointerLock: typingsSlinky.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
  @scala.inline
  def power: typingsSlinky.chromeApps.chromeAppsStrings.power = this.cast("power")
  @scala.inline
  def printerProvider: typingsSlinky.chromeApps.chromeAppsStrings.printerProvider = this.cast("printerProvider")
  @scala.inline
  def runtime: typingsSlinky.chromeApps.chromeAppsStrings.runtime = this.cast("runtime")
  @scala.inline
  def serial: typingsSlinky.chromeApps.chromeAppsStrings.serial = this.cast("serial")
  @scala.inline
  def socket: typingsSlinky.chromeApps.chromeAppsStrings.socket = this.cast("socket")
  @scala.inline
  def storage: typingsSlinky.chromeApps.chromeAppsStrings.storage = this.cast("storage")
  @scala.inline
  def syncFileSystem: typingsSlinky.chromeApps.chromeAppsStrings.syncFileSystem = this.cast("syncFileSystem")
  @scala.inline
  def systemDotcpu: typingsSlinky.chromeApps.chromeAppsStrings.systemDotcpu = this.cast("system.cpu")
  @scala.inline
  def systemDotdisplay: typingsSlinky.chromeApps.chromeAppsStrings.systemDotdisplay = this.cast("system.display")
  @scala.inline
  def systemDotmemory: typingsSlinky.chromeApps.chromeAppsStrings.systemDotmemory = this.cast("system.memory")
  @scala.inline
  def systemDotnetwork: typingsSlinky.chromeApps.chromeAppsStrings.systemDotnetwork = this.cast("system.network")
  @scala.inline
  def systemDotpowerSource: typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def systemDotstorage: typingsSlinky.chromeApps.chromeAppsStrings.systemDotstorage = this.cast("system.storage")
  @scala.inline
  def unlimitedStorage: typingsSlinky.chromeApps.chromeAppsStrings.unlimitedStorage = this.cast("unlimitedStorage")
  @scala.inline
  def usb: usb_ = this.cast("usb")
  @scala.inline
  def usbDevices: typingsSlinky.chromeApps.chromeAppsStrings.usbDevices = this.cast("usbDevices")
  @scala.inline
  def videoCapture: typingsSlinky.chromeApps.chromeAppsStrings.videoCapture = this.cast("videoCapture")
  @scala.inline
  def virtualKeyboard: typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
  @scala.inline
  def vpnProvider: typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider = this.cast("vpnProvider")
  @scala.inline
  def webview: typingsSlinky.chromeApps.chromeAppsStrings.webview = this.cast("webview")
}

