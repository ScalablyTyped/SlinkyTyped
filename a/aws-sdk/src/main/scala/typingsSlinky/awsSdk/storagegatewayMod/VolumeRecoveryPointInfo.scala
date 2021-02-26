package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeRecoveryPointInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume target.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  
  /**
    * The time the recovery point was taken.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.native
  
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * The size of the data stored on the volume in bytes.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsageInBytes: js.UndefOr[long] = js.native
}
object VolumeRecoveryPointInfo {
  
  @scala.inline
  def apply(): VolumeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeRecoveryPointInfo]
  }
  
  @scala.inline
  implicit class VolumeRecoveryPointInfoMutableBuilder[Self <: VolumeRecoveryPointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeRecoveryPointTime(value: String): Self = StObject.set(x, "VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeRecoveryPointTimeUndefined: Self = StObject.set(x, "VolumeRecoveryPointTime", js.undefined)
    
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
    
    @scala.inline
    def setVolumeUsageInBytes(value: long): Self = StObject.set(x, "VolumeUsageInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUsageInBytesUndefined: Self = StObject.set(x, "VolumeUsageInBytes", js.undefined)
  }
}
