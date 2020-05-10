package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateDescriptionInput extends js.Object {
  /**
    * The updated description of the approval rule template.
    */
  var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription = js.native
  /**
    * The name of the template for which you want to update the description.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object UpdateApprovalRuleTemplateDescriptionInput {
  @scala.inline
  def apply(
    approvalRuleTemplateDescription: ApprovalRuleTemplateDescription,
    approvalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateDescriptionInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateDescription = approvalRuleTemplateDescription.asInstanceOf[js.Any], approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionInput]
  }
  @scala.inline
  implicit class UpdateApprovalRuleTemplateDescriptionInputOps[Self <: UpdateApprovalRuleTemplateDescriptionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

