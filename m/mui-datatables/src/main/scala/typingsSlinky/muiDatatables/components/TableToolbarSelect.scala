package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbarSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableToolbarSelect {
  @JSImport("mui-datatables", "TableToolbarSelect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def displayData(value: js.Any): this.type = set("displayData", value.asInstanceOf[js.Any])
    @scala.inline
    def onRowsDelete(value: /* args */ js.Any => _): this.type = set("onRowsDelete", js.Any.fromFunction1(value))
    @scala.inline
    def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def selectRowUpdate(value: /* args */ js.Any => _): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableToolbarSelect): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(options: js.Object): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbarSelect]))
  }
}

