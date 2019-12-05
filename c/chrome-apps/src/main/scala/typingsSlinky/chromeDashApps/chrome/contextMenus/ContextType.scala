package typingsSlinky.chromeDashApps.chrome.contextMenus

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.all_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.browser_action
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.editable
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.frame
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.image
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.launcher
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.link
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.page
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.page_action
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.selection
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.video
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
  var ALL: all_ = js.native
  var AUDIO: typingsSlinky.chromeDashApps.chromeDashAppsStrings.audio = js.native
  var BROWSER_ACTION: browser_action = js.native
  var EDITABLE: editable = js.native
  var FRAME: frame = js.native
  var IMAGE: image = js.native
  var LAUNCHER: launcher = js.native
  var LINK: link = js.native
  var PAGE: page = js.native
  var PAGE_ACTION: page_action = js.native
  var SELECTION: selection = js.native
  var VIDEO: video = js.native
}

