package typingsSlinky.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatafusion.anon.LatestPatchOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends js.Object {
  
  /** Lists possible versions for Data Fusion instances in the specified project and location. */
  def list(): Request[ListAvailableVersionsResponse] = js.native
  def list(request: LatestPatchOnly): Request[ListAvailableVersionsResponse] = js.native
}
