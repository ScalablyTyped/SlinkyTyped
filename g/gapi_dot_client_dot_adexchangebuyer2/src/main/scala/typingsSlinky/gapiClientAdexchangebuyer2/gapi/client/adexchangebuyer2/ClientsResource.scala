package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAccesstoken
import typingsSlinky.gapiClientAdexchangebuyer2.AnonCallback
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientsResource extends js.Object {
  var invitations: InvitationsResource = js.native
  var users: UsersResource = js.native
  /** Creates a new client buyer. */
  def create(request: AnonCallback): Request_[Client] = js.native
  /** Gets a client buyer with a given client account ID. */
  def get(request: AnonAccesstoken): Request_[Client] = js.native
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: AnonFields): Request_[ListClientsResponse] = js.native
  /** Updates an existing client buyer. */
  def update(request: AnonAccesstoken): Request_[Client] = js.native
}

object ClientsResource {
  @scala.inline
  def apply(
    create: AnonCallback => Request_[Client],
    get: AnonAccesstoken => Request_[Client],
    invitations: InvitationsResource,
    list: AnonFields => Request_[ListClientsResponse],
    update: AnonAccesstoken => Request_[Client],
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
    def withCreate(value: AnonCallback => Request_[Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Client]): Self = {
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
    def withList(value: AnonFields => Request_[ListClientsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAccesstoken => Request_[Client]): Self = {
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

