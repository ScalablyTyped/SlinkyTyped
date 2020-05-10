package typingsSlinky.pulumiAws.patchBaselineMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule
import typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineArgs extends js.Object {
  /**
    * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
    */
  val approvalRules: js.UndefOr[Input[js.Array[Input[PatchBaselineApprovalRule]]]] = js.native
  /**
    * A list of explicitly approved patches for the baseline.
    */
  val approvedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  val approvedPatchesComplianceLevel: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the patch baseline.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  val globalFilters: js.UndefOr[Input[js.Array[Input[PatchBaselineGlobalFilter]]]] = js.native
  /**
    * The name of the patch baseline.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  /**
    * A list of rejected patches.
    */
  val rejectedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PatchBaselineArgs {
  @scala.inline
  def apply(): PatchBaselineArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineArgs]
  }
  @scala.inline
  implicit class PatchBaselineArgsOps[Self <: PatchBaselineArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRules(value: Input[js.Array[Input[PatchBaselineApprovalRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRules")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPatches(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPatchesComplianceLevel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPatchesComplianceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPatchesComplianceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPatchesComplianceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalFilters(value: Input[js.Array[Input[PatchBaselineGlobalFilter]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedPatches(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

