package typingsSlinky.reactDatagrid

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Props
import typingsSlinky.reactDatagrid.anon.DisabledStyle
import typingsSlinky.reactDatagrid.anon.PageSize
import typingsSlinky.reactDatagrid.mod.ReactDataGrid.DataGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-datagrid", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DataGridProps, js.Object, js.Any]
  
  object ReactDataGrid {
    
    @js.native
    trait CellProps extends StObject {
      
      /**
        * a class name for the cell
        */
      var className: String = js.native
      
      /**
        * the index of the column
        */
      var index: Double = js.native
      
      /**
        * the index of the row
        */
      var rowIndex: Double = js.native
      
      /**
        * a style for the cell
        */
      var style: CSSProperties = js.native
    }
    object CellProps {
      
      @scala.inline
      def apply(className: String, index: Double, rowIndex: Double, style: CSSProperties): CellProps = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellProps]
      }
      
      @scala.inline
      implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Column extends StObject {
      
      /**
        * String - a className to be applied to all cells in this column
        */
      var className: js.UndefOr[String] = js.native
      
      var defaultHidden: js.UndefOr[Boolean] = js.native
      
      /**
        * Specify a column as visible/hidden.
        */
      var defaultVisible: js.UndefOr[Boolean] = js.native
      
      /**
        * Columns are flexible via flexbox. Specify a flex property for this.
        * Unless a column specifies a flex or a width property, it is assumed
        * to have flex: 1.
        */
      var flex: js.UndefOr[Double] = js.native
      
      var minWidth: js.UndefOr[Double] = js.native
      
      /**
        * String - each column should have a name property.
        */
      var name: String = js.native
      
      /**
        * Function - if you want custom rendering, specify this property.
        *
        * The column.render function is called with 3 args:
        *   value - the default value to be rendered (equals to data[column.name])
        *   data - the corresponding data object for the current row
        cellProps - an object with props for the current cell
        */
      var render: js.UndefOr[
            js.Function3[/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps, _]
          ] = js.native
      
      /**
        * Object - if you want cells in this column to be have a custom
        * style.
        */
      var style: js.UndefOr[CSSProperties] = js.native
      
      /**
        * String - one of 'left', 'right', 'center'.
        */
      var textAlign: js.UndefOr[String] = js.native
      
      /**
        * String/ReactElement - a title to show in the header. If not
        * specified, a humanized version of name will be used. Can be a string
        * or anything that React can render, so you can customize it as you
        * please.
        */
      var title: js.UndefOr[String | ReactElement] = js.native
      
      /**
        * Boolean - controlled (which means you have to manually set column
        * visibility when it changes, by using onColumnVisibilityChange).
        */
      var visible: js.UndefOr[Boolean] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Column {
      
      @scala.inline
      def apply(name: String): Column = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Column]
      }
      
      @scala.inline
      implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setDefaultHidden(value: Boolean): Self = StObject.set(x, "defaultHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultHiddenUndefined: Self = StObject.set(x, "defaultHidden", js.undefined)
        
        @scala.inline
        def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
        
        @scala.inline
        def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
        
        @scala.inline
        def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRender(value: (/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps) => _): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
        
        @scala.inline
        def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
        
        @scala.inline
        def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait DataGrid
      extends Component[DataGridProps, js.Object, js.Any]
    
    @js.native
    trait DataGridProps extends Props[DataGrid] {
      
      /**
        * Array - an array of columns that are going to be rendered in the
        * grid.
        */
      var columns: js.Array[Column] = js.native
      
      /**
        * Array/String/Function/Promise - for local data, an array of object
        * to render in the grid. For remote data, a string url, or a function
        * that returns a promise.
        */
      var dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]) = js.native
      
      var dataSourceCount: js.UndefOr[Double] = js.native
      
      var defaultPage: js.UndefOr[Double] = js.native
      
      var defaultPageSize: js.UndefOr[Double] = js.native
      
      /**
        * Empty text for no records.
        */
      var emptyText: js.UndefOr[String] = js.native
      
      /**
        * Group rows by matching values.
        */
      var groupBy: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * String - the name of the property where the id is found for each
        * object in the data array.
        */
      var idProperty: String = js.native
      
      /**
        * To apply the filter while typing.
        */
      var liveFilter: js.UndefOr[Boolean] = js.native
      
      /**
        * If you dont want loadMask over header, specify
        */
      var loadMaskOverHeader: js.UndefOr[Boolean] = js.native
      
      /**
        * Loading grid.
        */
      var loading: js.UndefOr[Boolean] = js.native
      
      /**
        * If you want to enable column reordering, just specify the
        * onColumnOrderChange prop on the grid:
        */
      var onColumnOrderChange: js.UndefOr[js.Function2[/* index */ Double, /* dropIndex */ Double, Unit]] = js.native
      
      /**
        * If you want to enable column resized, just specify the
        * onColumnResize prop on the grid:
        */
      var onColumnResize: js.UndefOr[
            js.Function4[
              /* firstCol */ Column, 
              /* firstSize */ Double, 
              /* secondCol */ Column, 
              /* secondSize */ Double, 
              Unit
            ]
          ] = js.native
      
      /**
        * When a column is shown/hidden, you can be notified using the
        * onColumnVisibilityChange callback prop.
        */
      var onColumnVisibilityChange: js.UndefOr[js.Function2[/* column */ Column, /* visibility */ Boolean, Unit]] = js.native
      
      /**
        * If you want to enable filter, just specify the
        * onFilter prop on the grid:
        */
      var onFilter: js.UndefOr[
            js.Function3[/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_], Unit]
          ] = js.native
      
      /**
        * handle page changes.
        */
      var onPageChange: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
      
      /**
        * handle page size changes.
        */
      var onPageSizeChange: js.UndefOr[js.Function2[/* pageSize */ Double, /* props */ this.type, Unit]] = js.native
      
      /**
        * If you want to enable selection, just specify the
        * onSelectionChange prop on the grid:
        */
      var onSelectionChange: js.UndefOr[js.Function2[/* newSelected */ js.Object, /* data */ js.Any, Unit]] = js.native
      
      /**
        * Sorting the data array is not done by the grid. You can however
        * pass in sort info so the grid renders with sorting icons as needed.
        */
      var onSortChange: js.UndefOr[js.Function1[/* sortInfo */ js.Array[SortInfo], Unit]] = js.native
      
      /**
        * Number - controlled alternative for defaultPage. When page changes,
        * onPageChange(page) is called.
        */
      var page: js.UndefOr[Double] = js.native
      
      /**
        * Number - controlled alternative for defaultPageSize. When pageSize
        * changes, onPageSizeChange(pageSize) is called.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * When you have remote data, pagination is setup by default. If you
        * want to disable pagination, specify the pagination prop with a false
        * value.
        */
      var pagination: js.UndefOr[Boolean] = js.native
      
      /**
        * Customize the pagination toolbar.
        */
      var paginationToolbarProps: js.UndefOr[PaginationToolbarProps] = js.native
      
      /**
        * Custom row height.
        */
      var rowHeight: js.UndefOr[Double] = js.native
      
      /**
        * Object/Function - you can specify either a style object to be
        * applied to all rows, or a function. The function is called with
        * (data, props) (so you have access to props.index for example) and
        * is expected to return a style object.
        */
      var rowStyle: js.UndefOr[
            CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])
          ] = js.native
      
      /**
        * The current selection.
        */
      var selected: js.UndefOr[js.Object] = js.native
      
      /**
        * Show cell borders. Other valid values: 'horizontal', 'vertical'.
        */
      var showCellBorders: js.UndefOr[Boolean | String] = js.native
      
      /**
        * Array - an array with sorting information.
        */
      var sortInfo: js.UndefOr[js.Array[SortInfo]] = js.native
      
      var style: js.UndefOr[CSSProperties] = js.native
      
      /**
        * Boolean - show a column menu to show/hide columns.
        */
      var withColumnMenu: js.UndefOr[Boolean] = js.native
    }
    object DataGridProps {
      
      @scala.inline
      def apply(
        columns: js.Array[Column],
        dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]),
        idProperty: String
      ): DataGridProps = {
        val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataGridProps]
      }
      
      @scala.inline
      implicit class DataGridPropsMutableBuilder[Self <: DataGridProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        @scala.inline
        def setDataSource(value: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]])): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataSourceCount(value: Double): Self = StObject.set(x, "dataSourceCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataSourceCountUndefined: Self = StObject.set(x, "dataSourceCount", js.undefined)
        
        @scala.inline
        def setDataSourceFunction1(value: /* query */ PageSize => js.Promise[js.Array[_]]): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
        
        @scala.inline
        def setDefaultPage(value: Double): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
        
        @scala.inline
        def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
        
        @scala.inline
        def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
        
        @scala.inline
        def setGroupBy(value: js.Array[_]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
        
        @scala.inline
        def setGroupByVarargs(value: js.Any*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
        
        @scala.inline
        def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLiveFilter(value: Boolean): Self = StObject.set(x, "liveFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLiveFilterUndefined: Self = StObject.set(x, "liveFilter", js.undefined)
        
        @scala.inline
        def setLoadMaskOverHeader(value: Boolean): Self = StObject.set(x, "loadMaskOverHeader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadMaskOverHeaderUndefined: Self = StObject.set(x, "loadMaskOverHeader", js.undefined)
        
        @scala.inline
        def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
        
        @scala.inline
        def setOnColumnOrderChange(value: (/* index */ Double, /* dropIndex */ Double) => Unit): Self = StObject.set(x, "onColumnOrderChange", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnColumnOrderChangeUndefined: Self = StObject.set(x, "onColumnOrderChange", js.undefined)
        
        @scala.inline
        def setOnColumnResize(
          value: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Unit
        ): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction4(value))
        
        @scala.inline
        def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
        
        @scala.inline
        def setOnColumnVisibilityChange(value: (/* column */ Column, /* visibility */ Boolean) => Unit): Self = StObject.set(x, "onColumnVisibilityChange", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnColumnVisibilityChangeUndefined: Self = StObject.set(x, "onColumnVisibilityChange", js.undefined)
        
        @scala.inline
        def setOnFilter(value: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_]) => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
        
        @scala.inline
        def setOnPageChange(value: /* page */ Double => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
        
        @scala.inline
        def setOnPageSizeChange(value: (/* pageSize */ Double, DataGridProps) => Unit): Self = StObject.set(x, "onPageSizeChange", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnPageSizeChangeUndefined: Self = StObject.set(x, "onPageSizeChange", js.undefined)
        
        @scala.inline
        def setOnSelectionChange(value: (/* newSelected */ js.Object, /* data */ js.Any) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
        
        @scala.inline
        def setOnSortChange(value: /* sortInfo */ js.Array[SortInfo] => Unit): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSortChangeUndefined: Self = StObject.set(x, "onSortChange", js.undefined)
        
        @scala.inline
        def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
        
        @scala.inline
        def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaginationToolbarProps(value: PaginationToolbarProps): Self = StObject.set(x, "paginationToolbarProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaginationToolbarPropsUndefined: Self = StObject.set(x, "paginationToolbarProps", js.undefined)
        
        @scala.inline
        def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
        
        @scala.inline
        def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
        
        @scala.inline
        def setRowStyle(value: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowStyleFunction2(value: (/* data */ js.Any, /* props */ RowProps) => CSSProperties): Self = StObject.set(x, "rowStyle", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
        
        @scala.inline
        def setSelected(value: js.Object): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        @scala.inline
        def setShowCellBorders(value: Boolean | String): Self = StObject.set(x, "showCellBorders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowCellBordersUndefined: Self = StObject.set(x, "showCellBorders", js.undefined)
        
        @scala.inline
        def setSortInfo(value: js.Array[SortInfo]): Self = StObject.set(x, "sortInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortInfoUndefined: Self = StObject.set(x, "sortInfo", js.undefined)
        
        @scala.inline
        def setSortInfoVarargs(value: SortInfo*): Self = StObject.set(x, "sortInfo", js.Array(value :_*))
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setWithColumnMenu(value: Boolean): Self = StObject.set(x, "withColumnMenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWithColumnMenuUndefined: Self = StObject.set(x, "withColumnMenu", js.undefined)
      }
    }
    
    @js.native
    trait PaginationToolbarProps extends StObject {
      
      var iconProps: DisabledStyle = js.native
      
      var iconSize: Double = js.native
      
      /**
        * Available page sizes.
        */
      var pageSizes: js.Array[Double] = js.native
      
      /**
        * Hide/show page sizes.
        */
      var showPageSize: Boolean = js.native
      
      /**
        * Customize icons.
        */
      var showRefreshIcon: Boolean = js.native
    }
    object PaginationToolbarProps {
      
      @scala.inline
      def apply(
        iconProps: DisabledStyle,
        iconSize: Double,
        pageSizes: js.Array[Double],
        showPageSize: Boolean,
        showRefreshIcon: Boolean
      ): PaginationToolbarProps = {
        val __obj = js.Dynamic.literal(iconProps = iconProps.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], pageSizes = pageSizes.asInstanceOf[js.Any], showPageSize = showPageSize.asInstanceOf[js.Any], showRefreshIcon = showRefreshIcon.asInstanceOf[js.Any])
        __obj.asInstanceOf[PaginationToolbarProps]
      }
      
      @scala.inline
      implicit class PaginationToolbarPropsMutableBuilder[Self <: PaginationToolbarProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIconProps(value: DisabledStyle): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizes(value: js.Array[Double]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizesVarargs(value: Double*): Self = StObject.set(x, "pageSizes", js.Array(value :_*))
        
        @scala.inline
        def setShowPageSize(value: Boolean): Self = StObject.set(x, "showPageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowRefreshIcon(value: Boolean): Self = StObject.set(x, "showRefreshIcon", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RowProps extends StObject {
      
      /**
        * a class name for the row
        */
      var className: String = js.native
      
      /**
        * the index of the row
        */
      var index: Double = js.native
      
      /**
        * a class name for the row when the mouse is over it
        */
      var overClassName: String = js.native
      
      /**
        * a class name for the row when selected
        */
      var selectedClassName: String = js.native
    }
    object RowProps {
      
      @scala.inline
      def apply(className: String, index: Double, overClassName: String, selectedClassName: String): RowProps = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], overClassName = overClassName.asInstanceOf[js.Any], selectedClassName = selectedClassName.asInstanceOf[js.Any])
        __obj.asInstanceOf[RowProps]
      }
      
      @scala.inline
      implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverClassName(value: String): Self = StObject.set(x, "overClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedClassName(value: String): Self = StObject.set(x, "selectedClassName", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SortInfo extends StObject {
      
      var dir: String = js.native
      
      var name: String = js.native
    }
    object SortInfo {
      
      @scala.inline
      def apply(dir: String, name: String): SortInfo = {
        val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[SortInfo]
      }
      
      @scala.inline
      implicit class SortInfoMutableBuilder[Self <: SortInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
