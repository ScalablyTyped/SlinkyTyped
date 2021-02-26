package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInsertionOrdersResponse extends StObject {
  
  /** The list of insertion orders. This list will be absent if empty. */
  var insertionOrders: js.UndefOr[js.Array[InsertionOrder]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInsertionOrders` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInsertionOrdersResponse {
  
  @scala.inline
  def apply(): ListInsertionOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInsertionOrdersResponse]
  }
  
  @scala.inline
  implicit class ListInsertionOrdersResponseMutableBuilder[Self <: ListInsertionOrdersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertionOrders(value: js.Array[InsertionOrder]): Self = StObject.set(x, "insertionOrders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertionOrdersUndefined: Self = StObject.set(x, "insertionOrders", js.undefined)
    
    @scala.inline
    def setInsertionOrdersVarargs(value: InsertionOrder*): Self = StObject.set(x, "insertionOrders", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
