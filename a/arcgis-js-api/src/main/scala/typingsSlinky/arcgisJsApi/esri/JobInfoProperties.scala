package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-cancelled`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-cancelling`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-deleted`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-deleting`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-executing`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-failed`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-new`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-submitted`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-succeeded`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-timed-out`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`job-waiting`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobInfoProperties extends StObject {
  
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: js.UndefOr[
    `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
  ] = js.native
  
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.UndefOr[js.Array[GPMessageProperties]] = js.native
}
object JobInfoProperties {
  
  @scala.inline
  def apply(): JobInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobInfoProperties]
  }
  
  @scala.inline
  implicit class JobInfoPropertiesMutableBuilder[Self <: JobInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobStatus(
      value: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
    ): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "jobStatus", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GPMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GPMessageProperties*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
