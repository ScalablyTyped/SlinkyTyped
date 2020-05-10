package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingCanada extends js.Object {
  /**
    * Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14,
    * agesAbove18, restricted.
    */
  var movieRating: js.UndefOr[RatingCanadaMoviesType] = js.native
  /**
    * TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general,
    * parentalGuidance, agesAbove14, agesAbove18.
    */
  var tvRating: js.UndefOr[RatingCanadaTelevisionType] = js.native
}

object MediaContentRatingCanada {
  @scala.inline
  def apply(): MediaContentRatingCanada = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingCanada]
  }
  @scala.inline
  implicit class MediaContentRatingCanadaOps[Self <: MediaContentRatingCanada] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieRating(value: RatingCanadaMoviesType): Self = {
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
    def withTvRating(value: RatingCanadaTelevisionType): Self = {
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

