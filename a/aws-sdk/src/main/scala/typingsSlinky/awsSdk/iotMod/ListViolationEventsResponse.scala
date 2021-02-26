package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViolationEventsResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The security profile violation alerts issued for this account during the given time period, potentially filtered by security profile, behavior violated, or thing (device) violating.
    */
  var violationEvents: js.UndefOr[ViolationEvents] = js.native
}
object ListViolationEventsResponse {
  
  @scala.inline
  def apply(): ListViolationEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViolationEventsResponse]
  }
  
  @scala.inline
  implicit class ListViolationEventsResponseMutableBuilder[Self <: ListViolationEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setViolationEvents(value: ViolationEvents): Self = StObject.set(x, "violationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationEventsUndefined: Self = StObject.set(x, "violationEvents", js.undefined)
    
    @scala.inline
    def setViolationEventsVarargs(value: ViolationEvent*): Self = StObject.set(x, "violationEvents", js.Array(value :_*))
  }
}
