package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceActionResult extends js.Object {
  // Action name
  var actionName: js.UndefOr[String] = js.native
  // State of the action. Possible values are: none, pending, canceled, active, done, failed, notSupported.
  var actionState: js.UndefOr[ActionState] = js.native
  // Time the action state was last updated
  var lastUpdatedDateTime: js.UndefOr[String] = js.native
  // Time the action was initiated
  var startDateTime: js.UndefOr[String] = js.native
}

object DeviceActionResult {
  @scala.inline
  def apply(): DeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceActionResult]
  }
  @scala.inline
  implicit class DeviceActionResultOps[Self <: DeviceActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withActionState(value: ActionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionState")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
        ret
    }
  }
  
}

