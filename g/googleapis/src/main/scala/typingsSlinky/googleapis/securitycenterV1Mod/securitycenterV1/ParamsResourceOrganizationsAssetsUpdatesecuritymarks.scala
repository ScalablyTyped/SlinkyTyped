package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsAssetsUpdatesecuritymarks extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The relative resource name of the SecurityMarks. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Examples: "organizations/123/assets/456/securityMarks"
    * "organizations/123/sources/456/findings/789/securityMarks".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecurityMarks] = js.native
  
  /**
    * The time at which the updated SecurityMarks take effect. If not set uses
    * current server time.  Updates will be applied to the SecurityMarks that
    * are active immediately preceding this time.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The FieldMask to use when updating the security marks resource.  The
    * field mask must not contain duplicate fields. If empty or set to "marks",
    * all marks will be replaced.  Individual marks can be updated using
    * "marks.<mark_key>".
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsAssetsUpdatesecuritymarks {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsAssetsUpdatesecuritymarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsUpdatesecuritymarks]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsAssetsUpdatesecuritymarksMutableBuilder[Self <: ParamsResourceOrganizationsAssetsUpdatesecuritymarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSecurityMarks): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
