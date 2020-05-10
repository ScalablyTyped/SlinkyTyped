package typingsSlinky.reactNativeRatings.mod

import typingsSlinky.reactNative.mod.ImageStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AirbnbRatingProps extends js.Object {
  /**
    * Total number of ratings to display
    *
    * Default is 5
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Initial value for the rating
    *
    * Default is 3
    */
  var defaultRating: js.UndefOr[Double] = js.native
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Labels to show when each value is tapped
    *
    * e.g. If the first star is tapped, then value in index 0 will be used as the label
    *
    * Default is ['Terrible', 'Bad', 'Okay', 'Good', 'Great']
    */
  var reviews: js.UndefOr[js.Array[String]] = js.native
  /**
    * Determines if to show the reviews above the rating
    *
    * Default is true
    */
  var showRating: js.UndefOr[Boolean] = js.native
  /**
    * Size of rating image
    *
    * Default is 40
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Style for star image component
    *
    * Default is true
    */
  var starStyle: js.UndefOr[ImageStyle] = js.native
}

object AirbnbRatingProps {
  @scala.inline
  def apply(): AirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AirbnbRatingProps]
  }
  @scala.inline
  implicit class AirbnbRatingPropsOps[Self <: AirbnbRatingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishRating(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishRating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinishRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishRating")(js.undefined)
        ret
    }
    @scala.inline
    def withReviews(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRating")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStarStyle(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starStyle")(js.undefined)
        ret
    }
  }
  
}

