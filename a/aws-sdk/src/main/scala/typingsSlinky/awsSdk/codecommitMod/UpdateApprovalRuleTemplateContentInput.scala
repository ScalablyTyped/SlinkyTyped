package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateContentInput extends js.Object {
  /**
    * The name of the approval rule template where you want to update the content of the rule. 
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using GetPullRequest.
    */
  var existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.native
  /**
    * The content that replaces the existing content of the rule. Content statements must be complete. You cannot provide only the changes.
    */
  var newRuleContent: ApprovalRuleTemplateContent = js.native
}

object UpdateApprovalRuleTemplateContentInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, newRuleContent: ApprovalRuleTemplateContent): UpdateApprovalRuleTemplateContentInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], newRuleContent = newRuleContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentInput]
  }
  @scala.inline
  implicit class UpdateApprovalRuleTemplateContentInputOps[Self <: UpdateApprovalRuleTemplateContentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewRuleContent(value: ApprovalRuleTemplateContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRuleContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingRuleContentSha256(value: RuleContentSha256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingRuleContentSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingRuleContentSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingRuleContentSha256")(js.undefined)
        ret
    }
  }
  
}

