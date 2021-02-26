package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotFromVolumeRecoveryPointOutput extends StObject {
  
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
  implicit class CreateSnapshotFromVolumeRecoveryPointOutputMutableBuilder[Self <: CreateSnapshotFromVolumeRecoveryPointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeRecoveryPointTime(value: String): Self = StObject.set(x, "VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeRecoveryPointTimeUndefined: Self = StObject.set(x, "VolumeRecoveryPointTime", js.undefined)
  }
}
