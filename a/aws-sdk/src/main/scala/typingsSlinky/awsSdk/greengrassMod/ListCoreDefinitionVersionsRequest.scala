package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCoreDefinitionVersionsRequest extends StObject {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListCoreDefinitionVersionsRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string): ListCoreDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCoreDefinitionVersionsRequest]
  }
  
  @scala.inline
  implicit class ListCoreDefinitionVersionsRequestMutableBuilder[Self <: ListCoreDefinitionVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
