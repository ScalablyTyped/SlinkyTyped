package typingsSlinky.reactDatagrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDatagrid.AnonPageSize
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.Column
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.DataGridProps
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.PaginationToolbarProps
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.RowProps
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.SortInfo
import typingsSlinky.reactDatagrid.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDatagrid {
  @JSImport("react-datagrid", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def dataSourceCount(value: Double): this.type = set("dataSourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPage(value: Double): this.type = set("defaultPage", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyText(value: String): this.type = set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def groupBy(value: js.Array[_]): this.type = set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def liveFilter(value: Boolean): this.type = set("liveFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMaskOverHeader(value: Boolean): this.type = set("loadMaskOverHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def onColumnOrderChange(value: (/* index */ Double, /* dropIndex */ Double) => Unit): this.type = set("onColumnOrderChange", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnResize(
      value: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Unit
    ): this.type = set("onColumnResize", js.Any.fromFunction4(value))
    @scala.inline
    def onColumnVisibilityChange(value: (/* column */ Column, /* visibility */ Boolean) => Unit): this.type = set("onColumnVisibilityChange", js.Any.fromFunction2(value))
    @scala.inline
    def onFilter(value: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_]) => Unit): this.type = set("onFilter", js.Any.fromFunction3(value))
    @scala.inline
    def onPageChange(value: /* page */ Double => Unit): this.type = set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def onPageSizeChange(value: (/* pageSize */ Double, /* props */ DataGridProps) => Unit): this.type = set("onPageSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectionChange(value: (/* newSelected */ js.Object, /* data */ js.Any) => Unit): this.type = set("onSelectionChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSortChange(value: /* sortInfo */ js.Array[SortInfo] => Unit): this.type = set("onSortChange", js.Any.fromFunction1(value))
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationToolbarProps(value: PaginationToolbarProps): this.type = set("paginationToolbarProps", value.asInstanceOf[js.Any])
    @scala.inline
    def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def rowStyleFunction2(value: (/* data */ js.Any, /* props */ RowProps) => CSSProperties): this.type = set("rowStyle", js.Any.fromFunction2(value))
    @scala.inline
    def rowStyle(value: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])): this.type = set("rowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: js.Object): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def showCellBorders(value: Boolean | String): this.type = set("showCellBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def sortInfo(value: js.Array[SortInfo]): this.type = set("sortInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def withColumnMenu(value: Boolean): this.type = set("withColumnMenu", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ AnonPageSize, js.Promise[js.Array[_]]]),
    idProperty: String
  ): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DataGridProps]))
  }
}

