package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVault.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientVault.anon.Alt
import typingsSlinky.maximMazurokGapiClientVault.anon.Callback
import typingsSlinky.maximMazurokGapiClientVault.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportsResource extends js.Object {
  
  /** Creates an Export. */
  def create(request: Accesstoken): Request[Export] = js.native
  def create(request: Alt, body: Export): Request[Export] = js.native
  
  /** Deletes an Export. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an Export. */
  def get(): Request[Export] = js.native
  def get(request: Callback): Request[Export] = js.native
  
  /** Lists Exports. */
  def list(): Request[ListExportsResponse] = js.native
  def list(request: Fields): Request[ListExportsResponse] = js.native
}
