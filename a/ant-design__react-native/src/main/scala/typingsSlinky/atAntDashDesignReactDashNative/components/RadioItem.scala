package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.libRadioRadioItemMod.RadioItemNativeProps
import typingsSlinky.atAntDashDesignReactDashNative.libRadioRadioItemMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libRadioStyleMod.RadioStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, defaultChecked, disabled, name, onChange */
  def apply(
    onPress: () => _ = null,
    radioProps: js.Object = null,
    radioStyle: StyleProp[ImageStyle] = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[RadioStyle] = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (radioProps != null) __obj.updateDynamic("radioProps")(radioProps.asInstanceOf[js.Any])
    if (radioStyle != null) __obj.updateDynamic("radioStyle")(radioStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libRadioRadioItemMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RadioItemNativeProps
}

