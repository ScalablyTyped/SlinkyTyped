package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDelegatedAdministratorsRequest extends StObject {
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.MaxResults] = js.native
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don't specify a service principal, the operation lists all delegated administrators for all services in your organization.
    */
  var ServicePrincipal: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ServicePrincipal] = js.native
}
object ListDelegatedAdministratorsRequest {
  
  @scala.inline
  def apply(): ListDelegatedAdministratorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedAdministratorsRequest]
  }
  
  @scala.inline
  implicit class ListDelegatedAdministratorsRequestMutableBuilder[Self <: ListDelegatedAdministratorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
