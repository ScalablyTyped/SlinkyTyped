package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts columns into a table.  Other columns in the table will be resized
  * to fit the new column.
  */
@js.native
trait SchemaInsertTableColumnsRequest extends js.Object {
  /**
    * The reference table cell location from which columns will be inserted.  A
    * new column will be inserted to the left (or right) of the column where
    * the reference cell is. If the reference cell is a merged cell, a new
    * column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * Whether to insert new columns to the right of the reference cell
    * location.  - `True`: insert to the right. - `False`: insert to the left.
    */
  var insertRight: js.UndefOr[Boolean] = js.native
  /**
    * The number of columns to be inserted. Maximum 20 per request.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The table to insert columns into.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}

object SchemaInsertTableColumnsRequest {
  @scala.inline
  def apply(): SchemaInsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableColumnsRequest]
  }
  @scala.inline
  implicit class SchemaInsertTableColumnsRequestOps[Self <: SchemaInsertTableColumnsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: SchemaTableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRight")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withTableObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableObjectId")(js.undefined)
        ret
    }
  }
  
}

