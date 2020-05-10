package typingsSlinky.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBarOption extends js.Object {
  var fade: Boolean = js.native
}

object ScrollBarOption {
  @scala.inline
  def apply(fade: Boolean): ScrollBarOption = {
    val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBarOption]
  }
  @scala.inline
  implicit class ScrollBarOptionOps[Self <: ScrollBarOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

