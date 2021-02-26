package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDomainaliasesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Name of domain alias to be retrieved.
    */
  var domainAliasName: js.UndefOr[String] = js.native
}
object ParamsResourceDomainaliasesGet {
  
  @scala.inline
  def apply(): ParamsResourceDomainaliasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainaliasesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDomainaliasesGetMutableBuilder[Self <: ParamsResourceDomainaliasesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDomainAliasName(value: String): Self = StObject.set(x, "domainAliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAliasNameUndefined: Self = StObject.set(x, "domainAliasName", js.undefined)
  }
}
