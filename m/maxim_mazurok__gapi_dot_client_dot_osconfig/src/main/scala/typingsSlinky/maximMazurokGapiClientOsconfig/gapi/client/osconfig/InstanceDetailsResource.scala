package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientOsconfig.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDetailsResource extends js.Object {
  
  /** Get a list of instance details for a given patch job. */
  def list(): Request[ListPatchJobInstanceDetailsResponse] = js.native
  def list(request: Filter): Request[ListPatchJobInstanceDetailsResponse] = js.native
}
