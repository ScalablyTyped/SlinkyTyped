package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateExternalConnectionRequest extends StObject {
  
  /**
    * The name of the domain that contains the repository from which to remove the external repository. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the external connection to be removed from the repository. 
    */
  var externalConnection: ExternalConnectionName = js.native
  
  /**
    * The name of the repository from which the external connection will be removed. 
    */
  var repository: RepositoryName = js.native
}
object DisassociateExternalConnectionRequest {
  
  @scala.inline
  def apply(domain: DomainName, externalConnection: ExternalConnectionName, repository: RepositoryName): DisassociateExternalConnectionRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], externalConnection = externalConnection.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateExternalConnectionRequest]
  }
  
  @scala.inline
  implicit class DisassociateExternalConnectionRequestMutableBuilder[Self <: DisassociateExternalConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setExternalConnection(value: ExternalConnectionName): Self = StObject.set(x, "externalConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
