package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientSqladmin.anon.Fields
import typingsSlinky.gapiClientSqladmin.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: Host): Request[Operation] = js.native
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation] = js.native
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: Fields): Request[UsersListResponse] = js.native
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: Host): Request[Operation] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    delete: Host => Request[Operation],
    insert: Fields => Request[Operation],
    list: Fields => Request[UsersListResponse],
    update: Host => Request[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Host => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[UsersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Host => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

