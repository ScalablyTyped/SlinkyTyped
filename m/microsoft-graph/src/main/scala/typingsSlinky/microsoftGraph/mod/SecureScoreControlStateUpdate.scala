package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScoreControlStateUpdate extends js.Object {
  // Assigns the control to the user who will take the action.
  var assignedTo: js.UndefOr[String] = js.native
  // Provides optional comment about the control.
  var comment: js.UndefOr[String] = js.native
  // State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
  var state: js.UndefOr[String] = js.native
  // ID of the user who updated tenant state.
  var updatedBy: js.UndefOr[String] = js.native
  // Time at which the control state was updated.
  var updatedDateTime: js.UndefOr[String] = js.native
}

object SecureScoreControlStateUpdate {
  @scala.inline
  def apply(): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
  @scala.inline
  implicit class SecureScoreControlStateUpdateOps[Self <: SecureScoreControlStateUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDateTime")(js.undefined)
        ret
    }
  }
  
}

