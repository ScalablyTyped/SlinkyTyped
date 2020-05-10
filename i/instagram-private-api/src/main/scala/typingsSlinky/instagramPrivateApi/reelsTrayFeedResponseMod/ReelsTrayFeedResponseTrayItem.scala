package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseTrayItem extends js.Object {
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var expiring_at: Double = js.native
  var has_besties_media: Boolean = js.native
  var has_pride_media: Boolean = js.native
  var hide_from_feed_unit: js.UndefOr[Boolean] = js.native
  var id: Double = js.native
  var items: js.UndefOr[js.Array[ReelsTrayFeedResponseItemsItem]] = js.native
  var latest_reel_media: Double = js.native
  var media_count: Double = js.native
  var media_ids: js.Array[String] = js.native
  var muted: Boolean = js.native
  var prefetch_count: Double = js.native
  var ranked_position: Double = js.native
  var reel_type: String = js.native
  var seen: Double = js.native
  var seen_ranked_position: Double = js.native
  var user: ReelsTrayFeedResponseUser = js.native
}

object ReelsTrayFeedResponseTrayItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_besties_media: Boolean,
    has_pride_media: Boolean,
    id: Double,
    latest_reel_media: Double,
    media_count: Double,
    media_ids: js.Array[String],
    muted: Boolean,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Double,
    seen_ranked_position: Double,
    user: ReelsTrayFeedResponseUser
  ): ReelsTrayFeedResponseTrayItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_besties_media = has_besties_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTrayItem]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseTrayItemOps[Self <: ReelsTrayFeedResponseTrayItem] (val x: Self) extends AnyVal {
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
    def withHas_besties_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_besties_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_pride_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_pride_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withMedia_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanked_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranked_position")(value.asInstanceOf[js.Any])
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
    def withSeen_ranked_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seen_ranked_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReelsTrayFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_from_feed_unit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_from_feed_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_from_feed_unit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_from_feed_unit")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ReelsTrayFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

