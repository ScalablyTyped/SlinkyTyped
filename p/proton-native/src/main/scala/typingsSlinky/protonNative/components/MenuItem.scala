package typingsSlinky.protonNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.protonNative.mod.MenuItemProps
import typingsSlinky.protonNative.protonNativeStrings.About
import typingsSlinky.protonNative.protonNativeStrings.Check
import typingsSlinky.protonNative.protonNativeStrings.Item
import typingsSlinky.protonNative.protonNativeStrings.Preferences
import typingsSlinky.protonNative.protonNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonNative.mod.MenuItem] {
  @JSImport("proton-native", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked */
  def apply(
    onClick: /* checked */ Boolean => Unit = null,
    `type`: Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.MenuItem] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.MenuItem] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.protonNative.mod.MenuItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenuItemProps
}

