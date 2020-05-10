package typingsSlinky.flexmonster

import typingsSlinky.flexmonster.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSlice extends js.Object {
  var slice: js.UndefOr[Slice] = js.native
}

object AnonSlice {
  @scala.inline
  def apply(): AnonSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSlice]
  }
  @scala.inline
  implicit class AnonSliceOps[Self <: AnonSlice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlice(value: Slice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
  }
  
}

