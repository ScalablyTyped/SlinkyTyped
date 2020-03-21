package typingsSlinky.reactNativeSettingsList.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeSettingsList.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Header] {
  @JSImport("react-native-settings-list", "default.Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    headerNumberOfLines: Int | Double = null,
    headerRef: () => Unit = null,
    headerStyle: StyleProp[TextStyle] = null,
    headerText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Header] = {
    val __obj = js.Dynamic.literal()
    if (headerNumberOfLines != null) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(js.Any.fromFunction0(headerRef))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Header] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeSettingsList.mod.default.Header](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HeaderProps
}

