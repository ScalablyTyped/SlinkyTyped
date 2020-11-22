package typingsSlinky.muiDatatables.anon

import slinky.core.facade.ReactElement
import typingsSlinky.muiDatatables.mod.MUIDataTableBody
import typingsSlinky.muiDatatables.mod.MUIDataTableExpandButton
import typingsSlinky.muiDatatables.mod.MUIDataTableFilterList
import typingsSlinky.muiDatatables.mod.MUIDataTableFooter
import typingsSlinky.muiDatatables.mod.MUIDataTableHead
import typingsSlinky.muiDatatables.mod.MUIDataTableResize
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbar
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbarSelect
import typingsSlinky.muiDatatables.mod.RenderCustomComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  ExpandButton :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableExpandButton> | react.react.ReactNode,   TableBody :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableBody> | react.react.ReactNode,   TableFooter :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFooter> | react.react.ReactNode,   TableHead :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableHead> | react.react.ReactNode,   TableResize :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableResize> | react.react.ReactNode,   TableToolbar :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbar> | react.react.ReactNode,   TableToolbarSelect :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbarSelect> | react.react.ReactNode,   TableFilterList :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFilterList> | react.react.ReactNode,   Tooltip :react.react.ReactNode}> */
@js.native
trait PartialExpandButtonRender extends js.Object {
  
  var ExpandButton: js.UndefOr[RenderCustomComponent[MUIDataTableExpandButton] | ReactElement] = js.native
  
  var TableBody: js.UndefOr[RenderCustomComponent[MUIDataTableBody] | ReactElement] = js.native
  
  var TableFilterList: js.UndefOr[RenderCustomComponent[MUIDataTableFilterList] | ReactElement] = js.native
  
  var TableFooter: js.UndefOr[RenderCustomComponent[MUIDataTableFooter] | ReactElement] = js.native
  
  var TableHead: js.UndefOr[RenderCustomComponent[MUIDataTableHead] | ReactElement] = js.native
  
  var TableResize: js.UndefOr[RenderCustomComponent[MUIDataTableResize] | ReactElement] = js.native
  
  var TableToolbar: js.UndefOr[RenderCustomComponent[MUIDataTableToolbar] | ReactElement] = js.native
  
  var TableToolbarSelect: js.UndefOr[RenderCustomComponent[MUIDataTableToolbarSelect] | ReactElement] = js.native
  
  var Tooltip: js.UndefOr[ReactElement] = js.native
}
object PartialExpandButtonRender {
  
  @scala.inline
  def apply(): PartialExpandButtonRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExpandButtonRender]
  }
  
  @scala.inline
  implicit class PartialExpandButtonRenderOps[Self <: PartialExpandButtonRender] (val x: Self) extends AnyVal {
    
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
    def setExpandButtonReactElement(value: ReactElement): Self = this.set("ExpandButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandButtonFunction1(value: MUIDataTableExpandButton => ReactElement): Self = this.set("ExpandButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandButton(value: RenderCustomComponent[MUIDataTableExpandButton] | ReactElement): Self = this.set("ExpandButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandButton: Self = this.set("ExpandButton", js.undefined)
    
    @scala.inline
    def setTableBodyReactElement(value: ReactElement): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyFunction1(value: MUIDataTableBody => ReactElement): Self = this.set("TableBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableBody(value: RenderCustomComponent[MUIDataTableBody] | ReactElement): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    
    @scala.inline
    def setTableFilterListReactElement(value: ReactElement): Self = this.set("TableFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableFilterListFunction1(value: MUIDataTableFilterList => ReactElement): Self = this.set("TableFilterList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableFilterList(value: RenderCustomComponent[MUIDataTableFilterList] | ReactElement): Self = this.set("TableFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableFilterList: Self = this.set("TableFilterList", js.undefined)
    
    @scala.inline
    def setTableFooterReactElement(value: ReactElement): Self = this.set("TableFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableFooterFunction1(value: MUIDataTableFooter => ReactElement): Self = this.set("TableFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableFooter(value: RenderCustomComponent[MUIDataTableFooter] | ReactElement): Self = this.set("TableFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableFooter: Self = this.set("TableFooter", js.undefined)
    
    @scala.inline
    def setTableHeadReactElement(value: ReactElement): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableHeadFunction1(value: MUIDataTableHead => ReactElement): Self = this.set("TableHead", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableHead(value: RenderCustomComponent[MUIDataTableHead] | ReactElement): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHead: Self = this.set("TableHead", js.undefined)
    
    @scala.inline
    def setTableResizeReactElement(value: ReactElement): Self = this.set("TableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableResizeFunction1(value: MUIDataTableResize => ReactElement): Self = this.set("TableResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableResize(value: RenderCustomComponent[MUIDataTableResize] | ReactElement): Self = this.set("TableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableResize: Self = this.set("TableResize", js.undefined)
    
    @scala.inline
    def setTableToolbarReactElement(value: ReactElement): Self = this.set("TableToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableToolbarFunction1(value: MUIDataTableToolbar => ReactElement): Self = this.set("TableToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableToolbar(value: RenderCustomComponent[MUIDataTableToolbar] | ReactElement): Self = this.set("TableToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableToolbar: Self = this.set("TableToolbar", js.undefined)
    
    @scala.inline
    def setTableToolbarSelectReactElement(value: ReactElement): Self = this.set("TableToolbarSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableToolbarSelectFunction1(value: MUIDataTableToolbarSelect => ReactElement): Self = this.set("TableToolbarSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableToolbarSelect(value: RenderCustomComponent[MUIDataTableToolbarSelect] | ReactElement): Self = this.set("TableToolbarSelect", value.asInstanceOf[js.Any])
    
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
