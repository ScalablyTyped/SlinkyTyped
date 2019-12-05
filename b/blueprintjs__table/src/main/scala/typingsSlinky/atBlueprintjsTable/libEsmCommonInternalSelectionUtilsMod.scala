package typingsSlinky.atBlueprintjsTable

import typingsSlinky.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmCommonDirectionMod.Direction
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
@js.native
object libEsmCommonInternalSelectionUtilsMod extends js.Object {
  def resizeRegion(region: IRegion, direction: Direction): IRegion = js.native
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = js.native
}

