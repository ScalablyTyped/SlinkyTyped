package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceMetadataInBatchRequest extends StObject {
  
  /** Required. The list of metadata updates. */
  var updates: js.UndefOr[js.Array[UpdateMetadataArguments]] = js.native
}
object UpdateDeviceMetadataInBatchRequest {
  
  @scala.inline
  def apply(): UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataInBatchRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceMetadataInBatchRequestMutableBuilder[Self <: UpdateDeviceMetadataInBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdates(value: js.Array[UpdateMetadataArguments]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: UpdateMetadataArguments*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
