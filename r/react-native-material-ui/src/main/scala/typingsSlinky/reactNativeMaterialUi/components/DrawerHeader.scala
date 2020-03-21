package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.Image
import typingsSlinky.reactNativeMaterialUi.AnonContainerContentContainer
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, Header] {
  @JSImport("react-native-material-ui", "Drawer.Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: String = null,
    image: js.Array[Image] = null,
    style: AnonContainerContentContainer = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Header] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Header] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DrawerHeaderProps
}

