package typingsSlinky.protonDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.protonDashNative.protonDashNativeMod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.Menu] {
  @JSImport("proton-native", "Menu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(label: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.Menu] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.Menu] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.protonDashNative.protonDashNativeMod.Menu](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenuProps
}

