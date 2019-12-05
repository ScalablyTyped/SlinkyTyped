package typingsSlinky.fixedDashDataDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table] {
  @JSImport("fixed-data-table", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    headerHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit = null,
    onContentHeightChange: /* newHeight */ Double => Unit = null,
    onRowClick: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table], /* rowIndex */ Double) => Unit = null,
    onRowDoubleClick: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseDown: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseEnter: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseLeave: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table], /* rowIndex */ Double) => Unit = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Unit = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Unit = null,
    overflowX: String = null,
    overflowY: String = null,
    ownerHeight: Int | Double = null,
    rowClassNameGetter: /* index */ Double => String = null,
    rowHeightGetter: /* index */ Double => Double = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Table] = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(onColumnResizeEndCallback))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2(onRowMouseDown))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(onRowMouseLeave))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2(onScrollEnd))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2(onScrollStart))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(rowClassNameGetter))
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1(rowHeightGetter))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

