package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetails extends js.Object {
  /** The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin. */
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.native
  /**
    * The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is
    * channelItem.
    */
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.native
  /** The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment. */
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.native
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is
    * favorite.
    */
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.native
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is
    * like.
    */
  var like: js.UndefOr[ActivityContentDetailsLike] = js.native
  /** The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem. */
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.native
  /** The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem. */
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.native
  /** The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation. */
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.native
  /** The social object contains details about a social network post. This property is only present if the snippet.type is social. */
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.native
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is
    * subscription.
    */
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.native
  /** The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload. */
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

