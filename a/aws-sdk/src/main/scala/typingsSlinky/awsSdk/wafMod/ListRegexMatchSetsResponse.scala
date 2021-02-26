package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegexMatchSetsResponse extends StObject {
  
  /**
    * If you have more RegexMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexMatchSet objects, submit another ListRegexMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
  
  /**
    * An array of RegexMatchSetSummary objects.
    */
  var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.native
}
object ListRegexMatchSetsResponse {
  
  @scala.inline
  def apply(): ListRegexMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListRegexMatchSetsResponseMutableBuilder[Self <: ListRegexMatchSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setRegexMatchSets(value: RegexMatchSetSummaries): Self = StObject.set(x, "RegexMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchSetsUndefined: Self = StObject.set(x, "RegexMatchSets", js.undefined)
    
    @scala.inline
    def setRegexMatchSetsVarargs(value: RegexMatchSetSummary*): Self = StObject.set(x, "RegexMatchSets", js.Array(value :_*))
  }
}
