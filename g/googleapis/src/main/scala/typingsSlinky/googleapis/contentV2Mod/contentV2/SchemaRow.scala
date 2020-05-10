package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRow extends js.Object {
  /**
    * The list of cells that constitute the row. Must have the same length as
    * columnHeaders for two-dimensional tables, a length of 1 for
    * one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[SchemaValue]] = js.native
}

object SchemaRow {
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  @scala.inline
  implicit class SchemaRowOps[Self <: SchemaRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[SchemaValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
  }
  
}

