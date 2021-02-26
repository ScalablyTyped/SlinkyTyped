package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAgentsRequest extends StObject {
  
  /**
    * The maximum number of agents to list.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.MaxResults] = js.native
  
  /**
    * An opaque string that indicates the position at which to begin the next list of agents.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.NextToken] = js.native
}
object ListAgentsRequest {
  
  @scala.inline
  def apply(): ListAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsRequest]
  }
  
  @scala.inline
  implicit class ListAgentsRequestMutableBuilder[Self <: ListAgentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
