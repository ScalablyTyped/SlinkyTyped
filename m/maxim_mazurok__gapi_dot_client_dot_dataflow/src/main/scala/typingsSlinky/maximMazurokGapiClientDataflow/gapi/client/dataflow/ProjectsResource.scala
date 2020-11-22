package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.AccesstokenAltCallback
import typingsSlinky.maximMazurokGapiClientDataflow.anon.CallbackFieldsKey
import typingsSlinky.maximMazurokGapiClientDataflow.anon.SnapshotIdUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var catalogTemplates: CatalogTemplatesResource = js.native
  
  /** Deletes a snapshot. */
  def deleteSnapshots(): Request[js.Object] = js.native
  def deleteSnapshots(request: SnapshotIdUploadType): Request[js.Object] = js.native
  
  var jobs: JobsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var templateVersions: TemplateVersionsResource = js.native
  
  var templates: TemplatesResource = js.native
  
  def workerMessages(request: AccesstokenAltCallback, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: CallbackFieldsKey): Request[SendWorkerMessagesResponse] = js.native
}
