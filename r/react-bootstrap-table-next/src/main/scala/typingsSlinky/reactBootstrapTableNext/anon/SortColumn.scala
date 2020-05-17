package typingsSlinky.reactBootstrapTableNext.anon

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import typingsSlinky.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortColumn[T /* <: js.Object */] extends js.Object {
  var sortColumn: ColumnDescription[T, _] = js.native
  var sortOrder: SortOrder = js.native
}

object SortColumn {
  @scala.inline
  def apply[T](sortColumn: ColumnDescription[T, _], sortOrder: SortOrder): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortColumn = sortColumn.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  @scala.inline
  implicit class SortColumnOps[Self[t] <: SortColumn[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSortColumn(value: ColumnDescription[T, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

