package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupMembersRequest extends StObject {
  
  /**
    * The identifier for the group to which the members (users or groups) are associated.
    */
  var GroupId: WorkMailIdentifier = js.native
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.workmailMod.MaxResults] = js.native
  
  /**
    *  The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
  
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object ListGroupMembersRequest {
  
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): ListGroupMembersRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembersRequest]
  }
  
  @scala.inline
  implicit class ListGroupMembersRequestMutableBuilder[Self <: ListGroupMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
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
  }
}
