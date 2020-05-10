package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingGermany extends js.Object {
  /**
    * Movies rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingGermanyMoviesType] = js.native
  /**
    * TV rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var tvRating: js.UndefOr[RatingGermanyTelevisionType] = js.native
}

object MediaContentRatingGermany {
  @scala.inline
  def apply(): MediaContentRatingGermany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingGermany]
  }
  @scala.inline
  implicit class MediaContentRatingGermanyOps[Self <: MediaContentRatingGermany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingGermanyMoviesType): Self = {
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
    def withTvRating(value: RatingGermanyTelevisionType): Self = {
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

