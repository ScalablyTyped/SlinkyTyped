package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Alt
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Callback
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Fields
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Filter
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Key
import typingsSlinky.maximMazurokGapiClientRecommendationengine.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogItemsResource extends StObject {
  
  /** Creates a catalog item. */
  def create(request: Accesstoken): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def create(request: Alt, body: GoogleCloudRecommendationengineV1beta1CatalogItem): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  
  /** Deletes a catalog item. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a specific catalog item. */
  def get(): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def get(request: Callback): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  
  def `import`(request: Alt, body: GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Bulk import of multiple catalog items. Request processing may be synchronous. No partial updating supported. Non-existing items will be created. Operation.response is of type
    * ImportResponse. Note that it is possible for a subset of the items to be successfully updated.
    */
  def `import`(request: Fields): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets a list of catalog items. */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  
  /** Updates a catalog item. Partial updating is supported. Non-existing items will be created. */
  def patch(request: Key): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def patch(request: Name, body: GoogleCloudRecommendationengineV1beta1CatalogItem): Request[GoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
}
