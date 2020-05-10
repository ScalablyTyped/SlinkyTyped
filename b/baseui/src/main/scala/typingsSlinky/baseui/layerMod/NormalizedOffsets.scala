package typingsSlinky.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOffsets extends js.Object {
  var arrow: js.UndefOr[NormalizedOffset] = js.native
  var popper: NormalizedOffset = js.native
}

object NormalizedOffsets {
  @scala.inline
  def apply(popper: NormalizedOffset): NormalizedOffsets = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOffsets]
  }
  @scala.inline
  implicit class NormalizedOffsetsOps[Self <: NormalizedOffsets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopper(value: NormalizedOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrow(value: NormalizedOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
  }
  
}

