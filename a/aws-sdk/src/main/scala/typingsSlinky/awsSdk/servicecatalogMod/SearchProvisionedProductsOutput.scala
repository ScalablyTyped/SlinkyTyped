package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProvisionedProductsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.native
  
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.TotalResultsCount] = js.native
}
object SearchProvisionedProductsOutput {
  
  @scala.inline
  def apply(): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
  
  @scala.inline
  implicit class SearchProvisionedProductsOutputMutableBuilder[Self <: SearchProvisionedProductsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProvisionedProducts(value: ProvisionedProductAttributes): Self = StObject.set(x, "ProvisionedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductsUndefined: Self = StObject.set(x, "ProvisionedProducts", js.undefined)
    
    @scala.inline
    def setProvisionedProductsVarargs(value: ProvisionedProductAttribute*): Self = StObject.set(x, "ProvisionedProducts", js.Array(value :_*))
    
    @scala.inline
    def setTotalResultsCount(value: TotalResultsCount): Self = StObject.set(x, "TotalResultsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsCountUndefined: Self = StObject.set(x, "TotalResultsCount", js.undefined)
  }
}
