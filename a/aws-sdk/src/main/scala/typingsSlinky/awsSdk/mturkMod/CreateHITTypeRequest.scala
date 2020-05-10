package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITTypeRequest extends js.Object {
  /**
    *  The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find and accept. 
    */
  var AssignmentDurationInSeconds: Long = js.native
  /**
    *  The number of seconds after an assignment for the HIT has been submitted, after which the assignment is considered Approved automatically unless the Requester explicitly rejects it. 
    */
  var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    *  A general description of the HIT. A description includes detailed information about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate the HIT before accepting it. 
    */
  var Description: String = js.native
  /**
    *  One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find HITs. 
    */
  var Keywords: js.UndefOr[String] = js.native
  /**
    *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
    */
  var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.native
  /**
    *  The amount of money the Requester will pay a Worker for successfully completing the HIT. 
    */
  var Reward: CurrencyAmount = js.native
  /**
    *  The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned. 
    */
  var Title: String = js.native
}

object CreateHITTypeRequest {
  @scala.inline
  def apply(AssignmentDurationInSeconds: Long, Description: String, Reward: CurrencyAmount, Title: String): CreateHITTypeRequest = {
    val __obj = js.Dynamic.literal(AssignmentDurationInSeconds = AssignmentDurationInSeconds.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Reward = Reward.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITTypeRequest]
  }
  @scala.inline
  implicit class CreateHITTypeRequestOps[Self <: CreateHITTypeRequest] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReward(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
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
  }
  
}

