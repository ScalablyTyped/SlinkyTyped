package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseInbox extends js.Object {
  var blended_inbox_enabled: Boolean = js.native
  var has_older: Boolean = js.native
  var oldest_cursor: String = js.native
  var threads: js.Array[DirectInboxFeedResponseThreadsItem] = js.native
  var unseen_count: Double = js.native
  var unseen_count_ts: String = js.native
}

object DirectInboxFeedResponseInbox {
  @scala.inline
  def apply(
    blended_inbox_enabled: Boolean,
    has_older: Boolean,
    oldest_cursor: String,
    threads: js.Array[DirectInboxFeedResponseThreadsItem],
    unseen_count: Double,
    unseen_count_ts: String
  ): DirectInboxFeedResponseInbox = {
    val __obj = js.Dynamic.literal(blended_inbox_enabled = blended_inbox_enabled.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], unseen_count = unseen_count.asInstanceOf[js.Any], unseen_count_ts = unseen_count_ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseInbox]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseInboxOps[Self <: DirectInboxFeedResponseInbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlended_inbox_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blended_inbox_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_older(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_older")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldest_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[DirectInboxFeedResponseThreadsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnseen_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseen_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnseen_count_ts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseen_count_ts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

