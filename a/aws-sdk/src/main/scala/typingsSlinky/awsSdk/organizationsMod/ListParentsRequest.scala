package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListParentsRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the OU or account whose parent containers you want to list. Don't specify a root. The regex pattern for a child ID string requires one of the following:    Account - A string that consists of exactly 12 digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var ChildId: typingsSlinky.awsSdk.organizationsMod.ChildId = js.native
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.MaxResults] = js.native
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
}
object ListParentsRequest {
  
  @scala.inline
  def apply(ChildId: ChildId): ListParentsRequest = {
    val __obj = js.Dynamic.literal(ChildId = ChildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParentsRequest]
  }
  
  @scala.inline
  implicit class ListParentsRequestMutableBuilder[Self <: ListParentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildId(value: ChildId): Self = StObject.set(x, "ChildId", value.asInstanceOf[js.Any])
    
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
