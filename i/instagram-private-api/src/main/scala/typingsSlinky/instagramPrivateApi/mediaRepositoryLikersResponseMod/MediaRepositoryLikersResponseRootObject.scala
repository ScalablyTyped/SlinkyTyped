package typingsSlinky.instagramPrivateApi.mediaRepositoryLikersResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryLikersResponseRootObject extends js.Object {
  var status: String = js.native
  var user_count: Double = js.native
  var users: js.Array[MediaRepositoryLikersResponseUsersItem] = js.native
}

object MediaRepositoryLikersResponseRootObject {
  @scala.inline
  def apply(status: String, user_count: Double, users: js.Array[MediaRepositoryLikersResponseUsersItem]): MediaRepositoryLikersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryLikersResponseRootObject]
  }
  @scala.inline
  implicit class MediaRepositoryLikersResponseRootObjectOps[Self <: MediaRepositoryLikersResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[MediaRepositoryLikersResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

