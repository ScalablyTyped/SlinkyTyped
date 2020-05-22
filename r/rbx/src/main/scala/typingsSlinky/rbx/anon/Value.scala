package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.`inline-block`
import typingsSlinky.rbx.rbxStrings.`inline-flex`
import typingsSlinky.rbx.rbxStrings.`inline`
import typingsSlinky.rbx.rbxStrings.block
import typingsSlinky.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}

object Value {
  @scala.inline
  def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

