package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonAccountContainer
import typingsSlinky.reactNativeMaterialUi.AnonAvatar
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header.Account
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderAccountProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeaderAccount
  extends ExternalComponentWithAttributesWithRefType[tag.type, Account] {
  @JSImport("react-native-material-ui", "Drawer.Header.Account")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    accounts: js.Array[AnonAvatar] = null,
    avatar: ReactElement = null,
    footer: js.Object = null,
    style: AnonAccountContainer = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Account] = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Account] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header.Account](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DrawerHeaderAccountProps
}

