package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingAustralia extends js.Object {
  /**
    * Movies rating selected for Australia. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove15, agesAbove18.
    */
  var movieRating: js.UndefOr[RatingAustraliaMoviesType] = js.native
  /**
    * TV rating selected for Australia. Possible values are: allAllowed, allBlocked, preschoolers, children, general,
    * parentalGuidance, mature, agesAbove15, agesAbove15AdultViolence.
    */
  var tvRating: js.UndefOr[RatingAustraliaTelevisionType] = js.native
}

object MediaContentRatingAustralia {
  @scala.inline
  def apply(): MediaContentRatingAustralia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingAustralia]
  }
  @scala.inline
  implicit class MediaContentRatingAustraliaOps[Self <: MediaContentRatingAustralia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingAustraliaMoviesType): Self = {
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
    def withTvRating(value: RatingAustraliaTelevisionType): Self = {
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

