package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating] = js.native
  var author_name: String = js.native
  var author_url: String = js.native
  var language: String = js.native
  var text: String = js.native
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[PlaceAspectRating],
    author_name: String,
    author_url: String,
    language: String,
    text: String
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
  @scala.inline
  implicit class PlaceReviewOps[Self <: PlaceReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspects(value: js.Array[PlaceAspectRating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

