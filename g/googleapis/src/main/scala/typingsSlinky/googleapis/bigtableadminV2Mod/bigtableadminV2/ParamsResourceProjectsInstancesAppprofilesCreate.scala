package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsInstancesAppprofilesCreate extends StandardParameters {
  
  /**
    * The ID to be used when referring to the new app profile within its
    * instance, e.g., just `myprofile` rather than
    * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
    */
  var appProfileId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If true, ignore safety checks when creating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique name of the instance in which to create the new app profile.
    * Values are of the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.native
}
object ParamsResourceProjectsInstancesAppprofilesCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesAppprofilesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesAppprofilesCreateMutableBuilder[Self <: ParamsResourceProjectsInstancesAppprofilesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppProfileId(value: String): Self = StObject.set(x, "appProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppProfileIdUndefined: Self = StObject.set(x, "appProfileId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAppProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
