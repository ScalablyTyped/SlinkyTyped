package typingsSlinky.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudtasks.anon.Callback
import typingsSlinky.maximMazurokGapiClientCloudtasks.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var queues: QueuesResource = js.native
}
