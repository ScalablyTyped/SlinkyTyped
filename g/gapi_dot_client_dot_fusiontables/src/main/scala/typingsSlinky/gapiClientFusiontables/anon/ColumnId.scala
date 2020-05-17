package typingsSlinky.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnId extends js.Object {
  /** The id of the column in the base table from which this column is derived. */
  var columnId: js.UndefOr[Double] = js.native
  /** Offset to the entry in the list of base tables in the table definition. */
  var tableIndex: js.UndefOr[Double] = js.native
}

object ColumnId {
  @scala.inline
  def apply(): ColumnId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnId]
  }
  @scala.inline
  implicit class ColumnIdOps[Self <: ColumnId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableIndex")(js.undefined)
        ret
    }
  }
  
}

