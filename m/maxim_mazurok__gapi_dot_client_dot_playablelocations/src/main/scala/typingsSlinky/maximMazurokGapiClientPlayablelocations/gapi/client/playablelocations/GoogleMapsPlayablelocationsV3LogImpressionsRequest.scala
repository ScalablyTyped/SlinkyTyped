package typingsSlinky.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3LogImpressionsRequest extends StObject {
  
  /** Required. Information about the client device. For example, device model and operating system. */
  var clientInfo: js.UndefOr[GoogleMapsUnityClientInfo] = js.native
  
  /** Required. Impression event details. The maximum number of impression reports that you can log at once is 50. */
  var impressions: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3Impression]] = js.native
  
  /**
    * Required. A string that uniquely identifies the log impressions request. This allows you to detect duplicate requests. We recommend that you use UUIDs for this value. The value must
    * not exceed 50 characters. You should reuse the `request_id` only when retrying a request in case of failure. In this case, the request must be identical to the one that failed.
    */
  var requestId: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3LogImpressionsRequest {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3LogImpressionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3LogImpressionsRequest]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3LogImpressionsRequestMutableBuilder[Self <: GoogleMapsPlayablelocationsV3LogImpressionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientInfo(value: GoogleMapsUnityClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    @scala.inline
    def setImpressions(value: js.Array[GoogleMapsPlayablelocationsV3Impression]): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    
    @scala.inline
    def setImpressionsVarargs(value: GoogleMapsPlayablelocationsV3Impression*): Self = StObject.set(x, "impressions", js.Array(value :_*))
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
