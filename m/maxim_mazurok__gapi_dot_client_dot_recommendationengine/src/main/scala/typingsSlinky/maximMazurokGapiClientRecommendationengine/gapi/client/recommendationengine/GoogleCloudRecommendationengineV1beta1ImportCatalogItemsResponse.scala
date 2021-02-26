package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse extends StObject {
  
  /** A sample of errors encountered while processing the request. */
  var errorSamples: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
  
  /** Echoes the destination for the complete errors in the request if set. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.native
}
object GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorSamples(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    @scala.inline
    def setErrorSamplesVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value :_*))
    
    @scala.inline
    def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
  }
}
