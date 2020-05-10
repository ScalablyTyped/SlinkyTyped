package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRatingVideoId extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String = js.native
}

object AnonRatingVideoId {
  @scala.inline
  def apply(rating: String, videoId: String): AnonRatingVideoId = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRatingVideoId]
  }
  @scala.inline
  implicit class AnonRatingVideoIdOps[Self <: AnonRatingVideoId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

