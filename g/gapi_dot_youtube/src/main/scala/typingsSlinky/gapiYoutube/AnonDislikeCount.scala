package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDislikeCount extends js.Object {
  /**
    * The number of comments for the video.
    */
  var commentCount: Double = js.native
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: Double = js.native
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: Double = js.native
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: Double = js.native
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: Double = js.native
}

object AnonDislikeCount {
  @scala.inline
  def apply(
    commentCount: Double,
    dislikeCount: Double,
    favoriteCount: Double,
    likeCount: Double,
    viewCount: Double
  ): AnonDislikeCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], dislikeCount = dislikeCount.asInstanceOf[js.Any], favoriteCount = favoriteCount.asInstanceOf[js.Any], likeCount = likeCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDislikeCount]
  }
  @scala.inline
  implicit class AnonDislikeCountOps[Self <: AnonDislikeCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDislikeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dislikeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavoriteCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLikeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

