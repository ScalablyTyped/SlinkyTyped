package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleEventMetadata extends js.Object {
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.native
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.native
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.native
}

object ApprovalRuleEventMetadata {
  @scala.inline
  def apply(): ApprovalRuleEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleEventMetadata]
  }
  @scala.inline
  implicit class ApprovalRuleEventMetadataOps[Self <: ApprovalRuleEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleContent(value: ApprovalRuleContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleContent")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleId(value: ApprovalRuleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleName(value: ApprovalRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleName")(js.undefined)
        ret
    }
  }
  
}

