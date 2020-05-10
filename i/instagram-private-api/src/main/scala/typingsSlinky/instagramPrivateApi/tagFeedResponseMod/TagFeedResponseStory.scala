package typingsSlinky.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFeedResponseStory extends js.Object {
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var expiring_at: Double = js.native
  var id: String = js.native
  var items: js.Array[TagFeedResponseItemsItem] = js.native
  var latest_reel_media: Double = js.native
  var muted: Boolean = js.native
  var owner: TagFeedResponseOwner = js.native
  var prefetch_count: Double = js.native
  var reel_type: String = js.native
  var seen: Double = js.native
  var unique_integer_reel_id: String = js.native
}

object TagFeedResponseStory {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    id: String,
    items: js.Array[TagFeedResponseItemsItem],
    latest_reel_media: Double,
    muted: Boolean,
    owner: TagFeedResponseOwner,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    unique_integer_reel_id: String
  ): TagFeedResponseStory = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], unique_integer_reel_id = unique_integer_reel_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseStory]
  }
  @scala.inline
  implicit class TagFeedResponseStoryOps[Self <: TagFeedResponseStory] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[TagFeedResponseItemsItem]): Self = {
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
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: TagFeedResponseOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
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
    def withUnique_integer_reel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_integer_reel_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

