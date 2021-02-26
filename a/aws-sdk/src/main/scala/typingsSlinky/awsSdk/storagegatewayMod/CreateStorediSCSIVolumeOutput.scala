package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStorediSCSIVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
}
object CreateStorediSCSIVolumeOutput {
  
  @scala.inline
  def apply(): CreateStorediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
  }
  
  @scala.inline
  implicit class CreateStorediSCSIVolumeOutputMutableBuilder[Self <: CreateStorediSCSIVolumeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
  }
}
