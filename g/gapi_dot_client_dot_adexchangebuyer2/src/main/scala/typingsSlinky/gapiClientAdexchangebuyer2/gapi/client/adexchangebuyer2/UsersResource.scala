package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAlt
import typingsSlinky.gapiClientAdexchangebuyer2.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: AnonBearertoken): Request_[ClientUser] = js.native
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUsersResponse] = js.native
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: AnonBearertoken): Request_[ClientUser] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    get: AnonBearertoken => Request_[ClientUser],
    list: AnonAlt => Request_[ListClientUsersResponse],
    update: AnonBearertoken => Request_[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[ClientUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListClientUsersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBearertoken => Request_[ClientUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

