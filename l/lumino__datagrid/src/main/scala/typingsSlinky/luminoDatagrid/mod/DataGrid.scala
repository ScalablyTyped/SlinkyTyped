package typingsSlinky.luminoDatagrid.mod

import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.CopyConfig
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.CopyFormatArgs
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.DefaultSizes_
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.IOptions
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid", "DataGrid")
@js.native
/**
  * Construct a new data grid.
  *
  * @param options - The options for initializing the data grid.
  */
class DataGrid ()
  extends typingsSlinky.luminoDatagrid.datagridMod.DataGrid {
  def this(options: IOptions) = this()
}
@JSImport("@lumino/datagrid", "DataGrid")
@js.native
object DataGrid extends js.Object {
  
  /**
    * A generic format function for the copy handler.
    *
    * @param args - The format args for the function.
    *
    * @returns The string representation of the value.
    *
    * #### Notes
    * This function uses `String()` to coerce a value to a string.
    */
  def copyFormatGeneric(args: CopyFormatArgs): String = js.native
  
  /**
    * The default copy config for a data grid.
    */
  val defaultCopyConfig: CopyConfig = js.native
  
  /**
    * The default sizes for a data grid.
    */
  val defaultSizes: DefaultSizes_ = js.native
  
  /**
    * The default theme for a data grid.
    */
  val defaultStyle: Style = js.native
}
