package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExecutionHistoryOutput extends StObject {
  
  /**
    * The list of events that occurred in the execution.
    */
  var events: HistoryEventList = js.native
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
}
object GetExecutionHistoryOutput {
  
  @scala.inline
  def apply(events: HistoryEventList): GetExecutionHistoryOutput = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExecutionHistoryOutput]
  }
  
  @scala.inline
  implicit class GetExecutionHistoryOutputMutableBuilder[Self <: GetExecutionHistoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: HistoryEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: HistoryEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
