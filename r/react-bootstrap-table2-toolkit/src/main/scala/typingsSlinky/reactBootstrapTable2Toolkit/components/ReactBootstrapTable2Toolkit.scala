package typingsSlinky.reactBootstrapTable2Toolkit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Toolkit.mod.CSVProps
import typingsSlinky.reactBootstrapTable2Toolkit.mod.TableSearchProps
import typingsSlinky.reactBootstrapTable2Toolkit.mod.TableToolkitProps
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBootstrapTable2Toolkit {
  @JSImport("react-bootstrap-table2-toolkit", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    @scala.inline
    def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
    @scala.inline
    def exportCSV(value: Boolean | CSVProps): this.type = set("exportCSV", value.asInstanceOf[js.Any])
    @scala.inline
    def search(value: TableSearchProps[js.Any] | Boolean): this.type = set("search", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableToolkitProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[js.Any, _]],
    data: js.Array[js.Any],
    keyField: /* keyof T */ String
  ): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableToolkitProps[js.Any]]))
  }
}

