package typingsSlinky.maximMazurokGapiClientComposer.gapi.client.composer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientComposer.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientComposer.anon.Alt
import typingsSlinky.maximMazurokGapiClientComposer.anon.Callback
import typingsSlinky.maximMazurokGapiClientComposer.anon.Fields
import typingsSlinky.maximMazurokGapiClientComposer.anon.Key
import typingsSlinky.maximMazurokGapiClientComposer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /** Create a new environment. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Environment): Request[Operation] = js.native
  
  /** Delete an environment. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Get an existing environment. */
  def get(): Request[Environment] = js.native
  def get(request: Callback): Request[Environment] = js.native
  
  /** List environments. */
  def list(): Request[ListEnvironmentsResponse] = js.native
  def list(request: Fields): Request[ListEnvironmentsResponse] = js.native
  
  /** Update an environment. */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Environment): Request[Operation] = js.native
}
