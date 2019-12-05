package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmCommonGridMod.Grid
import typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantStackMod.ITableQuadrantStackProps
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.TableLoadingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableQuadrantStack
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantStackMod.TableQuadrantStack
    ] {
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onScroll */
  def apply(
    bodyRenderer: (QuadrantType, js.UndefOr[Boolean], js.UndefOr[Boolean]) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    grid: Grid,
    bodyRef: /* ref */ HTMLElement | Null => _ = null,
    columnHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    columnHeaderRef: /* ref */ HTMLElement | Null => Unit = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    handleColumnResizeGuide: /* verticalGuides */ js.Array[Double] => Unit = null,
    handleColumnsReordering: /* verticalGuides */ js.Array[Double] => Unit = null,
    handleRowResizeGuide: /* horizontalGuides */ js.Array[Double] => Unit = null,
    handleRowsReordering: /* horizontalGuides */ js.Array[Double] => Unit = null,
    isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    isVerticalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    loadingOptions: js.Array[TableLoadingOption] = null,
    menuRenderer: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    numColumns: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    quadrantRef: /* ref */ HTMLElement | Null => Unit = null,
    rowHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    rowHeaderRef: /* ref */ HTMLElement | Null => _ = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => _ = null,
    throttleScrolling: js.UndefOr[Boolean] = js.undefined,
    viewSyncDelay: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantStackMod.TableQuadrantStack
  ] = {
    val __obj = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), grid = grid.asInstanceOf[js.Any])
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1(bodyRef))
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction4(columnHeaderCellRenderer))
    if (columnHeaderRef != null) __obj.updateDynamic("columnHeaderRef")(js.Any.fromFunction1(columnHeaderRef))
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (handleColumnResizeGuide != null) __obj.updateDynamic("handleColumnResizeGuide")(js.Any.fromFunction1(handleColumnResizeGuide))
    if (handleColumnsReordering != null) __obj.updateDynamic("handleColumnsReordering")(js.Any.fromFunction1(handleColumnsReordering))
    if (handleRowResizeGuide != null) __obj.updateDynamic("handleRowResizeGuide")(js.Any.fromFunction1(handleRowResizeGuide))
    if (handleRowsReordering != null) __obj.updateDynamic("handleRowsReordering")(js.Any.fromFunction1(handleRowsReordering))
    if (!js.isUndefined(isHorizontalScrollDisabled)) __obj.updateDynamic("isHorizontalScrollDisabled")(isHorizontalScrollDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerticalScrollDisabled)) __obj.updateDynamic("isVerticalScrollDisabled")(isVerticalScrollDisabled.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (numColumns != null) __obj.updateDynamic("numColumns")(numColumns.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1(quadrantRef))
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction4(rowHeaderCellRenderer))
    if (rowHeaderRef != null) __obj.updateDynamic("rowHeaderRef")(js.Any.fromFunction1(rowHeaderRef))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1(scrollContainerRef))
    if (!js.isUndefined(throttleScrolling)) __obj.updateDynamic("throttleScrolling")(throttleScrolling.asInstanceOf[js.Any])
    if (viewSyncDelay != null) __obj.updateDynamic("viewSyncDelay")(viewSyncDelay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITableQuadrantStackProps
}

