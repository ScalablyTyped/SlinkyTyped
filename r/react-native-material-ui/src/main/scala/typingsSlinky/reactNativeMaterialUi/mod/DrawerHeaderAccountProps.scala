package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.AccountContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerHeaderAccountProps extends js.Object {
  var accounts: js.UndefOr[js.Array[typingsSlinky.reactNativeMaterialUi.anon.Avatar]] = js.native
  var avatar: js.UndefOr[ReactElement] = js.native
  var footer: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[AccountContainer] = js.native
}

object DrawerHeaderAccountProps {
  @scala.inline
  def apply(): DrawerHeaderAccountProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderAccountProps]
  }
  @scala.inline
  implicit class DrawerHeaderAccountPropsOps[Self <: DrawerHeaderAccountProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountsVarargs(value: typingsSlinky.reactNativeMaterialUi.anon.Avatar*): Self = this.set("accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: js.Array[typingsSlinky.reactNativeMaterialUi.anon.Avatar]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    @scala.inline
    def setAvatar(value: ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setFooter(value: js.Object): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setStyle(value: AccountContainer): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

