package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// | 'chrome://extension-icon/'; // Doesn't need permission yet?
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.clipboard
  - typingsSlinky.chromeApps.chromeAppsStrings.dns
  - typingsSlinky.chromeApps.chromeAppsStrings.documentScan
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig
  - typingsSlinky.chromeApps.chromeAppsStrings.platformKeys
  - typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider
  - typingsSlinky.chromeApps.chromeAppsStrings.wallpaper
  - typingsSlinky.chromeApps.chrome.runtime.FileSystemPermission
*/
trait ChromeOSOnlyPermissions extends Permission

object ChromeOSOnlyPermissions {
  @scala.inline
  def certificateProvider: typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider = "certificateProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.certificateProvider]
  @scala.inline
  def clipboard: typingsSlinky.chromeApps.chromeAppsStrings.clipboard = "clipboard".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.clipboard]
  @scala.inline
  def dns: typingsSlinky.chromeApps.chromeAppsStrings.dns = "dns".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.dns]
  @scala.inline
  def documentScan: typingsSlinky.chromeApps.chromeAppsStrings.documentScan = "documentScan".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.documentScan]
  @scala.inline
  def enterpriseDotplatformKeys: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys]
  @scala.inline
  def enterpriseDotdeviceAttributes: typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes]
  @scala.inline
  def fileBrowserHandler: typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler = "fileBrowserHandler".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileBrowserHandler]
  @scala.inline
  def fileSystemProvider: typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider = "fileSystemProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.fileSystemProvider]
  @scala.inline
  def networkingDotconfig: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig = "networking.config".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.networkingDotconfig]
  @scala.inline
  def platformKeys: typingsSlinky.chromeApps.chromeAppsStrings.platformKeys = "platformKeys".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.platformKeys]
  @scala.inline
  def vpnProvider: typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider = "vpnProvider".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.vpnProvider]
  @scala.inline
  def wallpaper: typingsSlinky.chromeApps.chromeAppsStrings.wallpaper = "wallpaper".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.wallpaper]
  @scala.inline
  implicit def apply(value: FileSystemPermission): ChromeOSOnlyPermissions = value.asInstanceOf[ChromeOSOnlyPermissions]
}

