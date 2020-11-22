package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.AccountId
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationsResource extends js.Object {
  
  /** Creates and sends out an email invitation to access an Ad Exchange client buyer account. */
  def create(request: Accesstoken): Request[ClientUserInvitation] = js.native
  def create(request: AccountId, body: ClientUserInvitation): Request[ClientUserInvitation] = js.native
  
  /** Retrieves an existing client user invitation. */
  def get(): Request[ClientUserInvitation] = js.native
  def get(request: Alt): Request[ClientUserInvitation] = js.native
  
  /** Lists all the client users invitations for a client with a given account ID. */
  def list(): Request[ListClientUserInvitationsResponse] = js.native
  def list(request: Callback): Request[ListClientUserInvitationsResponse] = js.native
}
