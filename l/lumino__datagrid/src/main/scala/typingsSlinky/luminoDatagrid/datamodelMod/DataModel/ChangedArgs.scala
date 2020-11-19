package typingsSlinky.luminoDatagrid.datamodelMod.DataModel

import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`cells-changed`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`columns-moved`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`model-reset`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`rows-inserted`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`rows-moved`
import typingsSlinky.luminoDatagrid.luminoDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type alias for the args objects of the `changed` signal.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.RowsChangedArgs
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ColumnsChangedArgs
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.RowsMovedArgs
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ColumnsMovedArgs
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.CellsChangedArgs
  - typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ModelResetArgs
*/
trait ChangedArgs extends js.Object
object ChangedArgs {
  
  @scala.inline
  def ModelResetArgs(`type`: `model-reset`): ChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  
  @scala.inline
  def ColumnsMovedArgs(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  
  @scala.inline
  def RowsMovedArgs(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  
  @scala.inline
  def ColumnsChangedArgs(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  
  @scala.inline
  def CellsChangedArgs(
    column: Double,
    columnSpan: Double,
    region: CellRegion,
    row: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): ChangedArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  
  @scala.inline
  def RowsChangedArgs(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
}
