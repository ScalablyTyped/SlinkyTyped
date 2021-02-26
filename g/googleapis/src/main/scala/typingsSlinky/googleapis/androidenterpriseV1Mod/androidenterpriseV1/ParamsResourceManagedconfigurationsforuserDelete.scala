package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagedconfigurationsforuserDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the managed configuration (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var managedConfigurationForUserId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceManagedconfigurationsforuserDelete {
  
  @scala.inline
  def apply(): ParamsResourceManagedconfigurationsforuserDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationsforuserDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceManagedconfigurationsforuserDeleteMutableBuilder[Self <: ParamsResourceManagedconfigurationsforuserDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForUserId(value: String): Self = StObject.set(x, "managedConfigurationForUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationForUserIdUndefined: Self = StObject.set(x, "managedConfigurationForUserId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
