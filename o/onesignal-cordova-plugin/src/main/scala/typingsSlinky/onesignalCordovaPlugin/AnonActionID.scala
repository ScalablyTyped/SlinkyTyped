package typingsSlinky.onesignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionID extends js.Object {
  var actionID: js.UndefOr[String] = js.native
  var `type`: OSActionType = js.native
}

object AnonActionID {
  @scala.inline
  def apply(`type`: OSActionType): AnonActionID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionID]
  }
  @scala.inline
  implicit class AnonActionIDOps[Self <: AnonActionID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: OSActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionID")(js.undefined)
        ret
    }
  }
  
}

