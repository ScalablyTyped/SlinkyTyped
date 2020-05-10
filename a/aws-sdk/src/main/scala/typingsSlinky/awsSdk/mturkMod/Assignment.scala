package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assignment extends js.Object {
  /**
    *  The date and time the Worker accepted the assignment.
    */
  var AcceptTime: js.UndefOr[js.Date] = js.native
  /**
    *  The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer may be empty.
    */
  var Answer: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time the Requester approved the results. This value is omitted from the assignment if the Requester has not yet approved the results.
    */
  var ApprovalTime: js.UndefOr[js.Date] = js.native
  /**
    *  A unique identifier for the assignment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the assignment.
    */
  var AssignmentStatus: js.UndefOr[typingsSlinky.awsSdk.mturkMod.AssignmentStatus] = js.native
  /**
    *  If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are considered Approved automatically if they have not already been explicitly approved or rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var AutoApprovalTime: js.UndefOr[js.Date] = js.native
  /**
    *  The date and time of the deadline for the assignment. This value is derived from the deadline specification for the HIT and the date and time the Worker accepted the HIT.
    */
  var Deadline: js.UndefOr[js.Date] = js.native
  /**
    *  The ID of the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    *  If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and time the Requester rejected the results.
    */
  var RejectionTime: js.UndefOr[js.Date] = js.native
  /**
    *  The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation, if the Requester approved or rejected the assignment and specified feedback.
    */
  var RequesterFeedback: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Assignment {
  @scala.inline
  def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  @scala.inline
  implicit class AssignmentOps[Self <: Assignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentStatus(value: AssignmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoApprovalTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoApprovalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApprovalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoApprovalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectionTime")(js.undefined)
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
    @scala.inline
    def withSubmitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(js.undefined)
        ret
    }
  }
  
}

