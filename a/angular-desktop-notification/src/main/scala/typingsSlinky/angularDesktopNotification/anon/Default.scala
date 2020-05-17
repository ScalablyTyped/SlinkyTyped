package typingsSlinky.angularDesktopNotification.anon

import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  var default: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default = js.native
  var denied: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied = js.native
  var granted: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted = js.native
}

object Default {
  @scala.inline
  def apply(default: default, denied: denied, granted: granted): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDenied(value: denied): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGranted(value: granted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

