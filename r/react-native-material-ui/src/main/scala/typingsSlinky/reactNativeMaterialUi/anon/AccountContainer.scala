package typingsSlinky.reactNativeMaterialUi.anon

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountContainer extends js.Object {
  var accountContainer: js.UndefOr[ViewStyle] = js.native
  var activeAvatarContainer: js.UndefOr[ViewStyle] = js.native
  var avatarsContainer: js.UndefOr[ViewStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var inactiveAvatarContainer: js.UndefOr[ViewStyle] = js.native
  var topContainer: js.UndefOr[ViewStyle] = js.native
}

object AccountContainer {
  @scala.inline
  def apply(): AccountContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountContainer]
  }
  @scala.inline
  implicit class AccountContainerOps[Self <: AccountContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountContainer")(null)
        ret
    }
    @scala.inline
    def withActiveAvatarContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAvatarContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAvatarContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAvatarContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveAvatarContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAvatarContainer")(null)
        ret
    }
    @scala.inline
    def withAvatarsContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarsContainer")(null)
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withInactiveAvatarContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveAvatarContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveAvatarContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveAvatarContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveAvatarContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveAvatarContainer")(null)
        ret
    }
    @scala.inline
    def withTopContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTopContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topContainer")(null)
        ret
    }
  }
  
}

