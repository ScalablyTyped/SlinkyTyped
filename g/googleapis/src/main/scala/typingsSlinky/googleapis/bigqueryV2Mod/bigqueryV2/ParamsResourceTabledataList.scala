package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTabledataList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Dataset ID of the table to read
    */
  var datasetId: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Page token, returned by a previous call, identifying the result set
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Project ID of the table to read
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * List of fields to return (comma-separated). If unspecified, all fields
    * are returned
    */
  var selectedFields: js.UndefOr[String] = js.native
  
  /**
    * Zero-based index of the starting row to read
    */
  var startIndex: js.UndefOr[String] = js.native
  
  /**
    * Table ID of the table to read
    */
  var tableId: js.UndefOr[String] = js.native
}
object ParamsResourceTabledataList {
  
  @scala.inline
  def apply(): ParamsResourceTabledataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTabledataList]
  }
  
  @scala.inline
  implicit class ParamsResourceTabledataListMutableBuilder[Self <: ParamsResourceTabledataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSelectedFields(value: String): Self = StObject.set(x, "selectedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFieldsUndefined: Self = StObject.set(x, "selectedFields", js.undefined)
    
    @scala.inline
    def setStartIndex(value: String): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
