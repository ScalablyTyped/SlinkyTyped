package typingsSlinky.chromeApps.chrome.contextMenus

import typingsSlinky.chromeApps.chromeAppsStrings.all__
import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.browser_action_
import typingsSlinky.chromeApps.chromeAppsStrings.editable_
import typingsSlinky.chromeApps.chromeAppsStrings.frame_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.launcher_
import typingsSlinky.chromeApps.chromeAppsStrings.link_
import typingsSlinky.chromeApps.chromeAppsStrings.page_
import typingsSlinky.chromeApps.chromeAppsStrings.page_action_
import typingsSlinky.chromeApps.chromeAppsStrings.selection_
import typingsSlinky.chromeApps.chromeAppsStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
  * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
  * Different platforms might put limitations on what is actually supported in a launcher context menu.
  **/
@JSGlobal("chrome.contextMenus.ContextType")
@js.native
object ContextType extends js.Object {
  var ALL: all__ = js.native
  var AUDIO: audio_ = js.native
  var BROWSER_ACTION: browser_action_ = js.native
  var EDITABLE: editable_ = js.native
  var FRAME: frame_ = js.native
  var IMAGE: image_ = js.native
  var LAUNCHER: launcher_ = js.native
  var LINK: link_ = js.native
  var PAGE: page_ = js.native
  var PAGE_ACTION: page_action_ = js.native
  var SELECTION: selection_ = js.native
  var VIDEO: video_ = js.native
}

