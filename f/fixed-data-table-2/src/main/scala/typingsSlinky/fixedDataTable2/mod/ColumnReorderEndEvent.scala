package typingsSlinky.fixedDataTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnReorderEndEvent extends js.Object {
  /** the column after the new location of this one */
  var columnAfter: js.UndefOr[String] = js.native
  /** the column before the new location of this one */
  var columnBefore: js.UndefOr[String] = js.native
  /** the column key that was just reordered */
  var reorderColumn: String = js.native
}

object ColumnReorderEndEvent {
  @scala.inline
  def apply(reorderColumn: String): ColumnReorderEndEvent = {
    val __obj = js.Dynamic.literal(reorderColumn = reorderColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnReorderEndEvent]
  }
  @scala.inline
  implicit class ColumnReorderEndEventOps[Self <: ColumnReorderEndEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorderColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBefore")(js.undefined)
        ret
    }
  }
  
}

