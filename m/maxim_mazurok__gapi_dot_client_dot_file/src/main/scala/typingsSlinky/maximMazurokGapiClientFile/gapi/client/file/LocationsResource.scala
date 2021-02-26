package typingsSlinky.maximMazurokGapiClientFile.gapi.client.file

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFile.anon.Callback
import typingsSlinky.maximMazurokGapiClientFile.anon.IncludeUnrevealedLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var backups: BackupsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: IncludeUnrevealedLocations): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
}
