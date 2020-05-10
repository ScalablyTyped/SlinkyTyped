package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonAccountContainer
import typingsSlinky.reactNativeMaterialUi.AnonAvatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerHeaderAccountProps extends js.Object {
  var accounts: js.UndefOr[js.Array[AnonAvatar]] = js.native
  var avatar: js.UndefOr[ReactElement] = js.native
  var footer: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[AnonAccountContainer] = js.native
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
    def withAccounts(value: js.Array[AnonAvatar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonAccountContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

