package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchRule extends js.Object {
  /**
    * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. 
    */
  var ApproveAfterDays: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ApproveAfterDays] = js.native
  /**
    * Example API
    */
  var ApproveUntilDate: js.UndefOr[PatchStringDateTime] = js.native
  /**
    * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels include the following: Unspecified, Critical, High, Medium, Low, and Informational.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates available in the specified repository. The default value is 'false'. Applies to Linux instances only.
    */
  var EnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The patch filter group that defines the criteria for the rule.
    */
  var PatchFilterGroup: typingsSlinky.awsSdk.ssmMod.PatchFilterGroup = js.native
}

object PatchRule {
  @scala.inline
  def apply(PatchFilterGroup: PatchFilterGroup): PatchRule = {
    val __obj = js.Dynamic.literal(PatchFilterGroup = PatchFilterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRule]
  }
  @scala.inline
  implicit class PatchRuleOps[Self <: PatchRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatchFilterGroup(value: PatchFilterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchFilterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApproveAfterDays(value: ApproveAfterDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproveAfterDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveAfterDays")(js.undefined)
        ret
    }
    @scala.inline
    def withApproveUntilDate(value: PatchStringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveUntilDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproveUntilDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproveUntilDate")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceLevel(value: PatchComplianceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNonSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNonSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNonSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNonSecurity")(js.undefined)
        ret
    }
  }
  
}

