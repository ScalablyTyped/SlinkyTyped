package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse extends StObject {
  
  /** The catalog items. */
  var catalogItems: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]] = js.native
  
  /** If empty, the list is complete. If nonempty, the token to pass to the next request's ListCatalogItemRequest.page_token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogItems(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]): Self = StObject.set(x, "catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogItemsUndefined: Self = StObject.set(x, "catalogItems", js.undefined)
    
    @scala.inline
    def setCatalogItemsVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItem*): Self = StObject.set(x, "catalogItems", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
