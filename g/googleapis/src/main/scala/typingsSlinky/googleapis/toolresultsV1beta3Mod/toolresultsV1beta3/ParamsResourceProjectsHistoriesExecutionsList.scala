package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsHistoriesExecutionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A History id.  Required.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of Executions to fetch.  Default value: 25. The server
    * will use this default if the field is not set or has a value of 0.
    * Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token to resume the query at the next item.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * A Project id.  Required.
    */
  var projectId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsHistoriesExecutionsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsHistoriesExecutionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsHistoriesExecutionsListMutableBuilder[Self <: ParamsResourceProjectsHistoriesExecutionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
