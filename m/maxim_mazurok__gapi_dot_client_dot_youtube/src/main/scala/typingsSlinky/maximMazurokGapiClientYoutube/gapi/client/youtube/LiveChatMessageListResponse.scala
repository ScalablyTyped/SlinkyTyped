package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessageListResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[LiveChatMessage]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessageListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The date and time when the underlying stream went offline. The value is specified in ISO 8601 format. */
  var offlineAt: js.UndefOr[String] = js.native
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** The amount of time the client should wait before polling again. */
  var pollingIntervalMillis: js.UndefOr[Double] = js.native
  
  var tokenPagination: js.UndefOr[js.Any] = js.native
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.native
}
object LiveChatMessageListResponse {
  
  @scala.inline
  def apply(): LiveChatMessageListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageListResponse]
  }
  
  @scala.inline
  implicit class LiveChatMessageListResponseMutableBuilder[Self <: LiveChatMessageListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[LiveChatMessage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LiveChatMessage*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOfflineAt(value: String): Self = StObject.set(x, "offlineAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineAtUndefined: Self = StObject.set(x, "offlineAt", js.undefined)
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingIntervalMillisUndefined: Self = StObject.set(x, "pollingIntervalMillis", js.undefined)
    
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
