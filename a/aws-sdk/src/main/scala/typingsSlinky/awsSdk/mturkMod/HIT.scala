package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIT extends js.Object {
  /**
    *  The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
    */
  var AssignmentDurationInSeconds: js.UndefOr[Long] = js.native
  /**
    * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid. 
    */
  var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    *  The date and time the HIT was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    *  A general description of the HIT.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The date and time the HIT expires.
    */
  var Expiration: js.UndefOr[js.Date] = js.native
  /**
    *  The ID of the HIT Group of this HIT.
    */
  var HITGroupId: js.UndefOr[EntityId] = js.native
  /**
    *  A unique identifier for the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    *  The ID of the HIT Layout of this HIT.
    */
  var HITLayoutId: js.UndefOr[EntityId] = js.native
  /**
    *  Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate | ReviewedInappropriate.
    */
  var HITReviewStatus: js.UndefOr[typingsSlinky.awsSdk.mturkMod.HITReviewStatus] = js.native
  /**
    * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing | Disposed. 
    */
  var HITStatus: js.UndefOr[typingsSlinky.awsSdk.mturkMod.HITStatus] = js.native
  /**
    * The ID of the HIT type of this HIT
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of a HIT are more likely to have the HIT in the search results.
    */
  var Keywords: js.UndefOr[String] = js.native
  /**
    * The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
    */
  var MaxAssignments: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that are available for Workers to accept.
    */
  var NumberOfAssignmentsAvailable: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that have been approved or rejected.
    */
  var NumberOfAssignmentsCompleted: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not yet been submitted, returned, or abandoned.
    */
  var NumberOfAssignmentsPending: js.UndefOr[Integer] = js.native
  /**
    *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
    */
  var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.native
  /**
    *  The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm, HTMLQuestion or an ExternalQuestion data structure.
    */
  var Question: js.UndefOr[String] = js.native
  /**
    *  An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of the HIT.
    */
  var RequesterAnnotation: js.UndefOr[String] = js.native
  var Reward: js.UndefOr[CurrencyAmount] = js.native
  /**
    *  The title of the HIT.
    */
  var Title: js.UndefOr[String] = js.native
}

object HIT {
  @scala.inline
  def apply(): HIT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIT]
  }
  @scala.inline
  implicit class HITOps[Self <: HIT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentDurationInSeconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentDurationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentDurationInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoApprovalDelayInSeconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoApprovalDelayInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApprovalDelayInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoApprovalDelayInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withHITGroupId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITGroupId")(js.undefined)
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
    def withHITLayoutId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITLayoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutId")(js.undefined)
        ret
    }
    @scala.inline
    def withHITReviewStatus(value: HITReviewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITReviewStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHITStatus(value: HITStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAssignments(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfAssignmentsAvailable(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfAssignmentsAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfAssignmentsCompleted(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfAssignmentsCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfAssignmentsPending(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfAssignmentsPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAssignmentsPending")(js.undefined)
        ret
    }
    @scala.inline
    def withQualificationRequirements(value: QualificationRequirementList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequirements")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Question")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterAnnotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withReward(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reward")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

