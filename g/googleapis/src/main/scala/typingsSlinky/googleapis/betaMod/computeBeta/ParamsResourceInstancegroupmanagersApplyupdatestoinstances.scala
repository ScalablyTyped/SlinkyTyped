package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInstancegroupmanagersApplyupdatestoinstances extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the managed instance group, should conform to RFC1035.
    */
  var instanceGroupManager: js.UndefOr[String] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstanceGroupManagersApplyUpdatesRequest] = js.native
  
  /**
    * The name of the zone where the managed instance group is located. Should
    * conform to RFC1035.
    */
  var zone: js.UndefOr[String] = js.native
}
object ParamsResourceInstancegroupmanagersApplyupdatestoinstances {
  
  @scala.inline
  def apply(): ParamsResourceInstancegroupmanagersApplyupdatestoinstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupmanagersApplyupdatestoinstances]
  }
  
  @scala.inline
  implicit class ParamsResourceInstancegroupmanagersApplyupdatestoinstancesMutableBuilder[Self <: ParamsResourceInstancegroupmanagersApplyupdatestoinstances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstanceGroupManager(value: String): Self = StObject.set(x, "instanceGroupManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupManagerUndefined: Self = StObject.set(x, "instanceGroupManager", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaInstanceGroupManagersApplyUpdatesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
