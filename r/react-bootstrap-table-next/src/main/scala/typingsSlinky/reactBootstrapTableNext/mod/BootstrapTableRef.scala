package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.AnonCurrFilters
import typingsSlinky.reactBootstrapTableNext.AnonCurrPage
import typingsSlinky.reactBootstrapTableNext.AnonProps
import typingsSlinky.reactBootstrapTableNext.AnonSelected
import typingsSlinky.reactBootstrapTableNext.AnonStartEditing
import typingsSlinky.reactBootstrapTableNext.AnonState
import typingsSlinky.reactBootstrapTableNext.AnonStateAnonSortColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTableRef[T /* <: js.Object */] extends js.Object {
  var cellEditContext: js.UndefOr[AnonStartEditing] = js.native
  var filterContext: js.UndefOr[AnonCurrFilters] = js.native
  var paginationContext: js.UndefOr[AnonCurrPage] = js.native
  var rowExpandContext: js.UndefOr[AnonState] = js.native
  var selectionContext: js.UndefOr[AnonSelected] = js.native
  var sortContext: js.UndefOr[AnonStateAnonSortColumn[T]] = js.native
  var table: AnonProps[T] = js.native
}

object BootstrapTableRef {
  @scala.inline
  def apply[T](table: AnonProps[T]): BootstrapTableRef[T] = {
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
    def withTable(value: AnonProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellEditContext(value: AnonStartEditing): Self[T] = {
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
    def withFilterContext(value: AnonCurrFilters): Self[T] = {
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
    def withPaginationContext(value: AnonCurrPage): Self[T] = {
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
    def withRowExpandContext(value: AnonState): Self[T] = {
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
    def withSelectionContext(value: AnonSelected): Self[T] = {
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
    def withSortContext(value: AnonStateAnonSortColumn[T]): Self[T] = {
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

