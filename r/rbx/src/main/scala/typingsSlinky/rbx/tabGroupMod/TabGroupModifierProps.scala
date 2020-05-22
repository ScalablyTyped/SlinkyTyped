package typingsSlinky.rbx.tabGroupMod

import typingsSlinky.rbx.rbxStrings.`toggle-rounded`
import typingsSlinky.rbx.rbxStrings.boxed
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[boxed | toggle | `toggle-rounded`] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object TabGroupModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    kind: boxed | toggle | `toggle-rounded` = null,
    size: small | medium | large = null
  ): TabGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupModifierProps]
  }
}

