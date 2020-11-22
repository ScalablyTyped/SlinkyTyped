package typingsSlinky.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Accesstoken): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Alt): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var repositories: RepositoriesResource = js.native
}
