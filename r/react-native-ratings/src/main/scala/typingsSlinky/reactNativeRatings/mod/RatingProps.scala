package typingsSlinky.reactNativeRatings.mod

import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.bell
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.custom
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.heart
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.rocket
import typingsSlinky.reactNativeRatings.reactNativeRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatingProps extends js.Object {
  /**
    * The number of decimal places for the rating value; must be between 0 and 20
    */
  var fractions: js.UndefOr[Double] = js.native
  /**
    * The size of each rating image
    *
    * Default is 50
    */
  var imageSize: js.UndefOr[Double] = js.native
  /**
    * The minimum value the user can select
    *
    * Default is 0
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  /**
    * Callback method when the user starts rating.
    */
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is 'white'
    */
  var ratingBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is '#f1c40f'
    */
  var ratingColor: js.UndefOr[String] = js.native
  /**
    * Number of rating images to display
    *
    * Default is 5
    */
  var ratingCount: js.UndefOr[Double] = js.native
  /**
    * Pass in a custom image source; use this along with type='custom' prop above
    */
  var ratingImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Color used for the text labels
    */
  var ratingTextColor: js.UndefOr[String] = js.native
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * Displays the Built-in Rating UI to show the rating value in real-time
    *
    * Default is false
    */
  var showRating: js.UndefOr[Boolean] = js.native
  /**
    * The initial rating to render
    *
    * Default is ratingCount/2
    */
  var startingValue: js.UndefOr[Double] = js.native
  /**
    * Exposes style prop to add additonal styling to the container view
    */
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  /**
    * Color used for the background
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * Graphic used for represent a rating
    *
    * Default is 'star'
    */
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.native
}

object RatingProps {
  @scala.inline
  def apply(): RatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RatingProps]
  }
  @scala.inline
  implicit class RatingPropsOps[Self <: RatingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishRating(value: /* rating */ Double => Unit): Self = {
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
    def withOnStartRating(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartRating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStartRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingImage(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingImage")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
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
    def withStartingValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Validator[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: star | rocket | bell | heart | custom): Self = {
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
  }
  
}

