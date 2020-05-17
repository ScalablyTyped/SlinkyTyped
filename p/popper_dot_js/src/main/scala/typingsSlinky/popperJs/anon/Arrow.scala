package typingsSlinky.popperJs.anon

import typingsSlinky.popperJs.mod.Popper.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrow extends js.Object {
  var arrow: Left = js.native
  var popper: Offset = js.native
  var reference: Offset = js.native
}

object Arrow {
  @scala.inline
  def apply(arrow: Left, popper: Offset, reference: Offset): Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopper(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

