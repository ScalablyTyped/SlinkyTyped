package typingsSlinky.reactNativeStarRating.mod

import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typingsSlinky.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarRatingProps extends js.Object {
  /**
    * Number between 0 to 1 to determine the opacity of the button.
    * Default is 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    * Add an animation to the stars upon selection.
    */
  var animation: js.UndefOr[
    bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble
  ] = js.native
  /**
    * Style of the button containing the star.
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style of the element containing the star rating component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Sets the interactivity of the star buttons.
    *
    * Default is false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the icon to represent an empty star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-o"
    */
  var emptyStar: js.UndefOr[String | ImageURISource] = js.native
  /**
    * Color of an empty star.
    *
    * Default is gray
    */
  var emptyStarColor: js.UndefOr[String] = js.native
  /**
    * The name of the icon to represent a full star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx')
    *
    * Default is "star"
    */
  var fullStar: js.UndefOr[String | ImageURISource] = js.native
  /**
    * Color of a filled star.
    *
    * Default is black
    */
  var fullStarColor: js.UndefOr[String] = js.native
  /**
    * The name of the icon to represent an half star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-half-o"
    */
  var halfStar: js.UndefOr[String | ImageURISource] = js.native
  /**
    * Color of a half-filled star.
    *
    * Defaults to fullStarColor.
    */
  var halfStarColor: js.UndefOr[String] = js.native
  /**
    * Sets ability to select half stars
    *
    * Default is false
    */
  var halfStarEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the icon set the star image belongs to.
    * Refer to react-native-vector-icons.
    *
    * Default is "FontAwesome"
    */
  var iconSet: js.UndefOr[String] = js.native
  /**
    * The maximum number of stars possible.
    *
    * Default is 5
    */
  var maxStars: js.UndefOr[Double] = js.native
  /**
    * The current rating to show.
    *
    * Default is 0
    */
  var rating: js.UndefOr[Double] = js.native
  /**
    * Renders stars from right to left
    *
    * Default is false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * A function to handle star button presses.
    */
  var selectedStar: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  /**
    * Size of the star.
    *
    * Default is 40
    */
  var starSize: js.UndefOr[Double] = js.native
  /**
    * Style to apply to the star.
    */
  var starStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object StarRatingProps {
  @scala.inline
  def apply(): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingProps]
  }
  @scala.inline
  implicit class StarRatingPropsOps[Self <: StarRatingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(null)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStar(value: String | ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStar")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyStarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStar(value: String | ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStar")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfStar(value: String | ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStar")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfStarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfStarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfStarEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStarEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfStarEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfStarEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStars")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStar(value: /* rating */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectedStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStar")(js.undefined)
        ret
    }
    @scala.inline
    def withStarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStarStyle(value: StyleProp[ViewStyle]): Self = {
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
    @scala.inline
    def withStarStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starStyle")(null)
        ret
    }
  }
  
}

