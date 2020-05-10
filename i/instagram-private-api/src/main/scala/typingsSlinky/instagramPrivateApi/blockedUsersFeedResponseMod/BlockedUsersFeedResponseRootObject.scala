package typingsSlinky.instagramPrivateApi.blockedUsersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockedUsersFeedResponseRootObject extends js.Object {
  var blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem] = js.native
  var next_max_id: String = js.native
  var page_size: Double = js.native
  var status: String = js.native
}

object BlockedUsersFeedResponseRootObject {
  @scala.inline
  def apply(
    blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem],
    next_max_id: String,
    page_size: Double,
    status: String
  ): BlockedUsersFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(blocked_list = blocked_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedUsersFeedResponseRootObject]
  }
  @scala.inline
  implicit class BlockedUsersFeedResponseRootObjectOps[Self <: BlockedUsersFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked_list(value: js.Array[BlockedUsersFeedResponseBlockedListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

