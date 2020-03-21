package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.around
import typingsSlinky.antdMobileRn.antdMobileRnStrings.baseline
import typingsSlinky.antdMobileRn.antdMobileRnStrings.between
import typingsSlinky.antdMobileRn.antdMobileRnStrings.center
import typingsSlinky.antdMobileRn.antdMobileRnStrings.column
import typingsSlinky.antdMobileRn.antdMobileRnStrings.end
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nowrap
import typingsSlinky.antdMobileRn.antdMobileRnStrings.row
import typingsSlinky.antdMobileRn.antdMobileRnStrings.start
import typingsSlinky.antdMobileRn.antdMobileRnStrings.stretch
import typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap
import typingsSlinky.antdMobileRn.flexNativeMod.FlexProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_FlexProps_1736847457[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
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
  ): BuildingComponent[tag.type, ComponentRef] = {
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
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlexProps
}

