package typingsSlinky.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyBooleanValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7`
}

object OnlyBooleanValue {
  @scala.inline
  def apply(
    value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7`,
    only: js.UndefOr[Boolean] = js.undefined
  ): OnlyBooleanValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBooleanValue]
  }
}

