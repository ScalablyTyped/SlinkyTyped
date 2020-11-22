package typingsSlinky.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Callback
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var environments: EnvironmentsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
}
