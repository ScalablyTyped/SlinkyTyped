package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupStateResult extends js.Object {
  /**
    * The number of instances in the patch group.
    */
  var Instances: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches from the patch baseline that failed to install.
    */
  var InstancesWithFailedPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches installed that aren't defined in the patch baseline.
    */
  var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with installed patches.
    */
  var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.
    */
  var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.native
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
    */
  var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.native
  /**
    * The number of instances with missing patches from the patch baseline.
    */
  var InstancesWithMissingPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches that aren't applicable.
    */
  var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with NotApplicable patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.
    */
  var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.native
}

object DescribePatchGroupStateResult {
  @scala.inline
  def apply(): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
  @scala.inline
  implicit class DescribePatchGroupStateResultOps[Self <: DescribePatchGroupStateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithFailedPatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithFailedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithFailedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithFailedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithInstalledOtherPatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledOtherPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithInstalledOtherPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledOtherPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithInstalledPatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithInstalledPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithInstalledPendingRebootPatches(value: InstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledPendingRebootPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithInstalledPendingRebootPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledPendingRebootPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithInstalledRejectedPatches(value: InstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledRejectedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithInstalledRejectedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithInstalledRejectedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithMissingPatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithMissingPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithMissingPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithMissingPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithNotApplicablePatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithNotApplicablePatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithNotApplicablePatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithNotApplicablePatches")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesWithUnreportedNotApplicablePatches(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithUnreportedNotApplicablePatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesWithUnreportedNotApplicablePatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesWithUnreportedNotApplicablePatches")(js.undefined)
        ret
    }
  }
  
}

