package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  @scala.inline
  implicit class ListUsersResponseOps[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationToken(value: SearchPaginationTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: UsersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

