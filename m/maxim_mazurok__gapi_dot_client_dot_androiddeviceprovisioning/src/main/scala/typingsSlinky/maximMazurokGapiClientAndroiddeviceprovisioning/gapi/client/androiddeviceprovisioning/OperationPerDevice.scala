package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationPerDevice extends StObject {
  
  /** A copy of the original device-claim request received by the server. */
  var claim: js.UndefOr[PartnerClaim] = js.native
  
  /** The processing result for each device. */
  var result: js.UndefOr[PerDeviceStatusInBatch] = js.native
  
  /** A copy of the original device-unclaim request received by the server. */
  var unclaim: js.UndefOr[PartnerUnclaim] = js.native
  
  /** A copy of the original metadata-update request received by the server. */
  var updateMetadata: js.UndefOr[UpdateMetadataArguments] = js.native
}
object OperationPerDevice {
  
  @scala.inline
  def apply(): OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationPerDevice]
  }
  
  @scala.inline
  implicit class OperationPerDeviceMutableBuilder[Self <: OperationPerDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaim(value: PartnerClaim): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    @scala.inline
    def setResult(value: PerDeviceStatusInBatch): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setUnclaim(value: PartnerUnclaim): Self = StObject.set(x, "unclaim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclaimUndefined: Self = StObject.set(x, "unclaim", js.undefined)
    
    @scala.inline
    def setUpdateMetadata(value: UpdateMetadataArguments): Self = StObject.set(x, "updateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMetadataUndefined: Self = StObject.set(x, "updateMetadata", js.undefined)
  }
}
