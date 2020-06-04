package typingsSlinky.antd.tableInterfaceMod

import typingsSlinky.antd.anon.Column
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnTitleProps[RecordType] extends js.Object {
  var filters: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  /** @deprecated Please use `sorterColumns` instead. */
  var sortColumn: js.UndefOr[ColumnType[RecordType]] = js.undefined
  var sortColumns: js.UndefOr[js.Array[Column[RecordType]]] = js.undefined
  /** @deprecated Please use `sorterColumns` instead. */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object ColumnTitleProps {
  @scala.inline
  def apply[RecordType](): ColumnTitleProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTitleProps[RecordType]]
  }
  @scala.inline
  implicit class ColumnTitlePropsOps[Self <: ColumnTitleProps[_], RecordType] (val x: Self with ColumnTitleProps[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilters(value: Record[String, js.Array[String]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setSortColumn(value: ColumnType[RecordType]): Self = this.set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumn: Self = this.set("sortColumn", js.undefined)
    @scala.inline
    def setSortColumns(value: js.Array[Column[RecordType]]): Self = this.set("sortColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumns: Self = this.set("sortColumns", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
  }
  
}

