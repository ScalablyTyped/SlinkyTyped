package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the object returned from a
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`} operation. Contains the list
  * of users for the current batch and the next page token if available.
  */
@js.native
trait ListUsersResult extends js.Object {
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The list of {@link admin.auth.UserRecord `UserRecord`} objects for the
    * current downloaded batch.
    */
  var users: js.Array[UserRecord] = js.native
}

object ListUsersResult {
  @scala.inline
  def apply(users: js.Array[UserRecord]): ListUsersResult = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResult]
  }
  @scala.inline
  implicit class ListUsersResultOps[Self <: ListUsersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsers(value: js.Array[UserRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

