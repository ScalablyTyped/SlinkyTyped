package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClientUsersResponse extends js.Object {
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientUsersRequest.pageToken
    * field in the subsequent call to the
    * clients.invitations.list
    * method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The returned list of client users. */
  var users: js.UndefOr[js.Array[ClientUser]] = js.native
}

object ListClientUsersResponse {
  @scala.inline
  def apply(): ListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientUsersResponse]
  }
  @scala.inline
  implicit class ListClientUsersResponseOps[Self <: ListClientUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[ClientUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

