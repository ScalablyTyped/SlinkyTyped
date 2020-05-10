package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorediSCSIVolume extends js.Object {
  /**
    * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved.  Valid Values: true, false
    */
  var PreservedExistingData: js.UndefOr[scala.Boolean] = js.native
  /**
    * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not included.
    */
  var SourceSnapshotId: js.UndefOr[SnapshotId] = js.native
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the storage volume.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway. For more information, see Moving Your Volumes to a Different Gateway.
    */
  var VolumeAttachmentStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  /**
    * The ID of the local disk that was specified in the CreateStorediSCSIVolume operation.
    */
  var VolumeDiskId: js.UndefOr[DiskId] = js.native
  /**
    * The unique identifier of the volume, e.g. vol-AE4B946D.
    */
  var VolumeId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeId] = js.native
  /**
    * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the stored volume is not restoring or bootstrapping.
    */
  var VolumeProgress: js.UndefOr[DoubleObject] = js.native
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeStatus] = js.native
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeType] = js.native
  /**
    * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns but less accurate for random write patterns. VolumeUsedInBytes is different from the compressed size of the volume, which is the value that is used to calculate your bill.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsedInBytes: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeUsedInBytes] = js.native
  /**
    * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
    */
  var VolumeiSCSIAttributes: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeiSCSIAttributes] = js.native
}

object StorediSCSIVolume {
  @scala.inline
  def apply(): StorediSCSIVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorediSCSIVolume]
  }
  @scala.inline
  implicit class StorediSCSIVolumeOps[Self <: StorediSCSIVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSKey(value: KMSKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservedExistingData(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreservedExistingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedExistingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreservedExistingData")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetName(value: TargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetName")(js.undefined)
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
    def withVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeAttachmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAttachmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeAttachmentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeDiskId(value: DiskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeDiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeDiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeDiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: VolumeId): Self = {
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
    @scala.inline
    def withVolumeProgress(value: DoubleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSizeInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeStatus(value: VolumeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatus")(js.undefined)
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
    @scala.inline
    def withVolumeUsedInBytes(value: VolumeUsedInBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeUsedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeUsedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeUsedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeiSCSIAttributes(value: VolumeiSCSIAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeiSCSIAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeiSCSIAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeiSCSIAttributes")(js.undefined)
        ret
    }
  }
  
}

