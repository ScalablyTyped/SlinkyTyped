package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Alt): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Accesstoken): Request[ListLocationsResponse] = js.native
}
