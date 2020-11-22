package typingsSlinky.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientNetworkmanagement.anon.Callback
import typingsSlinky.maximMazurokGapiClientNetworkmanagement.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var global: GlobalResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
}
