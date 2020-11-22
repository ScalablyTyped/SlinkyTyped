package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVault.anon.AccountId
import typingsSlinky.maximMazurokGapiClientVault.anon.HoldId
import typingsSlinky.maximMazurokGapiClientVault.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends js.Object {
  
  /** Adds a HeldAccount to a hold. Accounts can only be added to a hold that has no held_org_unit set. Attempting to add an account to an OU-based hold will result in an error. */
  def create(request: HoldId): Request[HeldAccount] = js.native
  def create(request: Key, body: HeldAccount): Request[HeldAccount] = js.native
  
  /** Removes a HeldAccount from a hold. If this request leaves the hold with no held accounts, the hold will not apply to any accounts. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AccountId): Request[js.Object] = js.native
  
  /** Lists HeldAccounts for a hold. This will only list individually specified held accounts. If the hold is on an OU, then use Admin SDK to enumerate its members. */
  def list(): Request[ListHeldAccountsResponse] = js.native
  def list(request: Key): Request[ListHeldAccountsResponse] = js.native
}
