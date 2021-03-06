package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTransferjobsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A list of query parameters specified as JSON text in the form of
    * {"project_id":"my_project_id", "job_names":["jobid1","jobid2",...],
    * "job_statuses":["status1","status2",...]}. Since `job_names` and
    * `job_statuses` support multiple values, their values must be specified
    * with array notation. `project_id` is required. `job_names` and
    * `job_statuses` are optional.  The valid values for `job_statuses` are
    * case-insensitive: `ENABLED`, `DISABLED`, and `DELETED`.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The list page size. The max allowed value is 256.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceTransferjobsList {
  
  @scala.inline
  def apply(): ParamsResourceTransferjobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransferjobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceTransferjobsListMutableBuilder[Self <: ParamsResourceTransferjobsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
