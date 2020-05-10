package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponse extends js.Object {
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var expiring_at: Double = js.native
  var id: Double = js.native
  var items: js.Array[ReelsMediaFeedResponseItem] = js.native
  var latest_reel_media: Double = js.native
  var media_count: Double = js.native
  var prefetch_count: Double = js.native
  var reel_type: String = js.native
  var seen: Double = js.native
  var user: ReelsMediaFeedResponseUser = js.native
}

object ReelsMediaFeedResponse {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    id: Double,
    items: js.Array[ReelsMediaFeedResponseItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    user: ReelsMediaFeedResponseUser
  ): ReelsMediaFeedResponse = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponse]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseOps[Self <: ReelsMediaFeedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_reply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiring_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ReelsMediaFeedResponseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest_reel_media(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_reel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReelsMediaFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

