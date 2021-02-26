package typingsSlinky.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a tenant configuration.
  *
  * Multi-tenancy support requires Google Cloud's Identity Platform
  * (GCIP). To learn more about GCIP, including pricing and features,
  * see the [GCIP documentation](https://cloud.google.com/identity-platform)
  *
  * Before multi-tenancy can be used on a Google Cloud Identity Platform project,
  * tenants must be allowed on that project via the Cloud Console UI.
  *
  * A tenant configuration provides information such as the display name, tenant
  * identifier and email authentication configuration.
  * For OIDC/SAML provider configuration management, `TenantAwareAuth` instances should
  * be used instead of a `Tenant` to retrieve the list of configured IdPs on a tenant.
  * When configuring these providers, note that tenants will inherit
  * whitelisted domains and authenticated redirect URIs of their parent project.
  *
  * All other settings of a tenant will also be inherited. These will need to be managed
  * from the Cloud Console UI.
  */
@js.native
trait Tenant extends StObject {
  
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The email sign in provider configuration.
    */
  var emailSignInConfig: js.UndefOr[Enabled] = js.native
  
  /**
    * The multi-factor auth configuration on the current tenant.
    */
  var multiFactorConfig: js.UndefOr[MultiFactorConfig] = js.native
  
  /**
    * The tenant identifier.
    */
  var tenantId: String = js.native
  
  /**
    * The map containing the test phone number / code pairs for the tenant.
    */
  var testPhoneNumbers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}
object Tenant {
  
  @scala.inline
  def apply(tenantId: String, toJSON: () => js.Object): Tenant = {
    val __obj = js.Dynamic.literal(tenantId = tenantId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Tenant]
  }
  
  @scala.inline
  implicit class TenantMutableBuilder[Self <: Tenant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailSignInConfig(value: Enabled): Self = StObject.set(x, "emailSignInConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSignInConfigUndefined: Self = StObject.set(x, "emailSignInConfig", js.undefined)
    
    @scala.inline
    def setMultiFactorConfig(value: MultiFactorConfig): Self = StObject.set(x, "multiFactorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorConfigUndefined: Self = StObject.set(x, "multiFactorConfig", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
