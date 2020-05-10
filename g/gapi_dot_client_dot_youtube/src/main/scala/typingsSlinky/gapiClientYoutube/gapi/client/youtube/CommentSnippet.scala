package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentSnippet extends js.Object {
  /** The id of the author's YouTube channel, if any. */
  var authorChannelId: js.UndefOr[js.Any] = js.native
  /** Link to the author's YouTube channel, if any. */
  var authorChannelUrl: js.UndefOr[String] = js.native
  /** The name of the user who posted the comment. */
  var authorDisplayName: js.UndefOr[String] = js.native
  /** The URL for the avatar of the user who posted the comment. */
  var authorProfileImageUrl: js.UndefOr[String] = js.native
  /** Whether the current viewer can rate this comment. */
  var canRate: js.UndefOr[Boolean] = js.native
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's
    * the video's channel.
    */
  var channelId: js.UndefOr[String] = js.native
  /** The total number of likes this comment has received. */
  var likeCount: js.UndefOr[Double] = js.native
  /** The comment's moderation status. Will not be set if the comments were requested through the id filter. */
  var moderationStatus: js.UndefOr[String] = js.native
  /** The unique id of the parent comment, only set for replies. */
  var parentId: js.UndefOr[String] = js.native
  /** The date and time when the comment was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from
    * the text originally posted in that it may replace video links with video titles etc.
    */
  var textDisplay: js.UndefOr[String] = js.native
  /**
    * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which
    * is only guaranteed if the viewer is the comment's author.
    */
  var textOriginal: js.UndefOr[String] = js.native
  /** The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var updatedAt: js.UndefOr[String] = js.native
  /** The ID of the video the comment refers to, if any. */
  var videoId: js.UndefOr[String] = js.native
  /**
    * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This
    * may change in the future.
    */
  var viewerRating: js.UndefOr[String] = js.native
}

object CommentSnippet {
  @scala.inline
  def apply(): CommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentSnippet]
  }
  @scala.inline
  implicit class CommentSnippetOps[Self <: CommentSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorChannelId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorChannelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorChannelUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorChannelUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorProfileImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorProfileImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorProfileImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorProfileImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCanRate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRate")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withLikeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOriginal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOriginal")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerRating")(js.undefined)
        ret
    }
  }
  
}

