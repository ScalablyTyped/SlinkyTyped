package typingsSlinky.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventTypesResult extends StObject {
  
  /**
    * Information about each event, including service name, resource type, event ID, and event name.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.NextToken] = js.native
}
object ListEventTypesResult {
  
  @scala.inline
  def apply(): ListEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesResult]
  }
  
  @scala.inline
  implicit class ListEventTypesResultMutableBuilder[Self <: ListEventTypesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypes(value: EventTypeBatch): Self = StObject.set(x, "EventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "EventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: EventTypeSummary*): Self = StObject.set(x, "EventTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
