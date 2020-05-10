package typingsSlinky.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryCreateReelResponseReel extends js.Object {
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var contains_stitched_media_blocked_by_rm: Boolean = js.native
  var cover_media: HighlightsRepositoryCreateReelResponseCoverMedia = js.native
  var created_at: Double = js.native
  var has_pride_media: Boolean = js.native
  var id: String = js.native
  var items: js.Array[HighlightsRepositoryCreateReelResponseItemsItem] = js.native
  var latest_reel_media: Double = js.native
  var media_count: Double = js.native
  var prefetch_count: Double = js.native
  var ranked_position: Double = js.native
  var reel_type: String = js.native
  var seen: Null = js.native
  var seen_ranked_position: Double = js.native
  var title: String = js.native
  var user: HighlightsRepositoryCreateReelResponseUser = js.native
}

object HighlightsRepositoryCreateReelResponseReel {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    contains_stitched_media_blocked_by_rm: Boolean,
    cover_media: HighlightsRepositoryCreateReelResponseCoverMedia,
    created_at: Double,
    has_pride_media: Boolean,
    id: String,
    items: js.Array[HighlightsRepositoryCreateReelResponseItemsItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Null,
    seen_ranked_position: Double,
    title: String,
    user: HighlightsRepositoryCreateReelResponseUser
  ): HighlightsRepositoryCreateReelResponseReel = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], contains_stitched_media_blocked_by_rm = contains_stitched_media_blocked_by_rm.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseReel]
  }
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseReelOps[Self <: HighlightsRepositoryCreateReelResponseReel] (val x: Self) extends AnyVal {
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
    def withContains_stitched_media_blocked_by_rm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains_stitched_media_blocked_by_rm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_media(value: HighlightsRepositoryCreateReelResponseCoverMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_pride_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_pride_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[HighlightsRepositoryCreateReelResponseItemsItem]): Self = {
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
    def withSeen(value: Null): Self = {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: HighlightsRepositoryCreateReelResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

