package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsServicesVersionsInstancesDelete extends StandardParameters {
  
  /**
    * Part of `name`. Name of the resource requested. Example:
    * apps/myapp/services/default/versions/v1/instances/instance-1.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var instancesId: js.UndefOr[String] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.native
}
object ParamsResourceAppsServicesVersionsInstancesDelete {
  
  @scala.inline
  def apply(): ParamsResourceAppsServicesVersionsInstancesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesVersionsInstancesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsServicesVersionsInstancesDeleteMutableBuilder[Self <: ParamsResourceAppsServicesVersionsInstancesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstancesId(value: String): Self = StObject.set(x, "instancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesIdUndefined: Self = StObject.set(x, "instancesId", js.undefined)
    
    @scala.inline
    def setServicesId(value: String): Self = StObject.set(x, "servicesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesIdUndefined: Self = StObject.set(x, "servicesId", js.undefined)
    
    @scala.inline
    def setVersionsId(value: String): Self = StObject.set(x, "versionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsIdUndefined: Self = StObject.set(x, "versionsId", js.undefined)
  }
}
