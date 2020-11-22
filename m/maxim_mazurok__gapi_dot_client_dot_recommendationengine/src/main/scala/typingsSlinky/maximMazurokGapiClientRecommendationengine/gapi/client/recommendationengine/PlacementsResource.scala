package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Callback
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsResource extends js.Object {
  
  def predict(request: Callback, body: GoogleCloudRecommendationengineV1beta1PredictRequest): Request[GoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  /**
    * Makes a recommendation prediction. If using API Key based authentication, the API Key must be registered using the PredictionApiKeyRegistry service. [Learn
    * more](/recommendations-ai/docs/setting-up#register-key).
    */
  def predict(request: PrettyPrint): Request[GoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
}
