package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingUnitedKingdom extends js.Object {
  /**
    * Movies rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, general, universalChildren,
    * parentalGuidance, agesAbove12Video, agesAbove12Cinema, agesAbove15, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedKingdomMoviesType] = js.native
  // TV rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, caution.
  var tvRating: js.UndefOr[RatingUnitedKingdomTelevisionType] = js.native
}

object MediaContentRatingUnitedKingdom {
  @scala.inline
  def apply(): MediaContentRatingUnitedKingdom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingUnitedKingdom]
  }
  @scala.inline
  implicit class MediaContentRatingUnitedKingdomOps[Self <: MediaContentRatingUnitedKingdom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingUnitedKingdomMoviesType): Self = {
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
    def withTvRating(value: RatingUnitedKingdomTelevisionType): Self = {
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

