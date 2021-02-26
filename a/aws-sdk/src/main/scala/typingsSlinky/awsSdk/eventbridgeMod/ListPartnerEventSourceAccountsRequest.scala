package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartnerEventSourceAccountsRequest extends StObject {
  
  /**
    * The name of the partner event source to display account information about.
    */
  var EventSourceName: typingsSlinky.awsSdk.eventbridgeMod.EventSourceName = js.native
  
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.NextToken] = js.native
}
object ListPartnerEventSourceAccountsRequest {
  
  @scala.inline
  def apply(EventSourceName: EventSourceName): ListPartnerEventSourceAccountsRequest = {
    val __obj = js.Dynamic.literal(EventSourceName = EventSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
  }
  
  @scala.inline
  implicit class ListPartnerEventSourceAccountsRequestMutableBuilder[Self <: ListPartnerEventSourceAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
