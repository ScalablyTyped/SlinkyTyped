package typingsSlinky.protonDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.protonDashNative.protonDashNativeMod.MenuItemProps
import typingsSlinky.protonDashNative.protonDashNativeStrings.About
import typingsSlinky.protonDashNative.protonDashNativeStrings.Check
import typingsSlinky.protonDashNative.protonDashNativeStrings.Item
import typingsSlinky.protonDashNative.protonDashNativeStrings.Preferences
import typingsSlinky.protonDashNative.protonDashNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.MenuItem] {
  @JSImport("proton-native", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, onClick */
  def apply(
    `type`: Check | Quit | About | Preferences | typingsSlinky.protonDashNative.protonDashNativeStrings.Separator | Item = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.MenuItem] = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuItemProps
}

