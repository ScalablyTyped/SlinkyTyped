package typingsSlinky.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectRepositoryRankedRecipientsResponseRootObject extends js.Object {
  var expires: Double = js.native
  var filtered: Boolean = js.native
  var rank_token: String = js.native
  var ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem] = js.native
  var request_id: String = js.native
  var status: String = js.native
}

object DirectRepositoryRankedRecipientsResponseRootObject {
  @scala.inline
  def apply(
    expires: Double,
    filtered: Boolean,
    rank_token: String,
    ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem],
    request_id: String,
    status: String
  ): DirectRepositoryRankedRecipientsResponseRootObject = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], ranked_recipients = ranked_recipients.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRootObject]
  }
  @scala.inline
  implicit class DirectRepositoryRankedRecipientsResponseRootObjectOps[Self <: DirectRepositoryRankedRecipientsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanked_recipients(value: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranked_recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
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

