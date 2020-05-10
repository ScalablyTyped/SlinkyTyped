package typingsSlinky.antd.columnGroupMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonCompare
import typingsSlinky.antd.tableInterfaceMod.ColumnFilterItem
import typingsSlinky.antd.tableInterfaceMod.ColumnTitle
import typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps
import typingsSlinky.antd.tableInterfaceMod.CompareFn
import typingsSlinky.antd.tableInterfaceMod.FilterDropdownProps
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.DataIndex
import typingsSlinky.rcTable.interfaceMod.FixedType
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'children'> */
@js.native
trait ColumnGroupProps[RecordType] extends js.Object {
  var align: js.UndefOr[AlignType] = js.native
  var children: ReactElement | js.Array[ReactElement] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var dataIndex: js.UndefOr[DataIndex] = js.native
  var defaultFilteredValue: js.UndefOr[js.Array[Key]] = js.native
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  var ellipsis: js.UndefOr[Boolean] = js.native
  var filterDropdown: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]])] = js.native
  var filterDropdownVisible: js.UndefOr[Boolean] = js.native
  var filterIcon: js.UndefOr[TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]])] = js.native
  var filterMultiple: js.UndefOr[Boolean] = js.native
  var filtered: js.UndefOr[Boolean] = js.native
  var filteredValue: js.UndefOr[js.Array[Key]] = js.native
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
      TagMod[Any] | RenderedCell[RecordType]
    ]
  ] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  var sortOrder: js.UndefOr[SortOrder] = js.native
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | AnonCompare[RecordType]] = js.native
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
  implicit class ColumnGroupPropsOps[Self[recordtype] <: ColumnGroupProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
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
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: AlignType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
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
    def withColSpan(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: DataIndex): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFilteredValue(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFilteredValue: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilteredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortOrder: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(null)
        ret
    }
    @scala.inline
    def withEllipsis(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropdownReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterDropdownFunction1(value: /* props */ FilterDropdownProps => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterDropdown(value: TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]])): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropdown: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropdownVisible(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdownVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropdownVisible: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdownVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterIconReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterIconFunction1(value: /* filtered */ Boolean => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterIcon(value: TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]])): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterIcon: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMultiple(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMultiple: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltered: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredValue(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredValue: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[ColumnFilterItem]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: FixedType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: typingsSlinky.rcTable.interfaceMod.Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCell: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: (/* record */ RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterDropdownVisibleChange: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDropdownVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderCell: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderCell")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => TagMod[Any] | RenderedCell[RecordType]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirections(value: js.Array[SortOrder]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirections: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(null)
        ret
    }
    @scala.inline
    def withSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSorter(value: Boolean | CompareFn[RecordType] | AnonCompare[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFunction1(value: /* props */ ColumnTitleProps[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: ColumnTitle[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

