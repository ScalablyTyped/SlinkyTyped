package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each row in a table.
  */
@js.native
trait SchemaTableRow extends js.Object {
  /**
    * Height of a row.
    */
  var rowHeight: js.UndefOr[SchemaDimension] = js.native
  /**
    * Properties and contents of each cell.  Cells that span multiple columns
    * are represented only once with a column_span greater than 1. As a result,
    * the length of this collection does not always match the number of columns
    * of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.native
  /**
    * Properties of the row.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  @scala.inline
  implicit class SchemaTableRowOps[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowHeight(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCells(value: js.Array[SchemaTableCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowProperties(value: SchemaTableRowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(js.undefined)
        ret
    }
  }
  
}

