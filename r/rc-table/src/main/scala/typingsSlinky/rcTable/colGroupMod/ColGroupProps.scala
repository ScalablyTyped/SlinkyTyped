package typingsSlinky.rcTable.colGroupMod

import typingsSlinky.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColGroupProps[RecordType] extends js.Object {
  var colWidths: js.Array[Double | String] = js.native
  var columCount: js.UndefOr[Double] = js.native
  var columns: js.UndefOr[js.Array[ColumnType[RecordType]]] = js.native
}

object ColGroupProps {
  @scala.inline
  def apply[RecordType](colWidths: js.Array[Double | String]): ColGroupProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupProps[RecordType]]
  }
  @scala.inline
  implicit class ColGroupPropsOps[Self[recordtype] <: ColGroupProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColWidths(value: js.Array[Double | String]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumCount(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumCount: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnType[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
  }
  
}

