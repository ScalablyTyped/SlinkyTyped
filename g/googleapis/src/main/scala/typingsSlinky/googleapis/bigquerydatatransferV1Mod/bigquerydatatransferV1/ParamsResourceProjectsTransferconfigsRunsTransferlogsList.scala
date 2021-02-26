package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTransferconfigsRunsTransferlogsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Message types to return. If not populated - INFO, WARNING and ERROR
    * messages are returned.
    */
  var messageTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Pagination token, which can be used to request a specific page of
    * `ListTransferLogsRequest` list results. For multiple-page results,
    * `ListTransferLogsResponse` outputs a `next_page` token, which can be used
    * as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Transfer run name in the form:
    * `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsTransferconfigsRunsTransferlogsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTransferconfigsRunsTransferlogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTransferconfigsRunsTransferlogsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTransferconfigsRunsTransferlogsListMutableBuilder[Self <: ParamsResourceProjectsTransferconfigsRunsTransferlogsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMessageTypes(value: js.Array[String]): Self = StObject.set(x, "messageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypesUndefined: Self = StObject.set(x, "messageTypes", js.undefined)
    
    @scala.inline
    def setMessageTypesVarargs(value: String*): Self = StObject.set(x, "messageTypes", js.Array(value :_*))
    
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
