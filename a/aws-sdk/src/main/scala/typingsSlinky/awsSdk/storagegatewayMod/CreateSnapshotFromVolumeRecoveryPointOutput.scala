package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * The time the volume was created from the recovery point.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.native
}

object CreateSnapshotFromVolumeRecoveryPointOutput {
  @scala.inline
  def apply(): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
  @scala.inline
  implicit class CreateSnapshotFromVolumeRecoveryPointOutputOps[Self <: CreateSnapshotFromVolumeRecoveryPointOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVolumeARN(value: VolumeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeRecoveryPointTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeRecoveryPointTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeRecoveryPointTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeRecoveryPointTime")(js.undefined)
        ret
    }
  }
  
}

