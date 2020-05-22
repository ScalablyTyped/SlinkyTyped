package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.`inline-block`
import typingsSlinky.rbx.rbxStrings.`inline-flex`
import typingsSlinky.rbx.rbxStrings.`inline`
import typingsSlinky.rbx.rbxStrings.block
import typingsSlinky.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Only extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}

object Only {
  @scala.inline
  def apply(
    value: block | flex | `inline` | `inline-block` | `inline-flex`,
    only: js.UndefOr[Boolean] = js.undefined
  ): Only = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Only]
  }
}

