package typingsSlinky.rcTable.tableMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.anon.Body
import typingsSlinky.rcTable.anon.X
import typingsSlinky.rcTable.interfaceMod.ColumnGroupType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.LegacyExpandableProps
import typingsSlinky.rcTable.interfaceMod.PanelRender
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TablePropsOps[Self <: TableProps[_], RecordType] (val x: Self with TableProps[RecordType]) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setComponents(value: TableComponents[RecordType]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: RecordType*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[RecordType]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEmptyTextReactElement(value: ReactElement): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextFunction0(value: () => ReactElement): Self = this.set("emptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyText(value: ReactElement | js.Function0[ReactElement]): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setExpandable(value: ExpandableConfig[RecordType]): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setFooter(value: /* data */ js.Array[RecordType] => ReactElement): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInternalHooks(value: String): Self = this.set("internalHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalHooks: Self = this.set("internalHooks", js.undefined)
    
    @scala.inline
    def setInternalRefs(value: Body): Self = this.set("internalRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalRefs: Self = this.set("internalRefs", js.undefined)
    
    @scala.inline
    def setOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHeaderRow: Self = this.set("onHeaderRow", js.undefined)
    
    @scala.inline
    def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = this.set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRow: Self = this.set("onRow", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("rowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRowClassName(value: String | RowClassName[RecordType]): Self = this.set("rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    
    @scala.inline
    def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = this.set("rowKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowKey(value: String | GetRowKey[RecordType]): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    
    @scala.inline
    def setScroll(value: X): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSummary(value: /* data */ js.Array[RecordType] => ReactElement): Self = this.set("summary", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTableLayout(value: TableLayout): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLayout: Self = this.set("tableLayout", js.undefined)
    
    @scala.inline
    def setTitle(value: /* data */ js.Array[RecordType] => ReactElement): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): Self = this.set("transformColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformColumns: Self = this.set("transformColumns", js.undefined)
  }
}
