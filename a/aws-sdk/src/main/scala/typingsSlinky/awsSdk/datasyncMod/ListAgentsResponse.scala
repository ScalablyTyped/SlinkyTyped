package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAgentsResponse extends StObject {
  
  /**
    * A list of agents in your account.
    */
  var Agents: js.UndefOr[AgentList] = js.native
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of agents.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.NextToken] = js.native
}
object ListAgentsResponse {
  
  @scala.inline
  def apply(): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsResponse]
  }
  
  @scala.inline
  implicit class ListAgentsResponseMutableBuilder[Self <: ListAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(value: AgentList): Self = StObject.set(x, "Agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsUndefined: Self = StObject.set(x, "Agents", js.undefined)
    
    @scala.inline
    def setAgentsVarargs(value: AgentListEntry*): Self = StObject.set(x, "Agents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
