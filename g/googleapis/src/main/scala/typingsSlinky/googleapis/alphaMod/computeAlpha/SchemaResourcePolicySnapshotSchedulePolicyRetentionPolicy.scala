package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy for retention of scheduled snapshots.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy extends js.Object {
  /**
    * Maximum age of the snapshot that is allowed to be kept.
    */
  var maxRetentionDays: js.UndefOr[Double] = js.native
  /**
    * Specifies the behavior to apply to existing, scheduled snapshots
    * snapshots if the policy is changed.
    */
  var onPolicySwitch: js.UndefOr[String] = js.native
  /**
    * Specifies the behavior to apply to scheduled snapshots when the source
    * disk is deleted.
    */
  var onSourceDiskDelete: js.UndefOr[String] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicyOps[Self <: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRetentionDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetentionDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetentionDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetentionDays")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPolicySwitch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPolicySwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPolicySwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPolicySwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSourceDiskDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceDiskDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSourceDiskDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceDiskDelete")(js.undefined)
        ret
    }
  }
  
}

