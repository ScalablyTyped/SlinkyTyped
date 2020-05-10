package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRange extends js.Object {
  /** The end column (exclusive) of the range, or not set if unbounded. */
  var endColumnIndex: js.UndefOr[Double] = js.native
  /** The end row (exclusive) of the range, or not set if unbounded. */
  var endRowIndex: js.UndefOr[Double] = js.native
  /** The sheet this range is on. */
  var sheetId: js.UndefOr[Double] = js.native
  /** The start column (inclusive) of the range, or not set if unbounded. */
  var startColumnIndex: js.UndefOr[Double] = js.native
  /** The start row (inclusive) of the range, or not set if unbounded. */
  var startRowIndex: js.UndefOr[Double] = js.native
}

object GridRange {
  @scala.inline
  def apply(): GridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRange]
  }
  @scala.inline
  implicit class GridRangeOps[Self <: GridRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRowIndex")(js.undefined)
        ret
    }
  }
  
}

