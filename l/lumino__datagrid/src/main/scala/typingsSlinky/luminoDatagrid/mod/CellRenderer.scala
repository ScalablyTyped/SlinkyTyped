package typingsSlinky.luminoDatagrid.mod

import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid", "CellRenderer")
@js.native
abstract class CellRenderer ()
  extends typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
@JSImport("@lumino/datagrid", "CellRenderer")
@js.native
object CellRenderer extends js.Object {
  
  /**
    * Resolve a config option for a cell renderer.
    *
    * @param option - The config option to resolve.
    *
    * @param config - The cell config object.
    *
    * @returns The resolved value for the option.
    */
  def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = js.native
}
