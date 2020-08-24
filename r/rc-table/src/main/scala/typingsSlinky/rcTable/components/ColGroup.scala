package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.colGroupMod.ColGroupProps
import typingsSlinky.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColGroup {
  @JSImport("rc-table/lib/ColGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def columCount(value: Double): this.type = set("columCount", value.asInstanceOf[js.Any])
    @scala.inline
    def columnsVarargs(value: ColumnType[RecordType]*): this.type = set("columns", js.Array(value :_*))
    @scala.inline
    def columns(value: js.Array[ColumnType[RecordType]]): this.type = set("columns", value.asInstanceOf[js.Any])
  }
  
  def withProps[RecordType](p: ColGroupProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RecordType](colWidths: js.Array[Double | String]): Builder[RecordType] = {
    val __props = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[ColGroupProps[RecordType]]))
  }
}

