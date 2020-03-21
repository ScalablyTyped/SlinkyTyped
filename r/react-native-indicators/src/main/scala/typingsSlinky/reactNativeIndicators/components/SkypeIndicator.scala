package typingsSlinky.reactNativeIndicators.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeIndicators.mod.SkypeIndicatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkypeIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeIndicators.mod.SkypeIndicator] {
  @JSImport("react-native-indicators", "SkypeIndicator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: /* value */ Double => Double = null,
    color: String = null,
    count: Int | Double = null,
    hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
    interaction: js.UndefOr[Boolean] = js.undefined,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeIndicators.mod.SkypeIndicator] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1(animationEasing))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesWhenStopped)) __obj.updateDynamic("hidesWhenStopped")(hidesWhenStopped.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeIndicators.mod.SkypeIndicator] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeIndicators.mod.SkypeIndicator](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SkypeIndicatorProps
}

