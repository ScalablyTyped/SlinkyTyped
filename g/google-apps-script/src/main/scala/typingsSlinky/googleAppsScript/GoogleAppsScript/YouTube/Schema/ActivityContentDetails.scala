package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetails extends js.Object {
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.native
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.native
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.native
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.native
  var like: js.UndefOr[ActivityContentDetailsLike] = js.native
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.native
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.native
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.native
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.native
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.native
  var upload: js.UndefOr[ActivityContentDetailsUpload] = js.native
}

object ActivityContentDetails {
  @scala.inline
  def apply(): ActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetails]
  }
  @scala.inline
  implicit class ActivityContentDetailsOps[Self <: ActivityContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletin(value: ActivityContentDetailsBulletin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletin")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelItem(value: ActivityContentDetailsChannelItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelItem")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: ActivityContentDetailsComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withFavorite(value: ActivityContentDetailsFavorite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavorite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite")(js.undefined)
        ret
    }
    @scala.inline
    def withLike(value: ActivityContentDetailsLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistItem(value: ActivityContentDetailsPlaylistItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotedItem(value: ActivityContentDetailsPromotedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendation(value: ActivityContentDetailsRecommendation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(js.undefined)
        ret
    }
    @scala.inline
    def withSocial(value: ActivityContentDetailsSocial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: ActivityContentDetailsSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: ActivityContentDetailsUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

