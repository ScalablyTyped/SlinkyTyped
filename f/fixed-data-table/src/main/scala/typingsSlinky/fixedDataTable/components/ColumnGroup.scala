package typingsSlinky.fixedDataTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable.mod.CellProps
import typingsSlinky.fixedDataTable.mod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  @JSImport("fixed-data-table", "ColumnGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable.mod.ColumnGroup] {
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Builder = {
    val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnGroupProps]))
  }
}

