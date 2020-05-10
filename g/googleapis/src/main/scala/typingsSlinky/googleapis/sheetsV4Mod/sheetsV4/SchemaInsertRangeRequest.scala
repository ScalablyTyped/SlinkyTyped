package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts cells into a range, shifting the existing cells over or down.
  */
@js.native
trait SchemaInsertRangeRequest extends js.Object {
  /**
    * The range to insert new cells into.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The dimension which will be shifted when inserting cells. If ROWS,
    * existing cells will be shifted down. If COLUMNS, existing cells will be
    * shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object SchemaInsertRangeRequest {
  @scala.inline
  def apply(): SchemaInsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertRangeRequest]
  }
  @scala.inline
  implicit class SchemaInsertRangeRequestOps[Self <: SchemaInsertRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDimension")(js.undefined)
        ret
    }
  }
  
}

