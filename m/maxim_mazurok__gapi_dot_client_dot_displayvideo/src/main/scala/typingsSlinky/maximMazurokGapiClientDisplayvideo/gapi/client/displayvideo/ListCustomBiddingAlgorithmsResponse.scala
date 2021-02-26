package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomBiddingAlgorithmsResponse extends StObject {
  
  /** The list of custom bidding algorithms. This list will be absent if empty. */
  var customBiddingAlgorithms: js.UndefOr[js.Array[CustomBiddingAlgorithm]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomBiddingAlgorithmsRequest` method to retrieve the next page
    * of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCustomBiddingAlgorithmsResponse {
  
  @scala.inline
  def apply(): ListCustomBiddingAlgorithmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomBiddingAlgorithmsResponse]
  }
  
  @scala.inline
  implicit class ListCustomBiddingAlgorithmsResponseMutableBuilder[Self <: ListCustomBiddingAlgorithmsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomBiddingAlgorithms(value: js.Array[CustomBiddingAlgorithm]): Self = StObject.set(x, "customBiddingAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBiddingAlgorithmsUndefined: Self = StObject.set(x, "customBiddingAlgorithms", js.undefined)
    
    @scala.inline
    def setCustomBiddingAlgorithmsVarargs(value: CustomBiddingAlgorithm*): Self = StObject.set(x, "customBiddingAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
