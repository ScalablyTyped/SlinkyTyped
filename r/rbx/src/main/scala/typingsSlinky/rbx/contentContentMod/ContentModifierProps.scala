package typingsSlinky.rbx.contentContentMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentModifierProps extends js.Object {
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object ContentModifierProps {
  @scala.inline
  def apply(size: small | medium | large = null): ContentModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentModifierProps]
  }
}

