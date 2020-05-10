package typingsSlinky.instagramPrivateApi.accountFriendshipsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingFriendshipsFeedResponse extends js.Object {
  var big_list: Boolean = js.native
  var next_max_id: Null = js.native
  var page_size: Double = js.native
  var sections: Null = js.native
  var status: String = js.native
  var users: js.Array[PendingFriendshipsFeedResponseUsersItem] = js.native
}

object PendingFriendshipsFeedResponse {
  @scala.inline
  def apply(
    big_list: Boolean,
    next_max_id: Null,
    page_size: Double,
    sections: Null,
    status: String,
    users: js.Array[PendingFriendshipsFeedResponseUsersItem]
  ): PendingFriendshipsFeedResponse = {
    val __obj = js.Dynamic.literal(big_list = big_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingFriendshipsFeedResponse]
  }
  @scala.inline
  implicit class PendingFriendshipsFeedResponseOps[Self <: PendingFriendshipsFeedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBig_list(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[PendingFriendshipsFeedResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

