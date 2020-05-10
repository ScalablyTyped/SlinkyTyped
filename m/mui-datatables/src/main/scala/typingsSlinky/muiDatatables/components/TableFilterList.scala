package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableFilterList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilterList {
  @JSImport("mui-datatables", "TableFilterList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def onFilterUpdate(value: /* args */ js.Any => _): this.type = set("onFilterUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableFilterList): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(filterList: js.Array[js.Array[String]]): Builder = {
    val __props = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableFilterList]))
  }
}

