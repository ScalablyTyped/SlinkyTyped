package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.Compare
import typingsSlinky.antd.responsiveObserveMod.Breakpoint
import typingsSlinky.antd.tableInterfaceMod.ColumnFilterItem
import typingsSlinky.antd.tableInterfaceMod.ColumnTitle
import typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps
import typingsSlinky.antd.tableInterfaceMod.CompareFn
import typingsSlinky.antd.tableInterfaceMod.FilterDropdownProps
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.CellEllipsisType
import typingsSlinky.rcTable.interfaceMod.DataIndex
import typingsSlinky.rcTable.interfaceMod.FixedType
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnGroupMod {
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @JSImport("antd/lib/table/ColumnGroup", JSImport.Default)
  @js.native
  def default[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = js.native
  
  /* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'children'> */
  @js.native
  trait ColumnGroupProps[RecordType] extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var children: ReactElement | js.Array[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
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
  object ColumnGroupProps {
    
    @scala.inline
    def apply[RecordType](children: ReactElement | js.Array[ReactElement]): ColumnGroupProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupProps[RecordType]]
    }
    
    @scala.inline
    implicit class ColumnGroupPropsMutableBuilder[Self <: ColumnGroupProps[_], RecordType] (val x: Self with ColumnGroupProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setDefaultFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "defaultFilteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFilteredValueNull: Self = StObject.set(x, "defaultFilteredValue", null)
      
      @scala.inline
      def setDefaultFilteredValueUndefined: Self = StObject.set(x, "defaultFilteredValue", js.undefined)
      
      @scala.inline
      def setDefaultFilteredValueVarargs(value: Key*): Self = StObject.set(x, "defaultFilteredValue", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortOrderNull: Self = StObject.set(x, "defaultSortOrder", null)
      
      @scala.inline
      def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      @scala.inline
      def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFilterDropdown(value: ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactElement): Self = StObject.set(x, "filterDropdown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDropdownReactElement(value: ReactElement): Self = StObject.set(x, "filterDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownUndefined: Self = StObject.set(x, "filterDropdown", js.undefined)
      
      @scala.inline
      def setFilterDropdownVisible(value: Boolean): Self = StObject.set(x, "filterDropdownVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownVisibleUndefined: Self = StObject.set(x, "filterDropdownVisible", js.undefined)
      
      @scala.inline
      def setFilterIcon(value: ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterIconFunction1(value: /* filtered */ Boolean => ReactElement): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterIconReactElement(value: ReactElement): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
      
      @scala.inline
      def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      @scala.inline
      def setFilteredValue(value: js.Array[Key]): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredValueNull: Self = StObject.set(x, "filteredValue", null)
      
      @scala.inline
      def setFilteredValueUndefined: Self = StObject.set(x, "filteredValue", js.undefined)
      
      @scala.inline
      def setFilteredValueVarargs(value: Key*): Self = StObject.set(x, "filteredValue", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setKey(value: typingsSlinky.rcTable.interfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClick(value: (/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
      
      @scala.inline
      def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = StObject.set(x, "onFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterDropdownVisibleChangeUndefined: Self = StObject.set(x, "onFilterDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOnHeaderCell(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
      
      @scala.inline
      def setShowSorterTooltip(value: Boolean): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
      
      @scala.inline
      def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
      
      @scala.inline
      def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      @scala.inline
      def setTitle(value: ColumnTitle[RecordType]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
