package typingsSlinky.fixedDataTable2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.auto
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.hidden
import typingsSlinky.fixedDataTable2.mod.ColumnReorderEndEvent
import typingsSlinky.fixedDataTable2.mod.ElementOrFunc
import typingsSlinky.fixedDataTable2.mod.RowProps
import typingsSlinky.fixedDataTable2.mod.TableProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fixedDataTable2.mod.Table] {
  @JSImport("fixed-data-table-2", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    headerHeight: Double,
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    bufferRowCount: Int | Double = null,
    cellGroupWrapperHeight: Int | Double = null,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnReordering: js.UndefOr[Boolean] = js.undefined,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    keyboardPageEnabled: js.UndefOr[Boolean] = js.undefined,
    keyboardScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    onColumnReorderEndCallback: /* event */ ColumnReorderEndEvent => Unit = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit = null,
    onContentHeightChange: /* newHeight */ Double => Unit = null,
    onHorizontalScroll: /* scrollPos */ Double => Boolean = null,
    onRowClick: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowDoubleClick: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseDown: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseEnter: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseLeave: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowMouseUp: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowTouchEnd: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowTouchMove: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onRowTouchStart: (/* event */ SyntheticEvent[Event_, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Unit = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Unit = null,
    onVerticalScroll: /* scrollPos */ Double => Boolean = null,
    overflowX: hidden | auto = null,
    overflowY: hidden | auto = null,
    ownerHeight: Int | Double = null,
    rowClassNameGetter: /* index */ Double => String = null,
    rowExpanded: ElementOrFunc[RowProps] = null,
    rowHeightGetter: /* index */ Double => Double = null,
    rowKeyGetter: /* index */ Double => String = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    showScrollbarX: js.UndefOr[Boolean] = js.undefined,
    showScrollbarY: js.UndefOr[Boolean] = js.undefined,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    subRowHeight: Int | Double = null,
    subRowHeightGetter: /* index */ Double => Double = null,
    touchScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.Table] = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (bufferRowCount != null) __obj.updateDynamic("bufferRowCount")(bufferRowCount.asInstanceOf[js.Any])
    if (cellGroupWrapperHeight != null) __obj.updateDynamic("cellGroupWrapperHeight")(cellGroupWrapperHeight.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnReordering)) __obj.updateDynamic("isColumnReordering")(isColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardPageEnabled)) __obj.updateDynamic("keyboardPageEnabled")(keyboardPageEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardScrollEnabled)) __obj.updateDynamic("keyboardScrollEnabled")(keyboardScrollEnabled.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnReorderEndCallback != null) __obj.updateDynamic("onColumnReorderEndCallback")(js.Any.fromFunction1(onColumnReorderEndCallback))
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(onColumnResizeEndCallback))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (onHorizontalScroll != null) __obj.updateDynamic("onHorizontalScroll")(js.Any.fromFunction1(onHorizontalScroll))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2(onRowMouseDown))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(onRowMouseLeave))
    if (onRowMouseUp != null) __obj.updateDynamic("onRowMouseUp")(js.Any.fromFunction2(onRowMouseUp))
    if (onRowTouchEnd != null) __obj.updateDynamic("onRowTouchEnd")(js.Any.fromFunction2(onRowTouchEnd))
    if (onRowTouchMove != null) __obj.updateDynamic("onRowTouchMove")(js.Any.fromFunction2(onRowTouchMove))
    if (onRowTouchStart != null) __obj.updateDynamic("onRowTouchStart")(js.Any.fromFunction2(onRowTouchStart))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2(onScrollEnd))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2(onScrollStart))
    if (onVerticalScroll != null) __obj.updateDynamic("onVerticalScroll")(js.Any.fromFunction1(onVerticalScroll))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(rowClassNameGetter))
    if (rowExpanded != null) __obj.updateDynamic("rowExpanded")(rowExpanded.asInstanceOf[js.Any])
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1(rowHeightGetter))
    if (rowKeyGetter != null) __obj.updateDynamic("rowKeyGetter")(js.Any.fromFunction1(rowKeyGetter))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollbarX)) __obj.updateDynamic("showScrollbarX")(showScrollbarX.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollbarY)) __obj.updateDynamic("showScrollbarY")(showScrollbarY.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation.asInstanceOf[js.Any])
    if (subRowHeight != null) __obj.updateDynamic("subRowHeight")(subRowHeight.asInstanceOf[js.Any])
    if (subRowHeightGetter != null) __obj.updateDynamic("subRowHeightGetter")(js.Any.fromFunction1(subRowHeightGetter))
    if (!js.isUndefined(touchScrollEnabled)) __obj.updateDynamic("touchScrollEnabled")(touchScrollEnabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

