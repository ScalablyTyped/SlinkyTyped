package typingsSlinky.muiDatatables.components

import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MUIDataTable {
  
  @JSImport("mui-datatables", "MUIDataTable")
  @js.native
  object component extends js.Object
  
  def withProps(p: MUIDataTableProps): SharedBuilder_MUIDataTableProps_749280285 = new SharedBuilder_MUIDataTableProps_749280285(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): SharedBuilder_MUIDataTableProps_749280285 = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    new SharedBuilder_MUIDataTableProps_749280285(js.Array(this.component, __props.asInstanceOf[MUIDataTableProps]))
  }
}
