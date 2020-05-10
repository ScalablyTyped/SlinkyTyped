package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transferMod.NextToken] = js.native
  /**
    * A system-assigned unique identifier for an SFTP server that the users are assigned to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * Returns the user accounts and their properties for the ServerId value that you specify.
    */
  var Users: ListedUsers = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(ServerId: ServerId, Users: ListedUsers): ListUsersResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResponse]
  }
  @scala.inline
  implicit class ListUsersResponseOps[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: ListedUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

