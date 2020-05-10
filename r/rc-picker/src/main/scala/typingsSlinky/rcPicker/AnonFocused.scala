package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocused extends js.Object {
  var focused: Boolean = js.native
  var typing: Boolean = js.native
}

object AnonFocused {
  @scala.inline
  def apply(focused: Boolean, typing: Boolean): AnonFocused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
  @scala.inline
  implicit class AnonFocusedOps[Self <: AnonFocused] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

