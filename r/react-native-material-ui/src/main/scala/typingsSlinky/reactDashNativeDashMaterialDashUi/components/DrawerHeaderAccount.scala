package typingsSlinky.reactDashNativeDashMaterialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashMaterialDashUi.Anon_AccountContainer
import typingsSlinky.reactDashNativeDashMaterialDashUi.Anon_Avatar
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Drawer.Header.Account
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.DrawerHeaderAccountProps
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
    accounts: js.Array[Anon_Avatar] = null,
    avatar: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    footer: js.Object = null,
    style: Anon_AccountContainer = null,
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
  type Props = DrawerHeaderAccountProps
}

