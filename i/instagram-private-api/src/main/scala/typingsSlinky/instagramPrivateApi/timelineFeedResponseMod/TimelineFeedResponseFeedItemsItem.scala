package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponseFeedItemsItem extends js.Object {
  var media_or_ad: TimelineFeedResponseMediaOrAd = js.native
  var stories_netego: js.UndefOr[TimelineFeedResponseStoriesNetego] = js.native
}

object TimelineFeedResponseFeedItemsItem {
  @scala.inline
  def apply(media_or_ad: TimelineFeedResponseMediaOrAd): TimelineFeedResponseFeedItemsItem = {
    val __obj = js.Dynamic.literal(media_or_ad = media_or_ad.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFeedItemsItem]
  }
  @scala.inline
  implicit class TimelineFeedResponseFeedItemsItemOps[Self <: TimelineFeedResponseFeedItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia_or_ad(value: TimelineFeedResponseMediaOrAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_or_ad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories_netego(value: TimelineFeedResponseStoriesNetego): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories_netego")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStories_netego: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories_netego")(js.undefined)
        ret
    }
  }
  
}

