package typingsSlinky.reactDashDatagrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashDatagrid.Anon_PageSize
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid.Column
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid.DataGridProps
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid.PaginationToolbarProps
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid.RowProps
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid.SortInfo
import typingsSlinky.reactDashDatagrid.reactDashDatagridMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashDatagrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-datagrid", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ Anon_PageSize, js.Promise[js.Array[_]]]),
    idProperty: String,
    dataSourceCount: Int | Double = null,
    defaultPage: Int | Double = null,
    defaultPageSize: Int | Double = null,
    emptyText: String = null,
    groupBy: js.Array[_] = null,
    liveFilter: js.UndefOr[Boolean] = js.undefined,
    loadMaskOverHeader: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onColumnOrderChange: (/* index */ Double, /* dropIndex */ Double) => Unit = null,
    onColumnResize: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Unit = null,
    onColumnVisibilityChange: (/* column */ Column, /* visibility */ Boolean) => Unit = null,
    onFilter: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_]) => Unit = null,
    onPageChange: /* page */ Double => Unit = null,
    onPageSizeChange: (/* pageSize */ Double, /* props */ DataGridProps) => Unit = null,
    onSelectionChange: (/* newSelected */ js.Object, /* data */ js.Any) => Unit = null,
    onSortChange: /* sortInfo */ js.Array[SortInfo] => Unit = null,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    paginationToolbarProps: PaginationToolbarProps = null,
    rowHeight: Int | Double = null,
    rowStyle: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties]) = null,
    selected: js.Object = null,
    showCellBorders: Boolean | String = null,
    sortInfo: js.Array[SortInfo] = null,
    style: CSSProperties = null,
    withColumnMenu: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    if (dataSourceCount != null) __obj.updateDynamic("dataSourceCount")(dataSourceCount.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(liveFilter)) __obj.updateDynamic("liveFilter")(liveFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMaskOverHeader)) __obj.updateDynamic("loadMaskOverHeader")(loadMaskOverHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onColumnOrderChange != null) __obj.updateDynamic("onColumnOrderChange")(js.Any.fromFunction2(onColumnOrderChange))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction4(onColumnResize))
    if (onColumnVisibilityChange != null) __obj.updateDynamic("onColumnVisibilityChange")(js.Any.fromFunction2(onColumnVisibilityChange))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction3(onFilter))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPageSizeChange != null) __obj.updateDynamic("onPageSizeChange")(js.Any.fromFunction2(onPageSizeChange))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (onSortChange != null) __obj.updateDynamic("onSortChange")(js.Any.fromFunction1(onSortChange))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationToolbarProps != null) __obj.updateDynamic("paginationToolbarProps")(paginationToolbarProps.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (showCellBorders != null) __obj.updateDynamic("showCellBorders")(showCellBorders.asInstanceOf[js.Any])
    if (sortInfo != null) __obj.updateDynamic("sortInfo")(sortInfo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withColumnMenu)) __obj.updateDynamic("withColumnMenu")(withColumnMenu.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DataGridProps
}

