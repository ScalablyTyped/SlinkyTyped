package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Alt
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Callback
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.PageSize
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictionApiKeyRegistrationsResource extends js.Object {
  
  def create(
    request: Alt,
    body: GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest
  ): Request[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  /** Register an API key for use with predict method. */
  def create(request: Parent): Request[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  
  /** Unregister an apiKey from using for predict method. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** List the registered apiKeys for use with predict method. */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] = js.native
}
