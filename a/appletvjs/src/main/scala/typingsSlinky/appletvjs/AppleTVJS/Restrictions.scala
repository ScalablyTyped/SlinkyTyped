package typingsSlinky.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Restrictions extends js.Object {
  /** A boolean value that indicates if explicit media is allowed. */
  var allowsExplicit: Boolean = js.native
  /** The maximum movie ranking allowed. */
  var maxMovieRank: Double = js.native
  /** The maximum television show ranking allowed. */
  var maxTVShowRank: Double = js.native
  /** The maximum movie rating allowed for the specified country. */
  def maxMovieRatingForCountry(countryCode: String): String = js.native
  /** Sets the maximum television show rating allowed for the specified country. */
  def maxTVShowRatingForCountry(countryCode: String): String = js.native
}

object Restrictions {
  @scala.inline
  def apply(
    allowsExplicit: Boolean,
    maxMovieRank: Double,
    maxMovieRatingForCountry: String => String,
    maxTVShowRank: Double,
    maxTVShowRatingForCountry: String => String
  ): Restrictions = {
    val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit.asInstanceOf[js.Any], maxMovieRank = maxMovieRank.asInstanceOf[js.Any], maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank.asInstanceOf[js.Any], maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
    __obj.asInstanceOf[Restrictions]
  }
  @scala.inline
  implicit class RestrictionsOps[Self <: Restrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowsExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsExplicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMovieRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMovieRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMovieRatingForCountry(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMovieRatingForCountry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxTVShowRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTVShowRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTVShowRatingForCountry(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTVShowRatingForCountry")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

