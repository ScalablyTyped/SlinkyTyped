package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLayoutPagesListResponse extends StObject {
  
  /** A store page of an enterprise. */
  var page: js.UndefOr[js.Array[StorePage]] = js.native
}
object StoreLayoutPagesListResponse {
  
  @scala.inline
  def apply(): StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutPagesListResponse]
  }
  
  @scala.inline
  implicit class StoreLayoutPagesListResponseMutableBuilder[Self <: StoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: js.Array[StorePage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: StorePage*): Self = StObject.set(x, "page", js.Array(value :_*))
  }
}
