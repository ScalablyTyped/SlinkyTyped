package typingsSlinky.reactNativeNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.TouchableHighlight
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import typingsSlinky.reactNative.mod.TouchableOpacity
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import typingsSlinky.reactNativeNavigation.AnonReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchablePreview
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeNavigation.touchablePreviewMod.TouchablePreview] {
  @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onPeekIn: () => Unit = null,
    onPeekOut: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: /* payload */ AnonReactTag => Unit = null,
    touchableComponent: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeNavigation.touchablePreviewMod.TouchablePreview] = {
    val __obj = js.Dynamic.literal()
    if (onPeekIn != null) __obj.updateDynamic("onPeekIn")(js.Any.fromFunction0(onPeekIn))
    if (onPeekOut != null) __obj.updateDynamic("onPeekOut")(js.Any.fromFunction0(onPeekOut))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeNavigation.touchablePreviewMod.TouchablePreview] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeNavigation.touchablePreviewMod.TouchablePreview](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactNativeNavigation.touchablePreviewMod.Props
}

