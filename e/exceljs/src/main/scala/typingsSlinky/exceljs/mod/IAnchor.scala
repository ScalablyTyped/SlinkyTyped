package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnchor extends js.Object {
  var col: Double = js.native
  var nativeCol: Double = js.native
  var nativeColOff: Double = js.native
  var nativeRow: Double = js.native
  var nativeRowOff: Double = js.native
  var row: Double = js.native
}

object IAnchor {
  @scala.inline
  def apply(
    col: Double,
    nativeCol: Double,
    nativeColOff: Double,
    nativeRow: Double,
    nativeRowOff: Double,
    row: Double
  ): IAnchor = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], nativeCol = nativeCol.asInstanceOf[js.Any], nativeColOff = nativeColOff.asInstanceOf[js.Any], nativeRow = nativeRow.asInstanceOf[js.Any], nativeRowOff = nativeRowOff.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnchor]
  }
  @scala.inline
  implicit class IAnchorOps[Self <: IAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeColOff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeColOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeRowOff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeRowOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

