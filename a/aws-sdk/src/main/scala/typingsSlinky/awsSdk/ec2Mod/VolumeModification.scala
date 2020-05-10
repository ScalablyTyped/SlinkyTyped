package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeModification extends js.Object {
  /**
    * The modification completion or failure time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The current modification state. The modification state is null for unmodified volumes.
    */
  var ModificationState: js.UndefOr[VolumeModificationState] = js.native
  /**
    * The original IOPS rate of the volume.
    */
  var OriginalIops: js.UndefOr[Integer] = js.native
  /**
    * The original size of the volume.
    */
  var OriginalSize: js.UndefOr[Integer] = js.native
  /**
    * The original EBS volume type of the volume.
    */
  var OriginalVolumeType: js.UndefOr[VolumeType] = js.native
  /**
    * The modification progress, from 0 to 100 percent complete.
    */
  var Progress: js.UndefOr[Long] = js.native
  /**
    * The modification start time.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * A status message about the modification progress or failure.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The target IOPS rate of the volume.
    */
  var TargetIops: js.UndefOr[Integer] = js.native
  /**
    * The target size of the volume, in GiB.
    */
  var TargetSize: js.UndefOr[Integer] = js.native
  /**
    * The target EBS volume type of the volume.
    */
  var TargetVolumeType: js.UndefOr[VolumeType] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object VolumeModification {
  @scala.inline
  def apply(): VolumeModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeModification]
  }
  @scala.inline
  implicit class VolumeModificationOps[Self <: VolumeModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationState(value: VolumeModificationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationState")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalIops(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalIops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalIops")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalVolumeType(value: VolumeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalVolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalVolumeType")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIops(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIops")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetVolumeType(value: VolumeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVolumeType")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(js.undefined)
        ret
    }
  }
  
}

