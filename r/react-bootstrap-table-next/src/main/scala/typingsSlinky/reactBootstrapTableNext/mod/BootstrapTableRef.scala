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

trait BootstrapTableRef[T /* <: js.Object */] extends js.Object {
  var cellEditContext: js.UndefOr[StartEditing] = js.undefined
  var filterContext: js.UndefOr[CurrFilters] = js.undefined
  var paginationContext: js.UndefOr[CurrPage] = js.undefined
  var rowExpandContext: js.UndefOr[State] = js.undefined
  var selectionContext: js.UndefOr[Selected] = js.undefined
  var sortContext: js.UndefOr[StateSortColumn[T]] = js.undefined
  var table: Props[T]
}

object BootstrapTableRef {
  @scala.inline
  def apply[T](
    table: Props[T],
    cellEditContext: StartEditing = null,
    filterContext: CurrFilters = null,
    paginationContext: CurrPage = null,
    rowExpandContext: State = null,
    selectionContext: Selected = null,
    sortContext: StateSortColumn[T] = null
  ): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (cellEditContext != null) __obj.updateDynamic("cellEditContext")(cellEditContext.asInstanceOf[js.Any])
    if (filterContext != null) __obj.updateDynamic("filterContext")(filterContext.asInstanceOf[js.Any])
    if (paginationContext != null) __obj.updateDynamic("paginationContext")(paginationContext.asInstanceOf[js.Any])
    if (rowExpandContext != null) __obj.updateDynamic("rowExpandContext")(rowExpandContext.asInstanceOf[js.Any])
    if (selectionContext != null) __obj.updateDynamic("selectionContext")(selectionContext.asInstanceOf[js.Any])
    if (sortContext != null) __obj.updateDynamic("sortContext")(sortContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
}

