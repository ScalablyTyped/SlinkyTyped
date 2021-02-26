package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsJobsMessagesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Return only messages with timestamps < end_time. The default is now (i.e.
    * return up to the latest messages available).
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The job to get messages about.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Filter to only get messages with importance >= level
    */
  var minimumImportance: js.UndefOr[String] = js.native
  
  /**
    * If specified, determines the maximum number of messages to return.  If
    * unspecified, the service may choose an appropriate default, or may return
    * an arbitrarily large number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If supplied, this should be the value of next_page_token returned by an
    * earlier call. This will cause the next page of results to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * If specified, return only messages with timestamps >= start_time. The
    * default is the job creation time (i.e. beginning of messages).
    */
  var startTime: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsJobsMessagesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsJobsMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsMessagesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsJobsMessagesListMutableBuilder[Self <: ParamsResourceProjectsJobsMessagesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMinimumImportance(value: String): Self = StObject.set(x, "minimumImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumImportanceUndefined: Self = StObject.set(x, "minimumImportance", js.undefined)
    
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
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
