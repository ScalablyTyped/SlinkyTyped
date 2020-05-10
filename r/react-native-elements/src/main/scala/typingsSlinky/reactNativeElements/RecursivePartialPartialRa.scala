package typingsSlinky.reactNativeElements

import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.bell
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.custom
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.heart
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.rocket
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.RatingProps>> */
@js.native
trait RecursivePartialPartialRa extends js.Object {
  var fractions: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var imageSize: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var minValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]]] = js.native
  var onStartRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var ratingBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var ratingColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var ratingCount: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var ratingImage: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.native
  var ratingTextColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var readonly: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var startingValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]]] = js.native
  var tintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]]] = js.native
}

object RecursivePartialPartialRa {
  @scala.inline
  def apply(): RecursivePartialPartialRa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialRa]
  }
  @scala.inline
  implicit class RecursivePartialPartialRaOps[Self <: RecursivePartialPartialRa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractions(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withImageSize(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withMinValue(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withOnFinishRating(value: RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFinishRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishRating")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartRating(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withRatingColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withRatingCount(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withRatingImage(value: RecursivePartial[js.UndefOr[ImageURISource]]): Self = {
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
    def withRatingTextColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withReadonly(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withShowRating(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withStartingValue(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withStyle(value: RecursivePartial[js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]]): Self = {
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
    def withTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withType(value: RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]]): Self = {
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

