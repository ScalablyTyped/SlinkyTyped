package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends js.Object {
  var slice: js.UndefOr[typingsSlinky.flexmonster.mod.Slice] = js.native
}

object Slice {
  @scala.inline
  def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  @scala.inline
  implicit class SliceOps[Self <: Slice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlice(value: typingsSlinky.flexmonster.mod.Slice): Self = {
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

