package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDiscoveredResourcesResponse extends StObject {
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
    */
  var resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.native
}
object ListDiscoveredResourcesResponse {
  
  @scala.inline
  def apply(): ListDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResponse]
  }
  
  @scala.inline
  implicit class ListDiscoveredResourcesResponseMutableBuilder[Self <: ListDiscoveredResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifierList): Self = StObject.set(x, "resourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifiersUndefined: Self = StObject.set(x, "resourceIdentifiers", js.undefined)
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "resourceIdentifiers", js.Array(value :_*))
  }
}
