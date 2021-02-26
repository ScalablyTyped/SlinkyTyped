package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to update.
    */
  var AgentArn: typingsSlinky.awsSdk.datasyncMod.AgentArn = js.native
  
  /**
    * The name that you want to use to configure the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
}
object UpdateAgentRequest {
  
  @scala.inline
  def apply(AgentArn: AgentArn): UpdateAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentRequest]
  }
  
  @scala.inline
  implicit class UpdateAgentRequestMutableBuilder[Self <: UpdateAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
