package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingUnitedStates extends js.Object {
  /**
    * Movies rating selected for United States. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * parentalGuidance13, restricted, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedStatesMoviesType] = js.native
  /**
    * TV rating selected for United States. Possible values are: allAllowed, allBlocked, childrenAll, childrenAbove7,
    * general, parentalGuidance, childrenAbove14, adults.
    */
  var tvRating: js.UndefOr[RatingUnitedStatesTelevisionType] = js.native
}

object MediaContentRatingUnitedStates {
  @scala.inline
  def apply(): MediaContentRatingUnitedStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingUnitedStates]
  }
  @scala.inline
  implicit class MediaContentRatingUnitedStatesOps[Self <: MediaContentRatingUnitedStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingUnitedStatesMoviesType): Self = {
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
    def withTvRating(value: RatingUnitedStatesTelevisionType): Self = {
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

