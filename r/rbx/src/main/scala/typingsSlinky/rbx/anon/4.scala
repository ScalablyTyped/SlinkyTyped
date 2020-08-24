package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var only: js.UndefOr[Boolean] = js.native
  var value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | `7` = js.native
}

object `4` {
  @scala.inline
  def apply(
    value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | `7`
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(
      value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | `7`
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
  
}

