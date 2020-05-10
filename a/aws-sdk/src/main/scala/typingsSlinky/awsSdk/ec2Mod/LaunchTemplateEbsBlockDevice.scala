package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateEbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the EBS volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. 
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type.
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VolumeType] = js.native
}

object LaunchTemplateEbsBlockDevice {
  @scala.inline
  def apply(): LaunchTemplateEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEbsBlockDevice]
  }
  @scala.inline
  implicit class LaunchTemplateEbsBlockDeviceOps[Self <: LaunchTemplateEbsBlockDevice] (val x: Self) extends AnyVal {
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
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
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
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
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

