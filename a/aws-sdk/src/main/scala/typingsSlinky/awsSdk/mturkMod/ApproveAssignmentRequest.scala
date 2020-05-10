package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproveAssignmentRequest extends js.Object {
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId = js.native
  /**
    *  A flag indicating that an assignment should be approved even if it was previously rejected. Defaults to False. 
    */
  var OverrideRejection: js.UndefOr[Boolean] = js.native
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: js.UndefOr[String] = js.native
}

object ApproveAssignmentRequest {
  @scala.inline
  def apply(AssignmentId: EntityId): ApproveAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproveAssignmentRequest]
  }
  @scala.inline
  implicit class ApproveAssignmentRequestOps[Self <: ApproveAssignmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideRejection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideRejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideRejection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideRejection")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterFeedback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterFeedback")(js.undefined)
        ret
    }
  }
  
}

