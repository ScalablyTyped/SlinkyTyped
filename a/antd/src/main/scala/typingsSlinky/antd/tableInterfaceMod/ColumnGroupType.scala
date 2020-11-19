package typingsSlinky.antd.tableInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.Compare
import typingsSlinky.antd.responsiveObserveMod.Breakpoint
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.CellEllipsisType
import typingsSlinky.rcTable.interfaceMod.FixedType
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'dataIndex'> */
@js.native
trait ColumnGroupType[RecordType] extends js.Object {
  
  var align: js.UndefOr[AlignType] = js.native
  
  var children: ColumnsType[RecordType] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  
  var ellipsis: js.UndefOr[CellEllipsisType] = js.native
  
  var filterDropdown: js.UndefOr[ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])] = js.native
  
  var filterDropdownVisible: js.UndefOr[Boolean] = js.native
  
  var filterIcon: js.UndefOr[ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])] = js.native
  
  var filterMultiple: js.UndefOr[Boolean] = js.native
  
  var filtered: js.UndefOr[Boolean] = js.native
  
  var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  
  var fixed: js.UndefOr[FixedType] = js.native
  
  var key: js.UndefOr[typingsSlinky.rcTable.interfaceMod.Key] = js.native
  
  var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.native
  
  var onCellClick: js.UndefOr[
    js.Function2[/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  
  var onFilter: js.UndefOr[
    js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
  ] = js.native
  
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.native
  
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactElement | RenderedCell[RecordType]
    ]
  ] = js.native
  
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
  
  var showSorterTooltip: js.UndefOr[Boolean] = js.native
  
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  
  var sortOrder: js.UndefOr[SortOrder] = js.native
  
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.native
  
  var title: js.UndefOr[ColumnTitle[RecordType]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ColumnGroupType {
  
  @scala.inline
  def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
  
  @scala.inline
  implicit class ColumnGroupTypeOps[Self <: ColumnGroupType[_], RecordType] (val x: Self with ColumnGroupType[RecordType]) extends AnyVal {
    
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
    def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ColumnsType[RecordType]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setDefaultFilteredValueVarargs(value: Key*): Self = this.set("defaultFilteredValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFilteredValue(value: js.Array[Key]): Self = this.set("defaultFilteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFilteredValue: Self = this.set("defaultFilteredValue", js.undefined)
    
    @scala.inline
    def setDefaultFilteredValueNull: Self = this.set("defaultFilteredValue", null)
    
    @scala.inline
    def setDefaultSortOrder(value: SortOrder): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    
    @scala.inline
    def setDefaultSortOrderNull: Self = this.set("defaultSortOrder", null)
    
    @scala.inline
    def setEllipsis(value: CellEllipsisType): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    
    @scala.inline
    def setFilterDropdownReactElement(value: ReactElement): Self = this.set("filterDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactElement): Self = this.set("filterDropdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterDropdown(value: ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])): Self = this.set("filterDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterDropdown: Self = this.set("filterDropdown", js.undefined)
    
    @scala.inline
    def setFilterDropdownVisible(value: Boolean): Self = this.set("filterDropdownVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterDropdownVisible: Self = this.set("filterDropdownVisible", js.undefined)
    
    @scala.inline
    def setFilterIconReactElement(value: ReactElement): Self = this.set("filterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIconFunction1(value: /* filtered */ Boolean => ReactElement): Self = this.set("filterIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterIcon(value: ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])): Self = this.set("filterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterIcon: Self = this.set("filterIcon", js.undefined)
    
    @scala.inline
    def setFilterMultiple(value: Boolean): Self = this.set("filterMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMultiple: Self = this.set("filterMultiple", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    
    @scala.inline
    def setFilteredValueVarargs(value: Key*): Self = this.set("filteredValue", js.Array(value :_*))
    
    @scala.inline
    def setFilteredValue(value: js.Array[Key]): Self = this.set("filteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredValue: Self = this.set("filteredValue", js.undefined)
    
    @scala.inline
    def setFilteredValueNull: Self = this.set("filteredValue", null)
    
    @scala.inline
    def setFiltersVarargs(value: ColumnFilterItem*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[ColumnFilterItem]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFixed(value: FixedType): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.rcTable.interfaceMod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = this.set("onCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCell: Self = this.set("onCell", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: (/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = this.set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = this.set("onFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterDropdownVisibleChange: Self = this.set("onFilterDropdownVisibleChange", js.undefined)
    
    @scala.inline
    def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHeaderCell: Self = this.set("onHeaderCell", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setResponsiveVarargs(value: Breakpoint*): Self = this.set("responsive", js.Array(value :_*))
    
    @scala.inline
    def setResponsive(value: js.Array[Breakpoint]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = this.set("shouldCellUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldCellUpdate: Self = this.set("shouldCellUpdate", js.undefined)
    
    @scala.inline
    def setShowSorterTooltip(value: Boolean): Self = this.set("showSorterTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSorterTooltip: Self = this.set("showSorterTooltip", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: SortOrder*): Self = this.set("sortDirections", js.Array(value :_*))
    
    @scala.inline
    def setSortDirections(value: js.Array[SortOrder]): Self = this.set("sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirections: Self = this.set("sortDirections", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
    
    @scala.inline
    def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = this.set("sorter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = this.set("sorter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => ReactElement): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: ColumnTitle[RecordType]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
