package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceChangesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    *
    */
  var changeId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var clientOperationId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var managedZone: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceChangesGet {
  
  @scala.inline
  def apply(): ParamsResourceChangesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceChangesGetMutableBuilder[Self <: ParamsResourceChangesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setChangeId(value: String): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeIdUndefined: Self = StObject.set(x, "changeId", js.undefined)
    
    @scala.inline
    def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
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
