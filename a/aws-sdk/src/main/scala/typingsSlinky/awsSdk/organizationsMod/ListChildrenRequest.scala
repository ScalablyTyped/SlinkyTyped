package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChildrenRequest extends StObject {
  
  /**
    * Filters the output to include only the specified child type.
    */
  var ChildType: typingsSlinky.awsSdk.organizationsMod.ChildType = js.native
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.MaxResults] = js.native
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * The unique identifier (ID) for the parent root or OU whose children you want to list. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var ParentId: typingsSlinky.awsSdk.organizationsMod.ParentId = js.native
}
object ListChildrenRequest {
  
  @scala.inline
  def apply(ChildType: ChildType, ParentId: ParentId): ListChildrenRequest = {
    val __obj = js.Dynamic.literal(ChildType = ChildType.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChildrenRequest]
  }
  
  @scala.inline
  implicit class ListChildrenRequestMutableBuilder[Self <: ListChildrenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildType(value: ChildType): Self = StObject.set(x, "ChildType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParentId(value: ParentId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
  }
}
