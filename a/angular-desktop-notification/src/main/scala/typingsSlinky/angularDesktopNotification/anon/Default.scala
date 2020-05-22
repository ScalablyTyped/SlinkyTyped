package typingsSlinky.angularDesktopNotification.anon

import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default
  var denied: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied
  var granted: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted
}

object Default {
  @scala.inline
  def apply(default: default, denied: denied, granted: granted): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

