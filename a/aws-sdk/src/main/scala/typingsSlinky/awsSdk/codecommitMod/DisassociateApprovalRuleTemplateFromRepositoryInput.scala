package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateApprovalRuleTemplateFromRepositoryInput extends js.Object {
  /**
    * The name of the approval rule template to disassociate from a specified repository.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The name of the repository you want to disassociate from the template.
    */
  var repositoryName: RepositoryName = js.native
}

object DisassociateApprovalRuleTemplateFromRepositoryInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryName: RepositoryName): DisassociateApprovalRuleTemplateFromRepositoryInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApprovalRuleTemplateFromRepositoryInput]
  }
  @scala.inline
  implicit class DisassociateApprovalRuleTemplateFromRepositoryInputOps[Self <: DisassociateApprovalRuleTemplateFromRepositoryInput] (val x: Self) extends AnyVal {
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
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

