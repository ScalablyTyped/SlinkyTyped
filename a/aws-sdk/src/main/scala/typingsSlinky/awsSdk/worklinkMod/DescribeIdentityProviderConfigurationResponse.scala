package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityProviderConfigurationResponse extends StObject {
  
  /**
    * The SAML metadata document provided by the user’s identity provider.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.IdentityProviderType] = js.native
  
  /**
    * The SAML metadata document uploaded to the user’s identity provider.
    */
  var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
}
object DescribeIdentityProviderConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeIdentityProviderConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeIdentityProviderConfigurationResponseMutableBuilder[Self <: DescribeIdentityProviderConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderSamlMetadataUndefined: Self = StObject.set(x, "IdentityProviderSamlMetadata", js.undefined)
    
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    @scala.inline
    def setServiceProviderSamlMetadata(value: SamlMetadata): Self = StObject.set(x, "ServiceProviderSamlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProviderSamlMetadataUndefined: Self = StObject.set(x, "ServiceProviderSamlMetadata", js.undefined)
  }
}
