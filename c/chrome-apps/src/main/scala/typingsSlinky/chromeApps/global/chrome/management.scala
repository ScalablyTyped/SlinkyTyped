package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.management.ExtensionInfo
import typingsSlinky.chromeApps.chrome.management.UninstallOptions
import typingsSlinky.chromeApps.chromeAppsStrings.admin_
import typingsSlinky.chromeApps.chromeAppsStrings.development_
import typingsSlinky.chromeApps.chromeAppsStrings.extension
import typingsSlinky.chromeApps.chromeAppsStrings.hosted_app
import typingsSlinky.chromeApps.chromeAppsStrings.legacy_packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import typingsSlinky.chromeApps.chromeAppsStrings.packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.permissions_increase_
import typingsSlinky.chromeApps.chromeAppsStrings.sideload_
import typingsSlinky.chromeApps.chromeAppsStrings.theme
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.management
////////////////
// Management //
////////////////
/**
  * The chrome.management API provides ways to
  * manage the list of apps
  * that are installed and running.
  */
@JSGlobal("chrome.management")
@js.native
object management extends js.Object {
  
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  def getSelf(): Unit = js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  def uninstallSelf(): Unit = js.native
  def uninstallSelf(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: UninstallOptions): Unit = js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @js.native
  object ExtensionDisabledReason extends js.Object {
    
    var PERMISSIONS_INCREASE: permissions_increase_ = js.native
    
    var UNKNOWN: unknown__ = js.native
  }
  
  @js.native
  object ExtensionInstallType extends js.Object {
    
    var ADMIN: admin_ = js.native
    
    var DEVELOPMENT: development_ = js.native
    
    var NORMAL: normal_ = js.native
    
    var OTHER: other_ = js.native
    
    var SIDELOAD: sideload_ = js.native
  }
  
  @js.native
  object ExtensionType extends js.Object {
    
    var EXTENSION: extension = js.native
    
    var HOSTED_APP: hosted_app = js.native
    
    var LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
    
    var PACKAGED_APP: packaged_app = js.native
    
    var THEME: theme = js.native
  }
  
  @js.native
  object LaunchType extends js.Object {
    
    var OPEN_AS_PINNED_TAB: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
    
    var OPEN_AS_REGULAR_TAB: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
    
    var OPEN_AS_WINDOW: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
    
    var OPEN_FULL_SCREEN: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
  }
}
