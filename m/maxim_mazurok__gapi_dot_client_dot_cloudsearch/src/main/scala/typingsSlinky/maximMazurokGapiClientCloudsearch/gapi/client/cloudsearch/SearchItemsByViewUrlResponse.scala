package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchItemsByViewUrlResponse extends StObject {
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SearchItemsByViewUrlResponse {
  
  @scala.inline
  def apply(): SearchItemsByViewUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchItemsByViewUrlResponse]
  }
  
  @scala.inline
  implicit class SearchItemsByViewUrlResponseMutableBuilder[Self <: SearchItemsByViewUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
