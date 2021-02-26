package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegexPatternSetsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.NextMarker] = js.native
  
  /**
    * 
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.native
}
object ListRegexPatternSetsResponse {
  
  @scala.inline
  def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  
  @scala.inline
  implicit class ListRegexPatternSetsResponseMutableBuilder[Self <: ListRegexPatternSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setRegexPatternSets(value: RegexPatternSetSummaries): Self = StObject.set(x, "RegexPatternSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetsUndefined: Self = StObject.set(x, "RegexPatternSets", js.undefined)
    
    @scala.inline
    def setRegexPatternSetsVarargs(value: RegexPatternSetSummary*): Self = StObject.set(x, "RegexPatternSets", js.Array(value :_*))
  }
}
