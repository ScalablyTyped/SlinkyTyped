package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRun.anon.Alt
import typingsSlinky.maximMazurokGapiClientRun.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutesResource extends StObject {
  
  /** Get information about a route. */
  def get(): Request[Route] = js.native
  def get(request: Alt): Request[Route] = js.native
  
  /** List routes. */
  def list(): Request[ListRoutesResponse] = js.native
  def list(request: Callback): Request[ListRoutesResponse] = js.native
}
