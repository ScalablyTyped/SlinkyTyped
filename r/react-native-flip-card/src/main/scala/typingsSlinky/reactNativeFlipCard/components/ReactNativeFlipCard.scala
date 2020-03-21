package typingsSlinky.reactNativeFlipCard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeFlipCard.mod.FlipCardProps
import typingsSlinky.reactNativeFlipCard.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeFlipCard
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alignHeight: js.UndefOr[Boolean] = js.undefined,
    alignWidth: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    flipHorizontal: js.UndefOr[Boolean] = js.undefined,
    flipVertical: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    onFlipEnd: () => Unit = null,
    onFlipStart: () => Unit = null,
    perspective: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignHeight)) __obj.updateDynamic("alignHeight")(alignHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWidth)) __obj.updateDynamic("alignWidth")(alignWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(flipHorizontal)) __obj.updateDynamic("flipHorizontal")(flipHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVertical)) __obj.updateDynamic("flipVertical")(flipVertical.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (onFlipEnd != null) __obj.updateDynamic("onFlipEnd")(js.Any.fromFunction0(onFlipEnd))
    if (onFlipStart != null) __obj.updateDynamic("onFlipStart")(js.Any.fromFunction0(onFlipStart))
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeFlipCard.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlipCardProps
}

