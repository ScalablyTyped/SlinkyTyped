package typingsSlinky.bootstrap.mod

import typingsSlinky.bootstrap.anon.PartialOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetsExtend extends js.Object {
  var popper: js.UndefOr[PartialOffset] = js.native
  var reference: js.UndefOr[PartialOffset] = js.native
}

object OffsetsExtend {
  @scala.inline
  def apply(): OffsetsExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetsExtend]
  }
  @scala.inline
  implicit class OffsetsExtendOps[Self <: OffsetsExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopper(value: PartialOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: PartialOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
  }
  
}

