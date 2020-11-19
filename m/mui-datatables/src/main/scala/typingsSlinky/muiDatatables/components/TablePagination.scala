package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.muiDatatables.mod.MUIDataTablePagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TablePagination {
  
  @JSImport("mui-datatables", "TablePagination")
  @js.native
  object component extends js.Object
  
  def withProps(p: MUIDataTablePagination): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => js.Any,
    count: Double,
    options: js.Object,
    page: Double,
    rowsPerPage: Double
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MUIDataTablePagination]))
  }
}
