package typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRepositorySearchResponseRootObject extends js.Object {
  var has_more: Boolean = js.native
  var num_results: Double = js.native
  var rank_token: String = js.native
  var status: String = js.native
  var users: js.Array[UserRepositorySearchResponseUsersItem] = js.native
}

object UserRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    num_results: Double,
    rank_token: String,
    status: String,
    users: js.Array[UserRepositorySearchResponseUsersItem]
  ): UserRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositorySearchResponseRootObject]
  }
  @scala.inline
  implicit class UserRepositorySearchResponseRootObjectOps[Self <: UserRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_results(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[UserRepositorySearchResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

