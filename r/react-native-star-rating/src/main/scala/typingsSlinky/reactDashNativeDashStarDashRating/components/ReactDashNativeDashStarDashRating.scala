package typingsSlinky.reactDashNativeDashStarDashRating.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageURISource
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingMod.StarRatingProps
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingMod.default
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.bounce
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.flash
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.jello
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.pulse
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.rotate
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.rubberBand
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.shake
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.swing
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.tada
import typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingStrings.wobble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashStarDashRating
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-star-rating", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, reversed */
  def apply(
    activeOpacity: Int | Double = null,
    animation: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    emptyStar: String | ImageURISource = null,
    emptyStarColor: String = null,
    fullStar: String | ImageURISource = null,
    fullStarColor: String = null,
    halfStar: String | ImageURISource = null,
    halfStarColor: String = null,
    halfStarEnabled: js.UndefOr[Boolean] = js.undefined,
    iconSet: String = null,
    maxStars: Int | Double = null,
    rating: Int | Double = null,
    selectedStar: /* rating */ Double => Unit = null,
    starSize: Int | Double = null,
    starStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (emptyStar != null) __obj.updateDynamic("emptyStar")(emptyStar.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (fullStar != null) __obj.updateDynamic("fullStar")(fullStar.asInstanceOf[js.Any])
    if (fullStarColor != null) __obj.updateDynamic("fullStarColor")(fullStarColor.asInstanceOf[js.Any])
    if (halfStar != null) __obj.updateDynamic("halfStar")(halfStar.asInstanceOf[js.Any])
    if (halfStarColor != null) __obj.updateDynamic("halfStarColor")(halfStarColor.asInstanceOf[js.Any])
    if (!js.isUndefined(halfStarEnabled)) __obj.updateDynamic("halfStarEnabled")(halfStarEnabled.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (maxStars != null) __obj.updateDynamic("maxStars")(maxStars.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (selectedStar != null) __obj.updateDynamic("selectedStar")(js.Any.fromFunction1(selectedStar))
    if (starSize != null) __obj.updateDynamic("starSize")(starSize.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashStarDashRating.reactDashNativeDashStarDashRatingMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StarRatingProps
}

