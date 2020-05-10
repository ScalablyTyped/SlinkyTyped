package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStatistics extends js.Object {
  /** The number of comments for the video. */
  var commentCount: js.UndefOr[String] = js.native
  /** The number of users who have indicated that they disliked the video by giving it a negative rating. */
  var dislikeCount: js.UndefOr[String] = js.native
  /** The number of users who currently have the video marked as a favorite video. */
  var favoriteCount: js.UndefOr[String] = js.native
  /** The number of users who have indicated that they liked the video by giving it a positive rating. */
  var likeCount: js.UndefOr[String] = js.native
  /** The number of times the video has been viewed. */
  var viewCount: js.UndefOr[String] = js.native
}

object VideoStatistics {
  @scala.inline
  def apply(): VideoStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStatistics]
  }
  @scala.inline
  implicit class VideoStatisticsOps[Self <: VideoStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDislikeCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dislikeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDislikeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dislikeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFavoriteCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavoriteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLikeCount(value: String): Self = {
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
    def withViewCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(js.undefined)
        ret
    }
  }
  
}

