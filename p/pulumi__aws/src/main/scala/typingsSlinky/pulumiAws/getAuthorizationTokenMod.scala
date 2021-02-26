package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAuthorizationTokenMod {
  
  @JSImport("@pulumi/aws/codeartifact/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws/codeartifact/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  
  @js.native
  trait GetAuthorizationTokenArgs extends StObject {
    
    /**
      * The name of the domain that is in scope for the generated authorization token.
      */
    val domain: String = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[String] = js.native
    
    /**
      * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
      */
    val durationSeconds: js.UndefOr[Double] = js.native
  }
  object GetAuthorizationTokenArgs {
    
    @scala.inline
    def apply(domain: String): GetAuthorizationTokenArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAuthorizationTokenArgs]
    }
    
    @scala.inline
    implicit class GetAuthorizationTokenArgsMutableBuilder[Self <: GetAuthorizationTokenArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    }
  }
  
  @js.native
  trait GetAuthorizationTokenResult extends StObject {
    
    /**
      * Temporary authorization token.
      */
    val authorizationToken: String = js.native
    
    val domain: String = js.native
    
    val domainOwner: String = js.native
    
    val durationSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The time in UTC RFC3339 format when the authorization token expires.
      */
    val expiration: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
  }
  object GetAuthorizationTokenResult {
    
    @scala.inline
    def apply(authorizationToken: String, domain: String, domainOwner: String, expiration: String, id: String): GetAuthorizationTokenResult = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], domainOwner = domainOwner.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAuthorizationTokenResult]
    }
    
    @scala.inline
    implicit class GetAuthorizationTokenResultMutableBuilder[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
      
      @scala.inline
      def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
