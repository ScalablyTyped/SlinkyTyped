package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeInfo extends StObject {
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var GatewayId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeAttachmentStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  
  /**
    * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeId] = js.native
  
  /**
    * The size of the volume in bytes. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeType] = js.native
}
object VolumeInfo {
  
  @scala.inline
  def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  
  @scala.inline
  implicit class VolumeInfoMutableBuilder[Self <: VolumeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayId(value: GatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "VolumeAttachmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAttachmentStatusUndefined: Self = StObject.set(x, "VolumeAttachmentStatus", js.undefined)
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
