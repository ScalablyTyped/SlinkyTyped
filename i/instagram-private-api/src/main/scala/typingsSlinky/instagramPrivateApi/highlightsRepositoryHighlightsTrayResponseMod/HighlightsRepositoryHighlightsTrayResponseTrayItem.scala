package typingsSlinky.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryHighlightsTrayResponseTrayItem extends js.Object {
  var can_reply: Boolean = js.native
  var can_reshare: Null = js.native
  var cover_media: HighlightsRepositoryHighlightsTrayResponseCoverMedia = js.native
  var has_pride_media: Boolean = js.native
  var id: String = js.native
  var latest_reel_media: Double = js.native
  var media_count: Double = js.native
  var prefetch_count: Double = js.native
  var ranked_position: Double = js.native
  var reel_type: String = js.native
  var seen: Null = js.native
  var seen_ranked_position: Double = js.native
  var title: String = js.native
  var user: HighlightsRepositoryHighlightsTrayResponseUser = js.native
}

object HighlightsRepositoryHighlightsTrayResponseTrayItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Null,
    cover_media: HighlightsRepositoryHighlightsTrayResponseCoverMedia,
    has_pride_media: Boolean,
    id: String,
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Null,
    seen_ranked_position: Double,
    title: String,
    user: HighlightsRepositoryHighlightsTrayResponseUser
  ): HighlightsRepositoryHighlightsTrayResponseTrayItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTrayItem]
  }
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseTrayItemOps[Self <: HighlightsRepositoryHighlightsTrayResponseTrayItem] (val x: Self) extends AnyVal {
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
    def withCan_reshare(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_media(value: HighlightsRepositoryHighlightsTrayResponseCoverMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_media")(value.asInstanceOf[js.Any])
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
    def withUser(value: HighlightsRepositoryHighlightsTrayResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

