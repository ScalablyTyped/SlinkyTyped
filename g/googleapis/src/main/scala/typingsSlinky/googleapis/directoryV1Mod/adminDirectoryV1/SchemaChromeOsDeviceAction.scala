package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing actions on ChromeOs Device in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsDeviceAction extends js.Object {
  /**
    * Action to be taken on the ChromeOs Device
    */
  var action: js.UndefOr[String] = js.native
  var deprovisionReason: js.UndefOr[String] = js.native
}

object SchemaChromeOsDeviceAction {
  @scala.inline
  def apply(): SchemaChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDeviceAction]
  }
  @scala.inline
  implicit class SchemaChromeOsDeviceActionOps[Self <: SchemaChromeOsDeviceAction] (val x: Self) extends AnyVal {
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

