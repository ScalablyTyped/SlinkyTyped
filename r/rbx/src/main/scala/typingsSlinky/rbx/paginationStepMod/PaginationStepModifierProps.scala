package typingsSlinky.rbx.paginationStepMod

import typingsSlinky.rbx.rbxStrings.next
import typingsSlinky.rbx.rbxStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationStepModifierProps extends js.Object {
  var align: next | previous
}

object PaginationStepModifierProps {
  @scala.inline
  def apply(align: next | previous): PaginationStepModifierProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStepModifierProps]
  }
}

