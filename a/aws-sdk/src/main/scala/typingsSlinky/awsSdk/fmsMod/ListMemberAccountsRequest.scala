package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberAccountsRequest extends StObject {
  
  /**
    * Specifies the number of member account IDs that you want AWS Firewall Manager to return for this request. If you have more IDs than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of member account IDs.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  
  /**
    * If you specify a value for MaxResults and you have more account IDs than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of IDs. For the second and subsequent ListMemberAccountsRequest requests, specify the value of NextToken from the previous response to get information about another batch of member account IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListMemberAccountsRequest {
  
  @scala.inline
  def apply(): ListMemberAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsRequest]
  }
  
  @scala.inline
  implicit class ListMemberAccountsRequestMutableBuilder[Self <: ListMemberAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
