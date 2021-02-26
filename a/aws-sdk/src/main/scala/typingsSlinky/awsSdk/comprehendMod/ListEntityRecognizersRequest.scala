package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntityRecognizersRequest extends StObject {
  
  /**
    * Filters the list of entities returned. You can filter on Status, SubmitTimeBefore, or SubmitTimeAfter. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[EntityRecognizerFilter] = js.native
  
  /**
    *  The maximum number of results to return on each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListEntityRecognizersRequest {
  
  @scala.inline
  def apply(): ListEntityRecognizersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizersRequest]
  }
  
  @scala.inline
  implicit class ListEntityRecognizersRequestMutableBuilder[Self <: ListEntityRecognizersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: EntityRecognizerFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
