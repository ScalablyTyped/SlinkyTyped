package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/interactions/menus", JSImport.Namespace)
@js.native
object menusMod extends js.Object {
  
  @js.native
  class CopyCellsMenuItem ()
    extends typingsSlinky.blueprintjsTable.copyCellsMenuItemMod.CopyCellsMenuItem
  
  @js.native
  class MenuContext protected ()
    extends typingsSlinky.blueprintjsTable.menuContextMod.MenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  }
}
