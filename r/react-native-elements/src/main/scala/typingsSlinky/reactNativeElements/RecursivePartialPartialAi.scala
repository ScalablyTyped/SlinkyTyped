package typingsSlinky.reactNativeElements

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.AirbnbRatingProps>> */
@js.native
trait RecursivePartialPartialAi extends js.Object {
  var count: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var defaultRating: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var isDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var reviews: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[String]]]] = js.native
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var starStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.native
}

object RecursivePartialPartialAi {
  @scala.inline
  def apply(): RecursivePartialPartialAi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialAi]
  }
  @scala.inline
  implicit class RecursivePartialPartialAiOps[Self <: RecursivePartialPartialAi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withDefaultRating(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withIsDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withOnFinishRating(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = {
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
    def withReviews(value: RecursivePartial[js.UndefOr[js.Array[String]]]): Self = {
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
    def withSize(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withStarStyle(value: RecursivePartial[js.UndefOr[ImageStyle]]): Self = {
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

