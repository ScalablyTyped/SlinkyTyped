package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseChannelsItem extends js.Object {
  var approx_total_videos: Null = js.native
  var cover_photo_url: Null = js.native
  var description: Null = js.native
  var id: String = js.native
  var items: js.Array[_] = js.native
  var max_id: Null = js.native
  var more_available: Boolean = js.native
  var seen_state: IgtvBrowseFeedResponseSeenState = js.native
  var title: String = js.native
  var `type`: String = js.native
  var user_dict: Null = js.native
}

object IgtvBrowseFeedResponseChannelsItem {
  @scala.inline
  def apply(
    approx_total_videos: Null,
    cover_photo_url: Null,
    description: Null,
    id: String,
    items: js.Array[_],
    max_id: Null,
    more_available: Boolean,
    seen_state: IgtvBrowseFeedResponseSeenState,
    title: String,
    `type`: String,
    user_dict: Null
  ): IgtvBrowseFeedResponseChannelsItem = {
    val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseChannelsItem]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseChannelsItemOps[Self <: IgtvBrowseFeedResponseChannelsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprox_total_videos(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approx_total_videos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_photo_url(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_photo_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeen_state(value: IgtvBrowseFeedResponseSeenState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seen_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_dict(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_dict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

