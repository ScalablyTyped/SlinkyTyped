package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUsersLegacyResponse extends js.Object {
  var users: js.Array[SearchUsersLegacyResponseUsersItem] = js.native
}

object SearchUsersLegacyResponse {
  @scala.inline
  def apply(users: js.Array[SearchUsersLegacyResponseUsersItem]): SearchUsersLegacyResponse = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersLegacyResponse]
  }
  @scala.inline
  implicit class SearchUsersLegacyResponseOps[Self <: SearchUsersLegacyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsers(value: js.Array[SearchUsersLegacyResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

