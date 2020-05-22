package typingsSlinky.rbx.buttonGroupMod

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var hasAddons: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object ButtonGroupModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    hasAddons: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): ButtonGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAddons)) __obj.updateDynamic("hasAddons")(hasAddons.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupModifierProps]
  }
}

