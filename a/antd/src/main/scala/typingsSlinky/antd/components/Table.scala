package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.ScrollToFirstRowOnChange
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.antd.tableInterfaceMod.ColumnGroupType
import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.ColumnsType
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.antd.tableInterfaceMod.SorterResult
import typingsSlinky.antd.tableInterfaceMod.TableCurrentDataSource
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.tableInterfaceMod.TablePaginationConfig
import typingsSlinky.antd.tableInterfaceMod.TableRowSelection
import typingsSlinky.antd.tableTableMod.TableProps
import typingsSlinky.rcTable.anon.X
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.interfaceMod.TableSticky
import typingsSlinky.rcTable.rowMod.FooterRowProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("antd", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenColumnName(value: String): this.type = set("childrenColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def columns(value: ColumnsType[RecordType]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: TableComponents[RecordType]): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceVarargs(value: RecordType*): this.type = set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def dataSource(value: js.Array[RecordType]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandAllRows(value: Boolean): this.type = set("defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandedRowKeysVarargs(value: Key*): this.type = set("defaultExpandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def defaultExpandedRowKeys(value: js.Array[Key]): this.type = set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownPrefixCls(value: String): this.type = set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandIconColumnIndex(value: Double): this.type = set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandRowByClick(value: Boolean): this.type = set("expandRowByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: ExpandableConfig[RecordType]): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("expandedRowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def expandedRowKeysVarargs(value: Key*): this.type = set("expandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def expandedRowKeys(value: js.Array[Key]): this.type = set("expandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRowRender(
      value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
    ): this.type = set("expandedRowRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def footer(value: /* data */ js.Array[RecordType] => ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TableLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, js.Array[typingsSlinky.antd.tableInterfaceMod.Key] | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def onExpand(value: (/* expanded */ Boolean, RecordType) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): this.type = set("onExpandedRowsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHeaderRow(
      value: (js.Array[typingsSlinky.rcTable.interfaceMod.ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): this.type = set("onHeaderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): this.type = set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def pagination(value: `false` | TablePaginationConfig): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("rowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def rowClassName(value: String | RowClassName[RecordType]): this.type = set("rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): this.type = set("rowKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowKey(value: String | GetRowKey[RecordType]): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSelection(value: TableRowSelection[RecordType]): this.type = set("rowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: js.UndefOr[X] with ScrollToFirstRowOnChange): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSorterTooltip(value: Boolean): this.type = set("showSorterTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortDirectionsVarargs(value: SortOrder*): this.type = set("sortDirections", js.Array(value :_*))
    
    @scala.inline
    def sortDirections(value: js.Array[SortOrder]): this.type = set("sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sticky(value: Boolean | TableSticky): this.type = set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def summary(value: /* data */ js.Array[RecordType] => ReactElement): this.type = set("summary", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableLayout(value: TableLayout): this.type = set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: /* data */ js.Array[RecordType] => ReactElement): this.type = set("title", js.Any.fromFunction1(value))
  }
  
  def withProps[RecordType /* <: js.Object */](p: TableProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[RecordType /* <: js.Object */](): Builder[RecordType] = {
    val __props = js.Dynamic.literal()
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  
  implicit def make[RecordType /* <: js.Object */](companion: Table.type): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  object Row {
    
    @JSImport("antd", "Table.Summary.Row")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: /* props */ FooterRowProps): typingsSlinky.antd.components.Table.Row.Builder = new typingsSlinky.antd.components.Table.Row.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Row.type): typingsSlinky.antd.components.Table.Row.Builder = new typingsSlinky.antd.components.Table.Row.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Cell {
    
    @JSImport("antd", "Table.Summary.Cell")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps): typingsSlinky.antd.components.Table.Cell.Builder = new typingsSlinky.antd.components.Table.Cell.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(index: Double): typingsSlinky.antd.components.Table.Cell.Builder = {
      val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      new typingsSlinky.antd.components.Table.Cell.Builder(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps]))
    }
  }
}
