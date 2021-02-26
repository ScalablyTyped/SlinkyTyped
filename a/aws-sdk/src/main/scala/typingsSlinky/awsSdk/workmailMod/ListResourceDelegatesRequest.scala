package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceDelegatesRequest extends StObject {
  
  /**
    * The number of maximum results in a page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.workmailMod.MaxResults] = js.native
  
  /**
    * The token used to paginate through the delegates associated with a resource.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
  
  /**
    * The identifier for the organization that contains the resource for which delegates are listed.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifier for the resource whose delegates are listed.
    */
  var ResourceId: WorkMailIdentifier = js.native
}
object ListResourceDelegatesRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: WorkMailIdentifier): ListResourceDelegatesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDelegatesRequest]
  }
  
  @scala.inline
  implicit class ListResourceDelegatesRequestMutableBuilder[Self <: ListResourceDelegatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: WorkMailIdentifier): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
