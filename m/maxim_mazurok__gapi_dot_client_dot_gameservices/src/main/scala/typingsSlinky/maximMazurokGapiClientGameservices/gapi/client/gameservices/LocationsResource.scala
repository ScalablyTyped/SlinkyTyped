package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Callback
import typingsSlinky.maximMazurokGapiClientGameservices.anon.IncludeUnrevealedLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var gameServerDeployments: GameServerDeploymentsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: IncludeUnrevealedLocations): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var realms: RealmsResource = js.native
}
