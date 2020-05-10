package typingsSlinky.rbx.badgeMod

import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeHelpersProps extends js.Object {
  var badge: js.UndefOr[Double | String] = js.native
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  var badgeRounded: js.UndefOr[Boolean] = js.native
  var badgeSize: js.UndefOr[small | medium | large] = js.native
}

object BadgeHelpersProps {
  @scala.inline
  def apply(): BadgeHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeHelpersProps]
  }
  @scala.inline
  implicit class BadgeHelpersPropsOps[Self <: BadgeHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeOutlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeOutlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeOutlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeOutlined")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeRounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeRounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeRounded")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSize")(js.undefined)
        ret
    }
  }
  
}

