package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesInDomainRequest extends StObject {
  
  /**
    *  Filter the list of repositories to only include those that are managed by the AWS account ID. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  
  /**
    *  The name of the domain that contains the returned list of repositories. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults] = js.native
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned. 
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.native
}
object ListRepositoriesInDomainRequest {
  
  @scala.inline
  def apply(domain: DomainName): ListRepositoriesInDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesInDomainRequest]
  }
  
  @scala.inline
  implicit class ListRepositoriesInDomainRequestMutableBuilder[Self <: ListRepositoriesInDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministratorAccount(value: AccountId): Self = StObject.set(x, "administratorAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorAccountUndefined: Self = StObject.set(x, "administratorAccount", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListRepositoriesInDomainMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositoryPrefix(value: RepositoryName): Self = StObject.set(x, "repositoryPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryPrefixUndefined: Self = StObject.set(x, "repositoryPrefix", js.undefined)
  }
}
