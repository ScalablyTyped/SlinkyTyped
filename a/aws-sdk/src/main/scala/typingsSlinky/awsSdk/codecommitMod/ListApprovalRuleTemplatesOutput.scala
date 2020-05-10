package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApprovalRuleTemplatesOutput extends js.Object {
  /**
    * The names of all the approval rule templates found in the AWS Region for your AWS account.
    */
  var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.native
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListApprovalRuleTemplatesOutput {
  @scala.inline
  def apply(): ListApprovalRuleTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovalRuleTemplatesOutput]
  }
  @scala.inline
  implicit class ListApprovalRuleTemplatesOutputOps[Self <: ListApprovalRuleTemplatesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleTemplateNames(value: ApprovalRuleTemplateNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleTemplateNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

