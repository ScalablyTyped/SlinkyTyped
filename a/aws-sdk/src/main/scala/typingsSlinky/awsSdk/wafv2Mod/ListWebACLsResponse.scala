package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebACLsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.NextMarker] = js.native
  
  /**
    * 
    */
  var WebACLs: js.UndefOr[WebACLSummaries] = js.native
}
object ListWebACLsResponse {
  
  @scala.inline
  def apply(): ListWebACLsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsResponse]
  }
  
  @scala.inline
  implicit class ListWebACLsResponseMutableBuilder[Self <: ListWebACLsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setWebACLs(value: WebACLSummaries): Self = StObject.set(x, "WebACLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLsUndefined: Self = StObject.set(x, "WebACLs", js.undefined)
    
    @scala.inline
    def setWebACLsVarargs(value: WebACLSummary*): Self = StObject.set(x, "WebACLs", js.Array(value :_*))
  }
}
