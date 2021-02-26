package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRepositoryEndpointMod {
  
  @JSImport("@pulumi/aws/codeartifact/getRepositoryEndpoint", "getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs): js.Promise[GetRepositoryEndpointResult] = js.native
  @JSImport("@pulumi/aws/codeartifact/getRepositoryEndpoint", "getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs, opts: InvokeOptions): js.Promise[GetRepositoryEndpointResult] = js.native
  
  @js.native
  trait GetRepositoryEndpointArgs extends StObject {
    
    /**
      * The name of the domain that contains the repository.
      */
    val domain: String = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[String] = js.native
    
    /**
      * Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, and `maven`.
      */
    val format: String = js.native
    
    /**
      * The name of the repository.
      */
    val repository: String = js.native
  }
  object GetRepositoryEndpointArgs {
    
    @scala.inline
    def apply(domain: String, format: String, repository: String): GetRepositoryEndpointArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryEndpointArgs]
    }
    
    @scala.inline
    implicit class GetRepositoryEndpointArgsMutableBuilder[Self <: GetRepositoryEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetRepositoryEndpointResult extends StObject {
    
    val domain: String = js.native
    
    val domainOwner: String = js.native
    
    val format: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val repository: String = js.native
    
    /**
      * The URL of the returned endpoint.
      */
    val repositoryEndpoint: String = js.native
  }
  object GetRepositoryEndpointResult {
    
    @scala.inline
    def apply(
      domain: String,
      domainOwner: String,
      format: String,
      id: String,
      repository: String,
      repositoryEndpoint: String
    ): GetRepositoryEndpointResult = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], domainOwner = domainOwner.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], repositoryEndpoint = repositoryEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryEndpointResult]
    }
    
    @scala.inline
    implicit class GetRepositoryEndpointResultMutableBuilder[Self <: GetRepositoryEndpointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryEndpoint(value: String): Self = StObject.set(x, "repositoryEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
