package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupEventsResponse extends StObject {
  
  /**
    * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is sorted by time. The most recent event is listed first.
    */
  var Events: js.UndefOr[EventsList] = js.native
  
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.NextToken] = js.native
}
object LookupEventsResponse {
  
  @scala.inline
  def apply(): LookupEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsResponse]
  }
  
  @scala.inline
  implicit class LookupEventsResponseMutableBuilder[Self <: LookupEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventsList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
