package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEnterDelay extends js.Object {
  var mouseEnterDelay: Double = js.native
  var mouseLeaveDelay: Double = js.native
}

object MouseEnterDelay {
  @scala.inline
  def apply(mouseEnterDelay: Double, mouseLeaveDelay: Double): MouseEnterDelay = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEnterDelay]
  }
  @scala.inline
  implicit class MouseEnterDelayOps[Self <: MouseEnterDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMouseEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseLeaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

