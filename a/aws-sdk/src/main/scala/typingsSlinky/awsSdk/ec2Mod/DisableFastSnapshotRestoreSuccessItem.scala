package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoreSuccessItem extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The time at which fast snapshot restores entered the disabled state.
    */
  var DisabledTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the disabling state.
    */
  var DisablingTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the enabled state.
    */
  var EnabledTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the enabling state.
    */
  var EnablingTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the optimizing state.
    */
  var OptimizingTime: js.UndefOr[js.Date] = js.native
  /**
    * The alias of the snapshot owner.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * The state of fast snapshot restores for the snapshot.
    */
  var State: js.UndefOr[FastSnapshotRestoreStateCode] = js.native
  /**
    * The reason for the state transition. The possible values are as follows:    Client.UserInitiated - The state successfully transitioned to enabling or disabling.    Client.UserInitiated - Lifecycle state transition - The state successfully transitioned to optimizing, enabled, or disabled.  
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
}

object DisableFastSnapshotRestoreSuccessItem {
  @scala.inline
  def apply(): DisableFastSnapshotRestoreSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreSuccessItem]
  }
  @scala.inline
  implicit class DisableFastSnapshotRestoreSuccessItemOps[Self <: DisableFastSnapshotRestoreSuccessItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisablingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisablingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: String): Self = {
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
    def withState(value: FastSnapshotRestoreStateCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransitionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateTransitionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(js.undefined)
        ret
    }
  }
  
}

