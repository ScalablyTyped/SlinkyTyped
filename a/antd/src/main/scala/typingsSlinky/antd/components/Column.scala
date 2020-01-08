package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_Filters
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.libTableColumnMod.default
import typingsSlinky.antd.libTableInterfaceMod.ColumnFilterItem
import typingsSlinky.antd.libTableInterfaceMod.ColumnProps
import typingsSlinky.antd.libTableInterfaceMod.CompareFn
import typingsSlinky.antd.libTableInterfaceMod.FilterDropdownProps
import typingsSlinky.antd.libTableInterfaceMod.SortOrder
import typingsSlinky.antd.libTableInterfaceMod.TableEventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("antd/lib/table/Column", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, colSpan, width */
  def apply[T](
    align: left | right | center = null,
    dataIndex: String = null,
    defaultFilteredValue: js.Array[_] = null,
    defaultSortOrder: SortOrder = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    filterDropdown: TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[_] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: Boolean | left | right = null,
    onCell: (T, /* rowIndex */ Double) => TableEventListeners = null,
    onCellClick: (T, /* event */ Event) => Unit = null,
    onFilter: (/* value */ js.Any, T) => Boolean = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Unit = null,
    onHeaderCell: /* props */ ColumnProps[T] => TableEventListeners = null,
    render: (/* text */ js.Any, T, /* index */ Double) => TagMod[Any] = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | Boolean = null,
    sorter: Boolean | CompareFn[T] = null,
    title: TagMod[Any] | (js.Function1[/* options */ Anon_Filters[T], TagMod[Any]]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (defaultFilteredValue != null) __obj.updateDynamic("defaultFilteredValue")(defaultFilteredValue.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible.asInstanceOf[js.Any])
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple.asInstanceOf[js.Any])
    if (filteredValue != null) __obj.updateDynamic("filteredValue")(filteredValue.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2(onCell))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2(onFilter))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1(onFilterDropdownVisibleChange))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction1(onHeaderCell))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libTableColumnMod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libTableColumnMod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColumnProps[js.Any]
}

