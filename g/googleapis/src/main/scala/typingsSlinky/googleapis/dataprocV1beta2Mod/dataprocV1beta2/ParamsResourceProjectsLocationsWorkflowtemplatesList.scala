package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsWorkflowtemplatesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The maximum number of results to return in each response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The page token, returned by a previous call, to request the
    * next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The "resource name" of the region, as described in
    * https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsWorkflowtemplatesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsWorkflowtemplatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowtemplatesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsWorkflowtemplatesListMutableBuilder[Self <: ParamsResourceProjectsLocationsWorkflowtemplatesList] (val x: Self) extends AnyVal {
    
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
