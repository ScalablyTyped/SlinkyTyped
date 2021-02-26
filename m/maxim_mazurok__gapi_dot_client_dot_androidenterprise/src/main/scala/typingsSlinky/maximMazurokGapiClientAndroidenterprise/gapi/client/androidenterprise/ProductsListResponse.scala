package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsListResponse extends StObject {
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** Information about a product (e.g. an app) in the Google Play store, for display to an enterprise admin. */
  var product: js.UndefOr[js.Array[Product]] = js.native
  
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}
object ProductsListResponse {
  
  @scala.inline
  def apply(): ProductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsListResponse]
  }
  
  @scala.inline
  implicit class ProductsListResponseMutableBuilder[Self <: ProductsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setProduct(value: js.Array[Product]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setProductVarargs(value: Product*): Self = StObject.set(x, "product", js.Array(value :_*))
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
