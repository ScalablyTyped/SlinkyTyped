package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemVersionsResource extends js.Object {
  
  /** Gets one operating system version by ID. */
  def get(): Request[OperatingSystemVersion] = js.native
  def get(request: Alt): Request[OperatingSystemVersion] = js.native
  
  /** Retrieves a list of operating system versions. */
  def list(): Request[OperatingSystemVersionsListResponse] = js.native
  def list(request: Callback): Request[OperatingSystemVersionsListResponse] = js.native
}
