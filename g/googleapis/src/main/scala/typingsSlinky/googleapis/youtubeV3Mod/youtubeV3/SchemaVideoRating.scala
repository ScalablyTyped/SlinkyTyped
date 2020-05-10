package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideoRating extends js.Object {
  var rating: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object SchemaVideoRating {
  @scala.inline
  def apply(): SchemaVideoRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoRating]
  }
  @scala.inline
  implicit class SchemaVideoRatingOps[Self <: SchemaVideoRating] (val x: Self) extends AnyVal {
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
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
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

