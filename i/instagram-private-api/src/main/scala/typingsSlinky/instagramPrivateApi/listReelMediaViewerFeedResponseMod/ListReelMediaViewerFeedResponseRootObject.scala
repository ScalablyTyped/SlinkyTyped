package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseRootObject extends js.Object {
  var next_max_id: String | Null = js.native
  var status: String = js.native
  var total_viewer_count: Double = js.native
  var updated_media: ListReelMediaViewerFeedResponseUpdatedMedia = js.native
  var user_count: Double = js.native
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem] = js.native
}

object ListReelMediaViewerFeedResponseRootObject {
  @scala.inline
  def apply(
    status: String,
    total_viewer_count: Double,
    updated_media: ListReelMediaViewerFeedResponseUpdatedMedia,
    user_count: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseRootObject]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseRootObjectOps[Self <: ListReelMediaViewerFeedResponseRootObject] (val x: Self) extends AnyVal {
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
    def withTotal_viewer_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_viewer_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_media(value: ListReelMediaViewerFeedResponseUpdatedMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[ListReelMediaViewerFeedResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(null)
        ret
    }
  }
  
}

