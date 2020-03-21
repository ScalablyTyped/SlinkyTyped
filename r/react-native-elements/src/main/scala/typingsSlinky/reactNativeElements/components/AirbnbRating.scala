package typingsSlinky.reactNativeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNativeRatings.mod.AirbnbRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AirbnbRating
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeElements.mod.AirbnbRating] {
  @JSImport("react-native-elements", "AirbnbRating")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    count: Int | Double = null,
    defaultRating: Int | Double = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    onFinishRating: /* value */ Double => Unit = null,
    reviews: js.Array[String] = null,
    showRating: js.UndefOr[Boolean] = js.undefined,
    starStyle: ImageStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.AirbnbRating] = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.asInstanceOf[js.Any])
    if (starStyle != null) __obj.updateDynamic("starStyle")(starStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.AirbnbRating] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeElements.mod.AirbnbRating](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AirbnbRatingProps
}

