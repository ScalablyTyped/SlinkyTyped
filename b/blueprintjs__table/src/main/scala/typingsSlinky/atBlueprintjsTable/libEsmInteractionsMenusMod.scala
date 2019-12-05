package typingsSlinky.atBlueprintjsTable

import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/menus", JSImport.Namespace)
@js.native
object libEsmInteractionsMenusMod extends js.Object {
  @js.native
  class CopyCellsMenuItem ()
    extends typingsSlinky.atBlueprintjsTable.libEsmInteractionsMenusCopyCellsMenuItemMod.CopyCellsMenuItem
  
  @js.native
  class MenuContext protected ()
    extends typingsSlinky.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.MenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  }
  
}

