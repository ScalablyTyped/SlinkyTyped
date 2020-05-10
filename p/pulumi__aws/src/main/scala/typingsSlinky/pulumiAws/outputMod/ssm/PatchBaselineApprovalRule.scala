package typingsSlinky.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRule extends js.Object {
  var approveAfterDays: Double = js.native
  var complianceLevel: js.UndefOr[String] = js.native
  var enableNonSecurity: js.UndefOr[Boolean] = js.native
  var patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter] = js.native
}

object PatchBaselineApprovalRule {
  @scala.inline
  def apply(approveAfterDays: Double, patchFilters: js.Array[PatchBaselineApprovalRulePatchFilter]): PatchBaselineApprovalRule = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays.asInstanceOf[js.Any], patchFilters = patchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRule]
  }
  @scala.inline
  implicit class PatchBaselineApprovalRuleOps[Self <: PatchBaselineApprovalRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveAfterDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatchFilters(value: js.Array[PatchBaselineApprovalRulePatchFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplianceLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNonSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNonSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNonSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNonSecurity")(js.undefined)
        ret
    }
  }
  
}

