package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Name
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.PageSize
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogsResource extends js.Object {
  
  var catalogItems: CatalogItemsResource = js.native
  
  var eventStores: EventStoresResource = js.native
  
  /** Lists all the catalog configurations associated with the project. */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def patch(request: Name, body: GoogleCloudRecommendationengineV1beta1Catalog): Request[GoogleCloudRecommendationengineV1beta1Catalog] = js.native
  /** Updates the catalog configuration. */
  def patch(request: UpdateMask): Request[GoogleCloudRecommendationengineV1beta1Catalog] = js.native
}
