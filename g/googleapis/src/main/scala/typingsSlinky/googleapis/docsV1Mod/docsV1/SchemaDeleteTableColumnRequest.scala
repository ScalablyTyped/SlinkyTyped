package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a column from a table.
  */
@js.native
trait SchemaDeleteTableColumnRequest extends js.Object {
  /**
    * The reference table cell location from which the column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell that
    * spans multiple columns, all columns that the cell spans will be deleted.
    * If no columns remain in the table after this deletion, the whole table is
    * deleted.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
}

object SchemaDeleteTableColumnRequest {
  @scala.inline
  def apply(): SchemaDeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTableColumnRequest]
  }
  @scala.inline
  implicit class SchemaDeleteTableColumnRequestOps[Self <: SchemaDeleteTableColumnRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableCellLocation(value: SchemaTableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellLocation")(js.undefined)
        ret
    }
  }
  
}

