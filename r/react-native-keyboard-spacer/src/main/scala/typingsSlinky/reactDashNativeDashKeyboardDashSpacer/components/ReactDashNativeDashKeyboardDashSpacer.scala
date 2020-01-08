package typingsSlinky.reactDashNativeDashKeyboardDashSpacer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashKeyboardDashSpacer.reactDashNativeDashKeyboardDashSpacerMod.KeyboardSpacerProps
import typingsSlinky.reactDashNativeDashKeyboardDashSpacer.reactDashNativeDashKeyboardDashSpacerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashKeyboardDashSpacer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onToggle: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit = null,
    style: StyleProp[ViewStyle] = null,
    topSpacing: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topSpacing != null) __obj.updateDynamic("topSpacing")(topSpacing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashKeyboardDashSpacer.reactDashNativeDashKeyboardDashSpacerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = KeyboardSpacerProps
}

