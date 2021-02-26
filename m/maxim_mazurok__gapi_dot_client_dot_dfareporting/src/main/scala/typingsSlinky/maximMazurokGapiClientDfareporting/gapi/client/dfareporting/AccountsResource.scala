package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Fields
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Id
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /** Gets one account by ID. */
  def get(): Request[Account] = js.native
  def get(request: Alt): Request[Account] = js.native
  
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(): Request[AccountsListResponse] = js.native
  def list(request: Fields): Request[AccountsListResponse] = js.native
  
  def patch(request: Alt, body: Account): Request[Account] = js.native
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: Id): Request[Account] = js.native
  
  def update(request: Callback, body: Account): Request[Account] = js.native
  /** Updates an existing account. */
  def update(request: Key): Request[Account] = js.native
}
