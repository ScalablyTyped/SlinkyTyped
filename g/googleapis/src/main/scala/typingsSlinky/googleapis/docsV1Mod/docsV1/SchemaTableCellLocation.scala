package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a single cell within a table.
  */
@js.native
trait SchemaTableCellLocation extends js.Object {
  /**
    * The zero-based column index. For example, the second column in the table
    * has a column index of 1.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based row index. For example, the second row in the table has a
    * row index of 1.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * The location where the table starts in the document.
    */
  var tableStartLocation: js.UndefOr[SchemaLocation] = js.native
}

object SchemaTableCellLocation {
  @scala.inline
  def apply(): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
  @scala.inline
  implicit class SchemaTableCellLocationOps[Self <: SchemaTableCellLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStartLocation(value: SchemaLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStartLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStartLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStartLocation")(js.undefined)
        ret
    }
  }
  
}

