package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing commands on Mobile Device in Directory
  * Devices API.
  */
@js.native
trait SchemaMobileDeviceAction extends js.Object {
  /**
    * Action to be taken on the Mobile Device
    */
  var action: js.UndefOr[String] = js.native
}

object SchemaMobileDeviceAction {
  @scala.inline
  def apply(): SchemaMobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDeviceAction]
  }
  @scala.inline
  implicit class SchemaMobileDeviceActionOps[Self <: SchemaMobileDeviceAction] (val x: Self) extends AnyVal {
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
  }
  
}

