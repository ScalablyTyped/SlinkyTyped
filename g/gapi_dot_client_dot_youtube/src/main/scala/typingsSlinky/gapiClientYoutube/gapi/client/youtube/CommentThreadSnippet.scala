package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadSnippet extends js.Object {
  /** Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field. */
  var canReply: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer
    * to the channel itself.
    */
  var channelId: js.UndefOr[String] = js.native
  /** Whether the thread (and therefore all its comments) is visible to all YouTube users. */
  var isPublic: js.UndefOr[Boolean] = js.native
  /** The top level comment of this thread. */
  var topLevelComment: js.UndefOr[Comment] = js.native
  /** The total number of replies (not including the top level comment). */
  var totalReplyCount: js.UndefOr[Double] = js.native
  /** The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment. */
  var videoId: js.UndefOr[String] = js.native
}

object CommentThreadSnippet {
  @scala.inline
  def apply(): CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadSnippet]
  }
  @scala.inline
  implicit class CommentThreadSnippetOps[Self <: CommentThreadSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReply")(js.undefined)
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
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLevelComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevelComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelComment")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalReplyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReplyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalReplyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReplyCount")(js.undefined)
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
  }
  
}

