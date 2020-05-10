package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingIreland extends js.Object {
  /**
    * Movies rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * agesAbove12, agesAbove15, agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingIrelandMoviesType] = js.native
  /**
    * TV rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, children, youngAdults,
    * parentalSupervision, mature.
    */
  var tvRating: js.UndefOr[RatingIrelandTelevisionType] = js.native
}

object MediaContentRatingIreland {
  @scala.inline
  def apply(): MediaContentRatingIreland = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingIreland]
  }
  @scala.inline
  implicit class MediaContentRatingIrelandOps[Self <: MediaContentRatingIreland] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingIrelandMoviesType): Self = {
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
    def withTvRating(value: RatingIrelandTelevisionType): Self = {
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

