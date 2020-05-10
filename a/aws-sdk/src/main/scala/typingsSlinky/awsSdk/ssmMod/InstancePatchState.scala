package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePatchState extends js.Object {
  /**
    * The ID of the patch baseline used to patch the instance.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
  /**
    * The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.
    */
  var FailedCount: js.UndefOr[PatchFailedCount] = js.native
  /**
    * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an Amazon S3 bucket in YAML format and specify in the SSM document AWS-RunPatchBaseline, overrides the patches specified by the default patch baseline. For more information about the InstallOverrideList parameter, see About the SSM Document AWS-RunPatchBaseline in the AWS Systems Manager User Guide.
    */
  var InstallOverrideList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstallOverrideList] = js.native
  /**
    * The number of patches from the patch baseline that are installed on the instance.
    */
  var InstalledCount: js.UndefOr[PatchInstalledCount] = js.native
  /**
    * The number of patches not specified in the patch baseline that are installed on the instance.
    */
  var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.native
  /**
    * The number of patches installed by Patch Manager since the last time the instance was rebooted.
    */
  var InstalledPendingRebootCount: js.UndefOr[PatchInstalledPendingRebootCount] = js.native
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of InstalledRejected were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero). 
    */
  var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.native
  /**
    * The ID of the managed instance the high-level patch compliance information was collected for.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The time of the last attempt to patch the instance with NoReboot specified as the reboot option.
    */
  var LastNoRebootInstallOperationTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.
    */
  var MissingCount: js.UndefOr[PatchMissingCount] = js.native
  /**
    * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in UnreportedNotApplicableCount.
    */
  var NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.native
  /**
    * The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).
    */
  var Operation: PatchOperationType = js.native
  /**
    * The time the most recent patching operation completed on the instance.
    */
  var OperationEndTime: js.Date = js.native
  /**
    * The time the most recent patching operation was started on the instance.
    */
  var OperationStartTime: js.Date = js.native
  /**
    * Placeholder information. This field will always be empty in the current release of the service.
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The name of the patch group the managed instance belongs to.
    */
  var PatchGroup: typingsSlinky.awsSdk.ssmMod.PatchGroup = js.native
  /**
    * Indicates the reboot option specified in the patch baseline.  Reboot options apply to Install operations only. Reboots are not attempted for Patch Manager Scan operations.     RebootIfNeeded: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of InstalledPendingReboot.    NoReboot: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of InstalledPendingReboot. These patches might not be in effect until a reboot is performed.  
    */
  var RebootOption: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RebootOption] = js.native
  /**
    * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SnapshotId] = js.native
  /**
    * The number of patches beyond the supported limit of NotApplicableCount that are not reported by name to Systems Manager Inventory.
    */
  var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.native
}

object InstancePatchState {
  @scala.inline
  def apply(
    BaselineId: BaselineId,
    InstanceId: InstanceId,
    Operation: PatchOperationType,
    OperationEndTime: js.Date,
    OperationStartTime: js.Date,
    PatchGroup: PatchGroup
  ): InstancePatchState = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OperationEndTime = OperationEndTime.asInstanceOf[js.Any], OperationStartTime = OperationStartTime.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchState]
  }
  @scala.inline
  implicit class InstancePatchStateOps[Self <: InstancePatchState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: PatchOperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatchGroup(value: PatchGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedCount(value: PatchFailedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallOverrideList(value: InstallOverrideList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallOverrideList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallOverrideList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallOverrideList")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledCount(value: PatchInstalledCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledOtherCount(value: PatchInstalledOtherCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledOtherCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledOtherCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledOtherCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledPendingRebootCount(value: PatchInstalledPendingRebootCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledPendingRebootCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledPendingRebootCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledPendingRebootCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledRejectedCount(value: PatchInstalledRejectedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledRejectedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledRejectedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstalledRejectedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastNoRebootInstallOperationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastNoRebootInstallOperationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastNoRebootInstallOperationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastNoRebootInstallOperationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingCount(value: PatchMissingCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNotApplicableCount(value: PatchNotApplicableCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotApplicableCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotApplicableCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotApplicableCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerInformation(value: OwnerInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withRebootOption(value: RebootOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebootOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebootOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebootOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreportedNotApplicableCount(value: PatchUnreportedNotApplicableCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnreportedNotApplicableCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreportedNotApplicableCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnreportedNotApplicableCount")(js.undefined)
        ret
    }
  }
  
}

