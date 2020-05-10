package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginStrings.ActionTaken
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginStrings.Opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSNotificationAction extends js.Object {
  var actionID: String = js.native
  var `type`: Opened | ActionTaken = js.native
}

object OSNotificationAction {
  @scala.inline
  def apply(actionID: String, `type`: Opened | ActionTaken): OSNotificationAction = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationAction]
  }
  @scala.inline
  implicit class OSNotificationActionOps[Self <: OSNotificationAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Opened | ActionTaken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

