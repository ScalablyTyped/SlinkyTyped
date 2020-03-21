package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.around
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.between
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.column
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.end
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.row
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.start
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap
import typingsSlinky.antDesignReactNative.flexFlexMod.FlexProps
import typingsSlinky.antDesignReactNative.flexMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/flex", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    justify: start | end | center | between | around = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antDesignReactNative.flexMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlexProps
}

