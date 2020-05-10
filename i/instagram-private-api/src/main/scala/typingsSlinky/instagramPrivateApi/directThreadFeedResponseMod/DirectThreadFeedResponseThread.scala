package typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadFeedResponseThread extends js.Object {
  var admin_user_ids: js.Array[_] = js.native
  var archived: Boolean = js.native
  var canonical: Boolean = js.native
  var folder: Double = js.native
  var has_newer: Boolean = js.native
  var has_older: Boolean = js.native
  var inviter: DirectThreadFeedResponseInviter = js.native
  var is_group: Boolean = js.native
  var is_pin: Boolean = js.native
  var items: js.Array[DirectThreadFeedResponseItemsItem] = js.native
  var last_activity_at: String = js.native
  var last_permanent_item: DirectThreadFeedResponseLastPermanentItem = js.native
  var last_seen_at: DirectThreadFeedResponseLastSeenAt = js.native
  var left_users: js.Array[_] = js.native
  var mentions_muted: Boolean = js.native
  var muted: Boolean = js.native
  var named: Boolean = js.native
  var newest_cursor: String = js.native
  var oldest_cursor: String = js.native
  var pending: Boolean = js.native
  var pending_score: String = js.native
  var prev_cursor: String = js.native
  var thread_id: String = js.native
  var thread_title: String = js.native
  var thread_type: String = js.native
  var thread_v2_id: String = js.native
  var users: js.Array[_] = js.native
  var valued_request: Boolean = js.native
  var vc_muted: Boolean = js.native
  var viewer_id: Double = js.native
}

object DirectThreadFeedResponseThread {
  @scala.inline
  def apply(
    admin_user_ids: js.Array[_],
    archived: Boolean,
    canonical: Boolean,
    folder: Double,
    has_newer: Boolean,
    has_older: Boolean,
    inviter: DirectThreadFeedResponseInviter,
    is_group: Boolean,
    is_pin: Boolean,
    items: js.Array[DirectThreadFeedResponseItemsItem],
    last_activity_at: String,
    last_permanent_item: DirectThreadFeedResponseLastPermanentItem,
    last_seen_at: DirectThreadFeedResponseLastSeenAt,
    left_users: js.Array[_],
    mentions_muted: Boolean,
    muted: Boolean,
    named: Boolean,
    newest_cursor: String,
    oldest_cursor: String,
    pending: Boolean,
    pending_score: String,
    prev_cursor: String,
    thread_id: String,
    thread_title: String,
    thread_type: String,
    thread_v2_id: String,
    users: js.Array[_],
    valued_request: Boolean,
    vc_muted: Boolean,
    viewer_id: Double
  ): DirectThreadFeedResponseThread = {
    val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadFeedResponseThread]
  }
  @scala.inline
  implicit class DirectThreadFeedResponseThreadOps[Self <: DirectThreadFeedResponseThread] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin_user_ids(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_user_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanonical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_newer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_newer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_older(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_older")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInviter(value: DirectThreadFeedResponseInviter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_group(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_pin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[DirectThreadFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_activity_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_activity_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_permanent_item(value: DirectThreadFeedResponseLastPermanentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_permanent_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_seen_at(value: DirectThreadFeedResponseLastSeenAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seen_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft_users(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMentions_muted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewest_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newest_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldest_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending_score(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_v2_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_v2_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValued_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valued_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVc_muted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vc_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

