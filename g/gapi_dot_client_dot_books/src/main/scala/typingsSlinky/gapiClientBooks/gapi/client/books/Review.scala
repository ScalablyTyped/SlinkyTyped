package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.anon.Description
import typingsSlinky.gapiClientBooks.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review extends js.Object {
  /** Author of this review. */
  var author: js.UndefOr[DisplayName] = js.native
  /** Review text. */
  var content: js.UndefOr[String] = js.native
  /** Date of this review. */
  var date: js.UndefOr[String] = js.native
  /** URL for the full review text, for reviews gathered from the web. */
  var fullTextUrl: js.UndefOr[String] = js.native
  /** Resource type for a review. */
  var kind: js.UndefOr[String] = js.native
  /** Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED. */
  var rating: js.UndefOr[String] = js.native
  /** Information regarding the source of this review, when the review is not from a Google Books user. */
  var source: js.UndefOr[Description] = js.native
  /** Title for this review. */
  var title: js.UndefOr[String] = js.native
  /** Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER. */
  var `type`: js.UndefOr[String] = js.native
  /** Volume that this review is for. */
  var volumeId: js.UndefOr[String] = js.native
}

object Review {
  @scala.inline
  def apply(): Review = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Review]
  }
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTextUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTextUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
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
    def withSource(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
  }
  
}

