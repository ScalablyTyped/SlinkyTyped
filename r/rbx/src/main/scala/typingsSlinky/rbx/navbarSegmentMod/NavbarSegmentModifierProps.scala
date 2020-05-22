package typingsSlinky.rbx.navbarSegmentMod

import typingsSlinky.rbx.rbxStrings.end
import typingsSlinky.rbx.rbxStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarSegmentModifierProps extends js.Object {
  var align: start | end
}

object NavbarSegmentModifierProps {
  @scala.inline
  def apply(align: start | end): NavbarSegmentModifierProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarSegmentModifierProps]
  }
}

