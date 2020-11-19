package typingsSlinky.luminoDatagrid.celleditorMod

import typingsSlinky.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/celleditor", "NumberInputValidator")
@js.native
class NumberInputValidator () extends ICellInputValidator {
  
  /**
    * Maximum value
    *
    * The default is Number.NaN, meaning no maximum constraint
    */
  var max: Double = js.native
  
  /**
    * Minimum value
    *
    * The default is Number.NaN, meaning no minimum constraint
    */
  var min: Double = js.native
  
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
}
