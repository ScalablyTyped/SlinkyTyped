package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTableRowsRequest extends js.Object {
  /**
    * The reference table cell location from which rows will be inserted.
    *
    * A new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  /**
    * Whether to insert new rows below the reference cell location.
    *
    * - `True`: insert below the cell.
    * - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.native
  /** The number of rows to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.native
  /** The table to insert rows into. */
  var tableObjectId: js.UndefOr[String] = js.native
}

object InsertTableRowsRequest {
  @scala.inline
  def apply(): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
  @scala.inline
  implicit class InsertTableRowsRequestOps[Self <: InsertTableRowsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: TableCellLocation): Self = {
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
    def withInsertBelow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBelow")(js.undefined)
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

