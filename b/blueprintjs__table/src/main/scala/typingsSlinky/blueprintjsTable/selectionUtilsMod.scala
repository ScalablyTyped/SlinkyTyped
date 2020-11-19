package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.directionMod.Direction
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/common/internal/selectionUtils", JSImport.Namespace)
@js.native
object selectionUtilsMod extends js.Object {
  
  def resizeRegion(region: IRegion, direction: Direction): IRegion = js.native
  def resizeRegion(region: IRegion, direction: Direction, focusedCell: IFocusedCellCoordinates): IRegion = js.native
}
