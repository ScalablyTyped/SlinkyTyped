package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchListResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.native
  
  /** Pagination information for token pagination. */
  var items: js.UndefOr[js.Array[SearchResult]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#searchListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set. */
  var prevPageToken: js.UndefOr[String] = js.native
  
  var regionCode: js.UndefOr[String] = js.native
  
  var tokenPagination: js.UndefOr[js.Any] = js.native
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.native
}
object SearchListResponse {
  
  @scala.inline
  def apply(): SearchListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchListResponse]
  }
  
  @scala.inline
  implicit class SearchListResponseMutableBuilder[Self <: SearchListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SearchResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SearchResult*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: js.Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
