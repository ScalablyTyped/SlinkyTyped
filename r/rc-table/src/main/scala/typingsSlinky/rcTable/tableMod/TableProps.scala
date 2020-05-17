package typingsSlinky.rcTable.tableMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.anon.Body
import typingsSlinky.rcTable.anon.X
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
import scala.scalajs.js.annotation._

@js.native
trait TableProps[RecordType] extends LegacyExpandableProps[RecordType] {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  var components: js.UndefOr[TableComponents[RecordType]] = js.native
  var data: js.UndefOr[js.Array[RecordType]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.native
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
  var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], TagMod[Any]]] = js.native
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
  implicit class TablePropsOps[Self[recordtype] <: TableProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ColumnsType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: TableComponents[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTextReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyTextFunction0(value: () => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmptyText(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: ExpandableConfig[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalHooks(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalHooks: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalRefs(value: Body): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalRefs: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderRow: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRow: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRowClassName(value: String | RowClassName[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowKey(value: String | GetRowKey[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKey: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: X): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSummary: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLayout(value: TableLayout): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLayout: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformColumns")(js.undefined)
        ret
    }
  }
  
}

