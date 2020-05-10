package typingsSlinky.antd.tableInterfaceMod

import typingsSlinky.antd.AnonColumn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnTitleProps[RecordType] extends js.Object {
  var filters: js.UndefOr[Record[String, js.Array[String]]] = js.native
  /** @deprecated Please use `sorterColumns` instead. */
  var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.native
  var sortColumns: js.UndefOr[js.Array[AnonColumn[RecordType]]] = js.native
  /** @deprecated Please use `sorterColumns` instead. */
  var sortOrder: js.UndefOr[SortOrder] = js.native
}

object ColumnTitleProps {
  @scala.inline
  def apply[RecordType](): ColumnTitleProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTitleProps[RecordType]]
  }
  @scala.inline
  implicit class ColumnTitlePropsOps[Self[recordtype] <: ColumnTitleProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withFilters(value: Record[String, js.Array[String]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumn(value: ColumnType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumn: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumns(value: js.Array[AnonColumn[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(null)
        ret
    }
  }
  
}

