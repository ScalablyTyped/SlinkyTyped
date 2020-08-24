package typingsSlinky.muiDatatables.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  TableBody :react.react.ReactNode,   TableFooter :react.react.ReactNode,   TableHead :react.react.ReactNode,   TableResize :react.react.ReactNode,   TableToolbar :react.react.ReactNode,   TableToolbarSelect :react.react.ReactNode,   TableFilterList :react.react.ReactNode,   Tooltip :react.react.ReactNode}> */
@js.native
trait PartialTableBodyReactNode extends js.Object {
  var TableBody: js.UndefOr[ReactElement] = js.native
  var TableFilterList: js.UndefOr[ReactElement] = js.native
  var TableFooter: js.UndefOr[ReactElement] = js.native
  var TableHead: js.UndefOr[ReactElement] = js.native
  var TableResize: js.UndefOr[ReactElement] = js.native
  var TableToolbar: js.UndefOr[ReactElement] = js.native
  var TableToolbarSelect: js.UndefOr[ReactElement] = js.native
  var Tooltip: js.UndefOr[ReactElement] = js.native
}

object PartialTableBodyReactNode {
  @scala.inline
  def apply(): PartialTableBodyReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableBodyReactNode]
  }
  @scala.inline
  implicit class PartialTableBodyReactNodeOps[Self <: PartialTableBodyReactNode] (val x: Self) extends AnyVal {
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
    def setTableBodyReactElement(value: ReactElement): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableBody(value: ReactElement): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    @scala.inline
    def setTableFilterListReactElement(value: ReactElement): Self = this.set("TableFilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableFilterList(value: ReactElement): Self = this.set("TableFilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableFilterList: Self = this.set("TableFilterList", js.undefined)
    @scala.inline
    def setTableFooterReactElement(value: ReactElement): Self = this.set("TableFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableFooter(value: ReactElement): Self = this.set("TableFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableFooter: Self = this.set("TableFooter", js.undefined)
    @scala.inline
    def setTableHeadReactElement(value: ReactElement): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableHead(value: ReactElement): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHead: Self = this.set("TableHead", js.undefined)
    @scala.inline
    def setTableResizeReactElement(value: ReactElement): Self = this.set("TableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableResize(value: ReactElement): Self = this.set("TableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableResize: Self = this.set("TableResize", js.undefined)
    @scala.inline
    def setTableToolbarReactElement(value: ReactElement): Self = this.set("TableToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableToolbar(value: ReactElement): Self = this.set("TableToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableToolbar: Self = this.set("TableToolbar", js.undefined)
    @scala.inline
    def setTableToolbarSelectReactElement(value: ReactElement): Self = this.set("TableToolbarSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableToolbarSelect(value: ReactElement): Self = this.set("TableToolbarSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableToolbarSelect: Self = this.set("TableToolbarSelect", js.undefined)
    @scala.inline
    def setTooltipReactElement(value: ReactElement): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: ReactElement): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("Tooltip", js.undefined)
  }
  
}

