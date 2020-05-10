package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingJapan extends js.Object {
  /**
    * Movies rating selected for Japan. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove15,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingJapanMoviesType] = js.native
  // TV rating selected for Japan. Possible values are: allAllowed, allBlocked, explicitAllowed.
  var tvRating: js.UndefOr[RatingJapanTelevisionType] = js.native
}

object MediaContentRatingJapan {
  @scala.inline
  def apply(): MediaContentRatingJapan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingJapan]
  }
  @scala.inline
  implicit class MediaContentRatingJapanOps[Self <: MediaContentRatingJapan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingJapanMoviesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovieRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieRating")(js.undefined)
        ret
    }
    @scala.inline
    def withTvRating(value: RatingJapanTelevisionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvRating")(js.undefined)
        ret
    }
  }
  
}

