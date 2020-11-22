package typingsSlinky.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Alt
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Callback
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Fields
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Key
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResource extends js.Object {
  
  /** Creates a endpoint, and returns the new Endpoint. */
  def create(request: Accesstoken): Request[Endpoint] = js.native
  def create(request: Alt, body: Endpoint): Request[Endpoint] = js.native
  
  /** Deletes a endpoint. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a endpoint. */
  def get(): Request[Endpoint] = js.native
  def get(request: Callback): Request[Endpoint] = js.native
  
  /** Lists all endpoints. */
  def list(): Request[ListEndpointsResponse] = js.native
  def list(request: Fields): Request[ListEndpointsResponse] = js.native
  
  /** Updates a endpoint. */
  def patch(request: Key): Request[Endpoint] = js.native
  def patch(request: Name, body: Endpoint): Request[Endpoint] = js.native
}
