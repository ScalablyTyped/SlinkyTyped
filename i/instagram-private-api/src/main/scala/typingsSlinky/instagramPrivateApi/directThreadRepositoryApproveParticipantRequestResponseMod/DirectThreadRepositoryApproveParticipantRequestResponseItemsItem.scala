package typingsSlinky.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryApproveParticipantRequestResponseItemsItem extends js.Object {
  var item_id: String = js.native
  var item_type: String = js.native
  var story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare = js.native
  var timestamp: String = js.native
  var user_id: Double = js.native
}

object DirectThreadRepositoryApproveParticipantRequestResponseItemsItem {
  @scala.inline
  def apply(
    item_id: String,
    item_type: String,
    story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare,
    timestamp: String,
    user_id: Double
  ): DirectThreadRepositoryApproveParticipantRequestResponseItemsItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], story_share = story_share.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem]
  }
  @scala.inline
  implicit class DirectThreadRepositoryApproveParticipantRequestResponseItemsItemOps[Self <: DirectThreadRepositoryApproveParticipantRequestResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_share(value: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

