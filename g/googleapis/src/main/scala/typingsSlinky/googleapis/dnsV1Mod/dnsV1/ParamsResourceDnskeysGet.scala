package typingsSlinky.googleapis.dnsV1Mod.dnsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDnskeysGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    *
    */
  var clientOperationId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var digestType: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var dnsKeyId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var managedZone: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceDnskeysGet {
  
  @scala.inline
  def apply(): ParamsResourceDnskeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDnskeysGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDnskeysGetMutableBuilder[Self <: ParamsResourceDnskeysGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    @scala.inline
    def setDigestType(value: String): Self = StObject.set(x, "digestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTypeUndefined: Self = StObject.set(x, "digestType", js.undefined)
    
    @scala.inline
    def setDnsKeyId(value: String): Self = StObject.set(x, "dnsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsKeyIdUndefined: Self = StObject.set(x, "dnsKeyId", js.undefined)
    
    @scala.inline
    def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
