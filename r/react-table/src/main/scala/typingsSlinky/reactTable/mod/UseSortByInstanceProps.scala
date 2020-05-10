package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByInstanceProps[D /* <: js.Object */] extends js.Object {
  var preSortedRows: js.Array[Row[D]] = js.native
  var rows: js.Array[Row[D]] = js.native
  def toggleSortBy(columnId: IdType[D], descending: Boolean, isMulti: Boolean): Unit = js.native
}

object UseSortByInstanceProps {
  @scala.inline
  def apply[D](
    preSortedRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    toggleSortBy: (IdType[D], Boolean, Boolean) => Unit
  ): UseSortByInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preSortedRows = preSortedRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], toggleSortBy = js.Any.fromFunction3(toggleSortBy))
    __obj.asInstanceOf[UseSortByInstanceProps[D]]
  }
  @scala.inline
  implicit class UseSortByInstancePropsOps[Self[d] <: UseSortByInstanceProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withPreSortedRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSortedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleSortBy(value: (IdType[D], Boolean, Boolean) => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSortBy")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

