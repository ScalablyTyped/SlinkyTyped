package typingsSlinky.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatafusion.anon.Callback
import typingsSlinky.maximMazurokGapiClientDatafusion.anon.IncludeUnrevealedLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: IncludeUnrevealedLocations): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var versions: VersionsResource = js.native
}
