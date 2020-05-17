package typingsSlinky.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyBooleanValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.native
  var value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7` = js.native
}

object OnlyBooleanValue {
  @scala.inline
  def apply(
    value: typingsSlinky.rbx.rbxNumbers.`1` | typingsSlinky.rbx.rbxNumbers.`2` | typingsSlinky.rbx.rbxNumbers.`3` | typingsSlinky.rbx.rbxNumbers.`4` | typingsSlinky.rbx.rbxNumbers.`5` | typingsSlinky.rbx.rbxNumbers.`6` | typingsSlinky.rbx.rbxNumbers.`7`
  ): OnlyBooleanValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBooleanValue]
  }
  @scala.inline
  implicit class OnlyBooleanValueOps[Self <: OnlyBooleanValue] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

