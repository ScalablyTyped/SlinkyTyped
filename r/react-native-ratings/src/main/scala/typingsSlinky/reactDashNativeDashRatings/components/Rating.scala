package typingsSlinky.reactDashNativeDashRatings.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageURISource
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsMod.RatingProps
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsStrings.bell
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsStrings.custom
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsStrings.heart
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsStrings.rocket
import typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsMod.Rating
    ] {
  @JSImport("react-native-ratings", "Rating")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    fractions: Int | Double = null,
    imageSize: Int | Double = null,
    minValue: Int | Double = null,
    onFinishRating: /* rating */ Double => Unit = null,
    onStartRating: () => Unit = null,
    ratingBackgroundColor: String = null,
    ratingColor: String = null,
    ratingCount: Int | Double = null,
    ratingImage: ImageURISource = null,
    ratingTextColor: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    showRating: js.UndefOr[Boolean] = js.undefined,
    startingValue: Int | Double = null,
    style: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ViewPropTypes.style */ js.Any = null,
    tintColor: String = null,
    `type`: star | rocket | bell | heart | custom = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsMod.Rating
  ] = {
    val __obj = js.Dynamic.literal()
    if (fractions != null) __obj.updateDynamic("fractions")(fractions.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (onStartRating != null) __obj.updateDynamic("onStartRating")(js.Any.fromFunction0(onStartRating))
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor.asInstanceOf[js.Any])
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor.asInstanceOf[js.Any])
    if (ratingCount != null) __obj.updateDynamic("ratingCount")(ratingCount.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage.asInstanceOf[js.Any])
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (startingValue != null) __obj.updateDynamic("startingValue")(startingValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsMod.Rating
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashRatings.reactDashNativeDashRatingsMod.Rating](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RatingProps
}

