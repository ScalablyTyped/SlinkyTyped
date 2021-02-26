package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1Catalog extends StObject {
  
  /** Required. The catalog item level configuration. */
  var catalogItemLevelConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig] = js.native
  
  /** Required. The ID of the default event store. */
  var defaultEventStoreId: js.UndefOr[String] = js.native
  
  /** Required. The catalog display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The fully qualified resource name of the catalog. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1Catalog {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1Catalog]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1Catalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogItemLevelConfig(value: GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig): Self = StObject.set(x, "catalogItemLevelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogItemLevelConfigUndefined: Self = StObject.set(x, "catalogItemLevelConfig", js.undefined)
    
    @scala.inline
    def setDefaultEventStoreId(value: String): Self = StObject.set(x, "defaultEventStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEventStoreIdUndefined: Self = StObject.set(x, "defaultEventStoreId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
