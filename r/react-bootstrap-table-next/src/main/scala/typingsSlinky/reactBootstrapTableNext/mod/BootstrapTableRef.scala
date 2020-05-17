package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.anon.CurrFilters
import typingsSlinky.reactBootstrapTableNext.anon.CurrPage
import typingsSlinky.reactBootstrapTableNext.anon.Props
import typingsSlinky.reactBootstrapTableNext.anon.Selected
import typingsSlinky.reactBootstrapTableNext.anon.StartEditing
import typingsSlinky.reactBootstrapTableNext.anon.State
import typingsSlinky.reactBootstrapTableNext.anon.StateSortColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTableRef[T /* <: js.Object */] extends js.Object {
  var cellEditContext: js.UndefOr[StartEditing] = js.native
  var filterContext: js.UndefOr[CurrFilters] = js.native
  var paginationContext: js.UndefOr[CurrPage] = js.native
  var rowExpandContext: js.UndefOr[State] = js.native
  var selectionContext: js.UndefOr[Selected] = js.native
  var sortContext: js.UndefOr[StateSortColumn[T]] = js.native
  var table: Props[T] = js.native
}

object BootstrapTableRef {
  @scala.inline
  def apply[T](table: Props[T]): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
  @scala.inline
  implicit class BootstrapTableRefOps[Self[t] <: BootstrapTableRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTable(value: Props[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellEditContext(value: StartEditing): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditContext")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterContext(value: CurrFilters): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterContext")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationContext(value: CurrPage): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationContext")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpandContext(value: State): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowExpandContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionContext(value: Selected): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSortContext(value: StateSortColumn[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortContext")(js.undefined)
        ret
    }
  }
  
}

