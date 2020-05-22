package typingsSlinky.rbx.deleteMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteModifierProps extends js.Object {
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object DeleteModifierProps {
  @scala.inline
  def apply(size: small | medium | large = null): DeleteModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModifierProps]
  }
}

