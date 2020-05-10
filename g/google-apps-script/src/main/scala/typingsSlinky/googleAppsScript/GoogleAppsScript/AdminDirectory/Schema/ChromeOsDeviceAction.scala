package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var deprovisionReason: js.UndefOr[String] = js.native
}

object ChromeOsDeviceAction {
  @scala.inline
  def apply(): ChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceAction]
  }
  @scala.inline
  implicit class ChromeOsDeviceActionOps[Self <: ChromeOsDeviceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprovisionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprovisionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprovisionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprovisionReason")(js.undefined)
        ret
    }
  }
  
}

