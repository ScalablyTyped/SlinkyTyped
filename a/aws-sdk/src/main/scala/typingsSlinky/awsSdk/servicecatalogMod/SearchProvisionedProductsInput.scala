package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProvisionedProductsInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AccessLevelFilter] = js.native
  
  /**
    * The search filters. When the key is SearchQuery, the searchable fields are arn, createdTime, id, lastRecordId, idempotencyToken, name, physicalId, productId, provisioningArtifact, type, status, tags, userArn, userArnSession, lastProvisioningRecordId, lastSuccessfulProvisioningRecordId, productName, and provisioningArtifactName. Example: "SearchQuery":["status:AVAILABLE"] 
    */
  var Filters: js.UndefOr[ProvisionedProductFilters] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The sort field. If no value is specified, the results are not sorted. The valid values are arn, id, name, and lastRecordId.
    */
  var SortBy: js.UndefOr[SortField] = js.native
  
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SortOrder] = js.native
}
object SearchProvisionedProductsInput {
  
  @scala.inline
  def apply(): SearchProvisionedProductsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProvisionedProductsInput]
  }
  
  @scala.inline
  implicit class SearchProvisionedProductsInputMutableBuilder[Self <: SearchProvisionedProductsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setAccessLevelFilter(value: AccessLevelFilter): Self = StObject.set(x, "AccessLevelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelFilterUndefined: Self = StObject.set(x, "AccessLevelFilter", js.undefined)
    
    @scala.inline
    def setFilters(value: ProvisionedProductFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setPageSize(value: SearchProvisionedProductsPageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: SortField): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
