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
trait ParamsResourceProjectsInstancesAppprofilesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Maximum number of results per page. CURRENTLY UNIMPLEMENTED AND IGNORED.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value of `next_page_token` returned by a previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The unique name of the instance for which a list of app profiles is
    * requested. Values are of the form
    * `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list
    * AppProfiles for all Instances in a project, e.g.,
    * `projects/myproject/instances/-`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsInstancesAppprofilesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesAppprofilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesAppprofilesListMutableBuilder[Self <: ParamsResourceProjectsInstancesAppprofilesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
