package typingsSlinky.chromeApps.chrome.notifications

import typingsSlinky.chromeApps.chromeAppsStrings.basic_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.list_
import typingsSlinky.chromeApps.chromeAppsStrings.progress_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @prop BASIC - icon, title, message, expandedMessage, up to two buttons.
  * @prop IMAGE - icon, title, message, expandedMessage, image, up to two buttons.
  * @prop LIST - icon, title, message, items, up to two buttons. Users on Mac OS X only see the first item.
  * @prop PROGRESS - icon, title, message, progress, up to two buttons.
  */
@JSGlobal("chrome.notifications.TemplateType")
@js.native
object TemplateType extends js.Object {
  var BASIC: basic_ = js.native
  var IMAGE: image_ = js.native
  var LIST: list_ = js.native
  var PROGRESS: progress_ = js.native
}

