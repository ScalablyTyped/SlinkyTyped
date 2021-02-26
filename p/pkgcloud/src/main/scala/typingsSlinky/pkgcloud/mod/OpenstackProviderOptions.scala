package typingsSlinky.pkgcloud.mod

import typingsSlinky.pkgcloud.pkgcloudStrings.openstack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenstackProviderOptions extends StObject {
  
  var authUrl: String = js.native
  
  var domainId: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var keystoneAuthVersion: js.UndefOr[String] = js.native
  
  var password: String = js.native
  
  var provider: openstack = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var tenantId: js.UndefOr[String] = js.native
  
  var username: String = js.native
  
  var version: js.UndefOr[String] = js.native
}
object OpenstackProviderOptions {
  
  @scala.inline
  def apply(authUrl: String, password: String, provider: openstack, username: String): OpenstackProviderOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenstackProviderOptions]
  }
  
  @scala.inline
  implicit class OpenstackProviderOptionsMutableBuilder[Self <: OpenstackProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setKeystoneAuthVersion(value: String): Self = StObject.set(x, "keystoneAuthVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystoneAuthVersionUndefined: Self = StObject.set(x, "keystoneAuthVersion", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: openstack): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
