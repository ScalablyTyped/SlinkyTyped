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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobInfo
  extends Accessor
     with JSONSupport {
  
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: String = js.native
  
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting` = js.native
  
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.Array[GPMessage] = js.native
}
