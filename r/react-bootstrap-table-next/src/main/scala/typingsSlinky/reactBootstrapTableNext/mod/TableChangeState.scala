package typingsSlinky.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactBootstrapTableNext.anon.Comparator
import typingsSlinky.reactBootstrapTableNext.anon.DataField
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableChangeState[T] extends js.Object {
  var cellEdit: DataField = js.native
  var data: js.Array[T] = js.native
  var filters: StringDictionary[Comparator] = js.native
  var page: Double = js.native
  var sizePerPage: Double = js.native
  var sortField: String = js.native
  var sortOrder: asc | desc = js.native
}

object TableChangeState {
  @scala.inline
  def apply[T](
    cellEdit: DataField,
    data: js.Array[T],
    filters: StringDictionary[Comparator],
    page: Double,
    sizePerPage: Double,
    sortField: String,
    sortOrder: asc | desc
  ): TableChangeState[T] = {
    val __obj = js.Dynamic.literal(cellEdit = cellEdit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangeState[T]]
  }
  @scala.inline
  implicit class TableChangeStateOps[Self[t] <: TableChangeState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCellEdit(value: DataField): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: StringDictionary[Comparator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizePerPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizePerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: asc | desc): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

