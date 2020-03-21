package typingsSlinky.reactNativeCollapsible.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.mod.CollapsibleProps
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import typingsSlinky.reactNativeCollapsible.mod.default
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCollapsible
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: top | center | bottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedHeight: Int | Double = null,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    enablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointerEvents)) __obj.updateDynamic("enablePointerEvents")(enablePointerEvents.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction0(onAnimationEnd))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeCollapsible.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CollapsibleProps
}

