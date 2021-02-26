package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewAgentsResponse extends StObject {
  
  /**
    * The resulting list of agents.
    */
  var agentPreviews: AgentPreviewList = js.native
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object PreviewAgentsResponse {
  
  @scala.inline
  def apply(agentPreviews: AgentPreviewList): PreviewAgentsResponse = {
    val __obj = js.Dynamic.literal(agentPreviews = agentPreviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewAgentsResponse]
  }
  
  @scala.inline
  implicit class PreviewAgentsResponseMutableBuilder[Self <: PreviewAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentPreviews(value: AgentPreviewList): Self = StObject.set(x, "agentPreviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentPreviewsVarargs(value: AgentPreview*): Self = StObject.set(x, "agentPreviews", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
