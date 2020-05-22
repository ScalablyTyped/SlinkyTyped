package typingsSlinky.rbx.breadcrumbBreadcrumbMod

import typingsSlinky.rbx.rbxStrings.arrow
import typingsSlinky.rbx.rbxStrings.bullet
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.dot
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object BreadcrumbModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    separator: arrow | bullet | dot | succeeds = null,
    size: small | medium | large = null
  ): BreadcrumbModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbModifierProps]
  }
}

