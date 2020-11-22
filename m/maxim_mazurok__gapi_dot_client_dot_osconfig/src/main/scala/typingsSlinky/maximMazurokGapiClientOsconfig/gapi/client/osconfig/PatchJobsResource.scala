package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Callback
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Filter
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Key
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobsResource extends js.Object {
  
  def cancel(request: Callback, body: CancelPatchJobRequest): Request[PatchJob] = js.native
  /** Cancel a patch job. The patch job must be active. Canceled patch jobs cannot be restarted. */
  def cancel(request: Key): Request[PatchJob] = js.native
  
  /** Patch VM instances by creating and running a patch job. */
  def execute(request: Oauthtoken): Request[PatchJob] = js.native
  def execute(request: Parent, body: ExecutePatchJobRequest): Request[PatchJob] = js.native
  
  /** Get the patch job. This can be used to track the progress of an ongoing patch job or review the details of completed jobs. */
  def get(): Request[PatchJob] = js.native
  def get(request: Callback): Request[PatchJob] = js.native
  
  var instanceDetails: InstanceDetailsResource = js.native
  
  /** Get a list of patch jobs. */
  def list(): Request[ListPatchJobsResponse] = js.native
  def list(request: Filter): Request[ListPatchJobsResponse] = js.native
}
