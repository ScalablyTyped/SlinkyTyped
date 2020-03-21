package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import typingsSlinky.blueprintjsTable.rectMod.Rect
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsSlinky.blueprintjsTable.tableBodyMod.ITableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.tableBodyMod.TableBody] {
  @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    locator: ILocator,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    bodyContextMenuRenderer: /* context */ IMenuContext => ReactElement = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    onCompleteRender: () => Unit = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Unit = null,
    renderMode: BATCH | NONE = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    selectedRegions: js.Array[IRegion] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableBodyMod.TableBody] = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1(bodyContextMenuRenderer))
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1(onSelectionEnd))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITableBodyProps
}

