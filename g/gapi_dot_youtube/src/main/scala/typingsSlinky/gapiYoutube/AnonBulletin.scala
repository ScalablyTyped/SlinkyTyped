package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBulletin extends js.Object {
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: AnonResourceIdAnonKindPlaylistId = js.native
  /**
    * The channelItem object contains details about a resource that was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: Anon0 = js.native
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: AnonResourceIdAnonChannelIdKind = js.native
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: AnonResourceId = js.native
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: AnonResourceId = js.native
  /**
    * The playlistItem object contains information about an item that was added to a playlist. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: AnonPlaylistId = js.native
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: AnonReason = js.native
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: AnonAuthor = js.native
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: AnonResourceIdAnonChannelIdString = js.native
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: AnonVideoId = js.native
}

object AnonBulletin {
  @scala.inline
  def apply(
    bulletin: AnonResourceIdAnonKindPlaylistId,
    channelItem: Anon0,
    comment: AnonResourceIdAnonChannelIdKind,
    favorite: AnonResourceId,
    like: AnonResourceId,
    playlistItem: AnonPlaylistId,
    recommendation: AnonReason,
    social: AnonAuthor,
    subscription: AnonResourceIdAnonChannelIdString,
    upload: AnonVideoId
  ): AnonBulletin = {
    val __obj = js.Dynamic.literal(bulletin = bulletin.asInstanceOf[js.Any], channelItem = channelItem.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBulletin]
  }
  @scala.inline
  implicit class AnonBulletinOps[Self <: AnonBulletin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletin(value: AnonResourceIdAnonKindPlaylistId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelItem(value: Anon0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: AnonResourceIdAnonChannelIdKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavorite(value: AnonResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLike(value: AnonResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylistItem(value: AnonPlaylistId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecommendation(value: AnonReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial(value: AnonAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: AnonResourceIdAnonChannelIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload(value: AnonVideoId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

