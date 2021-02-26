package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidedPurchasesListResponse extends StObject {
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
  
  var voidedPurchases: js.UndefOr[js.Array[VoidedPurchase]] = js.native
}
object VoidedPurchasesListResponse {
  
  @scala.inline
  def apply(): VoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoidedPurchasesListResponse]
  }
  
  @scala.inline
  implicit class VoidedPurchasesListResponseMutableBuilder[Self <: VoidedPurchasesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    @scala.inline
    def setVoidedPurchases(value: js.Array[VoidedPurchase]): Self = StObject.set(x, "voidedPurchases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedPurchasesUndefined: Self = StObject.set(x, "voidedPurchases", js.undefined)
    
    @scala.inline
    def setVoidedPurchasesVarargs(value: VoidedPurchase*): Self = StObject.set(x, "voidedPurchases", js.Array(value :_*))
  }
}
