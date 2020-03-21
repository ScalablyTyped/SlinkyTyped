package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.rectMod.Rect
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsSlinky.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBodyCells
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.tableBodyCellsMod.TableBodyCells] {
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
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
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    focusedCell: IFocusedCellCoordinates = null,
    onCompleteRender: () => Unit = null,
    renderMode: BATCH | NONE = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableBodyCellsMod.TableBodyCells] = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (onCompleteRender != null) __obj.updateDynamic("onCompleteRender")(js.Any.fromFunction0(onCompleteRender))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITableBodyCellsProps
}

