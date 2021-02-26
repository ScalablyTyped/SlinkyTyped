package typingsSlinky.rcTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.anon.Body
import typingsSlinky.rcTable.anon.X
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import typingsSlinky.rcTable.columnMod.ColumnProps
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.interfaceMod.ColumnGroupType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.LegacyExpandableProps
import typingsSlinky.rcTable.interfaceMod.PanelRender
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.interfaceMod.TableSticky
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.rcTable.rowMod.FooterRowProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  object default {
    
    @JSImport("rc-table/lib/Table", JSImport.Default)
    @js.native
    def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): ReactElement = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    @JSImport("rc-table/lib/Table", "default.Column")
    @js.native
    def Column[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    @JSImport("rc-table/lib/Table", "default.ColumnGroup")
    @js.native
    def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
    
    object Summary {
      
      @JSImport("rc-table/lib/Table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table/lib/Table", "default.Summary.Cell")
      @js.native
      def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, ReactElement] = js.native
      @scala.inline
      def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.Summary.Row")
      @js.native
      def Row: js.Function1[/* props */ FooterRowProps, ReactElement] = js.native
      @scala.inline
      def Row_=(x: js.Function1[/* props */ FooterRowProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("rc-table/lib/Table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.emptyText")
      @js.native
      def emptyText(): String = js.native
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      @scala.inline
      def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("rc-table/lib/Table", "INTERNAL_HOOKS")
  @js.native
  val INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String = js.native
  
  @js.native
  trait TableProps[RecordType] extends LegacyExpandableProps[RecordType] {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
    
    var components: js.UndefOr[TableComponents[RecordType]] = js.native
    
    var data: js.UndefOr[js.Array[RecordType]] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var emptyText: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
    
    /** Config expand rows */
    var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
    
    var footer: js.UndefOr[PanelRender[RecordType]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    /**
      * @private Internal usage, may remove by refactor. Should always use `columns` instead.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var internalHooks: js.UndefOr[String] = js.native
    
    /**
      * @private Internal usage, may remove by refactor.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var internalRefs: js.UndefOr[Body] = js.native
    
    var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.native
    
    var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.native
    
    var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.native
    
    var scroll: js.UndefOr[X] = js.native
    
    var showHeader: js.UndefOr[Boolean] = js.native
    
    var sticky: js.UndefOr[Boolean | TableSticky] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], ReactElement]] = js.native
    
    var tableLayout: js.UndefOr[TableLayout] = js.native
    
    var title: js.UndefOr[PanelRender[RecordType]] = js.native
    
    /**
      * @private Internal usage, may remove by refactor. Should always use `columns` instead.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var transformColumns: js.UndefOr[js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply[RecordType](): TableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps[RecordType]]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps[_], RecordType] (val x: Self with TableProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setComponents(value: TableComponents[RecordType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEmptyText(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextFunction0(value: () => ReactElement): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyTextReactElement(value: ReactElement): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      @scala.inline
      def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setFooter(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInternalHooks(value: String): Self = StObject.set(x, "internalHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalHooksUndefined: Self = StObject.set(x, "internalHooks", js.undefined)
      
      @scala.inline
      def setInternalRefs(value: Body): Self = StObject.set(x, "internalRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefsUndefined: Self = StObject.set(x, "internalRefs", js.undefined)
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHeaderRowUndefined: Self = StObject.set(x, "onHeaderRow", js.undefined)
      
      @scala.inline
      def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setRowKey(value: String | GetRowKey[RecordType]): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setScroll(value: X): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "summary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      @scala.inline
      def setTitle(value: /* data */ js.Array[RecordType] => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): Self = StObject.set(x, "transformColumns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformColumnsUndefined: Self = StObject.set(x, "transformColumns", js.undefined)
    }
  }
}
