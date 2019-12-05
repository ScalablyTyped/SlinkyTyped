package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmCommonMod.Grid
import typingsSlinky.atBlueprintjsTable.libEsmHeadersHeaderMod.IInternalHeaderProps
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.IClientCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import typingsSlinky.atBlueprintjsTable.libEsmLocatorMod.ILocator
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.RegionCardinality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.libEsmHeadersHeaderMod.Header] {
  @JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    fullRegionCardinality: RegionCardinality,
    getCellExtremaClasses: (Double, Double) => js.Array[String],
    getCellIndexClass: Double => String,
    getCellSize: Double => Double,
    getDragCoordinate: IClientCoordinates => Double,
    getIndexClass: Double => String,
    getMouseCoordinate: MouseEvent => Double,
    ghostCellRenderer: (Double, js.Array[String]) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    grid: Grid,
    handleResizeEnd: (Double, Double) => Unit,
    handleSizeChanged: (Double, Double) => Unit,
    headerCellIsReorderablePropName: String,
    headerCellIsSelectedPropName: String,
    headerCellRenderer: Double => typingsSlinky.react.reactMod._Global_.JSX.Element,
    indexEnd: Double,
    indexStart: Double,
    isCellSelected: Double => Boolean,
    isGhostIndex: Double => Boolean,
    locator: ILocator,
    maxSize: Double,
    minSize: Double,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onResizeGuide: js.Array[Double] => Unit,
    onSelection: js.Array[IRegion] => Unit,
    resizeOrientation: Orientation,
    selectedRegions: js.Array[IRegion],
    toRegion: (Double, js.UndefOr[Double]) => IRegion,
    wrapCells: js.Array[ReactElement] => typingsSlinky.react.reactMod._Global_.JSX.Element,
    convertPointToIndex: (/* clientXOrY */ Double, /* useMidpoint */ js.UndefOr[Boolean]) => Double = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    handleResizeDoubleClick: /* index */ Double => Unit = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Unit = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmHeadersHeaderMod.Header] = {
    val __obj = js.Dynamic.literal(fullRegionCardinality = fullRegionCardinality.asInstanceOf[js.Any], getCellExtremaClasses = js.Any.fromFunction2(getCellExtremaClasses), getCellIndexClass = js.Any.fromFunction1(getCellIndexClass), getCellSize = js.Any.fromFunction1(getCellSize), getDragCoordinate = js.Any.fromFunction1(getDragCoordinate), getIndexClass = js.Any.fromFunction1(getIndexClass), getMouseCoordinate = js.Any.fromFunction1(getMouseCoordinate), ghostCellRenderer = js.Any.fromFunction2(ghostCellRenderer), grid = grid.asInstanceOf[js.Any], handleResizeEnd = js.Any.fromFunction2(handleResizeEnd), handleSizeChanged = js.Any.fromFunction2(handleSizeChanged), headerCellIsReorderablePropName = headerCellIsReorderablePropName.asInstanceOf[js.Any], headerCellIsSelectedPropName = headerCellIsSelectedPropName.asInstanceOf[js.Any], headerCellRenderer = js.Any.fromFunction1(headerCellRenderer), indexEnd = indexEnd.asInstanceOf[js.Any], indexStart = indexStart.asInstanceOf[js.Any], isCellSelected = js.Any.fromFunction1(isCellSelected), isGhostIndex = js.Any.fromFunction1(isGhostIndex), locator = locator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onLayoutLock = js.Any.fromFunction1(onLayoutLock), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onResizeGuide = js.Any.fromFunction1(onResizeGuide), onSelection = js.Any.fromFunction1(onSelection), resizeOrientation = resizeOrientation.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any], toRegion = js.Any.fromFunction2(toRegion), wrapCells = js.Any.fromFunction1(wrapCells))
    if (convertPointToIndex != null) __obj.updateDynamic("convertPointToIndex")(js.Any.fromFunction2(convertPointToIndex))
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (handleResizeDoubleClick != null) __obj.updateDynamic("handleResizeDoubleClick")(js.Any.fromFunction1(handleResizeDoubleClick))
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1(onSelectionEnd))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IInternalHeaderProps
}

