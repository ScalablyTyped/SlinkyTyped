package typingsSlinky.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var created_at: String = js.native
  var liked_count: Double = js.native
  var liking_count: Double = js.native
  var md5: String = js.native
  var status: UserStatus = js.native
  var user_id: Double = js.native
  var username: String = js.native
}

object User {
  @scala.inline
  def apply(
    created_at: String,
    liked_count: Double,
    liking_count: Double,
    md5: String,
    status: UserStatus,
    user_id: Double,
    username: String
  ): User = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], liked_count = liked_count.asInstanceOf[js.Any], liking_count = liking_count.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiked_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liked_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiking_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liking_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: UserStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

