package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Accesstoken
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Callback
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientsResource extends js.Object {
  var invitations: InvitationsResource = js.native
  var users: UsersResource = js.native
  /** Creates a new client buyer. */
  def create(request: Callback): Request[Client] = js.native
  /** Gets a client buyer with a given client account ID. */
  def get(request: Accesstoken): Request[Client] = js.native
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: Fields): Request[ListClientsResponse] = js.native
  /** Updates an existing client buyer. */
  def update(request: Accesstoken): Request[Client] = js.native
}

object ClientsResource {
  @scala.inline
  def apply(
    create: Callback => Request[Client],
    get: Accesstoken => Request[Client],
    invitations: InvitationsResource,
    list: Fields => Request[ListClientsResponse],
    update: Accesstoken => Request[Client],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), invitations = invitations.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsResource]
  }
  @scala.inline
  implicit class ClientsResourceOps[Self <: ClientsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Callback => Request[Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvitations(value: InvitationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ListClientsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Accesstoken => Request[Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsers(value: UsersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

