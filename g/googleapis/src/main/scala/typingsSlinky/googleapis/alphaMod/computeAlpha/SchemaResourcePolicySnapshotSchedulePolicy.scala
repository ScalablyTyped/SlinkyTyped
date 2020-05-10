package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A snapshot schedule policy specifies when and how frequently snapshots are
  * to be created for the target disk. Also specifies how many and how long
  * these scheduled snapshots should be retained.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicy extends js.Object {
  /**
    * Retention policy applied to snapshots created by this resource policy.
    */
  var retentionPolicy: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.native
  /**
    * A Vm Maintenance Policy specifies what kind of infrastructure maintenance
    * we are allowed to perform on this VM and when. Schedule that is applied
    * to disks covered by this policy.
    */
  var schedule: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySchedule] = js.native
  /**
    * Properties with which snapshots are created such as labels, encryption
    * keys.
    */
  var snapshotProperties: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicy {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyOps[Self <: SchemaResourcePolicySnapshotSchedulePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetentionPolicy(value: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: SchemaResourcePolicySnapshotSchedulePolicySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotProperties(value: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotProperties")(js.undefined)
        ret
    }
  }
  
}

