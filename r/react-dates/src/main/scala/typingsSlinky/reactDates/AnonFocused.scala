package typingsSlinky.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocused extends js.Object {
  var focused: Boolean | Null = js.native
}

object AnonFocused {
  @scala.inline
  def apply(): AnonFocused = {
    val __obj = js.Dynamic.literal()
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
    def withFocusedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(null)
        ret
    }
  }
  
}

