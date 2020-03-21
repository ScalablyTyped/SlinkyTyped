package typingsSlinky.reactNativeMaterialMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeMaterialMenu.mod.MenuItemProps
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import typingsSlinky.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuItem] {
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    disabledTextColor: String = null,
    ellipsizeMode: clip | tail = null,
    onPress: () => Unit = null,
    style: StyleMedia_ = null,
    textStyle: TextStyle = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuItem] = {
    val __obj = js.Dynamic.literal()
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuItem] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenuItemProps
}

