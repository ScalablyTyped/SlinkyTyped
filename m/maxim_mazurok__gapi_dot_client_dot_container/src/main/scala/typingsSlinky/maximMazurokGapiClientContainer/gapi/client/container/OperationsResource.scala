package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.KeyNameOauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.Name
import typingsSlinky.maximMazurokGapiClientContainer.anon.NameOauthtokenOperationId
import typingsSlinky.maximMazurokGapiClientContainer.anon.OauthtokenOperationId
import typingsSlinky.maximMazurokGapiClientContainer.anon.OauthtokenParent
import typingsSlinky.maximMazurokGapiClientContainer.anon.OperationId
import typingsSlinky.maximMazurokGapiClientContainer.anon.OperationIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /** Cancels the specified operation. */
  def cancel(request: KeyNameOauthtoken): Request[js.Object] = js.native
  def cancel(request: Name, body: CancelOperationRequest): Request[js.Object] = js.native
  /** Cancels the specified operation. */
  def cancel(request: OauthtokenOperationId): Request[js.Object] = js.native
  def cancel(request: OperationIdPrettyPrint, body: CancelOperationRequest): Request[js.Object] = js.native
  
  /** Gets the specified operation. */
  def get(): Request[Operation] = js.native
  def get(request: NameOauthtokenOperationId): Request[Operation] = js.native
  def get(request: OperationId): Request[Operation] = js.native
  
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListOperationsResponse] = js.native
  def list(request: OauthtokenParent): Request[ListOperationsResponse] = js.native
}
