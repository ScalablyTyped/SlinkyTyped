package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InappproductsListResponse extends StObject {
  
  /** All in-app products. */
  var inappproduct: js.UndefOr[js.Array[InAppProduct]] = js.native
  
  /** The kind of this response ("androidpublisher#inappproductsListResponse"). */
  var kind: js.UndefOr[String] = js.native
  
  /** Information about the current page. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** Pagination token, to handle a number of products that is over one page. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}
object InappproductsListResponse {
  
  @scala.inline
  def apply(): InappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsListResponse]
  }
  
  @scala.inline
  implicit class InappproductsListResponseMutableBuilder[Self <: InappproductsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInappproduct(value: js.Array[InAppProduct]): Self = StObject.set(x, "inappproduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInappproductUndefined: Self = StObject.set(x, "inappproduct", js.undefined)
    
    @scala.inline
    def setInappproductVarargs(value: InAppProduct*): Self = StObject.set(x, "inappproduct", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
