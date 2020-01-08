package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`column-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`row-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`wrap-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.around
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.baseline
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.between
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.center
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.column
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.end
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.nowrap
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.row
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.start
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.stretch
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.wrap
import typingsSlinky.antdDashMobileDashRn.libFlexFlexDotNativeMod.FlexProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_FlexProps12513472[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
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

