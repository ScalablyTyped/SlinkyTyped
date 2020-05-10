package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsBlockDevice extends js.Object {
  /**
    * Whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For more information, see EbsBlockDevice.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The snapshot ID.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * The volume size, in GiB. For more information, see EbsBlockDevice.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type. gp2 for General Purpose (SSD) volumes, io1 for Provisioned IOPS (SSD) volumes, st1 for Throughput Optimized hard disk drives (HDD), sc1 for Cold HDD,and standard for Magnetic volumes. If you specify the io1 volume type, you must also specify a value for the Iops attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.VolumeType] = js.native
}

object EbsBlockDevice {
  @scala.inline
  def apply(): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsBlockDevice]
  }
  @scala.inline
  implicit class EbsBlockDeviceOps[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteOnTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(js.undefined)
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
    def withVolumeSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeType(value: VolumeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(js.undefined)
        ret
    }
  }
  
}

