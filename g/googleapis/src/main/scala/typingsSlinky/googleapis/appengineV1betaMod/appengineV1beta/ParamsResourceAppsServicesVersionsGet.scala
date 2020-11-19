package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsServicesVersionsGet extends StandardParameters {
  
  /**
    * Part of `name`. Name of the resource requested. Example:
    * apps/myapp/services/default/versions/v1.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.native
  
  /**
    * Controls the set of fields returned in the Get response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceAppsServicesVersionsGet {
  
  @scala.inline
  def apply(): ParamsResourceAppsServicesVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesVersionsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsServicesVersionsGetOps[Self <: ParamsResourceAppsServicesVersionsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setServicesId(value: String): Self = this.set("servicesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesId: Self = this.set("servicesId", js.undefined)
    
    @scala.inline
    def setVersionsId(value: String): Self = this.set("versionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionsId: Self = this.set("versionsId", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
