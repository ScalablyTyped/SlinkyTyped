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

trait BadgeHelpersProps extends js.Object {
  var badge: js.UndefOr[Double | String] = js.undefined
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var badgeOutlined: js.UndefOr[Boolean] = js.undefined
  var badgeRounded: js.UndefOr[Boolean] = js.undefined
  var badgeSize: js.UndefOr[small | medium | large] = js.undefined
}

object BadgeHelpersProps {
  @scala.inline
  def apply(
    badge: Double | String = null,
    badgeColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    badgeOutlined: js.UndefOr[Boolean] = js.undefined,
    badgeRounded: js.UndefOr[Boolean] = js.undefined,
    badgeSize: small | medium | large = null
  ): BadgeHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeOutlined)) __obj.updateDynamic("badgeOutlined")(badgeOutlined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeRounded)) __obj.updateDynamic("badgeRounded")(badgeRounded.get.asInstanceOf[js.Any])
    if (badgeSize != null) __obj.updateDynamic("badgeSize")(badgeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeHelpersProps]
  }
}

