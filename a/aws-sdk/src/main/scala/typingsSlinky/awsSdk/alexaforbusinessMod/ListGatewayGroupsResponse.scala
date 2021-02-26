package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewayGroupsResponse extends StObject {
  
  /**
    * The gateway groups in the list.
    */
  var GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.native
  
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
}
object ListGatewayGroupsResponse {
  
  @scala.inline
  def apply(): ListGatewayGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewayGroupsResponse]
  }
  
  @scala.inline
  implicit class ListGatewayGroupsResponseMutableBuilder[Self <: ListGatewayGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayGroups(value: GatewayGroupSummaries): Self = StObject.set(x, "GatewayGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayGroupsUndefined: Self = StObject.set(x, "GatewayGroups", js.undefined)
    
    @scala.inline
    def setGatewayGroupsVarargs(value: GatewayGroupSummary*): Self = StObject.set(x, "GatewayGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
