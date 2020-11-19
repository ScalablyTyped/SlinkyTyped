package typingsSlinky.luminoDatagrid.celleditorMod

import typingsSlinky.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/celleditor", "TextInputValidator")
@js.native
class TextInputValidator () extends ICellInputValidator {
  
  /**
    * Maximum text length
    *
    * The default is Number.NaN, meaning no maximum constraint
    */
  var maxLength: Double = js.native
  
  /**
    * Minimum text length
    *
    * The default is Number.NaN, meaning no minimum constraint
    */
  var minLength: Double = js.native
  
  /**
    * Required text pattern as regular expression
    *
    * The default is null, meaning no pattern constraint
    */
  var pattern: js.RegExp | Null = js.native
  
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: String): ICellInputValidatorResponse = js.native
}
