package typingsSlinky.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.Name
import typingsSlinky.maximMazurokGapiClientAccesscontextmanager.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcpUserAccessBindingsResource extends js.Object {
  
  /**
    * Creates a GcpUserAccessBinding. If the client specifies a name, the server will ignore it. Fails if a resource already exists with the same group_key. Completion of this
    * long-running operation does not necessarily signify that the new binding is deployed onto all affected users, which may take more time.
    */
  def create(request: AccesstokenAlt): Request[Operation] = js.native
  def create(request: Alt, body: GcpUserAccessBinding): Request[Operation] = js.native
  
  /**
    * Deletes a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the binding deletion is deployed onto all affected users, which may take
    * more time.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets the GcpUserAccessBinding with the given name. */
  def get(): Request[GcpUserAccessBinding] = js.native
  def get(request: Callback): Request[GcpUserAccessBinding] = js.native
  
  /** Lists all GcpUserAccessBindings for a Google Cloud organization. */
  def list(): Request[ListGcpUserAccessBindingsResponse] = js.native
  def list(request: PageSize): Request[ListGcpUserAccessBindingsResponse] = js.native
  
  /**
    * Updates a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the changed binding is deployed onto all affected users, which may take
    * more time.
    */
  def patch(request: AltCallback): Request[Operation] = js.native
  def patch(request: Name, body: GcpUserAccessBinding): Request[Operation] = js.native
}
