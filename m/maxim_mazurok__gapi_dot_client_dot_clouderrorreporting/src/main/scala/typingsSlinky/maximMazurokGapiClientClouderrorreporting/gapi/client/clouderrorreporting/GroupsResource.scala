package typingsSlinky.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.anon.Fields
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.anon.Key
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends js.Object {
  
  /** Get the specified group. */
  def get(): Request[ErrorGroup] = js.native
  def get(request: Fields): Request[ErrorGroup] = js.native
  
  /** Replace the data for the specified group. Fails if the group does not exist. */
  def update(request: Key): Request[ErrorGroup] = js.native
  def update(request: Name, body: ErrorGroup): Request[ErrorGroup] = js.native
}
