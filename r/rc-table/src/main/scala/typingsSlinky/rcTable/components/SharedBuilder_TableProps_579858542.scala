package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.anon.X
import typingsSlinky.rcTable.interfaceMod.ColumnGroupType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.interfaceMod.TableSticky
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TableProps_579858542[RecordType /* <: DefaultRecordType */] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def childrenColumnName(value: String): this.type = set("childrenColumnName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def columns(value: ColumnsType[RecordType]): this.type = set("columns", value.asInstanceOf[js.Any])
  
  @scala.inline
  def columnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): this.type = set("columns", js.Array(value :_*))
  
  @scala.inline
  def components(value: TableComponents[RecordType]): this.type = set("components", value.asInstanceOf[js.Any])
  
  @scala.inline
  def data(value: js.Array[RecordType]): this.type = set("data", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dataVarargs(value: RecordType*): this.type = set("data", js.Array(value :_*))
  
  @scala.inline
  def defaultExpandAllRows(value: Boolean): this.type = set("defaultExpandAllRows", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultExpandedRowKeys(value: js.Array[Key]): this.type = set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultExpandedRowKeysVarargs(value: Key*): this.type = set("defaultExpandedRowKeys", js.Array(value :_*))
  
  @scala.inline
  def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def emptyText(value: ReactElement | js.Function0[ReactElement]): this.type = set("emptyText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def emptyTextFunction0(value: () => ReactElement): this.type = set("emptyText", js.Any.fromFunction0(value))
  
  @scala.inline
  def emptyTextReactElement(value: ReactElement): this.type = set("emptyText", value.asInstanceOf[js.Any])
  
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
  def expandedRowKeys(value: js.Array[Key]): this.type = set("expandedRowKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandedRowKeysVarargs(value: Key*): this.type = set("expandedRowKeys", js.Array(value :_*))
  
  @scala.inline
  def expandedRowRender(
    value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
  ): this.type = set("expandedRowRender", js.Any.fromFunction4(value))
  
  @scala.inline
  def footer(value: /* data */ js.Array[RecordType] => ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def internalHooks(value: String): this.type = set("internalHooks", value.asInstanceOf[js.Any])
  
  @scala.inline
  def internalRefs(value: typingsSlinky.rcTable.anon.Body): this.type = set("internalRefs", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onExpand(value: (/* expanded */ Boolean, RecordType) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
  
  @scala.inline
  def onExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): this.type = set("onExpandedRowsChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onHeaderRow(
    value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
  ): this.type = set("onHeaderRow", js.Any.fromFunction2(value))
  
  @scala.inline
  def onRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): this.type = set("onRow", js.Any.fromFunction2(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rowClassName(value: String | RowClassName[RecordType]): this.type = set("rowClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("rowClassName", js.Any.fromFunction3(value))
  
  @scala.inline
  def rowKey(value: String | GetRowKey[RecordType]): this.type = set("rowKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): this.type = set("rowKey", js.Any.fromFunction2(value))
  
  @scala.inline
  def scroll(value: X): this.type = set("scroll", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
  
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
  
  @scala.inline
  def transformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): this.type = set("transformColumns", js.Any.fromFunction1(value))
}
