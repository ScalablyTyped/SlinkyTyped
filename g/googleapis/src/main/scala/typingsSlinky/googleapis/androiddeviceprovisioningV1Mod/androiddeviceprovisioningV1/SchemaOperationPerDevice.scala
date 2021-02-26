package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task for each device in the operation. Corresponds to each device change
  * in the request.
  */
@js.native
trait SchemaOperationPerDevice extends StObject {
  
  /**
    * A copy of the original device-claim request received by the server.
    */
  var claim: js.UndefOr[SchemaPartnerClaim] = js.native
  
  /**
    * The processing result for each device.
    */
  var result: js.UndefOr[SchemaPerDeviceStatusInBatch] = js.native
  
  /**
    * A copy of the original device-unclaim request received by the server.
    */
  var unclaim: js.UndefOr[SchemaPartnerUnclaim] = js.native
  
  /**
    * A copy of the original metadata-update request received by the server.
    */
  var updateMetadata: js.UndefOr[SchemaUpdateMetadataArguments] = js.native
}
object SchemaOperationPerDevice {
  
  @scala.inline
  def apply(): SchemaOperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationPerDevice]
  }
  
  @scala.inline
  implicit class SchemaOperationPerDeviceMutableBuilder[Self <: SchemaOperationPerDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaim(value: SchemaPartnerClaim): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaPerDeviceStatusInBatch): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setUnclaim(value: SchemaPartnerUnclaim): Self = StObject.set(x, "unclaim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclaimUndefined: Self = StObject.set(x, "unclaim", js.undefined)
    
    @scala.inline
    def setUpdateMetadata(value: SchemaUpdateMetadataArguments): Self = StObject.set(x, "updateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMetadataUndefined: Self = StObject.set(x, "updateMetadata", js.undefined)
  }
}
