package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateNameInput extends js.Object {
  /**
    * The new name you want to apply to the approval rule template.
    */
  var newApprovalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The current name of the approval rule template.
    */
  var oldApprovalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object UpdateApprovalRuleTemplateNameInput {
  @scala.inline
  def apply(
    newApprovalRuleTemplateName: ApprovalRuleTemplateName,
    oldApprovalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateNameInput = {
    val __obj = js.Dynamic.literal(newApprovalRuleTemplateName = newApprovalRuleTemplateName.asInstanceOf[js.Any], oldApprovalRuleTemplateName = oldApprovalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameInput]
  }
  @scala.inline
  implicit class UpdateApprovalRuleTemplateNameInputOps[Self <: UpdateApprovalRuleTemplateNameInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newApprovalRuleTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldApprovalRuleTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

