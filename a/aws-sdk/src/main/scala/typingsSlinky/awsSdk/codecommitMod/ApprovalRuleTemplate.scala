package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleTemplate extends js.Object {
  /**
    * The content of the approval rule template.
    */
  var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.native
  /**
    * The description of the approval rule template.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.native
  /**
    * The system-generated ID of the approval rule template.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  /**
    * The name of the approval rule template.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
  /**
    * The date the approval rule template was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the approval rule template was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule template.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}

object ApprovalRuleTemplate {
  @scala.inline
  def apply(): ApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleTemplate]
  }
  @scala.inline
  implicit class ApprovalRuleTemplateOps[Self <: ApprovalRuleTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleTemplateContent(value: ApprovalRuleTemplateContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleTemplateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleTemplateDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleTemplateName")(js.undefined)
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

