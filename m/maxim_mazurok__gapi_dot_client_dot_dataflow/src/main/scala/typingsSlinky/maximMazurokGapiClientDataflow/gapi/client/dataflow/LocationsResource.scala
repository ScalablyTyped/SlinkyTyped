package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.AltCallbackFields
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var flexTemplates: FlexTemplatesResource = js.native
  
  var jobs: JobsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var sql: SqlResource = js.native
  
  var templates: TemplatesResource = js.native
  
  /** Send a worker_message to the service. */
  def workerMessages(request: AltCallbackFields): Request[SendWorkerMessagesResponse] = js.native
  def workerMessages(request: QuotaUserUploadType, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
}
