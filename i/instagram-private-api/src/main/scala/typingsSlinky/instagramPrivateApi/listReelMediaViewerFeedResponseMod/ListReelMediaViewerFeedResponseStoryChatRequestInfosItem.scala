package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseStoryChatRequestInfosItem extends js.Object {
  var cursor: String = js.native
  var requester_usernames: ListReelMediaViewerFeedResponseRequesterUsernames = js.native
  var total_participant_requests: Double = js.native
  var total_thread_participants: Double = js.native
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem] = js.native
}

object ListReelMediaViewerFeedResponseStoryChatRequestInfosItem {
  @scala.inline
  def apply(
    cursor: String,
    requester_usernames: ListReelMediaViewerFeedResponseRequesterUsernames,
    total_participant_requests: Double,
    total_thread_participants: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseStoryChatRequestInfosItem = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], requester_usernames = requester_usernames.asInstanceOf[js.Any], total_participant_requests = total_participant_requests.asInstanceOf[js.Any], total_thread_participants = total_thread_participants.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryChatRequestInfosItem]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryChatRequestInfosItemOps[Self <: ListReelMediaViewerFeedResponseStoryChatRequestInfosItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequester_usernames(value: ListReelMediaViewerFeedResponseRequesterUsernames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_usernames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_participant_requests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_participant_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_thread_participants(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_thread_participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[ListReelMediaViewerFeedResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

