package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponse extends js.Object {
  var inbox: DirectInboxFeedResponseInbox = js.native
  var most_recent_inviter: DirectInboxFeedResponseMostRecentInviter = js.native
  var pending_requests_total: Double = js.native
  var seq_id: Double = js.native
  var snapshot_at_ms: Double = js.native
  var status: String = js.native
}

object DirectInboxFeedResponse {
  @scala.inline
  def apply(
    inbox: DirectInboxFeedResponseInbox,
    most_recent_inviter: DirectInboxFeedResponseMostRecentInviter,
    pending_requests_total: Double,
    seq_id: Double,
    snapshot_at_ms: Double,
    status: String
  ): DirectInboxFeedResponse = {
    val __obj = js.Dynamic.literal(inbox = inbox.asInstanceOf[js.Any], most_recent_inviter = most_recent_inviter.asInstanceOf[js.Any], pending_requests_total = pending_requests_total.asInstanceOf[js.Any], seq_id = seq_id.asInstanceOf[js.Any], snapshot_at_ms = snapshot_at_ms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponse]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseOps[Self <: DirectInboxFeedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInbox(value: DirectInboxFeedResponseInbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMost_recent_inviter(value: DirectInboxFeedResponseMostRecentInviter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("most_recent_inviter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending_requests_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_requests_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot_at_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot_at_ms")(value.asInstanceOf[js.Any])
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

