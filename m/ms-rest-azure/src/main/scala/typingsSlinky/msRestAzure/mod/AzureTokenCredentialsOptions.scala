package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRestAzure.msRestAzureStrings.batch
import typingsSlinky.msRestAzure.msRestAzureStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureTokenCredentialsOptions extends StObject {
  
  /**
    * The authorization scheme. Default value is 'Bearer'.
    */
  var authorizationScheme: js.UndefOr[String] = js.native
  
  /**
    * The Azure environment to authenticate with.
    */
  var environment: js.UndefOr[AzureEnvironment] = js.native
  
  /**
    * The audience for which the token is requested. Valid values are 'graph', 'batch' or any other resource like 'https://vault.azure.com'.
    * If tokenAudience is 'graph' then domain should also be provided and its value should not be the default 'common' tenant. 
    * It must be a string (preferrably in a guid format).
    */
  var tokenAudience: js.UndefOr[graph | batch | String] = js.native
  
  /**
    * The token cache. Default value is MemoryCache from adal.
    */
  var tokenCache: js.UndefOr[js.Any] = js.native
}
object AzureTokenCredentialsOptions {
  
  @scala.inline
  def apply(): AzureTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureTokenCredentialsOptions]
  }
  
  @scala.inline
  implicit class AzureTokenCredentialsOptionsMutableBuilder[Self <: AzureTokenCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationScheme(value: String): Self = StObject.set(x, "authorizationScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationSchemeUndefined: Self = StObject.set(x, "authorizationScheme", js.undefined)
    
    @scala.inline
    def setEnvironment(value: AzureEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setTokenAudience(value: graph | batch | String): Self = StObject.set(x, "tokenAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenAudienceUndefined: Self = StObject.set(x, "tokenAudience", js.undefined)
    
    @scala.inline
    def setTokenCache(value: js.Any): Self = StObject.set(x, "tokenCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenCacheUndefined: Self = StObject.set(x, "tokenCache", js.undefined)
  }
}
