package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.contentSettings.CameraContentSetting
import typingsSlinky.chrome.chrome.contentSettings.CookieContentSetting
import typingsSlinky.chrome.chrome.contentSettings.FullscreenContentSetting
import typingsSlinky.chrome.chrome.contentSettings.ImagesContentSetting
import typingsSlinky.chrome.chrome.contentSettings.JavascriptContentSetting
import typingsSlinky.chrome.chrome.contentSettings.LocationContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MicrophoneContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MouselockContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MultipleAutomaticDownloadsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.NotificationsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PluginsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PopupsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PpapiBrokerContentSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Content Settings
////////////////////
/**
  * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
  * Availability: Since Chrome 16.
  * Permissions:  "contentSettings"
  */
@JSGlobal("chrome.contentSettings")
@js.native
object contentSettings extends js.Object {
  
  var automaticDownloads: MultipleAutomaticDownloadsContentSetting = js.native
  
  var camera: CameraContentSetting = js.native
  
  var cookies: CookieContentSetting = js.native
  
  var fullscreen: FullscreenContentSetting = js.native
  
  var images: ImagesContentSetting = js.native
  
  var javascript: JavascriptContentSetting = js.native
  
  var location: LocationContentSetting = js.native
  
  var microphone: MicrophoneContentSetting = js.native
  
  var mouselock: MouselockContentSetting = js.native
  
  var notifications: NotificationsContentSetting = js.native
  
  var plugins: PluginsContentSetting = js.native
  
  var popups: PopupsContentSetting = js.native
  
  var unsandboxedPlugins: PpapiBrokerContentSetting = js.native
}
