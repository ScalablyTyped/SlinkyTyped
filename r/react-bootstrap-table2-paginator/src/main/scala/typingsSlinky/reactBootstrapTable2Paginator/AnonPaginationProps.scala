package typingsSlinky.reactBootstrapTable2Paginator

import typingsSlinky.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typingsSlinky.reactBootstrapTableNext.mod.BootstrapTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaginationProps extends js.Object {
  var paginationProps: PaginationChildProps = js.native
  var paginationTableProps: BootstrapTableProps[_] = js.native
}

object AnonPaginationProps {
  @scala.inline
  def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[_]): AnonPaginationProps = {
    val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaginationProps]
  }
  @scala.inline
  implicit class AnonPaginationPropsOps[Self <: AnonPaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationProps(value: PaginationChildProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationTableProps(value: BootstrapTableProps[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationTableProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

