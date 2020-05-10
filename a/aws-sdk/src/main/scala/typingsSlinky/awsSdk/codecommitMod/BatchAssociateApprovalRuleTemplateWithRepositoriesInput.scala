package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends js.Object {
  /**
    * The name of the template you want to associate with one or more repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The names of the repositories you want to associate with the template.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}

object BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryNames: RepositoryNameList): BatchAssociateApprovalRuleTemplateWithRepositoriesInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesInput]
  }
  @scala.inline
  implicit class BatchAssociateApprovalRuleTemplateWithRepositoriesInputOps[Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesInput] (val x: Self) extends AnyVal {
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
    def withRepositoryNames(value: RepositoryNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

