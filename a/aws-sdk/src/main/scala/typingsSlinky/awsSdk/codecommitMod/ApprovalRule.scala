package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRule extends js.Object {
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
  /**
    * The date the approval rule was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the approval rule was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  /**
    * The approval rule template used to create the rule.
    */
  var originApprovalRuleTemplate: js.UndefOr[OriginApprovalRuleTemplate] = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}

object ApprovalRule {
  @scala.inline
  def apply(): ApprovalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRule]
  }
  @scala.inline
  implicit class ApprovalRuleOps[Self <: ApprovalRule] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedUser(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginApprovalRuleTemplate(value: OriginApprovalRuleTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originApprovalRuleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginApprovalRuleTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originApprovalRuleTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleContentSha256(value: RuleContentSha256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleContentSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleContentSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleContentSha256")(js.undefined)
        ret
    }
  }
  
}

