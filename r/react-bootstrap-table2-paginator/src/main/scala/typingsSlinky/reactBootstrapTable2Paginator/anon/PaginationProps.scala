package typingsSlinky.reactBootstrapTable2Paginator.anon

import typingsSlinky.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typingsSlinky.reactBootstrapTableNext.mod.BootstrapTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var paginationProps: PaginationChildProps = js.native
  var paginationTableProps: BootstrapTableProps[_] = js.native
}

object PaginationProps {
  @scala.inline
  def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[_]): PaginationProps = {
    val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
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

