package typingsSlinky.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSnapshotResponse extends StObject {
  
  /**
    * The size of the blocks in the snapshot, in bytes.
    */
  var BlockSize: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockSize] = js.native
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.ebsMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the snapshot.
    */
  var KmsKeyArn: js.UndefOr[typingsSlinky.awsSdk.ebsMod.KmsKeyArn] = js.native
  
  /**
    * The AWS account ID of the snapshot owner.
    */
  var OwnerId: js.UndefOr[typingsSlinky.awsSdk.ebsMod.OwnerId] = js.native
  
  /**
    * The ID of the parent snapshot.
    */
  var ParentSnapshotId: js.UndefOr[SnapshotId] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.ebsMod.SnapshotId] = js.native
  
  /**
    * The timestamp when the snapshot was created.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.ebsMod.Status] = js.native
  
  /**
    * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see  Tagging your Amazon EC2 resources in the Amazon Elastic Compute Cloud User Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.ebsMod.Tags] = js.native
  
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[typingsSlinky.awsSdk.ebsMod.VolumeSize] = js.native
}
object StartSnapshotResponse {
  
  @scala.inline
  def apply(): StartSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSnapshotResponse]
  }
  
  @scala.inline
  implicit class StartSnapshotResponseMutableBuilder[Self <: StartSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: BlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setParentSnapshotId(value: SnapshotId): Self = StObject.set(x, "ParentSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSnapshotIdUndefined: Self = StObject.set(x, "ParentSnapshotId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
