package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** All GTM Tags of a GTM Container. */
  var tag: js.UndefOr[js.Array[Tag]] = js.native
}
object ListTagsResponse {
  
  @scala.inline
  def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  @scala.inline
  implicit class ListTagsResponseMutableBuilder[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
  }
}
