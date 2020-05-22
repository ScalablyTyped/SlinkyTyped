package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.AccountContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerHeaderAccountProps extends js.Object {
  var accounts: js.UndefOr[js.Array[typingsSlinky.reactNativeMaterialUi.anon.Avatar]] = js.undefined
  var avatar: js.UndefOr[ReactElement] = js.undefined
  var footer: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[AccountContainer] = js.undefined
}

object DrawerHeaderAccountProps {
  @scala.inline
  def apply(
    accounts: js.Array[typingsSlinky.reactNativeMaterialUi.anon.Avatar] = null,
    avatar: ReactElement = null,
    footer: js.Object = null,
    style: AccountContainer = null
  ): DrawerHeaderAccountProps = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerHeaderAccountProps]
  }
}

