package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonAccountContainer
import typingsSlinky.reactNativeMaterialUi.AnonAvatar
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header.Account
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderAccountProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeaderAccount {
  @JSImport("react-native-material-ui", "Drawer.Header.Account")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Account] {
    @scala.inline
    def accounts(value: js.Array[AnonAvatar]): this.type = set("accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def avatar(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Object): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonAccountContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerHeaderAccountProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DrawerHeaderAccount.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

