package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the storage volume that was deleted. It is the same ARN you provided in the request.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
}
object DeleteVolumeOutput {
  
  @scala.inline
  def apply(): DeleteVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVolumeOutput]
  }
  
  @scala.inline
  implicit class DeleteVolumeOutputMutableBuilder[Self <: DeleteVolumeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
