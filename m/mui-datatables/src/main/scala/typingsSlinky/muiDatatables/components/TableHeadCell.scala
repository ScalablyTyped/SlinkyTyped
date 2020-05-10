package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableHeadCell
import typingsSlinky.muiDatatables.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeadCell {
  @JSImport("mui-datatables", "TableHeadCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def sortDirection(value: SortDirection): this.type = set("sortDirection", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableHeadCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(hint: String, options: js.Object, sort: Boolean, toggleSort: js.Any => js.Any): Builder = {
    val __props = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableHeadCell]))
  }
}

