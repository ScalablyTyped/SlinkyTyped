package typingsSlinky.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7` = js.native
}

object `4` {
  @scala.inline
  def apply(
    value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7`
  ): `4` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(
      value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

