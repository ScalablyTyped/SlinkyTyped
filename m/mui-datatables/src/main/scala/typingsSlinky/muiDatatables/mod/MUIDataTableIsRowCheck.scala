package typingsSlinky.muiDatatables.mod

import typingsSlinky.muiDatatables.AnonDataIndex
import typingsSlinky.muiDatatables.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableIsRowCheck extends js.Object {
  var data: js.Array[AnonIndex] = js.native
  var lookup: AnonDataIndex = js.native
}

object MUIDataTableIsRowCheck {
  @scala.inline
  def apply(data: js.Array[AnonIndex], lookup: AnonDataIndex): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
  @scala.inline
  implicit class MUIDataTableIsRowCheckOps[Self <: MUIDataTableIsRowCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[AnonIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: AnonDataIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

