package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorediSCSIVolume extends StObject {
  
  /**
    * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this timestamp.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  
  /**
    * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved. Valid Values: true | false 
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
    * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway. For more information, see Moving your volumes to a different gateway.
    */
  var VolumeAttachmentStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  
  /**
    * The ID of the local disk that was specified in the CreateStorediSCSIVolume operation.
    */
  var VolumeDiskId: js.UndefOr[DiskId] = js.native
  
  /**
    * The unique identifier of the volume, e.g., vol-AE4B946D.
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
  implicit class StorediSCSIVolumeMutableBuilder[Self <: StorediSCSIVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setPreservedExistingData(value: scala.Boolean): Self = StObject.set(x, "PreservedExistingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedExistingDataUndefined: Self = StObject.set(x, "PreservedExistingData", js.undefined)
    
    @scala.inline
    def setSourceSnapshotId(value: SnapshotId): Self = StObject.set(x, "SourceSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSnapshotIdUndefined: Self = StObject.set(x, "SourceSnapshotId", js.undefined)
    
    @scala.inline
    def setTargetName(value: TargetName): Self = StObject.set(x, "TargetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameUndefined: Self = StObject.set(x, "TargetName", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "VolumeAttachmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAttachmentStatusUndefined: Self = StObject.set(x, "VolumeAttachmentStatus", js.undefined)
    
    @scala.inline
    def setVolumeDiskId(value: DiskId): Self = StObject.set(x, "VolumeDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDiskIdUndefined: Self = StObject.set(x, "VolumeDiskId", js.undefined)
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeProgress(value: DoubleObject): Self = StObject.set(x, "VolumeProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeProgressUndefined: Self = StObject.set(x, "VolumeProgress", js.undefined)
    
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
    
    @scala.inline
    def setVolumeStatus(value: VolumeStatus): Self = StObject.set(x, "VolumeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeStatusUndefined: Self = StObject.set(x, "VolumeStatus", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
    
    @scala.inline
    def setVolumeUsedInBytes(value: VolumeUsedInBytes): Self = StObject.set(x, "VolumeUsedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUsedInBytesUndefined: Self = StObject.set(x, "VolumeUsedInBytes", js.undefined)
    
    @scala.inline
    def setVolumeiSCSIAttributes(value: VolumeiSCSIAttributes): Self = StObject.set(x, "VolumeiSCSIAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeiSCSIAttributesUndefined: Self = StObject.set(x, "VolumeiSCSIAttributes", js.undefined)
  }
}
