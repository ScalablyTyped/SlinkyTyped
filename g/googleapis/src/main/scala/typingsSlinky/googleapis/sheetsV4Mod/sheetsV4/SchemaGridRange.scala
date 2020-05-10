package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range on a sheet. All indexes are zero-based. Indexes are half open, e.g
  * the start index is inclusive and the end index is exclusive --
  * [start_index, end_index). Missing indexes indicate the range is unbounded
  * on that side.  For example, if `&quot;Sheet1&quot;` is sheet ID 0, then:
  * `Sheet1!A1:A1 == sheet_id: 0,                   start_row_index: 0,
  * end_row_index: 1,                   start_column_index: 0,
  * end_column_index: 1`    `Sheet1!A3:B4 == sheet_id: 0, start_row_index: 2,
  * end_row_index: 4,                   start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A:B == sheet_id: 0, start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A5:B == sheet_id: 0, start_row_index: 4,
  * start_column_index: 0, end_column_index: 2`    `Sheet1 == sheet_id:0`  The
  * start index must always be less than or equal to the end index. If the
  * start index equals the end index, then the range is empty. Empty ranges are
  * typically not meaningful and are usually rendered in the UI as `#REF!`.
  */
@js.native
trait SchemaGridRange extends js.Object {
  /**
    * The end column (exclusive) of the range, or not set if unbounded.
    */
  var endColumnIndex: js.UndefOr[Double] = js.native
  /**
    * The end row (exclusive) of the range, or not set if unbounded.
    */
  var endRowIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this range is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The start column (inclusive) of the range, or not set if unbounded.
    */
  var startColumnIndex: js.UndefOr[Double] = js.native
  /**
    * The start row (inclusive) of the range, or not set if unbounded.
    */
  var startRowIndex: js.UndefOr[Double] = js.native
}

object SchemaGridRange {
  @scala.inline
  def apply(): SchemaGridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridRange]
  }
  @scala.inline
  implicit class SchemaGridRangeOps[Self <: SchemaGridRange] (val x: Self) extends AnyVal {
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

